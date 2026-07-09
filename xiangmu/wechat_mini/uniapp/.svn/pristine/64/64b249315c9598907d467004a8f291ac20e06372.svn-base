import { pinyin } from 'pinyin-pro';
// 成熟验证的 汉字拼音首字母映射表
// 覆盖所有城市名（含多音字、生僻字），优先级最高
const PINYIN_MAP = {
    "七": "Q", "万": "W", "三": "S", "乐": "L", "九": "J", "亳": "B", "重": "C",
    "厦": "X", "丽": "L", "佛": "F", "阿": "A", "什": "S", "漯": "L", "濮": "P",
    "郴": "C", "湛": "Z", "黔": "Q", "邕": "Y", "襄": "X", "莞": "G", "邳": "P",
    "莒": "J", "郯": "T", "嵊": "S", "溧": "L", "睢": "S", "黟": "Y", "歙": "X",
    "婺": "W", "衢": "Q", "缙": "J", "酃": "L", "儋": "D", "邛": "Q", "泸": "L",
    "梓": "Z", "阆": "L", "彭": "P", "涪": "F", "潼": "T", "犍": "Q", "筠": "Y",
    "屏": "P", "邛": "Q", "崇": "C", "冕": "M", "越": "Y", "隰": "X", "稷": "J",
    "芮": "R", "邰": "T", "彬": "B", "陇": "L", "宕": "D", "岷": "M", "迭": "D",
    "靖": "J", "濮": "P", "睢": "S", "涡": "G", "濉": "S", "砀": "D", "萧": "X",
    "亳": "B", "枞": "Z", "歙": "X", "黟": "Y", "旌": "J", "盱": "X", "眙": "Y",
    "邗": "H", "邳": "P", "睢": "S", "沭": "S", "泗": "S", "盱": "X", "眙": "Y",
    "繁": "F", "宁": "N", "淳": "C", "歙": "X", "绩": "J", "旌": "J", "泾": "J",
    "黟": "Y", "祁": "Q", "休": "X", "宁": "N", "寿": "S", "霍": "H", "凤": "F"
};
// 拼音声母可能的首字母
export const PINYIN_INITIAL_CONSONANT_LETTERS = 'ABCDEFGHJKLMNOPQRSTWXYZ'.split('');
// 拼音声母对应的边界中文
const PINYIN_BOUNDARY_CHAR = '驁簿錯鵽樲鰒餜靃攟鬠纙鞪黁漚曝裠鶸蜶籜鶩鑂韻糳'.split('');
// 【完整城市多音字/特殊字映射表】
// 覆盖所有易解析错误的地级市/县级市，按城市名匹配（优先级最高）
const CITY_SPECIAL_MAP = {
  // 单字特殊映射（城市名首字）
  七: 'Q', 万: 'W', 三: 'S', 乐: 'L', 九: 'J', 亳: 'B',
  重: 'C', 厦: 'X', 丽: 'L', 佛: 'F', 阿: 'A', 什: 'S',
  漯: 'L', 濮: 'P', 郴: 'C', 湛: 'Z', 黔: 'Q', 邕: 'Y',
  襄: 'X', 莞: 'G', 邳: 'P', 莒: 'J', 郯: 'T', 嵊: 'S',
  溧: 'L', 睢: 'S', 黟: 'Y', 歙: 'X', 婺: 'W', 衢: 'Q',
  缙: 'J', 酃: 'L', 儋: 'D', 邛: 'Q', 泸: 'L', 梓: 'Z',
  阆: 'L', 彭: 'P', 涪: 'F', 潼: 'T', 犍: 'Q', 筠: 'Y',
  屏: 'P', 崇: 'C', 冕: 'M', 越: 'Y', 隰: 'X', 稷: 'J',
  芮: 'R', 邰: 'T', 彬: 'B', 陇: 'L', 宕: 'D', 岷: 'M',
  迭: 'D', 靖: 'J', 涡: 'G', 濉: 'S', 砀: 'D', 萧: 'X',
  枞: 'Z', 旌: 'J', 盱: 'X', 眙: 'Y', 邗: 'H', 沭: 'S',
  泗: 'S', 繁: 'F', 宁: 'N', 淳: 'C', 绩: 'J', 泾: 'J',
  祁: 'Q', 休: 'X', 寿: 'S', 霍: 'H', 凤: 'F', 邳: 'P',
  // 整城市名特殊映射（兜底，防止单字匹配遗漏）
  重庆: 'C', 厦门: 'X', 丽水: 'L', 乐山: 'L', 亳州: 'B',
  佛山: 'F', 阿坝: 'A', 什邡: 'S', 漯河: 'L', 濮阳: 'P',
  郴州: 'C', 黔江: 'Q', 邕宁: 'Y', 东莞: 'G', 儋州: 'D',
  衢州: 'Q', 婺城: 'W', 黟县: 'Y', 歙县: 'X', 睢宁: 'S'
};
/**
 * 获取拼音首字母（大写）- 完全保留你原有方法名和入参/返回规则
 * 示例：'七台河市' => 'Q'，'乐山市' => 'L'，'亳州市' => 'B'，非中文返回原字符
 * @param {String} str 待解析字符串（城市名）
 * @returns {String} 首字母/原字符
 */
export function getChinesePinyinAbbreviation(str) {
  // 空值兜底
  if (!str || typeof str !== 'string') return '';
  const cityName = str.trim();
  // 空字符串返回
  if (cityName === '') return '';

  // 【优先级1：整城市名匹配特殊映射】
  if (CITY_SPECIAL_MAP[cityName]) {
    return CITY_SPECIAL_MAP[cityName];
  }

  // 取城市名首字符
  const firstChar = cityName.charAt(0);
  // 【优先级2：非中文字符，直接返回原字符】
  if (!/[\u4e00-\u9fa5]/.test(firstChar)) {
    return firstChar;
  }

  // 【优先级3：首字匹配特殊映射】
  if (CITY_SPECIAL_MAP[firstChar]) {
    return CITY_SPECIAL_MAP[firstChar];
  }

  // 【优先级4：pinyin-pro 精准解析（兜底所有普通字）】
  // pattern: 'first' 取首字母，toneType: 'none' 无拼音声调
  const firstLetter = pinyin(firstChar, { pattern: 'first', toneType: 'none' });
  // 转大写并返回（确保和字母表格式一致）
  return firstLetter.toUpperCase();
}
/**
 * 城市数据按首字母分组并排序 - 完全保留你原有返回格式
 * @param {Array} cityList 原始市级数据（格式：[{id:1, name:'北京'}, ...]）
 * @param {String} nameKey 城市名称的键名，默认name
 * @returns {Object} { options: [], groupObj: {} } 与你原有返回一致
 */
export function groupCityByLetter(cityList, nameKey = 'name') {
  // 空数据兜底
  if (!Array.isArray(cityList) || cityList.length === 0) {
    return { options: [], groupObj: {} };
  }

  // 初始化分组对象
  const groupObj = {};

  // 遍历城市进行分组
  cityList.forEach(city => {
    const cityName = city[nameKey] || '';
    // 调用解析首字母方法
    const letter = getChinesePinyinAbbreviation(cityName);
    // 仅保留你指定字母表中的字母（过滤其他无关字符）
    if (PINYIN_INITIAL_CONSONANT_LETTERS.includes(letter)) {
      if (!groupObj[letter]) groupObj[letter] = [];
      groupObj[letter].push(city);
    }
	city.letter = letter
  });

  // 【组内城市按中文拼音排序】- 小程序全兼容
  for (const key in groupObj) {
    groupObj[key].sort((a, b) => {
      return a[nameKey].localeCompare(b[nameKey], 'zh-CN', { sensitivity: 'base' });
    });
  }

  // 【按你指定的字母表顺序排序】- 严格匹配PINYIN_INITIAL_CONSONANT_LETTERS
  const sortedLetters = PINYIN_INITIAL_CONSONANT_LETTERS.filter(letter => {
    return groupObj.hasOwnProperty(letter);
  });

  // 构造与你原有完全一致的返回格式
  const options = sortedLetters.map(letter => {
    const cityItemList = groupObj[letter];
    return {
      letter: letter,
      data: cityItemList.map(item => item[nameKey])
    };
  });

  // console.log('城市分组结果：', { sortedLetters, groupObj });
  return { options, groupObj ,cityList};
}