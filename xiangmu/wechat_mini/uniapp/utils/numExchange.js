/**
 * 格式化数字为万级展示（≥10万显示10万+，1万~9.9万显示x.x万）
 * @param {number} num - 待格式化的数字（如8000、10000、59000、100000、123456）
 * @returns {string} 格式化后的文本（如"8000"、"1万"、"5.9万"、"10万+"）
 */
function formatNumberToWan(num) {
	// 1. 输入合法性校验：非数字/负数转为0处理
	const number = typeof num === 'number' && !isNaN(num) && num >= 0 ?
		num :
		0;

	// 2. 核心逻辑：按阈值格式化
	if (number >= 100000) { // ≥10万 → 显示10万+
		return '10万+';
	} else if (number >= 10000) { // 1万~9.9万 → 保留1位小数，如1万、5.9万
		const wanNum = number / 10000;
		// 四舍五入保留1位小数，处理整数情况（如1.0万→1万）
		const rounded = Math.round(wanNum * 10) / 10;
		return rounded % 1 === 0 ? `${rounded}万` : `${rounded.toFixed(1)}万`;
	} else { // <1万 → 显示原始数字
		return number.toString();
	}
}

export default formatNumberToWan