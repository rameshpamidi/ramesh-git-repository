package com.dotridge.nhc.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

  private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
      + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

  private StringUtil() {

  }

  public static final Boolean isEmptyOrNull(String value) {
    return (value == null) || value.trim().length() == 0;
  }

  public static boolean isValidEmail(String email) {
    Pattern pattern = Pattern.compile(EMAIL_PATTERN);
    Matcher matcher = pattern.matcher(email);
    return matcher.matches();
  }
}
