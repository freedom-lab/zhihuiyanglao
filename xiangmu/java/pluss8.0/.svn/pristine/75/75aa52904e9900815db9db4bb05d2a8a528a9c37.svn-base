package cn.pluss.platform.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 * @author hkj
 * @category
 * @see 日期工具
 */
public class DateUtils {

	final static String DEFAULT_FORMAT = "yyyy-MM-dd";

	public static String formatDateDefault(Date date, String pattern) {
		if (date == null) {
			return "";
		}

		try {
			SimpleDateFormat formatter = new SimpleDateFormat(pattern);
			return formatter.format(date);
		} catch (Exception e) {
			return "";
		}
	}
	
	/**
	 * 根据给定的格式化参数，将字符串转换为日期
	 * 
	 * @param dateString
	 * @param dateFormat
	 * @return java.util.Date
	 */
	public static java.util.Date parse(String dateString, String dateFormat) {
		if ("".equals(dateString.trim()) || dateString == null) {
			return null;
		}
		DateFormat sdf = new SimpleDateFormat(dateFormat);
		Date date = null;
		try {
			date = sdf.parse(dateString);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return date;
	}

	/**
	 * 
	 * 默认将字符串转换为日期，格式(yyyy-MM-dd)
	 * 
	 * @param dateString
	 * @return
	 */
	public static java.util.Date parse(String dateString) {
		return parse(dateString, DEFAULT_FORMAT);
	}

	/**
	 * 根据给定的格式化参数，将日期转换为字符串
	 * 
	 * @param date
	 * @param dateFormat
	 * @return String
	 */
	public static String toString(java.util.Date date, String dateFormat) {
		if ("".equals(date) || date == null) {
			return "bug: date is null";
		}
		DateFormat sdf = new SimpleDateFormat(dateFormat);
		String str = sdf.format(date);

		return str;
	}

	/**
	 * 默认将日期转换为字符串，格式(yyyy-MM-dd)
	 * 
	 * @param date
	 * @return String
	 */
	public static String toString(java.util.Date date) {
		return toString(date, DEFAULT_FORMAT);
	}

	/**
	 * 将日期转换为长整型?
	 * 
	 * @param date
	 * @return long
	 */
	public static long toLong(java.util.Date date) {
		if (date == null) {
			return 0;
		}
		long d = date.getTime();

		return d;
	}

	/**
	 * 将长整型转换为日期对象
	 * 
	 * @param time
	 * @return date
	 */
	public static java.util.Date toDate(long time) {
		if ("".equals(time)) {
			return new Date();
		}
		Date date = new Date(time);

		return date;
	}

	/**
	 * 获得系统当前时间
	 * 
	 * @return java.util.Date
	 */
	public static String currentStringDate() {
		Date date = new Date();

		return toString(date);
	}

	/**
	 * 获得系统当前时间(按用户自己格式)
	 * 
	 * @return java.util.Date
	 */
	public static String currentYourDate(String formate) {
		Date date = new Date();

		return toString(date,formate);
	}

	
	
	
	/**
	 * 获得系统当前时间
	 * 
	 * @return java.util.Date
	 */
	public static java.util.Date currentDate() {
		Date date = new Date();

		return date;
	}

	/**
	 * 根据日历的规则，为给定的日历字段添加或减去指定的时间�?
	 * 
	 * @param field
	 *            指定的日历字段
	 * @param date
	 *            需要操作的日期对象
	 * @param value
	 *            更改的时间值
	 * @return java.util.Date
	 */
	public static Date add(int field, Date date, int value) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(date);
		ca.add(field, value);
		Date newDate = ca.getTime();

		return newDate;
	}

	/**
	 * 返回给定日历字段的值
	 * 
	 * @param field
	 *            指定的日历字段
	 * @param date
	 *            给定的日期对象
	 * @return java.util.Date
	 */
	public static int get(int field, Date date) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(date);
		int value = ca.get(field);

		return value;
	}

	/**
	 * 返回前N个月的日期值
	 * 
	 * @param month
	 * @return
	 */
	public static Date getLastMonth(String month) {
		Calendar ca = Calendar.getInstance();
		int m = 0;
		try {
			m = Integer.parseInt(month);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		ca.add(Calendar.MONTH, -m);
		return ca.getTime();
	}
	
	/**
	 * 返回当前日期的前一天
	 * 
	 * @param date
	 * @return
	 */
	public static String getPreDate(Date date) {
		 date.setDate(date.getDate()-1);
		 return toString(date, DEFAULT_FORMAT);
	}
	/**
	 * 验证字符串是否匹配日期
	 */
	public static boolean isDate(String str , String formate) {
		 try
	        {
			     DateFormat sdf = new SimpleDateFormat(formate);
			     sdf.parse(str);
	             return true;
	         }
	        catch (Exception e)
	        {
	            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
	            return false;
	        }
	}
	
	/**
	 * 获取偏移日期
	 * @param offset
	 * @return
	 */
	public static Date getOffsetDate(int offset){
		
		SimpleDateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
		Date beginDate = new Date();
		Calendar date = Calendar.getInstance();
		date.setTime(beginDate);
		date.set(Calendar.DATE, date.get(Calendar.DATE) + offset);
		Date endDate =null;
		try {
			endDate = dft.parse(dft.format(date.getTime()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return endDate;
	}
	
	/**
     * 返回日时分秒
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
        String min=minutes+"";
        if(minutes<10){
        	min="0"+minutes;
        }
        String sec=second+"";
        if(second<10){
        	sec="0"+second;
        }
        
        if (0 < days){
            return days + "天，"+hours+"小时，"+minutes+"分，"+second+"秒";
        }else {
            return hours+":"+min+":"+sec;
        }
    }
	
	//获取当天的开始时间
    public static Date getDayBegin() {
       Calendar cal = new GregorianCalendar();
       cal.set(Calendar.HOUR_OF_DAY, 0);
       cal.set(Calendar.MINUTE, 0);
       cal.set(Calendar.SECOND, 0);
       cal.set(Calendar.MILLISECOND, 0);
       return cal.getTime();
   }
   //获取当天的结束时间
   public static Date getDayEnd() {
  	 Calendar cal = new GregorianCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 999);  
        return cal.getTime();
    }
    //获取昨天的开始时间
    public static Date getBeginDayOfYesterday() {
        Calendar cal = new GregorianCalendar();
        cal.setTime(getDayBegin());
        cal.add(Calendar.DAY_OF_MONTH, -1);
        return cal.getTime();
    }
    //获取昨天的结束时间
    public static Date getEndDayOfYesterDay() {
        Calendar cal = new GregorianCalendar();
        cal.setTime(getDayEnd());
        cal.add(Calendar.DAY_OF_MONTH, -1);
        return cal.getTime();
    }
    //获取明天的开始时间
    public static Date getBeginDayOfTomorrow() {
        Calendar cal = new GregorianCalendar();
        cal.setTime(getDayBegin());
        cal.add(Calendar.DAY_OF_MONTH, 1);

        return cal.getTime();
    }
    //获取明天的结束时间
    public static Date getEndDayOfTomorrow() {
        Calendar cal = new GregorianCalendar();
        cal.setTime(getDayEnd());
        cal.add(Calendar.DAY_OF_MONTH, 1);
        return cal.getTime();
    }
    //获取本周的开始时间
    public static Date getBeginDayOfWeek() {
        Date date = new Date();
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int dayofweek = cal.get(Calendar.DAY_OF_WEEK);
        if (dayofweek == 1) {
            dayofweek += 7;
        }
        cal.add(Calendar.DATE, 2 - dayofweek);
        return getDayStartTime(cal.getTime());
    }
    //获取本周的结束时间
    public static Date getEndDayOfWeek(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(getBeginDayOfWeek());  
        cal.add(Calendar.DAY_OF_WEEK, 6); 
        Date weekEndSta = cal.getTime();
        return getDayEndTime(weekEndSta);
    }
    //获取本月的开始时间
     public static Date getBeginDayOfMonth() {
            Calendar calendar = Calendar.getInstance();
            calendar.set(getNowYear(), getNowMonth() - 1, 1);
            return getDayStartTime(calendar.getTime());
        }
    //获取本月的结束时间
     public static Date getEndDayOfMonth() {
            Calendar calendar = Calendar.getInstance();
            calendar.set(getNowYear(), getNowMonth() - 1, 1);
            int day = calendar.getActualMaximum(5);
            calendar.set(getNowYear(), getNowMonth() - 1, day);
            return getDayEndTime(calendar.getTime());
        }
     //获取本年的开始时间
     public static Date getBeginDayOfYear() {
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR, getNowYear());
           // cal.set
           cal.set(Calendar.MONTH, Calendar.JANUARY);
           cal.set(Calendar.DATE, 1);

           return getDayStartTime(cal.getTime());
       }
    //获取本年的结束时间
    public static Date getEndDayOfYear() {
           Calendar cal = Calendar.getInstance();
           cal.set(Calendar.YEAR, getNowYear());
           cal.set(Calendar.MONTH, Calendar.DECEMBER);
           cal.set(Calendar.DATE, 31);
           return getDayEndTime(cal.getTime());
       }
    //获取某个日期的开始时间
         public static Timestamp getDayStartTime(Date d) {
            Calendar calendar = Calendar.getInstance();
             if(null != d) calendar.setTime(d);
             calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),    calendar.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
             calendar.set(Calendar.MILLISECOND, 0);
             return new Timestamp(calendar.getTimeInMillis());
         }
         //获取某个日期的结束时间
         public static Timestamp getDayEndTime(Date d) {
             Calendar calendar = Calendar.getInstance();
             if(null != d) calendar.setTime(d);
             calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),    calendar.get(Calendar.DAY_OF_MONTH), 23, 59, 59);
             calendar.set(Calendar.MILLISECOND, 999);
             return new Timestamp(calendar.getTimeInMillis());
         }
         //获取今年是哪一年
          public static Integer getNowYear() {
                  Date date = new Date();
                 GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
                 gc.setTime(date);
                 return Integer.valueOf(gc.get(1));
             }
          //获取本月是哪一月
          public static int getNowMonth() {
                  Date date = new Date();
                 GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
                 gc.setTime(date);
                 return gc.get(2) + 1;
          }
          
          
          
          //获取上一月的开始时间
	       public static Date getBeginDayOfPreMonth() {
	              Calendar calendar = Calendar.getInstance();
	              calendar.set(getNowYear(), getNowMonth() - 2, 1);
	              return getDayStartTime(calendar.getTime());
	          }
	       
	       //获取某个月的开始时间
	       public static String getBeginMonth(int i) {
	    	   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	    	   Calendar cal_1 = Calendar.getInstance();//获取当前日期
	           cal_1.add(Calendar.MONTH, i);
	           cal_1.set(Calendar.DAY_OF_MONTH, 1);//设置为1号,当前日期既为本月第一天
	           String firstDay = format.format(cal_1.getTime())+" 00:00:00";
              return firstDay;
	       }
	       
	       //获取某个月的结束时间
	       public static String getEndMonth(int i) {
	    	   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	    	   Calendar cale = Calendar.getInstance();
	           cale.add(Calendar.MONTH, i+1);//设置为1号,当前日期既为本月第一天
	           cale.set(Calendar.DAY_OF_MONTH, 0);//设置为1号,当前日期既为本月第一天
	           String lastDay = format.format(cale.getTime())+" 23:59:59";
              return lastDay;
	       }  
	       
	       //获取某个月的开始时间
	       public static Date getMonth(int i) {
	    	   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	    	   Calendar cal_1 = Calendar.getInstance();//获取当前日期
	           cal_1.add(Calendar.MONTH, i);
	           cal_1.set(Calendar.DAY_OF_MONTH, 1);//设置为1号,当前日期既为本月第一天
//	           String firstDay = format.format(cal_1.getTime())+" 00:00:00";
              return cal_1.getTime();
	       }
}

