package com.hangum.db.define;

/**
 * Preference name define
 * 
 * @author hangum
 *
 */
public class PreferenceDefine {
	/** select 제한  갯수 */ 
	public static final String SELECT_DEFAULT_PREFERENCE = "SELECT_DEFAULT_PREFERENCE";
	/** select 디폴트 값 */
	public static final int SELECT_DEFAULT_PREFERENCE_VALUE = 100;
	/** 한번에 select 할수 있는 최대 값 */
	public static final int SELECT_DEFAULT_MAX_PREFERENCE_VALUE = 2000;
	
	/** 검색 결과 페이지 당 보여주는 갯수 */
	public static final String SELECT_RESULT_PAGE_PREFERENCE = "SELECT_RESULT_PAGE_PREFERENCE";
	/** select 결과를 페이지에 출력 디폴트 값 */
	public static final int SELECT_RESULT_PAGE_PREFERENCE_VALUE = 10;
	/** select 결과를 페이지에 출력 최대 값 */
	public static final int SELECT_RESULT_PAGE_MAX_PREFERENCE_VALUE = 200;
	
	/** SESSION TIME OUT */
	public static final String SESSION_DFEAULT_PREFERENCE = "SESSION_DFEAULT_PREFERENCE";
	/** SESSION SERVER TIME OUT */
	public static final int SESSION_SERVER_DEFAULT_PREFERENCE_VALUE = 60;
	
	/** SESSION STANDALONE TIME OUT */
	public static final int SESSION_STANDALONE_DEFAULT_PREFERENCE_VALUE = 60 * 24;
	
	/** MAX SESSION TIME OUT */
	public static final int SESSION_DEFAULT_MAX_PREFERENEC_VALUE = 999999;
	
	/** ORACLE PLAN TABLE */
	public static final String ORACLE_PLAN_TABLE = "ORACLE_PLAN_TABLE";
	/** ORACLE PLAN TABLE VALUE */
	public static final String ORACLE_PLAN_TABLE_VALUE = "PLAN_TABLE";
	
	/** login history */
	public static final String LOGIN_HISTORY_PREFERENCE = "LOGIN_HISTORY_PREFERENCE";
	
	/** mongodb limit */
	public static final String MONGO_DEFAULT_LIMIT = "MONGO_DEFAULT_LIMIT_COUNT";
	public static final String MONGO_DEFAULT_LIMIT_VALUE = "100";
	
	public static final String MONGO_DEFAULT_MAX_COUNT = "MONGO_DEFAULT_MAX_COUNT";
	public static final String MONGO_DEFAULT_MAX_COUNT_VALUE = "1000";
	
	/** mongodb find page */ 
	public static final String MONGO_DEFAULT_FIND = "MONGO_DEFAULT_FIND_PAGE";
	public static final String MONGO_DEFAULT_FIND_BASIC = "MONGO_DEFAULT_FIND_PAGE_SEARCH";
	public static final String MONGO_DEFAULT_FIND_EXTEND = "MONGO_DEFAULT_FIND_PAGE_EXTEND";
	
	/** mongodb default result page */
	public static final String MONGO_DEFAULT_RESULT 		= "MONGO_DEFAULT_RESULT_PAGE";
	public static final String MONGO_DEFAULT_RESULT_TREE = "MONGO_DEFAULT_RESULT_PAGE_TREE";
	public static final String MONGO_DEFAULT_RESULT_TABLE = "MONGO_DEFAULT_RESULT_PAGE_TABLE";
	public static final String MONGO_DEFAULT_RESULT_TEXT = "MONGO_DEFAULT_RESULT_PAGE_TEXT";
	
	
}
