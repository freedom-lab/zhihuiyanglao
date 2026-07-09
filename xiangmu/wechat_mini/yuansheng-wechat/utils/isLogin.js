const isLogin = () => {
	const userInfo = uni.getStorageSync("userInfo")
	// console.log(userInfo, '----');
	if (userInfo && userInfo.memberCode) {
		return true
	} else {
		return false
	}
}


export default isLogin