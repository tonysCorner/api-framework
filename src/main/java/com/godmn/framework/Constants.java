
package com.godmn.framework;



public final class Constants {

	public static final String CHAEACTER_ENCODING = "utf-8";

	public static final int SESSION_TIMEOUT = 60 * 30; // 30 分钟
	
	public final static int GAME_CALC_MAX_HUMAN = 2000;
	
	/**
	 * redist key
	 */
	public static final String COOKIE_SESSION_ID_KEY = "ditui_sid";
	
	public static final String KEY_SALES_SESSION_ID = "ditui.sales.sid.%s";
	public static final String KEY_SALES_SESSION_OPENID = "ditui.sales.openid.%s";
	
	public static final String KEY_CUSTOMER_SESSION_ID = "ditui.customer.sid.%s";
	public static final String KEY_CUSTOMER_SESSION_OPENID = "ditui.customer.openid.%s";
	
	public final static String REDIS_GAME_CALC_MAX_HUMAN = "quote.calc.max.human";
}
