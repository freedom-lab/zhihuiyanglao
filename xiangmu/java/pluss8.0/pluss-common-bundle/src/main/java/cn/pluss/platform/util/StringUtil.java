package cn.pluss.platform.util;

import cn.hutool.core.util.StrUtil;
import org.springframework.util.CollectionUtils;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.*;


public class StringUtil extends StrUtil {
    private static final char[] charArr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
            'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
            'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public static String random6() {
        Random random = new Random();
        String result = "";
        for (int i = 0; i < 6; i++) {
            result += random.nextInt(10);
        }
        return result;
    }

    //生产随机8位userCode
    public static String genRandomNum() {
        int maxNum = 36;
        int i;
        int count = 0;
        char[] str = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
                'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        StringBuffer pwd = new StringBuffer("");
        Random r = new Random();
        while (count < 8) {
            i = Math.abs(r.nextInt(maxNum));
            if (i >= 0 && i < str.length) {
                pwd.append(str[i]);
                count++;
            }
        }
        return pwd.toString();
    }

    /**
     * 生成订单号
     *
     * @return
     */
    public static synchronized String getBillno() {
        StringBuilder billno = new StringBuilder();

        // 日期(格式:20080524)
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        billno.append(format.format(new Date()));

        // 生成5位格林治毫秒数
        String endStr = String.valueOf(new Date().getTime());
        billno.append((endStr.substring(endStr.length() - 5, endStr.length())));

        // 生成4位随机数
        String str4 = "0123456789";
        Random rand = new Random();
        int length = 8;
        for (int i = 0; i < length; i++) {
            int randNum = rand.nextInt(9);
            billno.append(str4.substring(randNum, randNum + 1));
        }
        return billno.toString();
    }

    /**
     * 生成订单号
     *
     * @return
     */
    public static synchronized String getUUid() {
        StringBuilder billno = new StringBuilder();
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        return uuid;
    }


    public static boolean isEmpty(String content) {
        // TODO Auto-generated method stub
        if (content != null && !"".equals(content)) {
            return false;
        }
        return true;
    }

    /**
     * 计算分页数量
     *
     * @param count
     * @param pageSize
     * @return
     */
    public static int getPageCount(int count, int pageSize) {
        // TODO Auto-generated method stub
        int pageCount = 0;
        if (count == 0) {

            return 0;
        }

        if (count % pageSize == 0) {
            pageCount = count / pageSize;
        } else {
            pageCount = count / pageSize + 1;

        }
        return pageCount;

    }

    public static boolean equals(String str1, String str2) {
        // TODO Auto-generated method stub
        return str1 == null ? str2 == null : str1.equals(str2);
    }


    /**
     * 返回日时分秒
     *
     * @param second
     * @return
     */
    public static String secondToTime(long second) {
        long days = second / 86400;//转换天数
        second = second % 86400;//剩余秒数
        long hours = second / 3600;//转换小时数
        second = second % 3600;//剩余秒数
        long minutes = second / 60;//转换分钟
        second = second % 60;//剩余秒数
        String min = minutes + "";
        if (minutes < 10) {
            min = "0" + minutes;
        }
        String sec = second + "";
        if (second < 10) {
            sec = "0" + second;
        }

        if (0 < days) {
            return days + "";
        } else {
            return hours + "";
        }
    }

    public static double bigDecimal(double d) {
        // TODO Auto-generated method stub
        double v = new BigDecimal(d).setScale(2, RoundingMode.HALF_UP).doubleValue();
        return v;
    }

    /**
     * 首字母切换大写
     *
     * @param str
     * @return
     */
    public static String firstCharUpCase(String str) {
        str = str.substring(0, 1).toUpperCase() + str.substring(1);
        return str;
    }

    /**
     * 首字母切换大写
     *
     * @param str
     * @return
     */
    public static String firstCharLowerCase(String str) {
        str = str.substring(0, 1).toLowerCase() + str.substring(1);
        return str;
    }

    /**
     * 格式化oracle表名
     *
     * @param tableName
     * @return
     */
    public static String fmtOracleTableName(String tableName) {
        // TODO Auto-generated method stub
        String[] tableNames = tableName.split("_");
        return null;
    }

    /**
     * 构建className
     *
     * @param tableName
     * @return
     */
    public static String buildClassName(String tableName, String type) {
        String className = "";
        String[] str = tableName.split("_");
        for (int i = 0; i < str.length; i++) {
//			if (i > 1) {
            className += StringUtil.firstCharUpCase(str[i]);
//			}
        }
        return className + type;

    }

    /**
     * 下划线命名转驼峰，并去除首尾下划线
     *
     * @param fieldName
     */
    public static String toCamelCase(String fieldName) {
        if (StringUtil.isEmpty(fieldName) || !fieldName.contains("_")) {
            return fieldName;
        }
        /**
         * 若下划线在首位时
         */
        int index = fieldName.indexOf("_");
        if (index == 0) {
            fieldName = fieldName.replaceFirst("_", "");
            index = fieldName.indexOf("_");
        }
        /**
         * 下划线转驼峰，末尾不做处理
         */
        while (index > 0 && (fieldName.length() - 1) > index) {
            fieldName = fieldName.replace(fieldName.substring(index, index + 2), fieldName.substring(index + 1, index + 2).toUpperCase());
            index = fieldName.indexOf("_");
        }
        //去除末尾下划线
        return fieldName.replaceAll("_", "");
    }

    /**
     * 将对象的某些属性进行编码
     *
     * @param t
     * @param fieldNameArr
     * @param <T>
     * @return
     */
    public static <T> void encodeBeanAttr(T t, String... fieldNameArr) {
        if (fieldNameArr.length == 0) {
            return;
        }
        Class<T> clazz = (Class<T>) t.getClass();
        for (int i = 0; i < fieldNameArr.length; i++) {
            try {
                String fieldName = fieldNameArr[i];
                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                String oldValue = (String) field.get(t);
                if (StringUtil.isEmpty(oldValue)) {
                    continue;
                }
                String newValue = URLEncoder.encode(oldValue, "UTF-8");
                field.set(t, newValue);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
                continue;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                continue;
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                continue;
            }
        }
    }

    /**
     * 将对象的某些属性进行解码
     *
     * @param t
     * @param fieldNameArr
     * @param <T>
     * @return
     */
    public static <T> void decodeBeanAttr(T t, String... fieldNameArr) {
        if (fieldNameArr.length == 0) {
            return;
        }
        Class<T> clazz = (Class<T>) t.getClass();
        for (int i = 0; i < fieldNameArr.length; i++) {
            try {
                String fieldName = fieldNameArr[i];
                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                String oldValue = (String) field.get(t);
                if (StringUtil.isEmpty(oldValue)) {
                    continue;
                }
                String newValue = URLDecoder.decode(oldValue, "UTF-8");
                field.set(t, newValue);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
                continue;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                continue;
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                continue;
            }
        }
    }

    /**
     * 将传入的参数进行编码
     *
     * @param fieldName 属性值
     * @return
     */
    public static String encodeName(String fieldName) {
        if (StringUtil.isNotEmpty(fieldName)) {
            try {
                fieldName = URLEncoder.encode(fieldName, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return fieldName;
    }

    /**
     * 将传入的参数进行解码
     *
     * @param fieldName 属性值
     * @return
     */
    public static String decodeName(String fieldName) {
        if (StringUtil.isNotEmpty(fieldName)) {
            try {
                fieldName = URLDecoder.decode(fieldName, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return fieldName;
    }

    /**
     * 递归循环设置各个分类的子集(反射及泛型实现为了通用)
     *
     * @param childrenMap   key为父级分类的所有分类集合(除去一级分类)
     * @param topList       一级分类集合
     * @param codeFieldName 对象编码属性名称
     */
    public static <T> void setChildrenList(Map<String, List<T>> childrenMap, List<T> topList, String codeFieldName) {
        if (CollectionUtils.isEmpty(topList)) {
            return;
        }
        for (T t : topList) {
            try {
                Class<?> clazz = t.getClass();
                Field field = clazz.getDeclaredField(codeFieldName);
                field.setAccessible(true);
                String parentCode = (String) field.get(t);
                if (StringUtil.isEmpty(parentCode)) {
                    continue;
                }
                List<T> childrenList = childrenMap.get(parentCode);
                //定义类属性时注意，此处写死的子分类集合的属性名称为 children
                Field childrenField = clazz.getDeclaredField("children");
                childrenField.setAccessible(true);
                childrenField.set(t, childrenList);
                //递归循环 设置二、三..级分类的子集
                setChildrenList(childrenMap, childrenList, codeFieldName);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
                continue;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                continue;
            }
        }
    }

    /**
     * 获取32位随机字符串
     *
     * @return
     */
    public static String getWechatNonceStr() {
        int maxNum = 36;
        int i;
        int count = 0;
        StringBuffer pwd = new StringBuffer("");
        Random r = new Random();
        while (count < 32) {
            i = Math.abs(r.nextInt(maxNum));
            if (i >= 0 && i < charArr.length) {
                pwd.append(charArr[i]);
                count++;
            }
        }
        return pwd.toString();
    }
}
