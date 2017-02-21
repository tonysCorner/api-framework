package com.godmn.framework.exception;

/**
 * 全局错误码定义
 *
 * 错误码格式 一共4位
 *
 * 分段：1000以内保留为 公共错误码
 *
 * srv-sso...............1200~1399
 * srv-node..............1400~1599
 * srv-passport..........1600~1799
 * srv-customer..........1800~1999
 * srv-order.............2000~2199
 * srv-insurance.........2200~2399
 * srv-workfllow.........2400~2599
 * srv-coupon............2600~2799
 * api-coupon............2800~2999
 * srv-core..............3000~3199
 * srv-calc..............3200-3399
 * src-cc................3800-3999
 * srv-dbdatasync........4000-4199
 * srv-data-proxy........4200-4399
 * srv-customer-third....4400-4599
 * srv-indicator-dispatch........4600-4699
 * api-activity..........4700-4799
 * api-activity-admin....4800-4899
 * srv-indicator-persistence....4900-4999
 * srv-dictionary........5000-5099
 * srv-brokerage.........5400-5599
 * srv-activiti-engine.........5100-5199
 * api-bee...............5600-5799
 * api-bee-admin.........5800-5999
 * srv-pay.........6000-6199
 * srv-comet.........7000-8999
 *
 * 注意：本类中所有errorCode 都定义为protected 只能在CodeMsgDef类中引用 ，所有错误信息定义都要在CodeMsgDef中定义
 * */
public class ErrorCodeDef {

	// 公共错误码
	protected static final int SUCCESS = 0;

	protected static final int ERROR = 1;

	protected static final int RUNTIME_ERROR = 2;

	protected static final int PARAMETER_ERROR = 3;

	protected static final int PURVIEW_ERROR = 4;

	protected static final int NOT_UPDATE = 5;


	// SSOSrv 错误码
	protected static final int ERROR_DECRYPT_SESSION = 1201;
	protected static final int ERROR_ENCRYPT_SESSION = 1202;
	protected static final int OPERATOR_NOT_FOUND = 1203;
	protected static final int OPERATOR_FROZEN = 1204;
	protected static final int INCORRECT_PWD = 1205;
	protected static final int NOT_LOGIN = 1206;
	protected static final int LOGIN_EXPIRED = 1207;
	protected static final int NODE_TYPE_ERROR = 1208;
	protected static final int SSO_USERNAME_NULL = 1209;
	protected static final int SSO_USERNAME_EXISTS = 1210;
	protected static final int SSO_PASSWORD_ILLEGAL = 1211;
	protected static final int GROUP_TYPE_ERROR = 1212;
	protected static final int NONE_RESOURCE_GROUP = 1213;
	protected static final int NONE_VALUE_REPEAT = 1214;
	protected static final int FOUND_NOT_NODE = 1215;
	// Passport
	protected static final int PASSPORT_NOT_FOUND = 1601;
	protected static final int PASSPORT_MOBILE_EXISTS = 1602;
	protected static final int PASSPORT_EMAIL_EXISTS = 1603;

	// SsoApi
	protected static final int CAPTCHA_EXPIRED = 5001;
	protected static final int CAPTCHA_ERROR = 5002;
	protected static final int LOGIN_ALREADY = 5003;

	// security
	protected static final int INVALID_SESSION = 5201;
	protected static final int SECURITY_NOT_LOGIN = 5202;
	protected static final int LOGIN_EXPIRE = 5203;
	protected static final int URL_NOT_PERMIT = 5204;
	protected static final int SYSTEM_NOT_PERMIT = 5205;
	protected static final int OK_BUT_NO_PAGE = 5206;

	//api-workflow
	protected static final int INVALID_USERID = 2400;
	protected static final int INVALID_USER_GROUP = 2401;
	protected static final int INVALID_USER_MEMBERSHIP = 2402;
	protected static final int CANNOT_GET_USER_INFO = 2403;
	protected static final int WORKFLOW_CLAIM_EXCEPTION = 2404;
	protected static final int WORKFLOW_COMPLETE_EXCEPTION = 2405;
	protected static final int WORKFLOW_ACTIVITY_EXCEPTION = 2406;
	protected static final int WORKFLOW_USER_GROUP_EXCEPTION = 2407;
	protected static final int WORKFLOW_UNCLAIM_EXCEPTION = 2408;
	protected static final int WORKFLOW_ASSIGN_EXCEPTION = 2409;
	protected static final int WORKFLOW_START_EXCEPTION = 2410;
	protected static final int WORKFLOW_INVALID_CALL_EXCEPTION = 2411;
	protected static final int WORKFLOW_DELETE_EXCEPTION = 2412;
	protected static final int WORKFLOW_NO_SOURCE_EXCEPTION = 2413;
	protected static final int WORKFLOW_NO_POLICY_INFO_EXCEPTION=2414;
	protected static final int WORKFLOW_ADD_USER_EXCEPTION=2415;
	protected static final int WORKFLOW_ADD_GROUP_EXCEPTION=2415;
	protected static final int WORKFLOW_EXISTS_PROCESSINSTANCE_EXCEPTION=2416;
	protected static final int WORKFLOW_PROCESSINSTANCE_PARSER_EXCEPTION=2417;
	protected static final int WORKFLOW_ASSIGNEE_EXCEPTION=2418;
	protected static final int WORKFLOW_PENDINGPAYMENT_EXCEPTION=2419;
	protected static final int WORKFLOW_DISPATCH_EXCEPTION = 2420;
	protected static final int WORKFLOW_INVALID_CLAIM_EXCEPTION = 2421;
	protected static final int WORKFLOW_OEM_EXCEPTION = 2422;
	
	

	//coupon错误码2600~2799
	protected static final int COUPON_BATCH_NOT_NULL = 2600;
	protected static final int COUPON_BATCH_QUERY_ERROR = 2601;
	protected static final int COUPON_BATCH_ADD_ERROR = 2602;
	protected static final int COUPON_BATCH_TOTALAMOUNT_NULL = 2603;
	protected static final int COUPON_BATCH_NAME_NULL = 2604;
	protected static final int COUPON_BATCH_OPERATOR_NULL = 2605;
	protected static final int COUPON_BATCH_BATCHID_NULL = 2606;
	protected static final int COUPON_BATCH_TATOLAMOUNT_ERROR = 2607;
	protected static final int COUPON_BATCH_REMAINAMOUNT_ERROR = 2608;
	protected static final int COUPON_BATCH_UPDATE_ERROR = 2609;
	protected static final int COUPON_BATCH_COUPONTYPE_NULL = 2610;
	protected static final int REMAINAMOUNT_NOT_ENOUGH = 2611;
	protected static final int COUPON_BATCH_IS_NULL = 2612;
	protected static final int COUPON_BATCH_STATUS_NOTUPDATE = 2613;
	protected static final int COUPON_BATCH_UPDATE_STATUS_ERROR = 2614;
	protected static final int COUPON_BATCH_STATUS_ERROR = 2615;

	protected static final int COUPON_NOT_NULL = 2630;
	protected static final int COUPON_QUERY_ERROR = 2631;
	protected static final int COUPON_ID_NULL = 2632;
	protected static final int COUPON_DEADLINE_FORMAT = 2633;
	protected static final int COUPON_INSERT_ERROR = 2634;
	protected static final int COUPON_COUNT_CTID_CID_ERROR = 2635;
	protected static final int COUPON_LOG_INSERT_ERROR = 2636;
	protected static final int COUPON_UPDATE_USESTATUS_ERROR = 2637;
	protected static final int COUPON_CALC_PRICE_PARAM_ERROR = 2638;
	protected static final int COUPON_UPDATE_STATUS_ERROR = 2639;
	protected static final int COUPON_UPDATE_WRITEBACK_ERROR = 2630;
	protected static final int COUPON_UPDATE_RESTORE_ERROR = 2631;
	protected static final int COUPON_CUSTOMERID_NULL = 2632;
	protected static final int COUPON_QUERY_NULL = 2633;
	protected static final int COUPON_NOT_BELONG_TO_CUSTOMER = 2634;
	protected static final int COUPON_NOT_BELONG_TO_SCOPE = 2635;
	protected static final int COUPON_EXPIRED = 2636;
	protected static final int COUPON_IS_USE = 2637;
	protected static final int COUPON_NOT_INCLUDE_CITY = 2638;

	protected static final int COUPON_TYPE_QUERY_ERROR = 2650;
	protected static final int COUPON_TYPE_NOT_NULL = 2651;
	protected static final int COUPON_TYPE_TOTALAMOUNT_NULL = 2652;
	protected static final int COUPON_TYPE_CITYS_FORMAT = 2653;
	protected static final int COUPON_TYPE_NAME_NULL = 2654;
	protected static final int COUPON_TYPE_BGIMAGE_NULL = 2655;
	protected static final int COUPON_TYPE_MONEYTYPE_NULL = 2656;
	protected static final int COUPON_TYPE_MONEY_NULL = 2657;
	protected static final int COUPON_TYPE_MONEY_FORMAT = 2658;
	protected static final int COUPON_TYPE_SCOPE_NULL = 2659;
	protected static final int COUPON_TYPE_EXPIRED_NULL = 2660;
	protected static final int COUPON_TYPE_OPERATID_NULL = 2661;
	protected static final int COUPON_TYPE_INSERT_ERROR = 2662;
	protected static final int COUPON_TYPE_CTID_NULL = 2663;
	protected static final int COUPON_TYPE_UPDATE_ERROR = 2664;
	protected static final int COUPON_TYPE_BATCHID_NULL = 2665;
	protected static final int COUPON_TYPE_STARTTIME_NULL = 2666;
	protected static final int COUPON_TYPE_ENDTIME_NULL = 2667;
	protected static final int COUPON_TYPE_NOT_USE = 2668;
	protected static final int COUPON_TYPE_REMAINMONEY_NULL = 2669;
	protected static final int COUPON_TYPE_BATCH_NULL = 2670;
	protected static final int COUPON_TYPE_TOTALAMOUNT_BATCH = 2671;
	protected static final int COUPON_TYPE_MAXMONEY_NULL = 2672;
	protected static final int COUPON_TYPE_MAXMONEY_FORMAT = 2673;
	protected static final int COUPON_TYPE_COUPONDESC_NULL = 2674;
	protected static final int COUPON_TYPE_TIME_REQUIRED = 2675;
	protected static final int COUPON_TYPE_SEND_UPPERLIMIT = 2676;
	protected static final int COUPON_TYPE_IS_NULL = 2677;
	protected static final int COUPON_TYPE_UPDATE_STATUS_CREATE = 2678;
	protected static final int COUPON_TYPE_UPDATE_STATUS_EQUEST = 2679;
	protected static final int COUPON_TYPE_NOTUPDATE_STATUS = 2680;

	protected static final int COUPON_CODE_QUERY_ERROR = 2730;
	protected static final int COUPON_CODE_UPDATE_AMOUNT_ERROR = 2731;
	protected static final int COUPON_CODE_UPDATE_STATUS_ERROR = 2732;
	protected static final int COUPON_CODE_INSERT_ERROR = 2733;
	protected static final int COUPON_CODE_OPERATID_NULL = 2734;
	protected static final int COUPON_CODE_IS_HAVE = 2735;
	protected static final int COUPON_CODE_IS_NOT_HAVE = 2736;
	protected static final int COUPON_CODE_IS_NULL = 2737;
	protected static final int COUPON_CODE_IS_EXCHANGE = 2738;
	protected static final int COUPON_CODE_EXCHANG_COUPONTYPEISNULL = 2739;
	protected static final int COUPON_CODE_EXCHANGE_NUMBER = 2740;

	protected static final int CODE_RELE_INSERT_ERROR = 2760;

	//UserSrv 错误码1800~1999
	protected static final int CUSTOMER_CUSTOMERNULL = 1800;
	protected static final int CUSTOMER_MOBILENULL = 1801;
	protected static final int CUSTOMER_CUSTOMEREXIST = 1802;
	protected static final int CUSTOMER_CARNULL = 1803;
	protected static final int CUSTOMER_CARCIDNULL = 1804;
	protected static final int CUSTOMER_CAREXIST = 1805;
	protected static final int CUSTOMER_EXPRESSNULL = 1806;
	protected static final int CUSTOMER_EXPRESSCIDNULL = 1807;
	protected static final int CUSTOMER_INSURENULL = 1808;
	protected static final int CUSTOMER_OPENIDNULL = 1809;
	protected static final int CUSTOMER_WECHATNULL = 1810;
	protected static final int CUSTOMER_ADDCUSTOMERFAIL = 1811;
	protected static final int CUSTOMER_IMPORTCUSTOMERFAIL = 1812;
	protected static final int CUSTOMER_CUSTOMERISEXISTFAIL = 1813;
	protected static final int CUSTOMER_UPDATECUSTOMERFAIL = 1814;
	protected static final int CUSTOMER_SETCUSTOMERSTATUSFAIL = 1815;
	protected static final int CUSTOMER_SETTRACKSTATUSFAIL = 1816;
	protected static final int CUSTOMER_SELECTCUSTOMERFAIL = 1817;
	protected static final int CUSTOMER_ADDCARFAIL = 1818;
	protected static final int CUSTOMER_UPDATECARRFAIL = 1819;
	protected static final int CUSTOMER_SETCARSTATUSFAIL = 1820;
	protected static final int CUSTOMER_SETCARTRACKSTATUSFAIL = 1821;
	protected static final int CUSTOMER_SELECTCARFAIL = 1822;
	protected static final int CUSTOMER_SELECTCARLISTFAIL = 1823;
	protected static final int CUSTOMER_ADDEXPRESSINFOFAIL = 1824;
	protected static final int CUSTOMER_UPDATEEXPRESSINFOFAIL = 1825;
	protected static final int CUSTOMER_SETDEFAULTEXPRESSINFOFAIL = 1826;
	protected static final int CUSTOMER_SELECTEXPRESSINFOFAIL = 1827;
	protected static final int CUSTOMER_SELECTEXPRESSLISTFAIL = 1828;
	protected static final int CUSTOMER_UPDATEINSUREFAIL = 1829;
	protected static final int CUSTOMER_SELECTINSUREFAIL = 1830;
	protected static final int CUSTOMER_SELECTINSURELISTFAIL = 1831;
	protected static final int CUSTOMER_ADDWECHATINFOFAIL = 1832;
	protected static final int CUSTOMER_WECHATREGISTERFAIL = 1834;
	protected static final int CUSTOMER_WECHATBINDFAIL = 1835;
	protected static final int CUSTOMER_SELECTWECHATCUSTOMERFAIL = 1836;
	protected static final int CUSTOMER_FOLLOWWECHATFAIL = 1837;
	protected static final int CUSTOMER_CANCELWECHATFOLLOWFAIL = 1838;
	protected static final int CUSTOMER_SELECTWECHATINFOFAIL = 1839;
	protected static final int CUSTOMER_SETCUSTOMEROPIDFAIL = 1840;
	protected static final int CUSTOMER_CAR_NUMBER_IS_NULL = 1841;
	protected static final int CUSTOMER_ADD_INSURE_PERSON_FAILED = 1842;
	protected static final int CUSTOMER_ASSIGN_TASK_FAILED = 1843;
	protected static final int CUSTOMER_RECYCLE_TASK_FAILED = 1844;
	protected static final int CAR_PROCESSED = 1845;
	protected static final int CAR_ABANDON = 1846;
	protected static final int TOTAL_NUMBER_ERROR = 1847;
	protected static final int TASK_STATUS_WRONG = 1848;
	protected static final int NO_PERMISSION = 1849;
	protected static final int ONLY_ONESELF_CAN_OPERATE = 1850;
	protected static final int FILING_ALREADY = 1851;
	protected static final int SOMEONE_IS_TRACKING = 1852;

	//OrderSrv 错误码 2000~2199
	protected static final int ORDER_ACTIVITYNULL = 2000;
	protected static final int ORDER_PRODUCTNULL = 2001;
	protected static final int ORDER_COMPUTENULL = 2002;
	protected static final int ORDER_ORDERNULL = 2003;
	protected static final int ORDER_ORDERITEMNULL = 2004;
	protected static final int ORDER_ORDERIDNULL = 2005;
	protected static final int ORDER_EXPRESSNULL = 2006;
	protected static final int ORDER_EXPRESSITEMNULL = 2007;
	protected static final int ORDER_ITEMSTRATEGYNULL = 2008;
	protected static final int ORDER_INVALIDORDER = 2009;
	protected static final int ORDER_NOTFIND_PRODUCT = 2010;
	protected static final int ORDER_STRATEGYNULL = 2011;
	protected static final int ORDER_INVALID_PRODUCT = 2012;
	protected static final int ORDER_INVALID_ACTIVITY = 2013;
	protected static final int ORDER_INVALID_STRATEGY = 2014;
	protected static final int ORDER_PAYMENT_EXIST = 2015;
	protected static final int ORDER_PAYMENT_EXPIRATION_NULL = 2016;
	protected static final int ORDER_PAYMENT_EXPIRATION_ERROR = 2017;
	protected static final int ORDER_PAYMENT_METHOD_NOT_ALLOWED = 2018;
	protected static final int ORDER_PAYMENT_METHOD_ERROR = 2019;
	protected static final int ORDER_STATUS_HAS_BEEN_CANCELED = 2020;
	protected static final int ORDER_STATUS_ERROR = 2021;
	protected static final int ORDER_PAYMENT_INFO_ERROR = 2022;
	protected static final int ORDER_STATUS_NOT_PAYABLE = 2023;



	//couponAPI
	protected static final int COUPONAPI_DATE_FORMAT_ERROR = 2800;
	protected static final int COUPONAPI_COUPONCODE_TOTAL_ERROR = 2801;
	protected static final int COUPONAPI_COUPONCODE_NUMBER_ERROR = 2802;
	protected static final int COUPONAPI_COUPONCODE_CODE_NULL = 2803;
	protected static final int COUPONAPI_TOCUSTOMER_CTID_NULL = 2804;
	protected static final int COUPONAPI_TOCUSTOMER_CID_NULL = 2805;
	protected static final int COUPONAPI_COUPONCODE_CODE_ERROR = 2806;
	protected static final int COUPONAPI_COUPONBATCH_IS_INVALID = 2807;
	//CoreSrv 错误码 3000~3199
	protected static final int CORE_STRATEGYCONFIGUREERROR = 3000;
	protected static final int CORE_DISCOUNTSTRATEGYERROR = 3001;
	protected static final int CORE_NODANGERSTRATEGYERROR = 3002;
	protected static final int CORE_GIVEPRODUCTSTRATEGYERROR = 3003;
	protected static final int CORE_ORDER_NULL = 3004;
	protected static final int CORE_ORDERITEMS_NULL = 3005;
	protected static final int CORE_ORDERITEM_PID_NULL = 3006;
	protected static final int CORE_ORDERITEM_PRODUCT_NOT_EXIST = 3007;
	protected static final int CORE_ORDERITEM_COUPON_NOT_EXIST= 3008;
	protected static final int CORE_ORDERITEM_HIT_ACTIVITYS_ERROR= 3009;
	protected static final int CORE_COMPUTE_NULL= 3010;
	protected static final int CORE_INSURANPERSON_NULL= 3011;
	protected static final int CORE_INSURANCE_NULL= 3012;
	protected static final int CORE_BUSINESSINSURANCEFEEDETAIL_NULL= 3013;
	protected static final int CORE_UPDATEORDERAMOUNT_ERROR= 3014;
	protected static final int CORE_UPDATEORDER_ERROR= 3015;
	protected static final int CORE_PLACEORDER_ERROR= 3016;
	protected static final int CORE_FORCESURANCEFEEDETAIL_NULL= 3017;
	protected static final int CORE_INSURANCECAR_NULL= 3018;
	protected static final int CORE_INSURANCEALL_NULL= 3019;
	protected static final int CORE_INSURANCE_REPEAT= 3020;
	protected static final int CORE_INSURANCE_DATE_ERROR= 3021;
	protected static final int CORE_BUSINESSINSURANCE_DATE_NULL= 3022;
	protected static final int CORE_FORCEINSURANCE_DATE_NULL= 3023;
	protected static final int CORE_CALL_WORKFLOW_IO_ERROR= 3024;
	protected static final int CORE_CALL_WORKFLOW_FAILED= 3025;
	protected static final int CORE_ORDER_STATUS_INELIGIBLE = 3026;
	protected static final int CORE_OEM_PARAMETER_NULL = 3027;
	protected static final int CORE_OEM_PARAMETER_ILLEGAL = 3028;
	protected static final int CORE_PLATE_CITY_INFO_ERROR = 3209;

	//srv-calc 3200-3399
	protected static final int CALC_QUERY_ERR_PLATFORM = 3200;
	protected static final int CALC_INSURANCE_ERR_EMPTY = 3201;
	protected static final int CALC_INSURANCE_COMPANY_NOT_SURPPORT = 3202;
	protected static final int CALC_CPIC_ERR_SUM_INSURED = 3203;
	protected static final int CALC_QUERY_PARAM_ERR = 3204;
	protected static final int CALC_EXECEPTION_ERR = 3205;
	protected static final int CALC_SBI_CPIC_ERR = 3206;
	protected static final int CALC_SBI_NO_MODEL_CODE_ERR = 3207;
	protected static final int CALC_INSURANCE_COMPANY_GENRATE_CONFIG_SEVICE_ERR = 3208;
	protected static final int CALC_INSURANCE_COMPANY_CITY_NOT_SURPPORT = 3209;
	protected static final int CALC_INPUT_PARAM_ERR = 3210;
	protected static final int CALC_INSURANCE_COMPANY_NOT_RESPONSE = 3211;
	protected static final int CALC_INSURANCE_COMPANY_CONNECT_EXCEPTION = 3212;
	protected static final int CALC_INSURANCE_COMPANY_TIMEOUT_EXCEPTION = 3213;
	protected static final int CALC_INSURANCE_COMPANY_LOGIN_FAIL = 3214;
	protected static final int CALC_INSURANCE_COMPANY_VERIFICATION_CODE_ERROR = 3215;
	protected static final int CALC_INSURANCE_COMPANY_SESSION_EXPIRE = 3216;
	protected static final int CALC_INSURANCE_COMPANY_RESPONSE_EXCEPTION_MSG = 3217;
	protected static final int CALC_INSURANCE_COMPANY_RESPONSE_ERROR_MSG = 3218;
	protected static final int CALC_INSURANCE_COMPANY_RESPONSE_DATA_STRUCTURE_INCORRECT = 3219;
	protected static final int CALC_INSURANCE_COMPANY_CALC_NOT_EXPECTED_EXECEPTION = 3220;
	protected static final int CALC_INSURANCE_COMPANY_NOT_GET_INFO = 3221;
	protected static final int CALC_INSURANCE_COMPANY_NOT_MATCH_INFO = 3222;
	protected static final int CALC_INSURANCE_COMPANY_RESULT_RESOLVE_ERROR = 3223;
	protected static final int CALC_CACHE_OPERATE_ERR = 3224;
	protected static final int CALC_REQUEST_COUNT_LIMIT_ERR = 3225;
	protected static final int CALC_SBI_NO_MODEL_CODE_INACCURATE = 3226;

	protected static final int CALC_CPIC_SESSION_TIMEOUT = 3301;

	//srv-finance 3400-3599
	protected static final int FINANCE_NOT_BALANCED = 3400;
	protected static final int FINANCE_NOT_ACCOUNT_SUBJECT = 3401;
	protected static final int FINANCE_INVALID_ACCOUNT_SUBJECT_CODE = 3402;

	//api-crm 3600-3699
	protected static final int CRM_CANNOT_GET_OBJECT_BY_SERVICE=3600;
	protected static final int GENERATE_SHORT_URL_ERROR=3601;
	protected static final int SMS_SEND_FAILED=3602;
	protected static final int FOUNTD_NOT_CALC_INFO=3603;
	protected static final int FOUND_NOT_CUSTOMER_CAR_INFO=3604;
	protected static final int SMS_PHONES_EMPTY_ERROR=3605;
	protected static final int SMS_SEND_PHONES_ERROR=3606;
	protected static final int SMS_SEND_PHONES_DUB=3607;
	protected static final int SMS_SEND_LESS_LIMIT_ERROR=3608;
	protected static final int SMS_SEND_COUNT_ERROR=3609;
	protected static final int SMS_SEND_CONTENT_EMPTY_ERROR=3610;
	protected static final int SMS_MULTI_XLS_FILE_ERROR=3611;
	protected static final int SMS_FILE_CSV_ERROR=3612;
	protected static final int SMS_BATCH_SEND_FAILED=3613;
	protected static final int CALC_SMS_LIMIT_ERROR=3614;
	protected static final int CAT_SMS_LIMIT_ERROR=3615;
	protected static final int BUY_NOT_BUSINESS_INSURANCE=3616;
	protected static final int CRM_CANNOT_UPDATE_ORDER_RECIPENT=3617;
	protected static final int CRM_CAN_ONLY_UPDATE_ORDER_RECIPENT=3618;
	protected static final int CRM_INSURANCE_PICS_NULL = 3619;
	protected static final int CRM_EMAIL_PARAMETER_ILLEGAL = 3620;
	protected static final int CRM_EMAIL_NOT_ALLOWED = 3621;
	protected static final int CRM_EMAIL_ERROR = 3622;


	//srv-crm 3700-3799
	protected static final int CAR_ID_NULL=3700;
	protected static final int CAR_TYPE_NULL=3701;


	//srv-insurance 2200~2399
	protected static final int INSURANCE_DRIVERS_MANY=2204;
	protected static final int INSURANCE_INVALID_INSURANCEID=2205;
	protected static final int INSURANCE_INVALID_ITEMID=2206;
	protected static final int INSURANCE_FEEDETAIL_MANY=2207;
	protected static final int INSURANCE_PERSON_MANY=2208;
	protected static final int INSURANCE_INVALID_ORDERID=2209;
	protected static final int INSURANCE_IMAGE_URL_ILLEGAL = 2210;

	//api-cc 3800-3999
	protected static final int CALLCENTER_DATA_NOT_EXIST= 3800;
	protected static final int CALLCENTER_MAPPING_RELATION_EXIST = 3801;
	protected static final int CALLCENTER_SEAT_NOT_EXIST = 3802;
	protected static final int CALLCENTER_EXTENSION_NOT_EXIST= 3803;
	protected static final int CALLCENTER_DATA_NOT_SELECT = 3804;
	protected static final int CALLCENTER_COMPANY_NOT_SAME = 3805;
	protected static final int CALLCENTER_SEAT_INVALID = 3806;
	protected static final int CALLCENTER_EXTENSION_INVALID = 3807;
	public static final int CALLCENTER_DELETE_ERROR = 3808;
	public static final int CALLCENTER_ADD_CALL_RECORD_ERROR=3809;
	//srv-dbdatasync 4000-4199
	protected static final int ALIYUNBINLOG_COUSUMER_STARTUP_FAILED = 4000;
	protected static final int ALIYUNBINLOG_COUSUMER_UNINITIALIZE = 4001;
	protected static final int ALIYUNBINLOG_COUSUMER_CLOSE_FAILED = 4002;
	protected static final int ALIYUNBINLOG_BINLOG_FIELDVALUEUPDATED_LOST = 4003;
	protected static final int ALIYUNBINLOG_TARGET_DBINSTANCE_LOST = 4004;
	protected static final int ALIYUNBINLOG_TARGET_DBINSTANCE_TYPE_ERROR = 4005;
	protected static final int ALIYUNBINLOG_BINLOG_RECORD_TYPE_ERROR = 4006;
	public static final int ALIYUNBINLOG_FIELD_PARSE_UNSUPPOR_TYPE_EXCEPTION = 4007;
	public static final int ALIYUNBINLOG_FIELD_PARSE_ENCODING_EXCEPTION = 4008;
	public static final int COMPENT_HAS_STARTUPED = 4009;
	public static final int DATAREPLAY_DML_NOT_LEGAL_ERROR = 4010;
	public static final int DATAREPLAY_TABLENAME_IS_NULL = 4011;
	public static final int DATAREPLAY_GET_PREPARESTATEMENT_ERROR = 4012;
	public static final int DATAREPLAY_DEL_PKS_IS_NULL = 4013;
	public static final int DATAREPLAY_INSERT_PKS_AND_FIELDS_IS_NULL = 4014;
	public static final int DATAREPLAY_UPDATE_PKS_OR_FIELDS_IS_NULL = 4015;
	public static final int DATAREPLAY_UPDATE_ROW_NOT_ONE = 4016;
	public static final int DATAREPLAY_SQL_EXECUTE_ERROR = 4017;
	public static final int DATAREPLAY_CONNECTION_ERROR = 4018;

	public static final int NOT_EXIST_ERROR = 4019;
	public static final int EXIST_MORE_ERROR = 4020;
	public static final int NOT_SUPPORT_UNALIYUN = 4021;
	public static final int NOT_EXIST_NEED_STOP_TASK = 4022;


	//srv-data-proxy.........4200-4399
	protected static final int DATAPROXY_GET_CONNECTION_ERROR = 4200;
	protected static final int DATAPROXY_EXECUTE_SQL_ERROR = 4201;
	//srv-customer-third....4400-4599
	public static final int WECHAT_ACCESS_TOKEN_NULL = 4400;
	public static final int WECHAT_MENU_JSON_NULL = 4401;
	public static final int WECHAT_CREATE_MENU_ERROR = 4402;
	public static final int WECHAT_CODE_NULL = 4403;
	public static final int WECHAT_OAUTH2_ACCESS_TOKEN_ERROR = 4404;
	public static final int WECHAT_QRCODE_TYPE_ERROR = 4405;
	public static final int WECHAT_CREATE_QRCODE_ERROR = 4406;
	public static final int WECHAT_TEMP_QRCODE_EXPIRED_ERROR = 4407;
	public static final int WECHAT_EXCUTE_GET_ERROR = 4408;
	public static final int WECHAT_GET_USER_INFO_ERROR = 4409;
	public static final int THIRD_INSERT_MENU_LOG_ERROR = 4410;
	public static final int THIRD_SELECT_LAST_MENU_LOG_ERROR = 4411;
	public static final int THIRD_SELECT_THIRD_INFO_ERROR = 4412;
	public static final int THIRD_INSERT_THIRD_INFO_ERROR = 4413;
	public static final int THIRD_UPDATE_THIRD_INFO_ERROR = 4414;
	public static final int THIRD_UPDATE_THIRD_INFO_NULL = 4415;
	public static final int WECHAT_CREATE_JSAPI_TICKET_ERROR = 4416;
	public static final int THIRD_API_JSAPI_TYPE_ERROR = 4417;
	public static final int THIRD_SELECT_SUB_MESSAGE_ERROR = 4418;
	public static final int THIRD_INSERT_SUB_MESSAGE_ERROR = 4419;
	public static final int THIRD_UPDATE_SUB_MESSAGE_NULL = 4420;
	public static final int THIRD_SUB_MSG_ID_NULL = 4421;
	public static final int THIRD_UPDATE_SUB_MESSAGE_ERROR = 4422;
	public static final int THIRD_SELECT_SUB_MESSAGE_PARAM_NULL = 4423;
	public static final int THIRD_SELECT_MENU_LOG_ERROR = 4424;
	public static final int THIRD_SELECT_QRCODE_ERROR = 4425;
	public static final int THIRD_INSERT_QRCODE_ERROR = 4426;
	public static final int THIRD_QRCODE_NULL = 4427;
	public static final int THIRD_QRCODE_ID_NULL = 4428;
	public static final int THIRD_SELECT_MAX_QRCODE_ERROR = 4429;
	public static final int THIRD_INSERT_SUB_LOG_ERROR = 4430;
	public static final int THIRD_SELECT_SUB_LOG_ERROR = 4431;
	public static final int WECHAT_GET_MEDIA_FILE_ERROR = 4432;
	public static final int WECHAT_GET_SHORT_URL_ERROR = 4433;
	public static final int CREATE_QRCODE_WECHATTYPE_NULL = 4434;
	public static final int CREATE_QRCODE_BELONGTYPE_NULL = 4435;
	public static final int CREATE_QRCODE_BELONGID_NULL = 4436;
	public static final int CREATE_QRCODE_QRCODETYPE_NULL = 4437;
	public static final int CREATE_QRCODE_OPID_NULL = 4438;
	public static final int CREATE_QRCODE_EXPIRED_NULL = 4439;


	public static final int QRCODE_PARAMETER_EXISTS = 4500;
	public static final int TEMP_QRCODE_OVERDUE = 4501;
	public static final int QRCODE_PARAMETER_ERROR = 4502;
	public static final int THRID_AUTH_CONFIG_SELECT_ERROR = 4503;
	public static final int THRID_AUTH_CONFIG_INSERT_ERROR = 4504;

	//srv-indicator-dispatch........4600-4699
	public static final int EVENT_IS_NULL_EXCEPTION = 4600;
	public static final int EVENT_PUSH_TO_MQ_EXCEPTION = 4601;

	// api-activity..........4700-4799
	public static final int CAPTCHA_PIC_CODE_FAILURE = 4700;
	public static final int CAPTCHA_PIC_CODE_ERROR = 4701;
	public static final int PHONE_FORMAT_ERROR = 4702;
	public static final int OPERATION_FREQUENT = 4703;
	public static final int PLATE_NUMBER_FORMAT_ERROR = 4704;
	public static final int CAPTCHA_SMS_CODE_ERROR = 4705;
	public static final int CALC_TRY_INSERT_ERROR = 4706;
	public static final int CALC_TRY_SELECT_ERROR = 4707;
	public static final int SOURCE_TEMPLATE_SELECT_ERROR = 4708;
	public static final int CUSTOMER_SELECT_NULL = 4709;
	public static final int NAME_INCLUED_NOT_UTF8 = 4710;
	public static final int NAME_LENGTH_NOT_CONFORM = 4711;
	public static final int CALC_TRY_RESULT_NULL = 4712;
	public static final int PLATE_NUMBER_IS_HAVE = 4713;
	public static final int ACTIVITY_INSURE_PERSON_NULL = 4714;
	public static final int CENTER_ACTIVITY_ERROR=4715;
	public static final int OUTTER_ACTIVITY_ERROR=4716;
	public static final int ADD_ACTIVITY_ERROR=4717;
	public static final int SELECT_ACTIVITY_ERROR=4718;
	public static final int SELECT_ACTIVITY_RESULTS_ERROR=4719;
	public static final int EDIT_ACTIVITY_ERROR=4720;
	public static final int COUPON_USE_FAIL=4721;
	public static final int COUPON_EXCHANGE_FAIL=4722;
	public static final int PAGE_API_TIMEOUT_ERROR=4723;
	public static final int BROWSER_LIMIT_ERROR =4724;
	public static final int USER_LOGIN_ERROR =4725;
	public static final int PARAMS_IS_NULL =4726;
	public static final int INSURANCE_EXPIRED_ERROR =4727;
	public static final int ACTIVITY_IS_NULL =4728;
	public static final int ACTIVITY_TIMES_OVER =4729;
	public static final int ACTIVITY_END =4730;
	public static final int CALC_RECORD_NO_EXIST =4731;

	public static final int TIMES_OVER =4732;
	public static final int ACTIVITY_OVER =4733;
	public static final int HAVE_CAR =4734;
	public static final int HU_CAR =4735;
	public static final int NO_CACL =4736;
	public static final int PA_CITY =4737;
	public static final int COUPON_OVER =4738;
	public static final int OTHER_FAIL =4739;

	public static final int APPOINTMENT_TIME_ERROR =4740;
	public static final int BIND_CID_TO_RECORD_ERROR =4741;
	public static final int EXCHANGE_OVER =4742;
	public static final int CALC_ERROR =4743;
	
	

	// api-activity-admin....4800-4899
	public static final int EXPORT_RESULT_TIME_ISNULL=4800;
	public static final int SELECT_CALC_RESULT_ERROR=4801;
	public static final int UPDATECUSTOMERSOURCE_FAIL=4802;
	public static final int INSERTSTOMERSOURCE_FAIL=4803;
	public static final int SET_WINNING_FAIL=4804; 
	public static final int RULE_ERROR=4805;
	public static final int ADD_SALE_ERROR=4806;
	public static final int LIST_SALE_ERROR=4807;
	public static final int UPDATE_SALE_ERROR=4808;
	public static final int LIST_SALE_URL_ERROR=4809;
	public static final int ADD_SALE_URL_ERROR=4810;
	public static final int UPDATE_SALE_URL_ERROR=4811;
	public static final int GET_SALE_URL_ERROR=4812;
	public static final int GET_SALE_ERROR=4813;
	public static final int ADD_SALE_RECORD_ERROR=4814;
	public static final int GET_SALE_RECORD_ERROR=4815;
	public static final int BIND_CID_TO_SALE_RECORD_ERROR=4816;
	public static final int EXPORT_RESULT_ACTIVITYID_ISNULL=4817;

	// srv-indicator-persistence....4900-4999
	public static final int 数据格错误=4900;

	// srv-dictionary... 5000 - 5099
	protected static final int DICTIONARY_DUPLICATE_OFFICE_CITY=5000;

	// srv-brokerage.... 5400 - 5599
	protected static final int BROKERAGE_STRATEGY_NULL = 5400;
	protected static final int BROKERAGE_STRATEGY_FORMULA_FORMAT_ILLEGAL = 5401;
	protected static final int BROKERAGE_STRATEGY_FORMULA_TYPE_ILLEGAL = 5402;
	protected static final int BROKERAGE_INPUT_PRECONDITION_ILLEGAL = 5403;
	protected static final int BROKERAGE_NO_MATCHED_STRATEGY = 5404;
	protected static final int BROKERAGE_LB_LOG_NULL = 5405;
	protected static final int BROKERAGE_LB_LOG_STATUS_ILLEGAL = 5406;
	protected static final int BROKERAGE_FORMULA_TYPE_ILLEGAL = 5407;
	protected static final int BROKERAGE_FORMULA_VALUE_ILLEGAL = 5408;
	protected static final int BROKERAGE_STRATEGY_STATUS_ILLEGAL = 5409;
	protected static final int BROKERAGE_STRATEGY_UPDATE_FAILURE = 5410;
	protected static final int BROKERAGE_MATCH_OEM_RULE_FAILURE = 5411;

	// srv-activiti-engine ....5100-5199
	public static final int ACTIVITI_PROCESS_BUSINESS_KEY_EMPTY_EXCEPTION=5100;
	public static final int ACTIVITI_PROCESS_BUSINESS_KEY_VALID_EXCEPTION=5101;
	public static final int ACTIVITI_USER_ID_VALID_EXCEPTION=5102;
	public static final int ACTIVITI_PROCESS_INSTANCE_ID_VALID_EXCEPTION=5103;
	public static final int ACTIVITI_PROCESS_VALID_EXCEPTION=5104;
	public static final int ACTIVITI_WORKFLOW_START_EXCEPTION=5105;
	public static final int ACTIVITI_COMPLETE_TASK_EXCEPTION=5106;
	public static final int ACTIVITI_CLAIM_EXCEPTION=5107;
	public static final int ACTIVITI_UNCLAIM_EXCEPTION=5108;
	public static final int ACTIVITI_PARAMETER_EXCEPTION=5109;
	public static final int ACTIVITI_UNFINISHED_HISTORIC_TASK_EXCEPTION=5110;
	public static final int ACTIVITI_GROUP_ID_VALID_EXCEPTION=5111;
	public static final int ACTIVITI_OBTAIN_USER_EXCEPTION=5112;
	public static final int ACTIVITI_OBTAIN_GROUP_EXCEPTION=5113;
	public static final int ACTIVITI_ADD_USER_EXCEPTION=5114;
	public static final int ACTIVITI_ADD_GROUP_EXCEPTION=5115;
	public static final int ACTIVITI_DELETE_MEMBERSHIP_EXCEPTION=5116;
	public static final int ACTIVITI_ADD_MEMBERSHIP_EXCEPTION=5117;
	public static final int ACTIVITI_QUERY_START_END_TIME_EXCEPTION=5118;
	public static final int ACTIVITI_QUERY_FIRST_MAX_EXCEPTION=5119;
	public static final int ACTIVITI_OBTAIN_HISTORIC_ACTIVITI_EXCEPTION=5120;
	public static final int ACTIVITI_OBTAIN_HISTORIC_INSTANCE_EXCEPTION=5121;
	public static final int ACTIVITI_OBTAIN_PROCESS_VARIABLE_EXCEPTION=5122;
	public static final int ACTIVITI_SET_PROCESS_VARIABLE_EXCEPTION=5123;
	public static final int ACTIVITI_OBTAIN_PROCESS_INSTANCE_EXCEPTION=5124;
	public static final int ACTIVITI_CONVERTION_EXCEPTION=5125;
	public static final int ACTIVITI_REDIS_EXCEPTION=5126;
	public static final int ACTIVITI_OBTAIN_TASK_EXCEPTION=5127;
	public static final int ACTIVITI_OBTAIN_PROCESS_DEFINITION_EXCEPTION=5128;
	public static final int ACTIVITI_DELETE_DEPLOYMENT_EXCEPTION=5129;

	// api-bee...............5600-5799
	public static final int BEE_LOGIN_PHONE_INVALID = 5600;
	public static final int BEE_LOGIN_OPERATOR_FREQUENT = 5601;
	public static final int BEE_LOGIN_CAPTCHA_ERROR = 5602;
	public static final int BEE_LOGIN_SESSION_INVALID = 5603;
	public static final int BEE_LOGIN_STATUS_FROST = 5604;
	public static final int BEE_REGISTER_PHONE_CARD_NULL = 5605;
	public static final int BEE_INSURANCE_IS_NOT_HAVE = 5606;
	public static final int BEE_RECORD_HB_IS_HAVE = 5607;
	public static final int BEE_CALC_PRICE_FREQUENT = 5608;
	public static final int BEE_CALC_PRICE_DAY_FREQUENT = 5609;
	public static final int BEE_CALC_PRICE_FORCE_NOT_YETDATE = 5610;
	public static final int BEE_CALC_PRICE_INVALID = 5611;
	public static final int BEE_CALC_PRICE_PLATENUMBER_INVALID = 5612;
	public static final int BEE_CALC_PRICE_DAY_UP_LIMIE = 5613;
	public static final int BEE_CALC_PRICE_ITEM_NULL = 5614;
	public static final int BEE_CAR_COMMIT_AUDIT = 5615;
	public static final int BEE_REGISTER_RECOMMEND_NOT_HAVE = 5616;
	public static final int BEE_REGISTER_RECOMMEND_NULL = 5617;
	public static final int BEE_REGISTER_RECOMMEND_CITY_NOT_EQUEST = 5618;
	public static final int BEE_SELECT_INSURANCE_ERROR = 5619;
	public static final int BEE_SELECT_RECORD_ERROR = 5620;
	public static final int BEE_CONFIRMINSURANCE_BENEFITDISCOUNT_ZERO = 5621;
	public static final int BEE_CONFIRMINSURANCE_COMMISSION_ZERO = 5622;
	public static final int BEE_CONFIRMINSURANCE_ERROR = 5623;
	public static final int BEE_CALC_INSURANCE_IS_NULL = 5624;
	public static final int BEE_CALC_RECORD_IS_NULL = 5625;
	public static final int BEE_JUDGE_PLATENUMBER_ISURED_FAILURE = 5626;
	public static final int BEE_INSERT_CALC_RECORD_ERROR = 5627;
	public static final int BEE_SELECT_MEMBER_RELE_INFO_ERROR = 5628;
	public static final int BEE_CONFIRMPRICE_ERROR = 5629;
	public static final int BEE_PAYMENT_INFO_EXCEPTION = 5630;
	public static final int BEE_PAY_EXCEPTION = 5631;
	public static final int BEE_PAY_CHECK_EXCEPTION = 5632;
	public static final int BEE_SELECT_INSURANCE_STATUS_ERROR = 5633;
	public static final int BEE_SELECT_CHANNEL_MANAGER_ERROR = 5634;
	public static final int BEE_PAY_INVALID_EXCEPTION = 5635;
	public static final int BEE_SELECT_APP_UPDATE_ERROR = 5636;
	public static final int BEE_INSERT_MEMBER_RELE_INFO_ERROR = 5637;
	public static final int BEE_UPDATE_CALC_TIME_ERROR = 5638;
	public static final int BEE_SELECT_PAY_INFO_ERROR = 5639;
	public static final int BEE_CAR_OWNER_IDNUMBER_ERROR = 5640;
	public static final int BEE_ORDER_IS_NULL = 5641;
	public static final int BEE_PAY_WAY_IS_NULL = 5642;
	public static final int BEE_CONFIRMPRICE_UP_LIMIT = 5643;
	public static final int BEE_GET_PAY_INFO_PARAM_ERROR = 5644;
	public static final int BEE_LOGIN_ADD_SESSION_ERROR = 5645;
	public static final int BEE_LOGIN_UPDATE_SESSION_ERROR = 5646;
	public static final int BEE_CALC_PRICE_BUSINESS_DATE_MORE = 5647;
	public static final int BEE_CALC_PRICE_BUSINESS_DATE_FORMAT = 5648;
	public static final int BEE_CANCEL_ORDER_FAILD = 5649;
	public static final int BEE_SELECT_CITY_CONF_ERROR = 5650;
	public static final int BEE_SERVICE_WEIHU_PROMPT = 5651;

	// api-bee-admin.........5800-5999
	public static final int BEE_INSERT_TAG_ERROR = 5800;
	public static final int BEE_SELECT_TAG_ERROR = 5801;
	public static final int BEE_INSERT_TAG_RELE_ERROR = 5802;
	public static final int BEE_SELECT_TAG_RELE_ERROR = 5803;
	public static final int BEE_INSERT_OPERATOR_RELE_ERROR = 5804;
	public static final int BEE_SELECT_OPERATOR_RELE_ERROR = 5805;
	public static final int BEE_SELECT_CITY_MEMBER_RELE_COUNT_ERROR = 5806;
	public static final int BEE_INSERT_MEMBER_RELE_ERROR = 5807;
	public static final int BEE_SELECT_MEMBER_RELE_ERROR = 5808;
	public static final int OPERATOR_RELE_NOT_HAVE = 5809;
	public static final int CALC_RECORD_SELECT_ERROR = 5810;
	public static final int QUERY_BEE_ORDER_COUNT_ERROR = 5811;
	public static final int QUERY_BEE_RELE_ERROR = 5812;
	public static final int CITY_MANAGER_IS_HAVE = 5813;
	public static final int CLOSE_CITY_MANAGER_IS_HAVE = 5814;
	public static final int CITY_MANAGER_IS_NOT_HAVE = 5815;
	public static final int QUERY_BEE_RELE_IS_HAVE_ERROR = 5816;
	public static final int QUERY_BEE_RELE_COUNT_ERROR = 5817;
	public static final int MEMBER_LOG_BATCH_INSERT_ERROR = 5818;
	public static final int QUERY_MEMBER_ALL_BEE_ERROR = 5819;
	public static final int UPDATE_BEE_MEMBER_ERROR = 5820;
	public static final int QUERY_BEE_INFO_STATISTICS_ERROR = 5821;
	public static final int OPERATOR_RELE_IS_NOT_HAVE = 5822;
	public static final int OPERATOR_CITY_NOT_EQUEST = 5823;
	public static final int OPERATOR_COUNTYID_NOT_EQUEST = 5824;
	public static final int OPERATOR_UNAUTHORIZED = 5825;
	public static final int MODIFY_MEMBER_BEE_IS_HAVE = 5826;
	public static final int BEE_OPERATOR_RELE_IS_NULL = 5827;
	public static final int BEE_OPERATOR_RELE_OPID_NULL = 5828;
	public static final int BEE_OPERATOR_RELE_OPTYPE_NULL = 5829;
	public static final int BEE_OPERATOR_RELE_UPDATE_ERROR = 5830;
	public static final int MODIFY_MEMBER_CITY_COUNTY_NULL = 5831;
	public static final int BATCH_IMPORT_BEE_OPERATOR_NOT_HAVE = 5832;
	public static final int ADD_BEE_CITY_NOT_EQUEST = 5833;
	public static final int ADD_BEE_COUNTY_NOT_EQUEST = 5834;
	public static final int ADD_BEE_IMPORT_FILE_NULL = 5835;
	public static final int ADD_BEE_IMPORT_FILE_FAILED = 5836;
	public static final int OPERATOR_ROLE_LOG_RECORD_INSERT_ERROR = 5837;
	public static final int ADD_BEE_TAG_NAME_REPEAT = 5838;
	public static final int SELECT_CHANNEL_MANAGER_NULL = 5839;
	public static final int BEE_MANAGER_CITY_COUNTY_NOT_EQUEST = 5840;
	public static final int BEE_UPDATE_ERROR = 5841;
	public static final int BEE_UPDATE_CITY_COUNTY_NOT_WITH = 5842;
	public static final int BEE_UPDATE_PASSWORD_FAILURE = 5843;
	public static final int PHONE_NUMBER_FORMAT_IS_NOT_CORRECT = 5844;
	public static final int EMAIL_FORMAT_IS_NOT_CORRECT = 5845;
	public static final int OPERATOR_CITY_NULL = 5846;
	public static final int OPERATOR_COUNTY_NULL = 5847;
	public static final int OPERATOR_EXIST = 5848;
	public static final int DEL_BEE_BELONG_TAG_ERROR = 5849;
	public static final int SELECT_FIRST_ADMIN_IS_NULL = 5850;
	public static final int DEL_BEE_TAGID_IS_NULL = 5851;
	public static final int BATCH_IMPORT_BEE_ERROR = 5852;
	public static final int SELECT_OPERATOR_COUNTY_ERROR = 5853;
	public static final int INSERT_OPERATOR_COUNTY_ERROR = 5854;
	public static final int SELECT_CITY_MANAGER_ISHAVE_ERROR = 5855;
	public static final int SELECT_CHANNEL_MANAGER_COUNT_ERROR = 5856;
	public static final int SELECT_CITY_MANAGER_ERROR = 5857;
	public static final int SELECT_CITY_MEMBER_ERROR = 5858;
	public static final int ADD_MEMBER_COUNTY_IS_NULL = 5859;
	public static final int UPDATE_MEMBER_ERROR = 5860;
	public static final int ADD_BEE_MEMBER_CITY_NOT_EQUEST = 5861;
	public static final int ADD_BEE_MEMBER_COUNTY_NOT_EQUEST = 5862;
	public static final int SELECT_MEMBER_BEE_COUNTY_ERROR = 5863;
	public static final int MEMBER_NOT_INCLUED_BEE_COUNTY = 5864;
	public static final int IMPORT_MEMBER_NOT_INCLUED_BEE_COUNTY = 5865;
	public static final int APP_UPDATE_CONF_INSERT_ERROR = 5866;
	public static final int APP_UPDATE_CONF_FILE_NULL = 5867;
	public static final int APP_UPDATE_CONF_SELECT_ERROR = 5868;
	public static final int BEE_TAG_UPDATE_STATUS_ERROR = 5869;
	public static final int BEE_CALC_RECORD_COUNTY_UPDATE_ERROR = 5870;
	public static final int BEE_ADMIN_CAR_CID_FORCEINSURANCE_COMMIT_AUDIT = 5871;
	public static final int BEE_ADMIN_CAR_CID_BUSINESINSURANCE_COMMIT_AUDIT = 5872;
	public static final int BEE_ADMIN_CAR_CID_COMMIT_AUDIT = 5873;
	public static final int BEE_ADMIN_BEELIST_IS_NULL = 5874;
	public static final int BEE_ADMIN_BEELIST_PUSHAPP_IS_NULL = 5875;
	public static final int BEE_ADMIN_BEELIST_PUSHURL_IS_ERROR = 5876;
	public static final int BEE_ADMIN_BEELIST_PUSHAPP_ERROR = 5877;
	public static final int BEE_ADMIN_UPLOAD_IMAGE_ERROR = 5878;
	public static final int BEE_ADMIN_OPERATOR_IS_NOT_CITYMANGE_ERROR = 5879;
	public static final int BEE_ADMIN_CITYMANGE_EXIST_CITYS_ERROR = 5880;
	public static final int BEE_ADMIN_MESSAGEDETAIL_BYID_ERROR = 5881;
	public static final int BEE_ADMIN_MESSAGEACTIVITYLIST_ERROR = 5882;
	public static final int BEE_ADMIN_MESSAGENOTICELIST_ERROR = 5883;
	public static final int BEE_ADMIN_MESSAGENOTICE_DEL_ERROR = 5884;
	public static final int BEE_ADMIN_MESSAGEACTIVITY_DEL_ERROR = 5885;
	public static final int BEE_ADMIN_CAR_VIN_ERROR = 5886;

	public static final int CAR_QUERY_RESULT_NULL_ERROR = 5900;
	public static final int OPERATOR_QUERY_STRATEGY_NO_PRIVILEGE = 5901;
	public static final int OPERATOR_ADD_STRATEGY_NO_PRIVILEGE = 5902;
	public static final int OPERATOR_NO_PRIVILEGE_CID_CALC_RECORD = 5903;
	public static final int CAR_CUSTOMER_QUERY_RESULT_NULL_ERROR = 5904;
	public static final int CAR_CALC_QUERY_RESULT_NULL_ERROR = 5905;
	public static final int BEE_UPDATE_INSURANCE_RECORD_ERROR = 5906;
	public static final int BEE_CALC_CALCID_ERROR = 5907;
	public static final int CALC_RECORD_ITEM_ID_IS_NOTEXISTS = 5908;
	public static final int BEE_CALC_SRV_RESULT_NULL_ERROR = 5909;
	public static final int BEE_UPDATE_INSURANCE_RECORD_STATUS_ERROR = 5910;
	public static final int OPERATOR_BEE_PRIVILEGE_ERROR = 5911;
	public static final int BEE_UPDATE_INSURANCE_PRE_ORDER_PRODUCT_ERROR = 5912;
	public static final int BEE_INSURANCE_COMPANY_DOES_NOT_EXIST = 5913;
	public static final int BEE_UPDATE_MAIN_CALC_RECORD_ERROR = 5914;
	public static final int BEE_CANNOT_UPDATE_ORDER_RECIPENT = 5915;
	public static final int BEE_CAN_ONLY_UPDATE_ORDER_RECIPENT = 5916;
	public static final int BEE_INSURANCE_ORDER_DUPLICATE = 5917;
	public static final int BEE_OPERATOR_PRIVILEGE_FOR_CAR_INFO_ERROR = 5918;
	public static final int BEE_CAR_CHANNEL_ERROR = 5919;
	public static final int BEE_CAR_NULL = 5920;
	public static final int BEE_MOBILE_NO_CUSTOMER_EXIST = 5921;

	public static final int PAY_ALIPAY_APPLY_ERROR = 6000;
	public static final int PAY_ALIPAY_CALLBACK_VERIFY_ERROR = 6001;
	public static final int PAY_ALIPAY_NOT_APPLY = 6002;
	public static final int PAY_ALIPAY_CALLBACK_ERROR = 6003;
	public static final int PAY_ALIPAY_NOTIFY_VERIFY_ERROR = 6004;
	public static final int PAY_ALIPAY_NOTIFY_ERROR = 6005;
	public static final int PAY_ALIPAY_SUPER_NUMBER = 6006;
	public static final int PAY_DETAIL_NOT_EXIST = 6007;
	public static final int PAY_ALIPAY_OUTTRADENO_NOT_EXIST = 6008;
	public static final int PAY_APPLYID_IS_NULL = 6009;
	public static final int PAY_CITYID_IS_NULL = 6010;
	public static final int PAY_CHANNELID_IS_NULL = 6011;
	public static final int PAY_CONFIG_NOT_EXIST = 6012;
	public static final int PAY_APPLY_ERROR = 6013;
	public static final int PAY_NOTIFY_ERROR = 6014;
	
	public static final int ES_EXISTS_INDEX_EXCEPTION=6100;
	public static final int ES_EXISTS_TYPE_EXCEPTION=6101;
	public static final int ES_CREATE_INDEX_EXCEPTION=6102;
    public static final int ES_CREATE_TYPE_EXCEPTION=6103;
    public static final int ES_CREATE_MAPPING_EXCEPTION=6104;
    public static final int ES_CREATE_INSRET_COMMAND_EXCEPTION=6105;
    public static final int ES_SAVE_OR_UPDATE_EXCEPTION=6106;
    public static final int ES_DELETE_INDEX_RECORD_EXCEPTION=6107;
    public static final int ES_DELETE_INDEX_EXCEPTION=6108;
    public static final int ES_SEARCH_BY_ID_EXCEPTION=6109;
    public static final int ES_SEARCH_BULK_EXCEPTION=6110;


	public static final int API_CALC_ADMIN_INPUT_PARAM_ERR=6200;
	public static final int API_CALC_ADMIN_CLAC_NODE_STATUS_BAD=6201;

    public static final int ACTIVITI_WORKFLOW_ADD_BUSINESS_DATA_EXCEPTION=6300;
    public static final int ACTIVITI_WORKFLOW_UPDATE_BUSINESS_DATA_EXCEPTION=6301;
    public static final int ACTIVITI_WORKFLOW_QUERY_WORKFLOW_CONFIG_EXCEPTION=6302;
    
    public static final int ACTIVITI_WORKER_NO_STATUS_EXCEPTION=6400;
    public static final int ACTIVITI_WORKER_DO_WORK_EXCEPTION=6401;
    
    //SRV-RESOURCE ........... 6500-6599
    public static final int RESOURCE_FETCH_RESOURCE_ERROR = 6500;

	// srv-comet.........7000-8999
	public static final int COMET_GET_CLIENT_ID_ERROR = 7000;
	public static final int COMET_ADD_APP_INFO_ERROR = 7001;
	public static final int COMET_ADD_RECORD_INFO_ERROR = 7002;
	public static final int COMET_SELECT_APP_INFO_ERROR = 7003;
	public static final int COMET_SELECT_APP_INFO_NULL = 7004;
	public static final int COMET_SELECT_RECORD_INFO_ERROR = 7005;
	public static final int COMET_UPDATE_CLIENT_ERROR = 7006;
	public static final int COMET_TEMPLATE_ERROR = 7007;
	public static final int COMET_SINGLEPUSH_ERROR = 7008;
	public static final int COMET_PUSH_TAG_IS_NULL = 7009;
	
	//srv-message.........9000-9999
	public static final int MESSAGE_UPDATE_RECORD_ERROR = 9000;
	public static final int MESSAGE_ADD_RECORD_ERROR = 9001;
	public static final int MESSAGE_SELECT_RECORD_ERROR = 9002;
	public static final int MESSAGE_SEND_PARAM_APPID_ERROR = 9003;
	public static final int MESSAGE_ADD_NOTICE_ERROR = 9004;
	public static final int MESSAGE_ADD_ACTIVITY_ERROR = 9005;
	public static final int MESSAGE_SELECT_ACTIVITY_ERROR = 9006;
	public static final int MESSAGE_SELECT_NOTICE_ERROR = 9007;
	public static final int MESSAGE_SELECT_PARAM_ERROR = 9008;
	public static final int MESSAGE_UPDATE_NOTICE_ERROR = 9009;
	public static final int MESSAGE_UPDATE_NOTICE_ID_NULL = 9010;
	public static final int MESSAGE_UPDATE_ACTIVITY_ERROR = 9011;
	public static final int MESSAGE_UPDATE_ACTIVITY_ID_NULL = 9012;
}