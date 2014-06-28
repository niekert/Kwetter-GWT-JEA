package com.google.gwt.i18n.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.LocaleInfo;
import com.google.gwt.i18n.client.constants.NumberConstants;
import com.google.gwt.i18n.client.constants.NumberConstantsImpl;
import com.google.gwt.i18n.client.DateTimeFormatInfo;
import com.google.gwt.i18n.client.impl.cldr.DateTimeFormatInfoImpl;

public class LocaleInfoImpl_nl_runtimeSelection extends LocaleInfoImpl_shared {
  @Override
  public String getLocaleName() {
    String rtLocale = getRuntimeLocale();
    return rtLocale != null ? rtLocale : "nl";
  }
  
  @Override
  public String getLocaleQueryParam() {
    return "locale";
  }
  
  @Override
  public DateTimeFormatInfo getDateTimeFormatInfo() {
    String runtimeLocale = getLocaleName();
    if ("nl_NL".equals(runtimeLocale)) {
      return new com.google.gwt.i18n.client.impl.cldr.DateTimeFormatInfoImpl_nl_NL_runtimeSelection();
    }
    if ("nl".equals(runtimeLocale)) {
      return new com.google.gwt.i18n.client.impl.cldr.DateTimeFormatInfoImpl_nl_runtimeSelection();
    }
    if ("nl_BE".equals(runtimeLocale)) {
      return new com.google.gwt.i18n.client.impl.cldr.DateTimeFormatInfoImpl_nl_BE_runtimeSelection();
    }
    return GWT.create(com.google.gwt.i18n.client.impl.cldr.DateTimeFormatInfoImpl.class);
  }
  
  @Override
  public NumberConstants getNumberConstants() {
    String runtimeLocale = getLocaleName();
    if ("nl_BE".equals(runtimeLocale)) {
      return new com.google.gwt.i18n.client.constants.NumberConstantsImpl_nl_BE();
    }
    if ("nl".equals(runtimeLocale)
        || "nl_NL".equals(runtimeLocale)) {
      return new com.google.gwt.i18n.client.constants.NumberConstantsImpl_nl();
    }
    return GWT.create(com.google.gwt.i18n.client.constants.NumberConstantsImpl.class);
  }
}
