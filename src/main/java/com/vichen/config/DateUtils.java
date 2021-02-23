package com.vichen.config;

import java.util.Calendar;
import java.util.Date;

/**
 * @author chenyu
 * @date 2021/2/23
 */
public class DateUtils {
  /**
   * 获取时间所在季度
   *
   * @param date 时间
   * @return
   */
  public static int getSeason(Date date) {
    int season = 0;
    Calendar c = Calendar.getInstance();
    c.setTime(date);
    int month = c.get(Calendar.MONTH);
    switch (month) {
      case Calendar.JANUARY:
      case Calendar.FEBRUARY:
      case Calendar.MARCH:
        season = 1;
        break;
      case Calendar.APRIL:
      case Calendar.MAY:
      case Calendar.JUNE:
        season = 2;
        break;
      case Calendar.JULY:
      case Calendar.AUGUST:
      case Calendar.SEPTEMBER:
        season = 3;
        break;
      case Calendar.OCTOBER:
      case Calendar.NOVEMBER:
      case Calendar.DECEMBER:
        season = 4;
        break;
      default:
        break;
    }
    return season;
  }
}
