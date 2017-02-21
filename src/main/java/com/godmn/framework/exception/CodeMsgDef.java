package com.godmn.framework.exception;


public class CodeMsgDef {

	public static CodeMsg SUCCESS = new CodeMsg(ErrorCodeDef.SUCCESS, "SUCCESS");

	public static CodeMsg ERROR = new CodeMsg(ErrorCodeDef.ERROR, "ERROR");

	public static CodeMsg 系统错误 = new CodeMsg(ErrorCodeDef.RUNTIME_ERROR, "未知系统错误！");

	public static CodeMsgFormat 系统错误_带异常信息 = new CodeMsgFormat(ErrorCodeDef.PARAMETER_ERROR, "未知系统错误,错误信息：%s");

	public static CodeMsg 必填参数为空 = new CodeMsg(ErrorCodeDef.PARAMETER_ERROR, "必填参数不能为空！");

	public static CodeMsg 无权限查看 = new CodeMsg(ErrorCodeDef.PURVIEW_ERROR, "无权限查看！");

	public static CodeMsg 不可修改状态 = new CodeMsg(ErrorCodeDef.NOT_UPDATE, "不可修改状态！");

	public static CodeMsgFormat 参数错误 = new CodeMsgFormat(ErrorCodeDef.PARAMETER_ERROR, "Error parameter:%s=%s!");

	// SSO 错误信息定义
	public static final CodeMsg ERROR_DECRYPT_SESSION = new CodeMsg(ErrorCodeDef.ERROR_DECRYPT_SESSION, "非法用户");
	public static final CodeMsg ERROR_ENCRYPT_SESSION = new CodeMsg(ErrorCodeDef.ERROR_ENCRYPT_SESSION, "session异常");
	public static final CodeMsg OPERATOR_NOT_FOUND = new CodeMsg(ErrorCodeDef.OPERATOR_NOT_FOUND, "用户名或密码错误");
	public static final CodeMsg OPERATOR_FROZEN = new CodeMsg(ErrorCodeDef.OPERATOR_FROZEN, "用户被冻结");
	public static final CodeMsg INCORRECT_PWD = new CodeMsg(ErrorCodeDef.INCORRECT_PWD, "用户名或密码错误");
	public static final CodeMsg NOT_LOGIN = new CodeMsg(ErrorCodeDef.NOT_LOGIN, "未登录");
	public static final CodeMsg LOGIN_EXPIRED = new CodeMsg(ErrorCodeDef.LOGIN_EXPIRED, "会话失效");
	public static final CodeMsg NODE_TYPE_ERROR = new CodeMsg(ErrorCodeDef.NODE_TYPE_ERROR, "节点类型错误");
	public static final CodeMsg SSO_USERNAME_NULL = new CodeMsg(ErrorCodeDef.SSO_USERNAME_NULL, "用户名不能为空");
	public static final CodeMsg SSO_USERNAME_EXISTS = new CodeMsg(ErrorCodeDef.SSO_USERNAME_EXISTS, "用户名已存在");
	public static final CodeMsg SSO_PASSWORD_ILLEGAL = new CodeMsg(ErrorCodeDef.SSO_PASSWORD_ILLEGAL, "密码格式不正确");
	public static final CodeMsg GROUP_TYPE_ERROR = new CodeMsg(ErrorCodeDef.GROUP_TYPE_ERROR, "组类型错误");
	public static final CodeMsg NONE_RESOURCE_GROUP = new CodeMsg(ErrorCodeDef.NONE_RESOURCE_GROUP, "未设置资源角色");
	public static final CodeMsg NONE_VALUE_REPEAT = new CodeMsg(ErrorCodeDef.NONE_VALUE_REPEAT, "节点值重复");
	public static final CodeMsg FOUND_NOT_NODE = new CodeMsg(ErrorCodeDef.FOUND_NOT_NODE, "未找到节点");

	// PASSPORT 错误信息
	public static final CodeMsg PASSPORT_NOT_FOUND = new CodeMsg(ErrorCodeDef.PASSPORT_NOT_FOUND, "用户不存在");
	public static final CodeMsg PASSPORT_MOBILE_EXISTS = new CodeMsg(ErrorCodeDef.PASSPORT_MOBILE_EXISTS, "手机号已存在");
	public static final CodeMsg PASSPORT_EMAIL_EXISTS = new CodeMsg(ErrorCodeDef.PASSPORT_EMAIL_EXISTS, "邮箱已存在");

	// api-sso
	public static final CodeMsg CAPTCHA_EXPIRED = new CodeMsg(ErrorCodeDef.CAPTCHA_EXPIRED, "验证码已过期");
	public static final CodeMsg CAPTCHA_ERROR = new CodeMsg(ErrorCodeDef.CAPTCHA_ERROR, "验证码错误");
	public static final CodeMsg LOGIN_ALREADY = new CodeMsg(ErrorCodeDef.LOGIN_ALREADY, "已登录");

	// security
	public static final CodeMsg INVALID_SESSION = new CodeMsg(ErrorCodeDef.INVALID_SESSION, "Invalid session id!");
	public static final CodeMsg SECURITY_NOT_LOGIN = new CodeMsg(ErrorCodeDef.SECURITY_NOT_LOGIN, "Not login!");
	public static final CodeMsg LOGIN_EXPIRE = new CodeMsg(ErrorCodeDef.LOGIN_EXPIRE, "Login expired!");
	public static final CodeMsg URL_NOT_PERMIT = new CodeMsg(ErrorCodeDef.URL_NOT_PERMIT, "Url not permit!");
	public static final CodeMsg SYSTEM_NOT_PERMIT = new CodeMsg(ErrorCodeDef.SYSTEM_NOT_PERMIT, "System not permit!");
	public static final CodeMsg OK_BUT_NO_PAGE = new CodeMsg(ErrorCodeDef.OK_BUT_NO_PAGE, "OK but no page!");


	//api-process
	public static final CodeMsg INVALID_USERID =new CodeMsg(ErrorCodeDef.INVALID_USERID,"用户已存在");
	public static final CodeMsg INVALID_USER_GROUP =new CodeMsg(ErrorCodeDef.INVALID_USER_GROUP,"用户组已存在");
	public static final CodeMsg INVALID_USER_MEMBERSHIP =new CodeMsg(ErrorCodeDef.INVALID_USER_MEMBERSHIP,"用户关系已存在");
	public static final CodeMsg CANNOT_GET_USER_INFO =new CodeMsg(ErrorCodeDef.CANNOT_GET_USER_INFO,"无法获取用户信息");
	public static final CodeMsg WORKFLOW_CLAIM_EXCEPTION =new CodeMsg(ErrorCodeDef.WORKFLOW_CLAIM_EXCEPTION,"该任务已被签收");
	public static final CodeMsg WORKFLOW_COMPLETE_EXCEPTION =new CodeMsg(ErrorCodeDef.WORKFLOW_COMPLETE_EXCEPTION,"工作流任务完成异常");
	public static final CodeMsg WORKFLOW_ACTIVITY_EXCEPTION =new CodeMsg(ErrorCodeDef.WORKFLOW_ACTIVITY_EXCEPTION,"工作流获取操作活动异常");
	public static final CodeMsg WORKFLOW_USER_GROUP_EXCEPTION =new CodeMsg(ErrorCodeDef.WORKFLOW_USER_GROUP_EXCEPTION,"工作流获取用户组异常");
	public static final CodeMsg WORKFLOW_UNCLAIM_EXCEPTION =new CodeMsg(ErrorCodeDef.WORKFLOW_UNCLAIM_EXCEPTION,"工作流获取所有未签收的任务异常");
	public static final CodeMsg WORKFLOW_ASSIGN_EXCEPTION =new CodeMsg(ErrorCodeDef.WORKFLOW_ASSIGN_EXCEPTION,"工作流获取所有已签收的任务异常");
	public static final CodeMsg WORKFLOW_TASK_EXCEPTION =new CodeMsg(ErrorCodeDef.WORKFLOW_ASSIGN_EXCEPTION,"工作流获取任务异常");
	public static final CodeMsg WORKFLOW_START_EXCEPTION =new CodeMsg(ErrorCodeDef.WORKFLOW_START_EXCEPTION,"工作流启动异常");
	public static final CodeMsg WORKFLOW_INVALID_CALL_EXCEPTION =new CodeMsg(ErrorCodeDef.WORKFLOW_INVALID_CALL_EXCEPTION,"工作流调用的API与当前处理的任务不匹配");
	public static final CodeMsg WORKFLOW_INVALID_CLAIM_EXCEPTION = new CodeMsg(ErrorCodeDef.WORKFLOW_CLAIM_EXCEPTION, "当前签收任务不匹配");
	public static final CodeMsg WORKFLOW_DELETE_EXCEPTION =new CodeMsg(ErrorCodeDef.WORKFLOW_DELETE_EXCEPTION,"工作流删除异常");
	public static final CodeMsg WORKFLOW_NO_SOURCE_EXCEPTION =new CodeMsg(ErrorCodeDef.WORKFLOW_NO_SOURCE_EXCEPTION,"工作流无法找到指定资源异常");
	public static final CodeMsg WORKFLOW_NO_POLICY_INFO_EXCEPTION=new CodeMsg(ErrorCodeDef.WORKFLOW_NO_POLICY_INFO_EXCEPTION, "工作流无法获取保单信息");
	public static final CodeMsg WORKFLOW_ADD_USER_EXCEPTION =new CodeMsg(ErrorCodeDef.WORKFLOW_ADD_USER_EXCEPTION,"工作流添加用户异常");
	public static final CodeMsg WORKFLOW_ADD_GROUP_EXCEPTION =new CodeMsg(ErrorCodeDef.WORKFLOW_ADD_GROUP_EXCEPTION,"工作流添加组异常");
	public static final CodeMsg WORKFLOW_EXISTS_PROCESSINSTANCE_EXCEPTION =new CodeMsg(ErrorCodeDef.WORKFLOW_EXISTS_PROCESSINSTANCE_EXCEPTION,"业务关联key对应的工作流已存在");
	public static final CodeMsg WORKFLOW_PROCESSINSTANCE_PARSER_EXCEPTION =new CodeMsg(ErrorCodeDef.WORKFLOW_PROCESSINSTANCE_PARSER_EXCEPTION,"业务关联key转换异常");
	public static final CodeMsg WORKFLOW_ASSIGNEE_EXCEPTION =new CodeMsg(ErrorCodeDef.WORKFLOW_ASSIGNEE_EXCEPTION,"工作流指派任务异常");
	public static final CodeMsg WORKFLOW_PENDINGPAYMENT_EXCEPTION =new CodeMsg(ErrorCodeDef.WORKFLOW_PENDINGPAYMENT_EXCEPTION,"已收部分金额，不能回退");
	public static final CodeMsg WORKFLOW_DISPATCH_EXCEPTION =new CodeMsg(ErrorCodeDef.WORKFLOW_DISPATCH_EXCEPTION,"线上支付尚未支付完成");
	public static final CodeMsg WORKFLOW_OEM_EXCEPTION =new CodeMsg(ErrorCodeDef.WORKFLOW_OEM_EXCEPTION,"挂单点匹配错误");

	//Order 错误信息定义
	public static CodeMsg ORDER_ACTIVITYNULL = new CodeMsg(ErrorCodeDef.ORDER_ACTIVITYNULL,"活动不能为空！");
	public static CodeMsg ORDER_PRODUCTNULL = new CodeMsg(ErrorCodeDef.ORDER_PRODUCTNULL,"产品不能为空！");
	public static CodeMsg ORDER_COMPUTENULL = new CodeMsg(ErrorCodeDef.ORDER_COMPUTENULL,"算价不能为空！");
	public static CodeMsg ORDER_ORDERNULL = new CodeMsg(ErrorCodeDef.ORDER_ORDERNULL,"订单不能为空！");
	public static CodeMsg ORDER_ORDERITEMNULL = new CodeMsg(ErrorCodeDef.ORDER_ORDERITEMNULL,"订单子项不能为空！");
	public static CodeMsg ORDER_ORDERIDNULL = new CodeMsg(ErrorCodeDef.ORDER_ORDERIDNULL,"订单号不能为空！");
	public static CodeMsg ORDER_EXPRESSNULL = new CodeMsg(ErrorCodeDef.ORDER_EXPRESSNULL,"订单快递信息不能为空！");
	public static CodeMsg ORDER_EXPRESSITEMNULL = new CodeMsg(ErrorCodeDef.ORDER_EXPRESSITEMNULL,"订单快递信息订单子项不能为空！");
	public static CodeMsg ORDER_ITEMSTRATEGYNULL = new CodeMsg(ErrorCodeDef.ORDER_ITEMSTRATEGYNULL,"订单子项策略不能为空！");
	public static CodeMsg ORDER_INVALIDORDER = new CodeMsg(ErrorCodeDef.ORDER_INVALIDORDER,"无效的订单！");
	public static CodeMsg ORDER_NOTFIND_PRODUCT = new CodeMsg(ErrorCodeDef.ORDER_NOTFIND_PRODUCT,"找不到合适的产品！");
	public static CodeMsg ORDER_STRATEGYNULL = new CodeMsg(ErrorCodeDef.ORDER_STRATEGYNULL,"策略不能为空！");
	public static CodeMsg ORDER_INVALID_PRODUCT = new CodeMsg(ErrorCodeDef.ORDER_INVALID_PRODUCT,"无效的产品！");
	public static CodeMsg ORDER_INVALID_ACTIVITY = new CodeMsg(ErrorCodeDef.ORDER_INVALID_ACTIVITY,"无效的活动！");
	public static CodeMsg ORDER_INVALID_STRATEGY = new CodeMsg(ErrorCodeDef.ORDER_INVALID_STRATEGY,"无效的策略！");
	public static CodeMsg ORDER_PAYMENT_EXIST = new CodeMsg(ErrorCodeDef.ORDER_PAYMENT_EXIST,"支付单已支付，不能新建！");
	public static CodeMsg ORDER_PAYMENT_EXPIRATION_NULL = new CodeMsg(ErrorCodeDef.ORDER_PAYMENT_EXPIRATION_NULL,"支付单有效期配置为空！");
	public static CodeMsg ORDER_PAYMENT_EXPIRATION_ERROR = new CodeMsg(ErrorCodeDef.ORDER_PAYMENT_EXPIRATION_ERROR,"支付单有效期配置有误！");
	public static CodeMsg ORDER_PAYMENT_METHOD_NOT_ALLOWED = new CodeMsg(ErrorCodeDef.ORDER_PAYMENT_METHOD_NOT_ALLOWED,"支付方式不允许！");
	public static CodeMsg ORDER_PAYMENT_METHOD_ERROR = new CodeMsg(ErrorCodeDef.ORDER_PAYMENT_METHOD_ERROR,"支付方式错误！");
	public static CodeMsg ORDER_STATUS_HAS_BEEN_CANCELED = new CodeMsg(ErrorCodeDef.ORDER_STATUS_HAS_BEEN_CANCELED,"订单已取消，不能重复取消！");
	public static CodeMsg ORDER_STATUS_ERROR = new CodeMsg(ErrorCodeDef.ORDER_STATUS_ERROR,"订单状态不正确！");
	public static CodeMsg ORDER_PAYMENT_INFO_ERROR = new CodeMsg(ErrorCodeDef.ORDER_PAYMENT_INFO_ERROR,"完成支付信息错误！");
	public static CodeMsg ORDER_STATUS_NOT_PAYABLE = new CodeMsg(ErrorCodeDef.ORDER_STATUS_NOT_PAYABLE,"订单不可支付！");

	//卷错误信息定义

	//CUSTOMER 错误信息定义
	public static CodeMsg CUSTOMER_CUSTOMERNULL = new CodeMsg(ErrorCodeDef.CUSTOMER_CUSTOMERNULL,"客户不能为空！");
	public static CodeMsg CUSTOMER_MOBILENULL = new CodeMsg(ErrorCodeDef.CUSTOMER_MOBILENULL,"电话号码不能为空！");
	public static CodeMsg CUSTOMER_CUSTOMEREXIST = new CodeMsg(ErrorCodeDef.CUSTOMER_CUSTOMEREXIST,"客户已存在！");
	public static CodeMsg CUSTOMER_CARNULL = new CodeMsg(ErrorCodeDef.CUSTOMER_CARCIDNULL,"车辆不能为空！");
	public static CodeMsg CUSTOMER_CARCIDNULL = new CodeMsg(ErrorCodeDef.CUSTOMER_CARCIDNULL,"车辆必须归属于客户！");
	public static CodeMsg CUSTOMER_CAREXIST = new CodeMsg(ErrorCodeDef.CUSTOMER_CAREXIST,"车辆已存在！");
	public static CodeMsg CUSTOMER_EXPRESSNULL = new CodeMsg(ErrorCodeDef.CUSTOMER_EXPRESSNULL,"快递信息为空！");
	public static CodeMsg CUSTOMER_EXPRESSCIDNULL = new CodeMsg(ErrorCodeDef.CUSTOMER_EXPRESSCIDNULL,"快递信息必须归属于客户！");
	public static CodeMsg CUSTOMER_INSURENULL = new CodeMsg(ErrorCodeDef.CUSTOMER_INSURENULL,"投保人为空！");
	public static CodeMsg CUSTOMER_OPENIDNULL = new CodeMsg(ErrorCodeDef.CUSTOMER_OPENIDNULL,"OPENID为空！");
	public static CodeMsg CUSTOMER_WECHATNULL = new CodeMsg(ErrorCodeDef.CUSTOMER_WECHATNULL,"微信信息为空！");
	public static CodeMsg CUSTOMER_ADDCUSTOMERFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_ADDCUSTOMERFAIL,"新增客户失败！");
	public static CodeMsg CUSTOMER_IMPORTCUSTOMERFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_IMPORTCUSTOMERFAIL,"导入客户失败！");
	public static CodeMsg CUSTOMER_CUSTOMERISEXISTFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_CUSTOMERISEXISTFAIL,"判断客户是否存在失败！");
	public static CodeMsg CUSTOMER_UPDATECUSTOMERFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_UPDATECUSTOMERFAIL,"修改客户信息失败！");
	public static CodeMsg CUSTOMER_SETCUSTOMERSTATUSFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_SETCUSTOMERSTATUSFAIL,"设置客户状态失败！");
	public static CodeMsg CUSTOMER_SETTRACKSTATUSFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_SETTRACKSTATUSFAIL,"设置客户跟踪状态失败！");
	public static CodeMsg CUSTOMER_SELECTCUSTOMERFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_SELECTCUSTOMERFAIL,"查询客户信息失败！");
	public static CodeMsg CUSTOMER_ADDCARFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_ADDCARFAIL,"新增车辆失败！");
	public static CodeMsg CUSTOMER_UPDATECARRFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_UPDATECARRFAIL,"修改车辆信息失败！");
	public static CodeMsg CUSTOMER_SETCARSTATUSFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_SETCARSTATUSFAIL,"设置车辆状态失败！");
	public static CodeMsg CUSTOMER_SETCARTRACKSTATUSFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_SETCARTRACKSTATUSFAIL,"设置车辆跟踪状态失败！");
	public static CodeMsg CUSTOMER_SELECTCARFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_SELECTCARFAIL,"查询车辆信息失败！");
	public static CodeMsg CUSTOMER_SELECTCARLISTFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_SELECTCARLISTFAIL,"查询车辆列表失败！");
	public static CodeMsg CUSTOMER_ADDEXPRESSINFOFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_ADDEXPRESSINFOFAIL,"新增快递信息失败！");
	public static CodeMsg CUSTOMER_UPDATEEXPRESSINFOFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_UPDATEEXPRESSINFOFAIL,"修改快递信息失败！");
	public static CodeMsg CUSTOMER_SETDEFAULTEXPRESSINFOFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_SETDEFAULTEXPRESSINFOFAIL,"设置默认快递信息失败！");
	public static CodeMsg CUSTOMER_SELECTEXPRESSINFOFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_SELECTEXPRESSINFOFAIL,"查询快递信息失败！");
	public static CodeMsg CUSTOMER_SELECTEXPRESSLISTFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_SELECTEXPRESSLISTFAIL,"查询快递信息列表失败！");
	public static CodeMsg CUSTOMER_UPDATEINSUREFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_UPDATEINSUREFAIL,"修改保险人失败！");
	public static CodeMsg CUSTOMER_SELECTINSUREFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_SELECTINSUREFAIL,"查询保险人失败！");
	public static CodeMsg CUSTOMER_SELECTINSURELISTFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_SELECTINSURELISTFAIL,"查询保险人列表失败！");
	public static CodeMsg CUSTOMER_ADDWECHATINFOFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_ADDWECHATINFOFAIL,"增加微信信息失败！");
	public static CodeMsg CUSTOMER_WECHATREGISTERFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_WECHATREGISTERFAIL,"微信注册失败！");
	public static CodeMsg CUSTOMER_WECHATBINDFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_WECHATBINDFAIL,"微信绑定客户失败！");
	public static CodeMsg CUSTOMER_SELECTWECHATCUSTOMERFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_SELECTWECHATCUSTOMERFAIL,"查询客户微信信息失败！");
	public static CodeMsg CUSTOMER_FOLLOWWECHATFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_FOLLOWWECHATFAIL,"关注公众号失败！");
	public static CodeMsg CUSTOMER_CANCELWECHATFOLLOWFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_CANCELWECHATFOLLOWFAIL,"取消关注公众号失败！");
	public static CodeMsg CUSTOMER_SELECTWECHATINFOFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_SELECTWECHATINFOFAIL,"查询微信信息失败！");
	public static CodeMsg CUSTOMER_SETCUSTOMEROPIDFAIL = new CodeMsg(ErrorCodeDef.CUSTOMER_SETCUSTOMEROPIDFAIL,"设置客户归属人失败！");
	public static CodeMsg CUSTOMER_CAR_NUMBER_IS_NULL = new CodeMsg(ErrorCodeDef.CUSTOMER_CAR_NUMBER_IS_NULL,"车牌号不能为空！");
	public static CodeMsg CUSTOMER_ADD_INSURE_PERSON_FAILED = new CodeMsg(ErrorCodeDef.CUSTOMER_ADD_INSURE_PERSON_FAILED,"新增保险人信息失败！");
	public static CodeMsg CUSTOMER_ASSIGN_TASK_FAILED = new CodeMsg(ErrorCodeDef.CUSTOMER_ASSIGN_TASK_FAILED,"分配任务失败！");
	public static CodeMsg CUSTOMER_RECYCLE_TASK_FAILED = new CodeMsg(ErrorCodeDef.CUSTOMER_RECYCLE_TASK_FAILED,"回收任务失败！");
	public static CodeMsg CAR_PROCESSED = new CodeMsg(ErrorCodeDef.CAR_PROCESSED,"核心客户已存在、已处理");
	public static CodeMsg CAR_ABANDON = new CodeMsg(ErrorCodeDef.CAR_ABANDON,"相同的车辆已成功出单");
	public static CodeMsg TOTAL_NUMBER_ERROR = new CodeMsg(ErrorCodeDef.TOTAL_NUMBER_ERROR,"分配数量设置错误");
	public static CodeMsg TASK_STATUS_WRONG = new CodeMsg(ErrorCodeDef.TASK_STATUS_WRONG,"任务状态错误");
	public static CodeMsg NO_PERMISSION = new CodeMsg(ErrorCodeDef.NO_PERMISSION,"无权查看该客户");
	public static CodeMsg ONLY_ONESELF_CAN_OPERATE = new CodeMsg(ErrorCodeDef.ONLY_ONESELF_CAN_OPERATE,"只有本人才可以操作");
	public static CodeMsg FILING_ALREADY = new CodeMsg(ErrorCodeDef.FILING_ALREADY,"已归档，重复操作");
	public static CodeMsg SOMEONE_IS_TRACKING = new CodeMsg(ErrorCodeDef.SOMEONE_IS_TRACKING, "坐席【%s】正在跟踪该车辆");
	public static CodeMsgFormat OPID_IS_TRACKING = new CodeMsgFormat(ErrorCodeDef.SOMEONE_IS_TRACKING, "坐席【%s】正在跟踪该车辆");

	//coupon
	public static final CodeMsg COUPON_BATCH_NULL = new CodeMsg(ErrorCodeDef.COUPON_BATCH_NOT_NULL, "优惠券批次不能为空！");
	public static final CodeMsg COUPON_BATCH_QUERY_ERROR = new CodeMsg(ErrorCodeDef.COUPON_BATCH_QUERY_ERROR, "优惠券批次查询失败！");
	public static final CodeMsg COUPON_BATCH_ADD_ERROR = new CodeMsg(ErrorCodeDef.COUPON_BATCH_ADD_ERROR, "优惠券批次新增失败！");
	public static final CodeMsg COUPON_BATCH_TOTALAMOUNT_NULL = new CodeMsg(ErrorCodeDef.COUPON_BATCH_TOTALAMOUNT_NULL, "优惠券批次总金额不能为空！");
	public static final CodeMsg COUPON_BATCH_NAME_NULL = new CodeMsg(ErrorCodeDef.COUPON_BATCH_NAME_NULL, "优惠券批次名称不能为空！");
	public static final CodeMsg COUPON_BATCH_OPERATOR_NULL = new CodeMsg(ErrorCodeDef.COUPON_BATCH_OPERATOR_NULL, "优惠券批次创建人不能为空！");
	public static final CodeMsg COUPON_BATCH_BATCHID_NULL = new CodeMsg(ErrorCodeDef.COUPON_BATCH_BATCHID_NULL, "优惠券批次ID不能为空！");
	public static final CodeMsg COUPON_BATCH_TATOLAMOUNT_ERROR = new CodeMsg(ErrorCodeDef.COUPON_BATCH_TATOLAMOUNT_ERROR, "优惠券批次总金额修改失败！");
	public static final CodeMsg COUPON_BATCH_REMAINAMOUNT_ERROR = new CodeMsg(ErrorCodeDef.COUPON_BATCH_REMAINAMOUNT_ERROR, "优惠券批次剩余金额修改失败！");
	public static final CodeMsg COUPON_BATCH_UPDATE_ERROR = new CodeMsg(ErrorCodeDef.COUPON_BATCH_UPDATE_ERROR, "优惠券批次修改失败！");
	public static final CodeMsg COUPON_BATCH_COUPONTYPE_NULL = new CodeMsg(ErrorCodeDef.COUPON_BATCH_COUPONTYPE_NULL, "批次中没有可发放优惠券！");
	public static final CodeMsg REMAINAMOUNT_NOT_ENOUGH = new CodeMsg(ErrorCodeDef.REMAINAMOUNT_NOT_ENOUGH, "修改金额大于批次剩余金额！");
	public static final CodeMsg COUPON_BATCH_IS_NULL = new CodeMsg(ErrorCodeDef.COUPON_BATCH_IS_NULL, "批次不存在！");
	public static final CodeMsg COUPON_BATCH_STATUS_NOTUPDATE = new CodeMsg(ErrorCodeDef.COUPON_BATCH_STATUS_NOTUPDATE, "批次审批成功不允许修改！");
	public static final CodeMsg COUPON_BATCH_UPDATE_STATUS_ERROR = new CodeMsg(ErrorCodeDef.COUPON_BATCH_UPDATE_STATUS_ERROR, "修改优惠券批次状态失败！");
	public static final CodeMsg COUPON_BATCH_STATUS_ERROR = new CodeMsg(ErrorCodeDef.COUPON_BATCH_STATUS_ERROR, "优惠券批次状态不正确！");

	public static final CodeMsg COUPON_NOT_NULL = new CodeMsg(ErrorCodeDef.COUPON_NOT_NULL, "优惠券不能为空！");
	public static final CodeMsg COUPON_QUERY_ERROR = new CodeMsg(ErrorCodeDef.COUPON_QUERY_ERROR, "优惠券查询失败！");
	public static final CodeMsg COUPON_ID_NULL = new CodeMsg(ErrorCodeDef.COUPON_ID_NULL, "优惠券ID不能为空！");
	public static final CodeMsg COUPON_DEADLINE_FORMAT = new CodeMsg(ErrorCodeDef.COUPON_DEADLINE_FORMAT, "券截止日期小于当前时间！");
	public static final CodeMsg COUPON_INSERT_ERROR = new CodeMsg(ErrorCodeDef.COUPON_INSERT_ERROR, "优惠券新增失败！");
	public static final CodeMsg COUPON_COUNT_CTID_CID_ERROR = new CodeMsg(ErrorCodeDef.COUPON_COUNT_CTID_CID_ERROR, "获取用户优惠券领取数失败！");
	public static final CodeMsg COUPON_LOG_INSERT_ERROR = new CodeMsg(ErrorCodeDef.COUPON_LOG_INSERT_ERROR, "新增优惠券日志失败！");
	public static final CodeMsg COUPON_UPDATE_USESTATUS_ERROR = new CodeMsg(ErrorCodeDef.COUPON_UPDATE_USESTATUS_ERROR, "修改优惠券使用状态失败！");
	public static final CodeMsg COUPON_CALC_PRICE_PARAM_ERROR = new CodeMsg(ErrorCodeDef.COUPON_CALC_PRICE_PARAM_ERROR, "参数不正确计算失败！");
	public static final CodeMsg COUPON_UPDATE_STATUS_ERROR = new CodeMsg(ErrorCodeDef.COUPON_UPDATE_STATUS_ERROR, "修改优惠券状态失败！");
	public static final CodeMsg COUPON_UPDATE_WRITEBACK_ERROR = new CodeMsg(ErrorCodeDef.COUPON_UPDATE_WRITEBACK_ERROR, "回写优惠券失败！");
	public static final CodeMsg COUPON_UPDATE_RESTORE_ERROR = new CodeMsg(ErrorCodeDef.COUPON_UPDATE_RESTORE_ERROR, "恢复优惠券失败！");
	public static final CodeMsg COUPON_CUSTOMERID_NULL = new CodeMsg(ErrorCodeDef.COUPON_CUSTOMERID_NULL, "用户ID不能为空！");
	public static final CodeMsg COUPON_QUERY_NULL = new CodeMsg(ErrorCodeDef.COUPON_QUERY_NULL, "优惠券不存在！");
	public static final CodeMsg COUPON_NOT_BELONG_TO_CUSTOMER = new CodeMsg(ErrorCodeDef.COUPON_NOT_BELONG_TO_CUSTOMER, "优惠券不属于该用户！");
	public static final CodeMsg COUPON_NOT_BELONG_TO_SCOPE = new CodeMsg(ErrorCodeDef.COUPON_NOT_BELONG_TO_SCOPE, "优惠券不属于该作用域！");
	public static final CodeMsg COUPON_EXPIRED = new CodeMsg(ErrorCodeDef.COUPON_EXPIRED, "优惠券已过期！");
	public static final CodeMsg COUPON_IS_USE = new CodeMsg(ErrorCodeDef.COUPON_IS_USE, "优惠券已使用！");
	public static final CodeMsg COUPON_NOT_INCLUDE_CITY = new CodeMsg(ErrorCodeDef.COUPON_NOT_INCLUDE_CITY, "优惠券不支持跨城使用！");

	public static final CodeMsg COUPON_TYPE_QUERY_ERROR = new CodeMsg(ErrorCodeDef.COUPON_TYPE_QUERY_ERROR, "券类型查询失败!");
	public static final CodeMsg COUPON_TYPE_NOT_NULL = new CodeMsg(ErrorCodeDef.COUPON_TYPE_NOT_NULL, "券类型不能为空!");
	public static final CodeMsg COUPON_TYPE_BATCHID_NULL = new CodeMsg(ErrorCodeDef.COUPON_TYPE_BATCHID_NULL, "批次ID不能为空!");
	public static final CodeMsg COUPON_TYPE_TOTALAMOUNT_NULL = new CodeMsg(ErrorCodeDef.COUPON_TYPE_TOTALAMOUNT_NULL, "券类型总金额不能为空！");
	public static final CodeMsg COUPON_TYPE_CITYS_FORMAT = new CodeMsg(ErrorCodeDef.COUPON_TYPE_CITYS_FORMAT, "券类型支持城市数据格式不正确！");
	public static final CodeMsg COUPON_TYPE_NAME_NULL = new CodeMsg(ErrorCodeDef.COUPON_TYPE_NAME_NULL, "券类型名称不能为空！");
	public static final CodeMsg COUPON_TYPE_BGIMAGE_NULL = new CodeMsg(ErrorCodeDef.COUPON_TYPE_BGIMAGE_NULL, "券类型背景图不能为空！");
	public static final CodeMsg COUPON_TYPE_MONEYTYPE_NULL = new CodeMsg(ErrorCodeDef.COUPON_TYPE_MONEYTYPE_NULL, "券类型面值类型不能为空！");
	public static final CodeMsg COUPON_TYPE_MONEY_NULL = new CodeMsg(ErrorCodeDef.COUPON_TYPE_MONEY_NULL, "券类型面值不能为空！");
	public static final CodeMsg COUPON_TYPE_MONEY_FORMAT = new CodeMsg(ErrorCodeDef.COUPON_TYPE_MONEY_FORMAT, "面值类型为折扣时面值应为1-100！");
	public static final CodeMsg COUPON_TYPE_SCOPE_NULL = new CodeMsg(ErrorCodeDef.COUPON_TYPE_SCOPE_NULL, "券类型作用域不能为空！");
	public static final CodeMsg COUPON_TYPE_EXPIRED_NULL = new CodeMsg(ErrorCodeDef.COUPON_TYPE_EXPIRED_NULL, "券类型过期时间和截止时间必填一项！");
	public static final CodeMsg COUPON_TYPE_OPERATID_NULL = new CodeMsg(ErrorCodeDef.COUPON_TYPE_OPERATID_NULL, "券类型创建人不能为空！");
	public static final CodeMsg COUPON_TYPE_INSERT_ERROR = new CodeMsg(ErrorCodeDef.COUPON_TYPE_INSERT_ERROR, "券类型新增失败！");
	public static final CodeMsg COUPON_TYPE_CTID_NULL = new CodeMsg(ErrorCodeDef.COUPON_TYPE_CTID_NULL, "券类型ID不能为空！");
	public static final CodeMsg COUPON_TYPE_UPDATE_ERROR = new CodeMsg(ErrorCodeDef.COUPON_TYPE_UPDATE_ERROR, "修改券类型失败！");
	public static final CodeMsg COUPON_TYPE_STARTTIME_NULL = new CodeMsg(ErrorCodeDef.COUPON_TYPE_STARTTIME_NULL, "券类型兑换开始日期不能为空！");
	public static final CodeMsg COUPON_TYPE_ENDTIME_NULL = new CodeMsg(ErrorCodeDef.COUPON_TYPE_ENDTIME_NULL, "券类型兑换结束日期不能为空！");
	public static final CodeMsg COUPON_TYPE_NOT_USE = new CodeMsg(ErrorCodeDef.COUPON_TYPE_NOT_USE, "券类型已停用！");
	public static final CodeMsg COUPON_TYPE_REMAINMONEY_NULL = new CodeMsg(ErrorCodeDef.COUPON_TYPE_REMAINMONEY_NULL, "券类型剩余金额不够，发券失败！");
	public static final CodeMsg COUPON_TYPE_BATCH_NULL = new CodeMsg(ErrorCodeDef.COUPON_TYPE_BATCH_NULL, "所选批次不存在！");
	public static final CodeMsg COUPON_TYPE_TOTALAMOUNT_BATCH = new CodeMsg(ErrorCodeDef.COUPON_TYPE_TOTALAMOUNT_BATCH, "总金额大于批次剩余金额！");
	public static final CodeMsg COUPON_TYPE_MAXMONEY_NULL = new CodeMsg(ErrorCodeDef.COUPON_TYPE_MAXMONEY_NULL, "最大兑换金额不能为空！");
	public static final CodeMsg COUPON_TYPE_MAXMONEY_FORMAT = new CodeMsg(ErrorCodeDef.COUPON_TYPE_MAXMONEY_FORMAT, "最大兑换金额不是面额/折扣上限的整数倍！");
	public static final CodeMsg COUPON_TYPE_COUPONDESC_NULL = new CodeMsg(ErrorCodeDef.COUPON_TYPE_COUPONDESC_NULL, "券类型描述不能为空！");
	public static final CodeMsg COUPON_TYPE_TIME_REQUIRED = new CodeMsg(ErrorCodeDef.COUPON_TYPE_TIME_REQUIRED, "券类型不在发放时间范围内！");
	public static final CodeMsg COUPON_TYPE_SEND_UPPERLIMIT = new CodeMsg(ErrorCodeDef.COUPON_TYPE_SEND_UPPERLIMIT, "券类型超过该用户发放上限！");
	public static final CodeMsg COUPON_TYPE_IS_NULL = new CodeMsg(ErrorCodeDef.COUPON_TYPE_IS_NULL, "券类型不存在！");
	public static final CodeMsg COUPON_TYPE_UPDATE_STATUS_CREATE = new CodeMsg(ErrorCodeDef.COUPON_TYPE_UPDATE_STATUS_CREATE, "券类型不能修改为创建状态！");
	public static final CodeMsg COUPON_TYPE_UPDATE_STATUS_EQUEST = new CodeMsg(ErrorCodeDef.COUPON_TYPE_UPDATE_STATUS_EQUEST, "券类型已经是该状态无需修改！");
	public static final CodeMsg COUPON_TYPE_NOTUPDATE_STATUS = new CodeMsg(ErrorCodeDef.COUPON_TYPE_NOTUPDATE_STATUS, "券类型只有在创建状态下才能修改！");

	public static final CodeMsg COUPON_CODE_QUERY_ERROR = new CodeMsg(ErrorCodeDef.COUPON_CODE_QUERY_ERROR, "兑换码查询失败！");
	public static final CodeMsg COUPON_CODE_UPDATE_AMOUNT_ERROR = new CodeMsg(ErrorCodeDef.COUPON_CODE_UPDATE_AMOUNT_ERROR, "兑换码数量修改失败！");
	public static final CodeMsg COUPON_CODE_UPDATE_STATUS_ERROR = new CodeMsg(ErrorCodeDef.COUPON_CODE_UPDATE_STATUS_ERROR, "兑换码状态修改失败！");
	public static final CodeMsg COUPON_CODE_INSERT_ERROR = new CodeMsg(ErrorCodeDef.COUPON_CODE_INSERT_ERROR, "兑换码新增失败！");
	public static final CodeMsg COUPON_CODE_OPERATID_NULL = new CodeMsg(ErrorCodeDef.COUPON_CODE_OPERATID_NULL, "兑换码创建人不能为空！");
	public static final CodeMsg COUPON_CODE_IS_HAVE = new CodeMsg(ErrorCodeDef.COUPON_CODE_IS_HAVE, "兑换码已存在！");
	public static final CodeMsg COUPON_CODE_IS_NOT_HAVE = new CodeMsg(ErrorCodeDef.COUPON_CODE_IS_NOT_HAVE, "兑换码已经兑换完毕，兑换失败！");
	public static final CodeMsg COUPON_CODE_IS_NULL = new CodeMsg(ErrorCodeDef.COUPON_CODE_IS_NULL, "兑换码不存在！");
	public static final CodeMsg COUPON_CODE_IS_EXCHANGE = new CodeMsg(ErrorCodeDef.COUPON_CODE_IS_EXCHANGE, "你已兑换过！");
	public static final CodeMsg COUPON_CODE_EXCHANG_COUPONTYPEISNULL = new CodeMsg(ErrorCodeDef.COUPON_CODE_EXCHANG_COUPONTYPEISNULL, "兑换码无对应优惠券！");
	public static final CodeMsgFormat COUPON_CODE_EXCHANGE_NUMBER = new CodeMsgFormat(ErrorCodeDef.COUPON_CODE_EXCHANGE_NUMBER, "兑换码生成数量超过券类型(%s)可生成数量！");
	public static final CodeMsg CODE_RELE_INSERT_ERROR = new CodeMsg(ErrorCodeDef.CODE_RELE_INSERT_ERROR, "新增兑换码和优惠券对应关系失败！");

	//couponAPI
	public static final CodeMsg COUPONAPI_DATE_FORMAT_ERROR = new CodeMsg(ErrorCodeDef.COUPONAPI_DATE_FORMAT_ERROR, "日期格式错误！");
	public static final CodeMsg COUPONAPI_COUPONCODE_CODE_ERROR = new CodeMsg(ErrorCodeDef.COUPONAPI_COUPONCODE_CODE_ERROR, "输入的兑换码过长！");
	public static final CodeMsg COUPONAPI_COUPONCODE_TOTAL_ERROR = new CodeMsg(ErrorCodeDef.COUPONAPI_COUPONCODE_TOTAL_ERROR, "创建兑换码数量必须大于零！");
	public static final CodeMsg COUPONAPI_COUPONCODE_NUMBER_ERROR = new CodeMsg(ErrorCodeDef.COUPONAPI_COUPONCODE_NUMBER_ERROR, "创建指定兑换码兑换数量必须大于零！");
	public static final CodeMsg COUPONAPI_COUPONCODE_CODE_NULL = new CodeMsg(ErrorCodeDef.COUPONAPI_COUPONCODE_CODE_NULL, "指定兑换码CODE不能为空！");
	public static final CodeMsg COUPONAPI_TOCUSTOMER_CTID_NULL = new CodeMsg(ErrorCodeDef.COUPONAPI_TOCUSTOMER_CTID_NULL, "发放优惠券类型不能为空！");
	public static final CodeMsg COUPONAPI_TOCUSTOMER_CID_NULL = new CodeMsg(ErrorCodeDef.COUPONAPI_TOCUSTOMER_CID_NULL, "发放优惠券用户ID不能为空！");
	public static final CodeMsg COUPONAPI_COUPONBATCH_IS_INVALID = new CodeMsg(ErrorCodeDef.COUPONAPI_TOCUSTOMER_CID_NULL, "选择的优惠券批未审核通过!");
	//SRV-CORE
	public static final CodeMsg CORE_STRATEGYCONFIGUREERROR = new CodeMsg(ErrorCodeDef.CORE_STRATEGYCONFIGUREERROR, "策略配置有误！");
	public static final CodeMsg CORE_DISCOUNTSTRATEGYERROR = new CodeMsg(ErrorCodeDef.CORE_DISCOUNTSTRATEGYERROR, "折扣策略配置有误！");
	public static final CodeMsg CORE_NODANGERSTRATEGYERROR = new CodeMsg(ErrorCodeDef.CORE_NODANGERSTRATEGYERROR, "未出险返现策略配置有误！");
	public static final CodeMsg CORE_GIVEPRODUCTSTRATEGYERROR = new CodeMsg(ErrorCodeDef.CORE_GIVEPRODUCTSTRATEGYERROR, "赠送产品策略配置有误！");
	public static final CodeMsg CORE_ORDER_NULL = new CodeMsg(ErrorCodeDef.CORE_ORDER_NULL, "订单信息不能为空！");
	public static final CodeMsg CORE_ORDERITEMS_NULL = new CodeMsg(ErrorCodeDef.CORE_ORDERITEMS_NULL, "订单子项信息不能为空！");
	public static final CodeMsg CORE_ORDERITEM_PID_NULL = new CodeMsg(ErrorCodeDef.CORE_ORDERITEM_PID_NULL, "订单子项产品不能为空！");
	public static final CodeMsg CORE_ORDERITEM_PRODUCT_NOT_EXIST = new CodeMsg(ErrorCodeDef.CORE_ORDERITEM_PRODUCT_NOT_EXIST, "订单子项中的产品无效！");
	public static final CodeMsg CORE_ORDERITEM_COUPON_NOT_EXIST = new CodeMsg(ErrorCodeDef.CORE_ORDERITEM_COUPON_NOT_EXIST, "订单子项中的券无效！");
	public static final CodeMsg CORE_ORDERITEM_HIT_ACTIVITYS_ERROR = new CodeMsg(ErrorCodeDef.CORE_ORDERITEM_HIT_ACTIVITYS_ERROR, "订单子项命中活动失败！");
	public static final CodeMsg CORE_COMPUTE_NULL = new CodeMsg(ErrorCodeDef.CORE_COMPUTE_NULL, "订单算价不能为空！");
	public static final CodeMsg CORE_INSURANPERSON_NULL = new CodeMsg(ErrorCodeDef.CORE_INSURANPERSON_NULL, "被保人、投保人、受益人不能为空！");
	public static final CodeMsg CORE_INSURANCE_NULL = new CodeMsg(ErrorCodeDef.CORE_INSURANCE_NULL, "保单信息不能为空！");
	public static final CodeMsg CORE_BUSINESSINSURANCEFEEDETAIL_NULL = new CodeMsg(ErrorCodeDef.CORE_BUSINESSINSURANCEFEEDETAIL_NULL, "保单商业险子险信息不能为空！");
	public static final CodeMsg CORE_UPDATEORDERAMOUNT_ERROR = new CodeMsg(ErrorCodeDef.CORE_UPDATEORDERAMOUNT_ERROR, "修改订单金额错误！");
	public static final CodeMsg CORE_UPDATEORDER_ERROR = new CodeMsg(ErrorCodeDef.CORE_UPDATEORDER_ERROR, "修改订单错误！");
	public static final CodeMsg CORE_PLACEORDER_ERROR = new CodeMsg(ErrorCodeDef.CORE_PLACEORDER_ERROR, "下单错误！");
	public static final CodeMsg CORE_FORCESURANCEFEEDETAIL_NULL = new CodeMsg(ErrorCodeDef.CORE_FORCESURANCEFEEDETAIL_NULL, "保单交强险子险信息不能为空！");
	public static final CodeMsg CORE_INSURANCECAR_NULL = new CodeMsg(ErrorCodeDef.CORE_INSURANCECAR_NULL, "保单车辆信息不能为空！");
	public static final CodeMsg CORE_INSURANCEALL_NULL = new CodeMsg(ErrorCodeDef.CORE_INSURANCEALL_NULL, "商业险保单和交强险保单不能同时为空！");
	public static final CodeMsg CORE_INSURANCE_REPEAT = new CodeMsg(ErrorCodeDef.CORE_INSURANCE_REPEAT, "该车辆已有相同险种订单提交，请先处理前期订单！");
	public static final CodeMsg CORE_INSURANCE_DATE_ERROR = new CodeMsg(ErrorCodeDef.CORE_INSURANCE_DATE_ERROR, "保单起始时间有误！");
	public static final CodeMsg CORE_BUSINESSINSURANCE_DATE_NULL = new CodeMsg(ErrorCodeDef.CORE_BUSINESSINSURANCE_DATE_NULL, "商业险起始时间不能为空！");
	public static final CodeMsg CORE_FORCEINSURANCE_DATE_NULL = new CodeMsg(ErrorCodeDef.CORE_FORCEINSURANCE_DATE_NULL, "交强险起始时间不能为空！");
	public static final CodeMsg CORE_CALL_WORKFLOW_FAILED = new CodeMsg(ErrorCodeDef.CORE_CALL_WORKFLOW_FAILED, "调用工作流失败！");
	public static final CodeMsg CORE_CALL_WORKFLOW_IO_ERROR = new CodeMsg(ErrorCodeDef.CORE_CALL_WORKFLOW_IO_ERROR, "支付成功，调用工作流确认订单失败，网络IO异常！");
	public static final CodeMsg CORE_ORDER_STATUS_INELIGIBLE = new CodeMsg(ErrorCodeDef.CORE_ORDER_STATUS_INELIGIBLE, "订单状态不适用，此订单状态不能进行当前支付操作！");
	public static final CodeMsg CORE_OEM_PARAMETER_NULL = new CodeMsg(ErrorCodeDef.CORE_OEM_PARAMETER_NULL, "OEM参数为空！");
	public static final CodeMsg CORE_OEM_PARAMETER_ILLEGAL = new CodeMsg(ErrorCodeDef.CORE_OEM_PARAMETER_ILLEGAL, "OEM参数不合法！");
	public static final CodeMsg CORE_PLATE_CITY_INFO_ERROR = new CodeMsg(ErrorCodeDef.CORE_PLATE_CITY_INFO_ERROR, "根据车牌获取城市信息错误！");

	
	//srv-calc
	public static final CodeMsg CALC_QUERY_ERR_PLATFORM = new CodeMsg(ErrorCodeDef.CALC_QUERY_ERR_PLATFORM, "平台查询错误信息！");
	public static final CodeMsg CALC_INSURANCE_ERR_EMPTY = new CodeMsg(ErrorCodeDef.CALC_INSURANCE_ERR_EMPTY, "算价信息不存！");
	public static final CodeMsg CALC_INSURANCE_COMPANY_NOT_SURPPORT = new CodeMsg(ErrorCodeDef.CALC_INSURANCE_COMPANY_NOT_SURPPORT, "算价服务不支持此保险公司！");
	public static final CodeMsg CALC_INSURANCE_COMPANY_CITY_NOT_SURPPORT = new CodeMsg(ErrorCodeDef.CALC_INSURANCE_COMPANY_CITY_NOT_SURPPORT, "算价服务暂不支持此保险公司或城市！");
	public static final CodeMsg CALC_QUERY_PARAM_ERR = new CodeMsg(ErrorCodeDef.CALC_QUERY_PARAM_ERR, "查询参数错误！");

	public static final CodeMsg CALC_INPUT_PARAM_ERR = new CodeMsg(ErrorCodeDef.CALC_INPUT_PARAM_ERR, "参数错误！");

	public static final CodeMsg CALC_EXECEPTION_ERR = new CodeMsg(ErrorCodeDef.CALC_EXECEPTION_ERR, "异常错误！");

	public static final CodeMsg CALC_CPIC_ERR_SUM_INSURED = new CodeMsg(ErrorCodeDef.CALC_CPIC_ERR_SUM_INSURED, "保额错误！");

	public static final CodeMsg CALC_SBI_CPIC_ERR = new CodeMsg(ErrorCodeDef.CALC_SBI_CPIC_ERR, "太保bfss2009系统程序异常！");

	public static final CodeMsg CALC_SBI_NO_MODEL_CODE_ERR = new CodeMsg(ErrorCodeDef.CALC_SBI_NO_MODEL_CODE_ERR, "车辆型号查询失败！");

	public static final CodeMsg CALC_SBI_NO_MODEL_CODE_INACCURATE = new CodeMsg(ErrorCodeDef.CALC_SBI_NO_MODEL_CODE_INACCURATE, "所选车型与平台登记不一致！");

	public static final CodeMsg CALC_INSURANCE_COMPANY_GENRATE_CONFIG_SEVICE_ERR = new CodeMsg(ErrorCodeDef.CALC_INSURANCE_COMPANY_GENRATE_CONFIG_SEVICE_ERR, "算价生成保险公司配置服务出错！");

	public static final CodeMsg CALC_INSURANCE_COMPANY_VERIFICATION_CODE_ERROR  = new CodeMsg(ErrorCodeDef.CALC_INSURANCE_COMPANY_VERIFICATION_CODE_ERROR, "验证码错误！");
	public static final CodeMsg CALC_INSURANCE_COMPANY_LOGIN_FAIL = new CodeMsg(ErrorCodeDef.CALC_INSURANCE_COMPANY_LOGIN_FAIL, "登陆保司系统失败！");
	public static final CodeMsg CALC_INSURANCE_COMPANY_SESSION_EXPIRE = new CodeMsg(ErrorCodeDef.CALC_INSURANCE_COMPANY_SESSION_EXPIRE, "连接保司会话过期！");
	public static final CodeMsg CALC_INSURANCE_COMPANY_RESPONSE_ERROR_MSG = new CodeMsg(ErrorCodeDef.CALC_INSURANCE_COMPANY_RESPONSE_ERROR_MSG, "保司返回错误消息！");
	public static final CodeMsg CALC_INSURANCE_COMPANY_RESPONSE_EXCEPTION_MSG = new CodeMsg(ErrorCodeDef.CALC_INSURANCE_COMPANY_RESPONSE_EXCEPTION_MSG, "保司返回异常消息！");
	public static final CodeMsg CALC_INSURANCE_COMPANY_RESPONSE_DATA_STRUCTURE_INCORRECT = new CodeMsg(ErrorCodeDef.CALC_INSURANCE_COMPANY_RESPONSE_DATA_STRUCTURE_INCORRECT, "保司返回数据结构异常！");
	public static final CodeMsg CALC_INSURANCE_COMPANY_CONNECT_EXCEPTION= new CodeMsg(ErrorCodeDef.CALC_INSURANCE_COMPANY_CONNECT_EXCEPTION, "连接保司网络异常！");
	public static final CodeMsg CALC_INSURANCE_COMPANY_TIMEOUT_EXCEPTION= new CodeMsg(ErrorCodeDef.CALC_INSURANCE_COMPANY_TIMEOUT_EXCEPTION, "连接保司超时！");
	public static final CodeMsg CALC_INSURANCE_COMPANY_NOT_RESPONSE = new CodeMsg(ErrorCodeDef.CALC_INSURANCE_COMPANY_NOT_RESPONSE, "连接保司无响应！");
	public static final CodeMsg CALC_INSURANCE_COMPANY_CALC_NOT_EXPECTED_EXECEPTION= new CodeMsg(ErrorCodeDef.CALC_INSURANCE_COMPANY_CALC_NOT_EXPECTED_EXECEPTION, "算价处理错误！");
	public static final CodeMsg CALC_INSURANCE_COMPANY_NOT_GET_INFO = new CodeMsg(ErrorCodeDef.CALC_INSURANCE_COMPANY_NOT_GET_INFO, "未查询到结果！");
	public static final CodeMsg CALC_INSURANCE_COMPANY_NOT_MATCH_INFO = new CodeMsg(ErrorCodeDef.CALC_INSURANCE_COMPANY_NOT_MATCH_INFO, "未匹配到结果！");
	public static final CodeMsg CALC_INSURANCE_COMPANY_RESULT_RESOLVE_ERROR = new CodeMsg(ErrorCodeDef.CALC_INSURANCE_COMPANY_RESULT_RESOLVE_ERROR, "返回结果解析异常！");

	public static final CodeMsg CALC_CPIC_SESSION_TIMEOUT = new CodeMsg(ErrorCodeDef.CALC_CPIC_SESSION_TIMEOUT, "CPIC2014AutoNew会话超时，请重新登录！");

	public static final CodeMsg CALC_CACHE_OPERATE_ERR = new CodeMsg(ErrorCodeDef.CALC_CACHE_OPERATE_ERR, "算价缓存处理异常！");

	public static final CodeMsg CALC_REQUEST_COUNT_LIMIT_ERR = new CodeMsg(ErrorCodeDef.CALC_REQUEST_COUNT_LIMIT_ERR, "算价请求次数已达上限！");


	//srv-finance
	public static final CodeMsg FINANCE_NOT_BALANCED_BEGIN = new CodeMsg(ErrorCodeDef.FINANCE_NOT_BALANCED, "开始记账时财务账目无法拉平！");
	public static final CodeMsg FINANCE_NOT_BALANCED_END = new CodeMsg(ErrorCodeDef.FINANCE_NOT_BALANCED, "记账结束后财务账目无法拉平！");
	public static final CodeMsg FINANCE_NOT_ACCOUNT_SUBJECT = new CodeMsg(ErrorCodeDef.FINANCE_NOT_ACCOUNT_SUBJECT, "没有指定的会计科目！");
	public static final CodeMsg FINANCE_INVALID_ACCOUNT_SUBJECT_CODE = new CodeMsg(ErrorCodeDef.FINANCE_NOT_ACCOUNT_SUBJECT, "非法的科目代码！");

	//api-crm
	public static final CodeMsg CRM_CANNOT_GET_OBJECT_BY_SERVICE = new CodeMsg(ErrorCodeDef.CRM_CANNOT_GET_OBJECT_BY_SERVICE, "无法通过调用服务获取产品信息（保司算价信息）");
	public static final CodeMsg GENERATE_SHORT_URL_ERROR = new CodeMsg(ErrorCodeDef.GENERATE_SHORT_URL_ERROR, "生成短链失败！");
	public static final CodeMsg SMS_SEND_FAILED = new CodeMsg(ErrorCodeDef.SMS_SEND_FAILED, "短信发送失败！");
	public static final CodeMsg FOUNTD_NOT_CALC_INFO = new CodeMsg(ErrorCodeDef.FOUNTD_NOT_CALC_INFO, "未找到算价信息！");
	public static final CodeMsg FOUND_NOT_CUSTOMER_CAR_INFO = new CodeMsg(ErrorCodeDef.FOUND_NOT_CUSTOMER_CAR_INFO, "未找到客户车辆信息！");
	public static final CodeMsg SMS_PHONES_EMPTY_ERROR = new CodeMsg(ErrorCodeDef.SMS_PHONES_EMPTY_ERROR, "手机号码错误,不能为空!");
	public static final CodeMsg SMS_SEND_CONTENT_EMPTY_ERROR = new CodeMsg(ErrorCodeDef.SMS_SEND_CONTENT_EMPTY_ERROR, "短信内容不能为空!");
	public static final CodeMsg SMS_FILE_CSV_ERROR = new CodeMsg(ErrorCodeDef.SMS_FILE_CSV_ERROR, "文件格式有误，不是csv类型!");
	public static final CodeMsgFormat SMS_SEND_PHONES_ERROR = new CodeMsgFormat(ErrorCodeDef.SMS_SEND_PHONES_ERROR, "部分手机号码格式有错误：%s");
	public static final CodeMsgFormat SMS_SEND_PHONES_DUB = new CodeMsgFormat(ErrorCodeDef.SMS_SEND_PHONES_DUB, "部分手机号码有重复：%s");
	public static final CodeMsg SMS_MULTI_XLS_FILE_ERROR = new CodeMsg(ErrorCodeDef.SMS_MULTI_XLS_FILE_ERROR, "文件格式有误，不是xls或xlsx类型!");
	public static final CodeMsgFormat SMS_SEND_LESS_LIMIT_ERROR = new CodeMsgFormat(ErrorCodeDef.SMS_SEND_LESS_LIMIT_ERROR, "一次限制发送%s条!");
	public static final CodeMsg SMS_SEND_COUNT_ERROR = new CodeMsg(ErrorCodeDef.SMS_SEND_COUNT_ERROR, "您手动输入的手机号码超过100!");
	public static final CodeMsg SMS_BATCH_SEND_FAILED = new CodeMsg(ErrorCodeDef.SMS_BATCH_SEND_FAILED, "短信批量发送失败!");
	public static final CodeMsg CALC_SMS_LIMIT_ERROR = new CodeMsg(ErrorCodeDef.CALC_SMS_LIMIT_ERROR, "算价短信发送次数超过限制!");
	public static final CodeMsg CAT_SMS_LIMIT_ERROR = new CodeMsg(ErrorCodeDef.CAT_SMS_LIMIT_ERROR, "CAT报错短信发送次数超过限制!");
	public static final CodeMsg BUY_NOT_BUSINESS_INSURANCE = new CodeMsg(ErrorCodeDef.BUY_NOT_BUSINESS_INSURANCE, "未购买商业险!");
    public static final CodeMsg CRM_CANNOT_UPDATE_ORDER_RECIPENT = new CodeMsg(ErrorCodeDef.CRM_CANNOT_UPDATE_ORDER_RECIPENT, "此工作流状态中的收件人信息不可修改!");
    public static final CodeMsg CRM_CAN_ONLY_UPDATE_ORDER_RECIPENT = new CodeMsg(ErrorCodeDef.CRM_CAN_ONLY_UPDATE_ORDER_RECIPENT, "此工作流状态中只可修改收件人、联系电话和联系地址!");
    public static final CodeMsg CRM_INSURANCE_PICS_NULL = new CodeMsg(ErrorCodeDef.CRM_INSURANCE_PICS_NULL, "没有收到需要上传的保单照片!");
    public static final CodeMsg CRM_EMAIL_PARAMETER_ILLEGAL = new CodeMsg(ErrorCodeDef.CRM_EMAIL_PARAMETER_ILLEGAL, "发送邮件参数【%s】不正确，!");
    public static final CodeMsg CRM_EMAIL_NOT_ALLOWED = new CodeMsg(ErrorCodeDef.CRM_EMAIL_NOT_ALLOWED, "发送邮件权限错误!");
    public static final CodeMsg CRM_EMAIL_ERROR = new CodeMsg(ErrorCodeDef.CRM_EMAIL_ERROR, "发送邮件失败!");


    //srv-crm
    public static final CodeMsg CAR_TYPE_NULL = new CodeMsg(ErrorCodeDef.CAR_TYPE_NULL, "新增预约事件车辆类型为空!");
    public static final CodeMsg CAR_ID_NULL = new CodeMsg(ErrorCodeDef.CAR_ID_NULL, "新增预约事件车辆类型为空!");


	//srv-insurance
	public static CodeMsgFormat INSURANCE_DRIVERS_MANY = new CodeMsgFormat(ErrorCodeDef.INSURANCE_DRIVERS_MANY, "指定驾驶人不能超过%s个！");
	public static CodeMsg INSURANCE_INVALID_INSURANCEID = new CodeMsg(ErrorCodeDef.INSURANCE_INVALID_INSURANCEID, "无效的保单ID！");
	public static CodeMsg INSURANCE_INVALID_ITEMID = new CodeMsg(ErrorCodeDef.INSURANCE_INVALID_ITEMID, "无效的订单子项ID！");
	public static CodeMsg INSURANCE_INVALID_ORDERID = new CodeMsg(ErrorCodeDef.INSURANCE_INVALID_ORDERID, "无效的订单ID！");
	public static CodeMsgFormat INSURANCE_FEEDETAIL_MANY = new CodeMsgFormat(ErrorCodeDef.INSURANCE_FEEDETAIL_MANY, "商业险子险不能超过%s个！");
	public static CodeMsgFormat INSURANCE_PERSON_MANY = new CodeMsgFormat(ErrorCodeDef.INSURANCE_PERSON_MANY, "客户信息必须是%s个！");
	public static CodeMsg INSURANCE_IMAGE_URL_ILLEGAL = new CodeMsg(ErrorCodeDef.INSURANCE_IMAGE_URL_ILLEGAL, "保单图片地址格式错误！");

	//api-cc
	public static final CodeMsg CALLCENTER_DATA_NOT_EXIST = new CodeMsg(ErrorCodeDef.CALLCENTER_DATA_NOT_EXIST, "数据不存在！");
	public static final CodeMsg CALLCENTER_MAPPING_RELATION_EXIST = new CodeMsg(ErrorCodeDef.CALLCENTER_MAPPING_RELATION_EXIST, "映射关系已存在！");
	public static final CodeMsg CALLCENTER_SEAT_NOT_EXIST = new CodeMsg(ErrorCodeDef.CALLCENTER_SEAT_NOT_EXIST, "坐席不存在！");
	public static final CodeMsg CALLCENTER_EXTENSION_NOT_EXIST = new CodeMsg(ErrorCodeDef.CALLCENTER_EXTENSION_NOT_EXIST, "分机不存在！");
	public static final CodeMsg CALLCENTER_DATA_NOT_SELECT = new CodeMsg(ErrorCodeDef.CALLCENTER_DATA_NOT_SELECT, "未选择数据！");
	public static final CodeMsg CALLCENTER_COMPANY_NOT_SAME = new CodeMsg(ErrorCodeDef.CALLCENTER_COMPANY_NOT_SAME, "所属公司不一致！");
	public static final CodeMsg CALLCENTER_SEAT_INVALID = new CodeMsg(ErrorCodeDef.CALLCENTER_SEAT_INVALID, "坐席不可用！");
	public static final CodeMsg CALLCENTER_EXTENSION_INVALID = new CodeMsg(ErrorCodeDef.CALLCENTER_EXTENSION_INVALID, "分机不可用！");
	public static final CodeMsg CALLCENTER_DELTE_ERROR = new CodeMsg(ErrorCodeDef.CALLCENTER_DELETE_ERROR, "坐席号和分机号必须为空！");
	public static final CodeMsg CALLCENTER_ADD_CALL_RECORD_ERROR = new CodeMsg(ErrorCodeDef.CALLCENTER_ADD_CALL_RECORD_ERROR, "添加通话记录失败！");


	//srv-dbdatasync
	public static final CodeMsgFormat ALIYUNBINLOG_COUSUMER_STARTUP_FAILED = new CodeMsgFormat(ErrorCodeDef.ALIYUNBINLOG_COUSUMER_STARTUP_FAILED, "阿里云binlog消费端启动异常！%s");
	public static final CodeMsg ALIYUNBINLOG_COUSUMER_UNINITIALIZE = new CodeMsg(ErrorCodeDef.ALIYUNBINLOG_COUSUMER_UNINITIALIZE, "阿里云binlog消费端未初始化！");
	public static final CodeMsg ALIYUNBINLOG_COUSUMER_CLOSE_FAILED = new CodeMsg(ErrorCodeDef.ALIYUNBINLOG_COUSUMER_CLOSE_FAILED, "阿里云binlog消费端关闭异常！");
	public static final CodeMsgFormat ALIYUNBINLOG_BINLOG_FIELDVALUEUPDATED_LOST = new CodeMsgFormat(ErrorCodeDef.ALIYUNBINLOG_BINLOG_FIELDVALUEUPDATED_LOST, "阿里云binlog行更新后的字段值信息丢失！%s");
	public static final CodeMsgFormat ALIYUNBINLOG_TARGET_DBINSTANCE_LOST = new CodeMsgFormat(ErrorCodeDef.ALIYUNBINLOG_TARGET_DBINSTANCE_LOST, "阿里云binlog写入的对应目标DB实例信息丢失！%s");
	public static final CodeMsgFormat ALIYUNBINLOG_TARGET_DBINSTANCE_TYPE_ERROR = new CodeMsgFormat(ErrorCodeDef.ALIYUNBINLOG_TARGET_DBINSTANCE_TYPE_ERROR, "阿里云binlog写入的对应目标DB实例类型错误！%s");
	public static final CodeMsgFormat ALIYUNBINLOG_BINLOG_RECORD_TYPE_ERROR = new CodeMsgFormat(ErrorCodeDef.ALIYUNBINLOG_BINLOG_RECORD_TYPE_ERROR, "阿里云binlog同步的记录类型错误！%s");
	public static final CodeMsgFormat ALIYUNBINLOG_FIELD_PARSE_UNSUPPOR_TYPE_EXCEPTION = new CodeMsgFormat(ErrorCodeDef.ALIYUNBINLOG_FIELD_PARSE_UNSUPPOR_TYPE_EXCEPTION, "阿里云binlog同步的字段类型不被支持！%s");
	public static final CodeMsgFormat ALIYUNBINLOG_FIELD_PARSE_ENCODING_EXCEPTION = new CodeMsgFormat(ErrorCodeDef.ALIYUNBINLOG_FIELD_PARSE_ENCODING_EXCEPTION, "阿里云binlog同步的字符串类型字段编码异常！%s");
	public static final CodeMsgFormat COMPENT_DATATRANSFERCOMPENT_HAS_STARTUPED = new CodeMsgFormat(ErrorCodeDef.COMPENT_HAS_STARTUPED, "数据传输组件已启动，不要再启动！%s");
	public static final CodeMsg COMPENT_DATATRANSFERCOMPENT_UNSTARTUP_STOP_EXCEPTION = new CodeMsg(ErrorCodeDef.ALIYUNBINLOG_COUSUMER_UNINITIALIZE, "数据传输组件未启动，不能停止！");
	public static final CodeMsg DATAREPLAY_DML_NOT_LEGAL_ERROR = new CodeMsg(ErrorCodeDef.ALIYUNBINLOG_BINLOG_RECORD_TYPE_ERROR, "同步SQL中DML类型不合法！");
	public static final CodeMsg DATAREPLAY_TABLENAME_IS_NULL = new CodeMsg(ErrorCodeDef.DATAREPLAY_TABLENAME_IS_NULL, "同步SQL中表名为空！");
	public static final CodeMsg DATAREPLAY_GET_PREPARESTATEMENT_ERROR = new CodeMsg(ErrorCodeDef.DATAREPLAY_GET_PREPARESTATEMENT_ERROR, "同步SQL时获取prepareStatement失败！");
	public static final CodeMsg DATAREPLAY_DEL_PKS_IS_NULL = new CodeMsg(ErrorCodeDef.DATAREPLAY_DEL_PKS_IS_NULL, "同步SQL，DEL语句主键为空！");
	public static final CodeMsg DATAREPLAY_INSERT_PKS_AND_FIELDS_IS_NULL = new CodeMsg(ErrorCodeDef.DATAREPLAY_INSERT_PKS_AND_FIELDS_IS_NULL, "同步SQL，INSERT语句主键和非主键不能同时为空！");
	public static final CodeMsg DATAREPLAY_UPDATE_PKS_OR_FIELDS_IS_NULL = new CodeMsg(ErrorCodeDef.DATAREPLAY_UPDATE_PKS_OR_FIELDS_IS_NULL, "同步SQL，UPDATE语句主键和非主键都不能为空！");
	public static final CodeMsg DATAREPLAY_UPDATE_ROW_NOT_ONE = new CodeMsg(ErrorCodeDef.DATAREPLAY_UPDATE_ROW_NOT_ONE, "同步SQL，修改的行数不为1！");
	public static final CodeMsg DATAREPLAY_SQL_EXECUTE_ERROR = new CodeMsg(ErrorCodeDef.DATAREPLAY_UPDATE_ROW_NOT_ONE, "同步SQL，执行SQL异常！");
	public static final CodeMsg DATAREPLAY_CONNECTION_ERROR = new CodeMsg(ErrorCodeDef.DATAREPLAY_CONNECTION_ERROR, "同步SQL，数据库连接异常！");

	public static final CodeMsg NOT_EXIST_TASK = new CodeMsg(ErrorCodeDef.NOT_EXIST_ERROR, "不存在对应同步任务，无法启动！");
	public static final CodeMsgFormat EXIST_MORE_TASK = new CodeMsgFormat(ErrorCodeDef.EXIST_MORE_ERROR, "一个同步任务只起一个同步组件！已启动同步组建：%s");
	public static final CodeMsg NOT_SUPPORT_UNALIYUN = new CodeMsg(ErrorCodeDef.NOT_SUPPORT_UNALIYUN, "暂不支持源库未非阿里云类型！");
	public static final CodeMsg NOT_EXIST_NEED_STOP_TASK = new CodeMsg(ErrorCodeDef.NOT_EXIST_NEED_STOP_TASK, "待停止同步任务不存在！");

	//srv-data-proxy
	public static final CodeMsg DATAPROXY_GET_CONNECTION_ERROR = new CodeMsg(ErrorCodeDef.DATAPROXY_GET_CONNECTION_ERROR, "获取数据库连接失败");
	public static final CodeMsg DATAPROXY_EXECUTE_SQL_ERROR = new CodeMsg(ErrorCodeDef.DATAPROXY_EXECUTE_SQL_ERROR, "执行sql失败");

	//srv-customer-third
	public static final CodeMsgFormat WECHAT_ACCESS_TOKEN_NULL = new CodeMsgFormat(ErrorCodeDef.WECHAT_ACCESS_TOKEN_NULL, "获取access_token失败！%s");
	public static final CodeMsg WECHAT_MENU_JSON_NULL = new CodeMsg(ErrorCodeDef.WECHAT_MENU_JSON_NULL, "菜单json不能为空！");
	public static final CodeMsgFormat WECHAT_CREATE_MENU_ERROR = new CodeMsgFormat(ErrorCodeDef.WECHAT_ACCESS_TOKEN_NULL, "创建微信菜单失败！%s");
	public static final CodeMsg WECHAT_CODE_NULL = new CodeMsg(ErrorCodeDef.WECHAT_CODE_NULL, "Code不能为空！");
	public static final CodeMsgFormat WECHAT_OAUTH2_ACCESS_TOKEN_ERROR = new CodeMsgFormat(ErrorCodeDef.WECHAT_OAUTH2_ACCESS_TOKEN_ERROR, "获取oauth2access_token失败！%s");
	public static final CodeMsg WECHAT_QRCODE_TYPE_ERROR = new CodeMsg(ErrorCodeDef.WECHAT_QRCODE_TYPE_ERROR, "二维码类型不正确！");
	public static final CodeMsgFormat WECHAT_CREATE_QRCODE_ERROR = new CodeMsgFormat(ErrorCodeDef.WECHAT_CREATE_QRCODE_ERROR, "创建二维码失败！%s");
	public static final CodeMsg WECHAT_TEMP_QRCODE_EXPIRED_ERROR = new CodeMsg(ErrorCodeDef.WECHAT_TEMP_QRCODE_EXPIRED_ERROR, "临时二维码过期时间不正确！");
	public static final CodeMsgFormat WECHAT_EXCUTE_GET_ERROR = new CodeMsgFormat(ErrorCodeDef.WECHAT_EXCUTE_GET_ERROR, "excut get error！%s");
	public static final CodeMsgFormat WECHAT_GET_USER_INFO_ERROR = new CodeMsgFormat(ErrorCodeDef.WECHAT_GET_USER_INFO_ERROR, "获取微信用户信息失败！%s");
	public static final CodeMsg THIRD_INSERT_MENU_LOG_ERROR = new CodeMsg(ErrorCodeDef.THIRD_INSERT_MENU_LOG_ERROR, "新增微信菜单生成记录失败！");
	public static final CodeMsg THIRD_SELECT_LAST_MENU_LOG_ERROR = new CodeMsg(ErrorCodeDef.THIRD_SELECT_LAST_MENU_LOG_ERROR, "查询最新微信菜单生成记录失败！");
	public static final CodeMsg THIRD_SELECT_THIRD_INFO_ERROR = new CodeMsg(ErrorCodeDef.THIRD_SELECT_THIRD_INFO_ERROR, "查询用户第三方信息失败！");
	public static final CodeMsg THIRD_INSERT_THIRD_INFO_ERROR = new CodeMsg(ErrorCodeDef.THIRD_INSERT_THIRD_INFO_ERROR, "新增用户第三方信息失败！");
	public static final CodeMsg THIRD_UPDATE_THIRD_INFO_ERROR = new CodeMsg(ErrorCodeDef.THIRD_UPDATE_THIRD_INFO_ERROR, "更新用户第三方信息失败！");
	public static final CodeMsg THIRD_UPDATE_THIRD_INFO_NULL = new CodeMsg(ErrorCodeDef.THIRD_UPDATE_THIRD_INFO_NULL, "更新对象和ID不能为空！");
	public static final CodeMsgFormat WECHAT_CREATE_JSAPI_TICKET_ERROR = new CodeMsgFormat(ErrorCodeDef.WECHAT_CREATE_JSAPI_TICKET_ERROR, "创建微信js接口签名失败！%s");
	public static final CodeMsg THIRD_API_JSAPI_TYPE_ERROR = new CodeMsg(ErrorCodeDef.THIRD_API_JSAPI_TYPE_ERROR, "invalid type！");
	public static final CodeMsg THIRD_SELECT_SUB_MESSAGE_ERROR = new CodeMsg(ErrorCodeDef.THIRD_SELECT_SUB_MESSAGE_ERROR, "查询关注推文失败！");
	public static final CodeMsg THIRD_INSERT_SUB_MESSAGE_ERROR = new CodeMsg(ErrorCodeDef.THIRD_INSERT_SUB_MESSAGE_ERROR, "新增关注推文失败！");
	public static final CodeMsg THIRD_UPDATE_SUB_MESSAGE_NULL = new CodeMsg(ErrorCodeDef.THIRD_UPDATE_SUB_MESSAGE_NULL, "关注推文为空！");
	public static final CodeMsg THIRD_SUB_MSG_ID_NULL = new CodeMsg(ErrorCodeDef.THIRD_SUB_MSG_ID_NULL, "关注推文ID为空！");
	public static final CodeMsg THIRD_UPDATE_SUB_MESSAGE_ERROR = new CodeMsg(ErrorCodeDef.THIRD_UPDATE_SUB_MESSAGE_ERROR, "修改关注推文失败！");
	public static final CodeMsg THIRD_SELECT_SUB_MESSAGE_PARAM_NULL = new CodeMsg(ErrorCodeDef.THIRD_SELECT_SUB_MESSAGE_PARAM_NULL, "关注推文查询参数为空！");
	public static final CodeMsg THIRD_SELECT_MENU_LOG_ERROR = new CodeMsg(ErrorCodeDef.THIRD_SELECT_MENU_LOG_ERROR, "查询微信菜单生成记录失败！");
	public static final CodeMsg THIRD_SELECT_QRCODE_ERROR = new CodeMsg(ErrorCodeDef.THIRD_SELECT_QRCODE_ERROR, "查询微信二维码失败！");
	public static final CodeMsg THIRD_INSERT_QRCODE_ERROR = new CodeMsg(ErrorCodeDef.THIRD_INSERT_QRCODE_ERROR, "新增微信二维码失败！");
	public static final CodeMsg THIRD_QRCODE_NULL = new CodeMsg(ErrorCodeDef.THIRD_QRCODE_NULL, "二维码对象为空！");
	public static final CodeMsg THIRD_QRCODE_ID_NULL = new CodeMsg(ErrorCodeDef.THIRD_QRCODE_ID_NULL, "二维码ID为空！");
	public static final CodeMsg THIRD_SELECT_MAX_QRCODE_ERROR = new CodeMsg(ErrorCodeDef.THIRD_SELECT_MAX_QRCODE_ERROR, "查询最大的二维码参数失败！");
	public static final CodeMsg QRCODE_PARAMETER_EXISTS = new CodeMsg(ErrorCodeDef.QRCODE_PARAMETER_EXISTS, "二维码参数已存在！");
	public static final CodeMsg TEMP_QRCODE_OVERDUE = new CodeMsg(ErrorCodeDef.TEMP_QRCODE_OVERDUE, "临时二维码已过期！");
	public static final CodeMsg QRCODE_PARAMETER_ERROR = new CodeMsg(ErrorCodeDef.QRCODE_PARAMETER_ERROR, "二维码参数不正确！");
	public static final CodeMsg THIRD_INSERT_SUB_LOG_ERROR = new CodeMsg(ErrorCodeDef.THIRD_INSERT_SUB_LOG_ERROR, "新增关注日志失败！");
	public static final CodeMsg THIRD_SELECT_SUB_LOG_ERROR = new CodeMsg(ErrorCodeDef.THIRD_SELECT_SUB_LOG_ERROR, "查询关注日志失败！");
	public static final CodeMsg THRID_AUTH_CONFIG_SELECT_ERROR = new CodeMsg(ErrorCodeDef.THRID_AUTH_CONFIG_SELECT_ERROR, "查询第三方授权配置失败！");
	public static final CodeMsg THRID_AUTH_CONFIG_INSERT_ERROR = new CodeMsg(ErrorCodeDef.THRID_AUTH_CONFIG_INSERT_ERROR, "新增第三方授权配置失败！");
	public static final CodeMsgFormat WECHAT_GET_MEDIA_FILE_ERROR = new CodeMsgFormat(ErrorCodeDef.WECHAT_GET_MEDIA_FILE_ERROR, "通过mediaId获取文件失败！%s");
	public static final CodeMsgFormat WECHAT_GET_SHORT_URL_ERROR = new CodeMsgFormat(ErrorCodeDef.WECHAT_GET_SHORT_URL_ERROR, "生成短链失败！%s");
	public static final CodeMsgFormat CREATE_QRCODE_WECHATTYPE_NULL = new CodeMsgFormat(ErrorCodeDef.CREATE_QRCODE_WECHATTYPE_NULL, "微信类型不能为空！");
	public static final CodeMsgFormat CREATE_QRCODE_BELONGTYPE_NULL = new CodeMsgFormat(ErrorCodeDef.CREATE_QRCODE_BELONGTYPE_NULL, "所属对象类型不能为空！");
	public static final CodeMsgFormat CREATE_QRCODE_BELONGID_NULL = new CodeMsgFormat(ErrorCodeDef.CREATE_QRCODE_BELONGID_NULL, "所属对象ID不能为空！");
	public static final CodeMsgFormat CREATE_QRCODE_QRCODETYPE_NULL = new CodeMsgFormat(ErrorCodeDef.CREATE_QRCODE_QRCODETYPE_NULL, "二维码类型不能为空！");
	public static final CodeMsgFormat CREATE_QRCODE_OPID_NULL = new CodeMsgFormat(ErrorCodeDef.CREATE_QRCODE_OPID_NULL, "操作人不能为空！");
	public static final CodeMsgFormat CREATE_QRCODE_EXPIRED_NULL = new CodeMsgFormat(ErrorCodeDef.CREATE_QRCODE_EXPIRED_NULL, "二维码到期时间不能为空！");

	//srv-indicator-dispatch
	public static final CodeMsg EVENT_IS_NULL_EXCEPTION = new CodeMsg(ErrorCodeDef.EVENT_IS_NULL_EXCEPTION, "推送至分发服务的事件为空，请确保其不为空！");
	public static final CodeMsgFormat EVENT_PUSH_TO_MQ_EXCEPTION = new CodeMsgFormat(ErrorCodeDef.EVENT_PUSH_TO_MQ_EXCEPTION, "推送消息至消息队列异常，未推送成功的消息为：%s！");

	// api-activity..........4700-4799
	public static final CodeMsg CAPTCHA_PIC_CODE_FAILURE = new CodeMsg(ErrorCodeDef.CAPTCHA_PIC_CODE_FAILURE, "验证码已失效，请重新获取！");
	public static final CodeMsg CAPTCHA_PIC_CODE_ERROR = new CodeMsg(ErrorCodeDef.CAPTCHA_PIC_CODE_ERROR, "验证码错误，请重新获取！");
	public static final CodeMsg PHONE_FORMAT_ERROR = new CodeMsg(ErrorCodeDef.PHONE_FORMAT_ERROR, "手机号码格式不正确！");
	public static final CodeMsg OPERATION_FREQUENT = new CodeMsg(ErrorCodeDef.OPERATION_FREQUENT, "操作频繁，请您稍后再试！");
	public static final CodeMsg PLATE_NUMBER_FORMAT_ERROR = new CodeMsg(ErrorCodeDef.PLATE_NUMBER_FORMAT_ERROR, "车牌号码格式不正确！");
	public static final CodeMsg CAPTCHA_SMS_CODE_ERROR = new CodeMsg(ErrorCodeDef.CAPTCHA_SMS_CODE_ERROR, "短信验证码错误！");
	public static final CodeMsg CALC_TRY_INSERT_ERROR = new CodeMsg(ErrorCodeDef.CALC_TRY_INSERT_ERROR, "新增试算结果失败！");
	public static final CodeMsg CALC_TRY_SELECT_ERROR = new CodeMsg(ErrorCodeDef.CALC_TRY_SELECT_ERROR, "查询试算结果失败！");
	public static final CodeMsg SOURCE_TEMPLATE_SELECT_ERROR = new CodeMsg(ErrorCodeDef.SOURCE_TEMPLATE_SELECT_ERROR, "查询获客主题失败！");
	public static final CodeMsg CUSTOMER_SELECT_NULL = new CodeMsg(ErrorCodeDef.CUSTOMER_SELECT_NULL, "用户不存在！");
	public static final CodeMsg NAME_INCLUED_NOT_UTF8 = new CodeMsg(ErrorCodeDef.NAME_INCLUED_NOT_UTF8, "名称中包含特殊字符！");
	public static final CodeMsg NAME_LENGTH_NOT_CONFORM = new CodeMsg(ErrorCodeDef.NAME_LENGTH_NOT_CONFORM, "名称长度不符合！");
	public static final CodeMsg CALC_TRY_RESULT_NULL = new CodeMsg(ErrorCodeDef.CALC_TRY_RESULT_NULL, "移动试算结果为空！");
	public static final CodeMsg PLATE_NUMBER_IS_HAVE = new CodeMsg(ErrorCodeDef.PLATE_NUMBER_IS_HAVE, "车辆已经注册过！");
	public static final CodeMsg ACTIVITY_INSURE_PERSON_NULL = new CodeMsg(ErrorCodeDef.ACTIVITY_INSURE_PERSON_NULL, "被保人不存在！");
	public static final CodeMsg CENTER_ACTIVITY_ERROR = new CodeMsg(ErrorCodeDef.CENTER_ACTIVITY_ERROR, "个人中心匹配活动失败！");
	public static final CodeMsg OUTTER_ACTIVITY_ERROR = new CodeMsg(ErrorCodeDef.OUTTER_ACTIVITY_ERROR, "外部入口匹配活动失败！");
	public static final CodeMsg ACTIVITY_TIMES_OVER = new CodeMsg(ErrorCodeDef.ACTIVITY_TIMES_OVER, "你已参加过活动！");
	public static final CodeMsg ADD_ACTIVITY_ERROR = new CodeMsg(ErrorCodeDef.ADD_ACTIVITY_ERROR, "增加活动失败！");
	public static final CodeMsg SELECT_ACTIVITY_ERROR = new CodeMsg(ErrorCodeDef.SELECT_ACTIVITY_ERROR, "查询活动列表失败！");
	public static final CodeMsg SELECT_ACTIVITY_RESULTS_ERROR = new CodeMsg(ErrorCodeDef.SELECT_ACTIVITY_RESULTS_ERROR, "查询活动结果列表失败！");
	public static final CodeMsg EDIT_ACTIVITY_ERROR = new CodeMsg(ErrorCodeDef.EDIT_ACTIVITY_ERROR, "修改活动失败！");
	public static final CodeMsg COUPON_USE_FAIL = new CodeMsg(ErrorCodeDef.COUPON_USE_FAIL, "优惠券使用失败！");
	public static final CodeMsg COUPON_EXCHANGE_FAIL = new CodeMsg(ErrorCodeDef.COUPON_EXCHANGE_FAIL, "请确认兑换码是否正确");
	public static final CodeMsg PAGE_API_TIMEOUT_ERROR = new CodeMsg(ErrorCodeDef.PAGE_API_TIMEOUT_ERROR, "连接超时,请刷新页面！");
	public static final CodeMsg BROWSER_LIMIT_ERROR = new CodeMsg(ErrorCodeDef.BROWSER_LIMIT_ERROR, "请在浏览器中访问！");
	public static final CodeMsg USER_LOGIN_ERROR = new CodeMsg(ErrorCodeDef.USER_LOGIN_ERROR, "请登入！");
	public static final CodeMsg PARAMS_IS_NULL = new CodeMsg(ErrorCodeDef.PARAMS_IS_NULL, "必填参数不能空！");
	public static final CodeMsg INSURANCE_EXPIRED_ERROR = new CodeMsg(ErrorCodeDef.INSURANCE_EXPIRED_ERROR, "请重新输入保险到期日！");
	public static final CodeMsg ACTIVITY_IS_NULL = new CodeMsg(ErrorCodeDef.ACTIVITY_IS_NULL, "活动不存在！");
	public static final CodeMsg CALC_RECORD_NO_EXIST = new CodeMsg(ErrorCodeDef.CALC_RECORD_NO_EXIST, "该算价不存在！");
	public static final CodeMsg CALC_ERROR = new CodeMsg(ErrorCodeDef.CALC_ERROR, "算价失败！");

	public static final CodeMsg TIMES_OVER = new CodeMsg(ErrorCodeDef.TIMES_OVER, "您已参加过此活动了\n更多活动等着您");
	public static final CodeMsg ACTIVITY_OVER = new CodeMsg(ErrorCodeDef.ACTIVITY_OVER, "来迟了该活动已结束\n更多活动等着您");
	public static final CodeMsg HAVE_CAR = new CodeMsg(ErrorCodeDef.HAVE_CAR, "您已添加过车辆\n此活动只向还未添加车辆的新用户开放");
	public static final CodeMsg HU_CAR = new CodeMsg(ErrorCodeDef.HU_CAR, "您的车辆为沪牌\n此活动只向非沪牌车辆开放");
	public static final CodeMsg NO_CACL = new CodeMsg(ErrorCodeDef.NO_CACL, "您还没有进行过报价\n报价过后您就可以参加此活动哦");
	public static final CodeMsg PA_CITY = new CodeMsg(ErrorCodeDef.PA_CITY, "您的车辆与活动城市不符合\n更多活动等着您");
	public static final CodeMsg COUPON_OVER= new CodeMsg(ErrorCodeDef.COUPON_OVER, "来迟了哦\n卡券已发完");
	public static final CodeMsg OTHER_FAIL = new CodeMsg(ErrorCodeDef.OTHER_FAIL, "矮油，不在服务区\n更多活动等着您");
	public static final CodeMsg EXCHANGE_OVER = new CodeMsg(ErrorCodeDef.EXCHANGE_OVER, "兑换码已发完\n更多活动等着您");

	public static final CodeMsg APPOINTMENT_TIME_ERROR = new CodeMsg(ErrorCodeDef.APPOINTMENT_TIME_ERROR, "请填写正确的预约时间!");
	public static final CodeMsg BIND_CID_TO_RECORD_ERROR = new CodeMsg(ErrorCodeDef.BIND_CID_TO_RECORD_ERROR, "无法查看报价详情!");

	

	// api-activity-admin....4800-4899
	public static final CodeMsg EXPORT_RESULT_TIME_ISNULL = new CodeMsg(ErrorCodeDef.EXPORT_RESULT_TIME_ISNULL, "导出时间参数缺失！");
	public static final CodeMsg SELECT_CALC_RESULT_ERROR = new CodeMsg(ErrorCodeDef.SELECT_CALC_RESULT_ERROR, "查询试算列表失败！");
	public static final CodeMsg UPDATECUSTOMERSOURCE_FAIL = new CodeMsg(ErrorCodeDef.UPDATECUSTOMERSOURCE_FAIL, "更新模版失败！");
	public static final CodeMsg INSERTSTOMERSOURCE_FAIL = new CodeMsg(ErrorCodeDef.INSERTSTOMERSOURCE_FAIL, "查询试算列表失败！");
	public static final CodeMsg SET_WINNING_FAIL= new CodeMsg(ErrorCodeDef.SET_WINNING_FAIL, "试算设置中奖失败，试算来源不是移动试算！");
	public static final CodeMsg RULE_ERROR= new CodeMsg(ErrorCodeDef.RULE_ERROR, "规则表达式有误！");
	public static final CodeMsg ADD_SALE_ERROR= new CodeMsg(ErrorCodeDef.ADD_SALE_ERROR, "添加销售主题失败！");
	public static final CodeMsg LIST_SALE_ERROR= new CodeMsg(ErrorCodeDef.LIST_SALE_ERROR, "列出销售主题失败！");
	public static final CodeMsg UPDATE_SALE_ERROR= new CodeMsg(ErrorCodeDef.UPDATE_SALE_ERROR, "更新销售主题失败！");
	public static final CodeMsg LIST_SALE_URL_ERROR= new CodeMsg(ErrorCodeDef.LIST_SALE_URL_ERROR, "列出销售渠道失败！");
	public static final CodeMsg ADD_SALE_URL_ERROR= new CodeMsg(ErrorCodeDef.ADD_SALE_URL_ERROR, "添加销售渠道失败！");
	public static final CodeMsg UPDATE_SALE_URL_ERROR= new CodeMsg(ErrorCodeDef.UPDATE_SALE_URL_ERROR, "更新销售渠道失败！");
	public static final CodeMsg GET_SALE_URL_ERROR= new CodeMsg(ErrorCodeDef.GET_SALE_URL_ERROR, "查询销售渠道失败！");
	public static final CodeMsg GET_SALE_ERROR= new CodeMsg(ErrorCodeDef.GET_SALE_ERROR, "查询销售主题失败！");
	public static final CodeMsg ADD_SALE_RECORD_ERROR= new CodeMsg(ErrorCodeDef.ADD_SALE_RECORD_ERROR, "网销添加销售记录失败！");
	public static final CodeMsg GET_SALE_RECORD_ERROR= new CodeMsg(ErrorCodeDef.GET_SALE_RECORD_ERROR, "网销查询销售记录失败！");
	public static final CodeMsg BIND_CID_TO_SALE_RECORD_ERROR= new CodeMsg(ErrorCodeDef.BIND_CID_TO_SALE_RECORD_ERROR, "绑定cid到网销销售记录失败！");
	public static final CodeMsg EXPORT_RESULT_ACTIVITYID_ISNULL = new CodeMsg(ErrorCodeDef.EXPORT_RESULT_ACTIVITYID_ISNULL, "导出活动id参数缺失！");





	//srv-brokerage  5400-5599
	public static CodeMsg BROKERAGE_STRATEGY_NULL = new CodeMsg(ErrorCodeDef.BROKERAGE_STRATEGY_NULL,"佣金策略不能为空！");
	public static CodeMsg BROKERAGE_STRATEGY_FORMULA_FORMAT_ILLEGAL = new CodeMsg(ErrorCodeDef.BROKERAGE_STRATEGY_FORMULA_FORMAT_ILLEGAL,"佣金策略公式格式错误！");
	public static CodeMsg BROKERAGE_STRATEGY_FORMULA_TYPE_ILLEGAL = new CodeMsg(ErrorCodeDef.BROKERAGE_STRATEGY_FORMULA_TYPE_ILLEGAL,"佣金策略公式类型错误！");
	public static CodeMsg BROKERAGE_INPUT_PRECONDITION_ILLEGAL = new CodeMsg(ErrorCodeDef.BROKERAGE_INPUT_PRECONDITION_ILLEGAL,"输入的前置条件不合法！");
	public static CodeMsg BROKERAGE_NO_MATCHED_STRATEGY = new CodeMsg(ErrorCodeDef.BROKERAGE_NO_MATCHED_STRATEGY,"没有找到适用的佣金策略！");
	public static CodeMsg BROKERAGE_LB_LOG_NULL = new CodeMsg(ErrorCodeDef.BROKERAGE_LB_LOG_NULL,"小蜜蜂佣金日志不能为空！");
	public static CodeMsg BROKERAGE_LB_LOG_STATUS_ILLEGAL = new CodeMsg(ErrorCodeDef.BROKERAGE_LB_LOG_STATUS_ILLEGAL,"小蜜蜂佣金日志状态不合法！");
	public static CodeMsg BROKERAGE_FORMULA_TYPE_ILLEGAL = new CodeMsg(ErrorCodeDef.BROKERAGE_FORMULA_TYPE_ILLEGAL,"佣金计算类型不合法！");
	public static CodeMsg BROKERAGE_FORMULA_VALUE_ILLEGAL = new CodeMsg(ErrorCodeDef.BROKERAGE_FORMULA_VALUE_ILLEGAL,"佣金值不合法！");
	public static CodeMsg BROKERAGE_STRATEGY_STATUS_ILLEGAL = new CodeMsg(ErrorCodeDef.BROKERAGE_STRATEGY_STATUS_ILLEGAL,"佣金策略状态不合法！");
	public static CodeMsg BROKERAGE_STRATEGY_UPDATE_FAILURE = new CodeMsg(ErrorCodeDef.BROKERAGE_STRATEGY_UPDATE_FAILURE,"佣金策略不存在或者状态无变化！");
	public static CodeMsg BROKERAGE_MATCH_OEM_RULE_FAILURE = new CodeMsg(ErrorCodeDef.BROKERAGE_MATCH_OEM_RULE_FAILURE,"匹配挂单点细则失败！");


	// srv-activiti-engine  5100-5199
	public static final CodeMsg ACTIVITI_PROCESS_BUSINESS_KEY_EMPTY_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_PROCESS_BUSINESS_KEY_EMPTY_EXCEPTION, "工作流业务关联key为空");
	public static final CodeMsg ACTIVITI_PROCESS_BUSINESS_KEY_VALID_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_PROCESS_BUSINESS_KEY_VALID_EXCEPTION, "无效的业务关联key");
	public static final CodeMsg ACTIVITI_USER_ID_VALID_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_USER_ID_VALID_EXCEPTION, "无效的用户id");
	public static final CodeMsg ACTIVITI_PROCESS_INSTANCE_ID_VALID_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_PROCESS_INSTANCE_ID_VALID_EXCEPTION, "无效的流程实例id");
	public static final CodeMsg ACTIVITI_PROCESS_VALID_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_PROCESS_VALID_EXCEPTION, "无效的工作流流程");
	public static final CodeMsg ACTIVITI_WORKFLOW_START_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_WORKFLOW_START_EXCEPTION, "工作流启动异常");
	public static final CodeMsg ACTIVITI_COMPLETE_TASK_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_COMPLETE_TASK_EXCEPTION, "完成任务异常");
	public static final CodeMsg ACTIVITI_CLAIM_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_CLAIM_EXCEPTION, "签收任务异常");
	public static final CodeMsg ACTIVITI_UNCLAIM_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_UNCLAIM_EXCEPTION, "取消签收异常");
	public static final CodeMsg ACTIVITI_PARAMETER_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_PARAMETER_EXCEPTION, "参数不合法");
	public static final CodeMsg ACTIVITI_UNFINISHED_HISTORIC_TASK_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_UNCLAIM_EXCEPTION, "无法获取未完成的历史任务");
	public static final CodeMsg ACTIVITI_GROUP_ID_VALID_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_GROUP_ID_VALID_EXCEPTION, "无效的组id");
	public static final CodeMsg ACTIVITI_OBTAIN_USER_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_OBTAIN_USER_EXCEPTION, "获取工作流用户异常");
	public static final CodeMsg ACTIVITI_OBTAIN_GROUP_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_OBTAIN_GROUP_EXCEPTION, "获取工作流组异常");
	public static final CodeMsg ACTIVITI_ADD_USER_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_ADD_USER_EXCEPTION, "创建工作流用户异常");
	public static final CodeMsg ACTIVITI_ADD_GROUP_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_ADD_GROUP_EXCEPTION, "创建工作流组异常");
	public static final CodeMsg ACTIVITI_DELETE_MEMBERSHIP_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_DELETE_MEMBERSHIP_EXCEPTION, "删除工作流组用户关系异常");
	public static final CodeMsg ACTIVITI_ADD_MEMBERSHIP_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_ADD_MEMBERSHIP_EXCEPTION, "创建工作流组用户关系异常");
	public static final CodeMsg ACTIVITI_QUERY_START_END_TIME_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_QUERY_START_END_TIME_EXCEPTION, "查询开始时间和结束时间异常");
	public static final CodeMsg ACTIVITI_QUERY_FIRST_MAX_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_QUERY_FIRST_MAX_EXCEPTION, "查询开始下标不能小于结束下标异常");
	public static final CodeMsg ACTIVITI_OBTAIN_HISTORIC_ACTIVITI_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_OBTAIN_HISTORIC_ACTIVITI_EXCEPTION, "获取工作流历史活动异常");
	public static final CodeMsg ACTIVITI_OBTAIN_HISTORIC_INSTANCE_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_OBTAIN_HISTORIC_INSTANCE_EXCEPTION, "获取工作流历史流程异常");
	public static final CodeMsg ACTIVITI_OBTAIN_PROCESS_VARIABLE_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_OBTAIN_PROCESS_VARIABLE_EXCEPTION, "获取工作流流程变量异常");
	public static final CodeMsg ACTIVITI_SET_PROCESS_VARIABLE_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_SET_PROCESS_VARIABLE_EXCEPTION, "设置工作流流程变量异常");
	public static final CodeMsg ACTIVITI_OBTAIN_PROCESS_INSTANCE_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_OBTAIN_PROCESS_INSTANCE_EXCEPTION, "获取工作流流程实例异常");
	public static final CodeMsg ACTIVITI_CONVERTION_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_CONVERTION_EXCEPTION, "工作流类型转换异常");
	public static final CodeMsg ACTIVITI_REDIS_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_REDIS_EXCEPTION, "工作流中Redis异常");
	public static final CodeMsg ACTIVITI_OBTAIN_TASK_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_OBTAIN_TASK_EXCEPTION, "获取工作流任务结点异常");
	public static final CodeMsg ACTIVITI_OBTAIN_PROCESS_DEFINITION_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_OBTAIN_PROCESS_DEFINITION_EXCEPTION, "获取工作流流程信息异常");
	public static final CodeMsg ACTIVITI_DELETE_DEPLOYMENT_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_DELETE_DEPLOYMENT_EXCEPTION, "删除部署流程异常");

	// api-bee...............5600-5799
	public static final CodeMsg BEE_LOGIN_PHONE_INVALID = new CodeMsg(ErrorCodeDef.BEE_LOGIN_PHONE_INVALID, "手机号码格式不正确！");
	public static final CodeMsg BEE_LOGIN_OPERATOR_FREQUENT = new CodeMsg(ErrorCodeDef.BEE_LOGIN_OPERATOR_FREQUENT, "操作频繁,请您稍后再试！");
	public static final CodeMsg BEE_LOGIN_CAPTCHA_ERROR = new CodeMsg(ErrorCodeDef.BEE_LOGIN_CAPTCHA_ERROR, "验证码错误！");
	public static final CodeMsg BEE_LOGIN_SESSION_INVALID = new CodeMsg(ErrorCodeDef.BEE_LOGIN_SESSION_INVALID, "登陆会话失效！");
	public static final CodeMsg BEE_LOGIN_STATUS_FROST = new CodeMsg(ErrorCodeDef.BEE_LOGIN_STATUS_FROST, "您已被冻结，无法登陆！");
	public static final CodeMsg BEE_REGISTER_PHONE_CARD_NULL = new CodeMsg(ErrorCodeDef.BEE_REGISTER_PHONE_CARD_NULL, "请填写推荐人手机号或上传名片！");
	public static final CodeMsg BEE_INSURANCE_IS_NOT_HAVE = new CodeMsg(ErrorCodeDef.BEE_INSURANCE_IS_NOT_HAVE, "报价详情不存在！");
	public static final CodeMsg BEE_RECORD_HB_IS_HAVE = new CodeMsg(ErrorCodeDef.BEE_RECORD_HB_IS_HAVE, "已存在核保记录！");
	public static final CodeMsg BEE_CALC_PRICE_FREQUENT = new CodeMsg(ErrorCodeDef.BEE_CALC_PRICE_FREQUENT, "报价频繁，请稍后再试！");
	public static final CodeMsg BEE_CALC_PRICE_DAY_FREQUENT = new CodeMsg(ErrorCodeDef.BEE_CALC_PRICE_DAY_FREQUENT, "报价频繁，请明天再试！");
	public static final CodeMsg BEE_CALC_PRICE_FORCE_NOT_YETDATE = new CodeMsg(ErrorCodeDef.BEE_CALC_PRICE_FORCE_NOT_YETDATE, "交强险未到可投保时间！");
	public static final CodeMsg BEE_CALC_PRICE_INVALID = new CodeMsg(ErrorCodeDef.BEE_CALC_PRICE_INVALID, "系统未能找到该车，建议拨打人工台获取报价！");
	public static final CodeMsgFormat BEE_CALC_PRICE_PLATENUMBER_INVALID = new CodeMsgFormat(ErrorCodeDef.BEE_CALC_PRICE_PLATENUMBER_INVALID, "车牌号码{%s}格式不正确！");
	public static final CodeMsg BEE_CALC_PRICE_DAY_UP_LIMIE = new CodeMsg(ErrorCodeDef.BEE_CALC_PRICE_DAY_UP_LIMIE, "该车报价已达到上限，请明天再试！");
	public static final CodeMsg BEE_CALC_PRICE_ITEM_NULL = new CodeMsg(ErrorCodeDef.BEE_CALC_PRICE_ITEM_NULL, "报价险种项不能为空！");
	public static final CodeMsg BEE_CAR_COMMIT_AUDIT = new CodeMsg(ErrorCodeDef.BEE_CAR_COMMIT_AUDIT, "该车辆已提交核保！");
	public static final CodeMsg BEE_REGISTER_RECOMMEND_NOT_HAVE = new CodeMsg(ErrorCodeDef.BEE_REGISTER_RECOMMEND_NOT_HAVE, "推荐人不存在！");
	public static final CodeMsg BEE_REGISTER_RECOMMEND_NULL = new CodeMsg(ErrorCodeDef.BEE_REGISTER_RECOMMEND_NULL, "推荐人不能为空！");
	public static final CodeMsg BEE_REGISTER_RECOMMEND_CITY_NOT_EQUEST = new CodeMsg(ErrorCodeDef.BEE_REGISTER_RECOMMEND_CITY_NOT_EQUEST, "推荐人不属于该城市！");
	public static final CodeMsg BEE_SELECT_INSURANCE_ERROR = new CodeMsg(ErrorCodeDef.BEE_SELECT_INSURANCE_ERROR, "查询报价详情失败！");
	public static final CodeMsg BEE_SELECT_RECORD_ERROR = new CodeMsg(ErrorCodeDef.BEE_SELECT_RECORD_ERROR, "查询报价记录失败！");
	public static final CodeMsg BEE_CONFIRMINSURANCE_BENEFITDISCOUNT_ZERO = new CodeMsg(ErrorCodeDef.BEE_CONFIRMINSURANCE_BENEFITDISCOUNT_ZERO, "佣金系数不能小于零！");
	public static final CodeMsg BEE_CONFIRMINSURANCE_COMMISSION_ZERO = new CodeMsg(ErrorCodeDef.BEE_CONFIRMINSURANCE_COMMISSION_ZERO, "佣金额度不能小于零！");
	public static final CodeMsg BEE_CONFIRMINSURANCE_ERROR = new CodeMsg(ErrorCodeDef.BEE_CONFIRMINSURANCE_ERROR, "确认投保失败！");
	public static final CodeMsg BEE_CALC_INSURANCE_IS_NULL = new CodeMsg(ErrorCodeDef.BEE_CALC_INSURANCE_IS_NULL, "报价详情不存在！");
	public static final CodeMsg BEE_CALC_RECORD_IS_NULL = new CodeMsg(ErrorCodeDef.BEE_CALC_RECORD_IS_NULL, "报价记录不存在！");
	public static final CodeMsg BEE_JUDGE_PLATENUMBER_ISURED_FAILURE = new CodeMsg(ErrorCodeDef.BEE_JUDGE_PLATENUMBER_ISURED_FAILURE, "判断车辆是否核保失败！");
	public static final CodeMsg BEE_INSERT_CALC_RECORD_ERROR = new CodeMsg(ErrorCodeDef.BEE_INSERT_CALC_RECORD_ERROR, "新增报价记录失败！");
	public static final CodeMsg BEE_SELECT_MEMBER_RELE_INFO_ERROR = new CodeMsg(ErrorCodeDef.BEE_SELECT_MEMBER_RELE_INFO_ERROR, "查询经纪人详情失败！");
	public static final CodeMsg BEE_CONFIRMPRICE_ERROR = new CodeMsg(ErrorCodeDef.BEE_CONFIRMPRICE_ERROR, "确认核保失败！");
	public static final CodeMsg BEE_SELECT_INSURANCE_STATUS_ERROR = new CodeMsg(ErrorCodeDef.BEE_SELECT_INSURANCE_STATUS_ERROR, "查询报价记录保单状态失败！");
	public static final CodeMsg BEE_PAYMENT_INFO_EXCEPTION = new CodeMsg(ErrorCodeDef.BEE_PAYMENT_INFO_EXCEPTION, "支付信息页面显示异常！");
	public static final CodeMsg BEE_PAY_EXCEPTION = new CodeMsg(ErrorCodeDef.BEE_PAY_EXCEPTION, "支付异常！");
	public static final CodeMsg BEE_PAY_CHECK_EXCEPTION = new CodeMsg(ErrorCodeDef.BEE_PAY_CHECK_EXCEPTION, "支付验证失败！");
	public static final CodeMsg BEE_PAY_INVALID_EXCEPTION = new CodeMsg(ErrorCodeDef.BEE_PAY_INVALID_EXCEPTION, "支付信息已失效！");
	public static final CodeMsg BEE_SELECT_CHANNEL_MANAGER_ERROR = new CodeMsg(ErrorCodeDef.BEE_SELECT_CHANNEL_MANAGER_ERROR, "查询推荐人失败！");
	public static final CodeMsg BEE_SELECT_APP_UPDATE_ERROR = new CodeMsg(ErrorCodeDef.BEE_SELECT_APP_UPDATE_ERROR, "查询APP升级信息失败！");
	public static final CodeMsg BEE_INSERT_MEMBER_RELE_INFO_ERROR = new CodeMsg(ErrorCodeDef.BEE_INSERT_MEMBER_RELE_INFO_ERROR, "新增经纪人信息失败！");
	public static final CodeMsg BEE_UPDATE_CALC_TIME_ERROR = new CodeMsg(ErrorCodeDef.BEE_UPDATE_CALC_TIME_ERROR, "更新算价时间失败！");
	public static final CodeMsg BEE_SELECT_PAY_INFO_ERROR = new CodeMsg(ErrorCodeDef.BEE_SELECT_PAY_INFO_ERROR, "查询支付信息失败！");
	public static final CodeMsg BEE_CAR_OWNER_IDNUMBER_ERROR = new CodeMsg(ErrorCodeDef.BEE_CAR_OWNER_IDNUMBER_ERROR, "车主证件号不正确！");
	public static final CodeMsg BEE_ORDER_IS_NULL = new CodeMsg(ErrorCodeDef.BEE_ORDER_IS_NULL, "订单不存在！");
	public static final CodeMsg BEE_PAY_WAY_IS_NULL = new CodeMsg(ErrorCodeDef.BEE_PAY_WAY_IS_NULL, "请选择正确的支付方式！");
	public static final CodeMsg BEE_CONFIRMPRICE_UP_LIMIT = new CodeMsg(ErrorCodeDef.BEE_CONFIRMPRICE_UP_LIMIT, "下单数量已达到上限！");
	public static final CodeMsg BEE_GET_PAY_INFO_PARAM_ERROR = new CodeMsg(ErrorCodeDef.BEE_GET_PAY_INFO_PARAM_ERROR, "参数错误请重试！");
	public static final CodeMsg BEE_LOGIN_ADD_SESSION_ERROR = new CodeMsg(ErrorCodeDef.BEE_LOGIN_ADD_SESSION_ERROR, "新增会话失败！");
	public static final CodeMsg BEE_LOGIN_UPDATE_SESSION_ERROR = new CodeMsg(ErrorCodeDef.BEE_LOGIN_UPDATE_SESSION_ERROR, "更新会话失败！");
	public static final CodeMsg BEE_CALC_PRICE_BUSINESS_DATE_MORE = new CodeMsg(ErrorCodeDef.BEE_CALC_PRICE_BUSINESS_DATE_MORE, "商业险报价日期超过60天！");
	public static final CodeMsg BEE_CALC_PRICE_BUSINESS_DATE_FORMAT = new CodeMsg(ErrorCodeDef.BEE_CALC_PRICE_BUSINESS_DATE_FORMAT, "日期格式不正确！");
	public static final CodeMsg BEE_CANCEL_ORDER_FAILD = new CodeMsg(ErrorCodeDef.BEE_CANCEL_ORDER_FAILD, "取消订单失败！");
	public static final CodeMsg BEE_SELECT_CITY_CONF_ERROR = new CodeMsg(ErrorCodeDef.BEE_SELECT_CITY_CONF_ERROR, "查询城市相关信息失败！");
	public static final CodeMsg BEE_SERVICE_WEIHU_PROMPT = new CodeMsg(ErrorCodeDef.BEE_SERVICE_WEIHU_PROMPT, "系统升级，请稍后再试！");
	
	// api-bee-admin.........5800-5999
	public static final CodeMsg BEE_INSERT_TAG_ERROR = new CodeMsg(ErrorCodeDef.BEE_INSERT_TAG_ERROR, "新增经纪人标签失败！");
	public static final CodeMsg BEE_SELECT_TAG_ERROR = new CodeMsg(ErrorCodeDef.BEE_SELECT_TAG_ERROR, "查询经纪人标签失败！");
	public static final CodeMsg BEE_INSERT_TAG_RELE_ERROR = new CodeMsg(ErrorCodeDef.BEE_INSERT_TAG_RELE_ERROR, "新增经纪人标签关系失败！");
	public static final CodeMsg BEE_SELECT_TAG_RELE_ERROR = new CodeMsg(ErrorCodeDef.BEE_SELECT_TAG_RELE_ERROR, "查询经纪人标签关系失败！");
	public static final CodeMsg BEE_INSERT_OPERATOR_RELE_ERROR = new CodeMsg(ErrorCodeDef.BEE_INSERT_OPERATOR_RELE_ERROR, "新增操作人关联关系失败！");
	public static final CodeMsg BEE_SELECT_OPERATOR_RELE_ERROR = new CodeMsg(ErrorCodeDef.BEE_SELECT_OPERATOR_RELE_ERROR, "查询操作人关联关系失败！");
	public static final CodeMsg BEE_SELECT_CITY_MEMBER_RELE_COUNT_ERROR = new CodeMsg(ErrorCodeDef.BEE_SELECT_CITY_MEMBER_RELE_COUNT_ERROR, "查询城市经纪人数量失败！");
	public static final CodeMsg BEE_INSERT_MEMBER_RELE_ERROR = new CodeMsg(ErrorCodeDef.BEE_INSERT_MEMBER_RELE_ERROR, "新增经纪人和渠道经理对应关系失败！");
	public static final CodeMsg BEE_SELECT_MEMBER_RELE_ERROR = new CodeMsg(ErrorCodeDef.BEE_SELECT_MEMBER_RELE_ERROR, "查询经纪人和渠道经理对应关系失败！");
	public static final CodeMsg OPERATOR_RELE_NOT_HAVE = new CodeMsg(ErrorCodeDef.OPERATOR_RELE_NOT_HAVE, "操作员和操作员类型对应关系不存在！");
	public static final CodeMsg CALC_RECORD_SELECT_ERROR = new CodeMsg(ErrorCodeDef.CALC_RECORD_SELECT_ERROR, "查询报价记录失败！");
	public static final CodeMsg QUERY_BEE_ORDER_COUNT_ERROR = new CodeMsg(ErrorCodeDef.QUERY_BEE_ORDER_COUNT_ERROR, "查询经纪人出单量失败！");
	public static final CodeMsg QUERY_BEE_RELE_ERROR = new CodeMsg(ErrorCodeDef.QUERY_BEE_RELE_ERROR, "查询经纪人失败！");
	public static final CodeMsg CITY_MANAGER_IS_HAVE = new CodeMsg(ErrorCodeDef.CITY_MANAGER_IS_HAVE, "该城市已存在城市经理！");
	public static final CodeMsg CLOSE_CITY_MANAGER_IS_HAVE = new CodeMsg(ErrorCodeDef.CLOSE_CITY_MANAGER_IS_HAVE, "该城市存在城市经理！");
	public static final CodeMsg CITY_MANAGER_IS_NOT_HAVE = new CodeMsg(ErrorCodeDef.CITY_MANAGER_IS_NOT_HAVE, "该城市不存在城市经理！");
	public static final CodeMsg QUERY_BEE_RELE_IS_HAVE_ERROR = new CodeMsg(ErrorCodeDef.QUERY_BEE_RELE_IS_HAVE_ERROR, "查询经纪人是否存在失败！");
	public static final CodeMsg QUERY_BEE_RELE_COUNT_ERROR = new CodeMsg(ErrorCodeDef.QUERY_BEE_RELE_COUNT_ERROR, "查询所属经纪人数量失败！");
	public static final CodeMsg MEMBER_LOG_BATCH_INSERT_ERROR = new CodeMsg(ErrorCodeDef.MEMBER_LOG_BATCH_INSERT_ERROR, "批量新增经纪人日志失败！");
	public static final CodeMsg QUERY_MEMBER_ALL_BEE_ERROR = new CodeMsg(ErrorCodeDef.QUERY_MEMBER_ALL_BEE_ERROR, "查询渠道经理所有经纪人失败！");
	public static final CodeMsg UPDATE_BEE_MEMBER_ERROR = new CodeMsg(ErrorCodeDef.UPDATE_BEE_MEMBER_ERROR, "变更经纪人所属渠道经理失败！");
	public static final CodeMsg QUERY_BEE_INFO_STATISTICS_ERROR = new CodeMsg(ErrorCodeDef.QUERY_BEE_INFO_STATISTICS_ERROR, "获取经纪人详细信息失败！");
	public static final CodeMsg CAR_QUERY_RESULT_NULL_ERROR = new CodeMsg(ErrorCodeDef.CAR_QUERY_RESULT_NULL_ERROR, "车辆查询结果为空！");
	public static final CodeMsg OPERATOR_RELE_IS_NOT_HAVE = new CodeMsg(ErrorCodeDef.OPERATOR_RELE_IS_NOT_HAVE, "操作员没有类型标识！");
	public static final CodeMsg OPERATOR_CITY_NOT_EQUEST = new CodeMsg(ErrorCodeDef.OPERATOR_CITY_NOT_EQUEST, "不能添加其它城市的渠道经理！");
	public static final CodeMsg OPERATOR_COUNTYID_NOT_EQUEST = new CodeMsg(ErrorCodeDef.OPERATOR_COUNTYID_NOT_EQUEST, "不能添加其它区县的渠道经理！");
	public static final CodeMsg OPERATOR_UNAUTHORIZED = new CodeMsg(ErrorCodeDef.OPERATOR_UNAUTHORIZED, "不能越权进行操作！");
	public static final CodeMsg MODIFY_MEMBER_BEE_IS_HAVE = new CodeMsg(ErrorCodeDef.MODIFY_MEMBER_BEE_IS_HAVE, "渠道经理下面存在经纪人！");
	public static final CodeMsg BEE_OPERATOR_RELE_IS_NULL = new CodeMsg(ErrorCodeDef.BEE_OPERATOR_RELE_IS_NULL, "关联关系对象不能为空！");
	public static final CodeMsg BEE_OPERATOR_RELE_OPID_NULL = new CodeMsg(ErrorCodeDef.BEE_OPERATOR_RELE_OPID_NULL, "操作员ID不能为空！");
	public static final CodeMsg BEE_OPERATOR_RELE_OPTYPE_NULL = new CodeMsg(ErrorCodeDef.BEE_OPERATOR_RELE_OPTYPE_NULL, "操作员类型不能为空！");
	public static final CodeMsg BEE_OPERATOR_RELE_UPDATE_ERROR = new CodeMsg(ErrorCodeDef.BEE_OPERATOR_RELE_UPDATE_ERROR, "修改操作员对应关系失败！");
	public static final CodeMsg MODIFY_MEMBER_CITY_COUNTY_NULL = new CodeMsg(ErrorCodeDef.MODIFY_MEMBER_CITY_COUNTY_NULL, "城市和区县需要联合修改！");
	public static final CodeMsg OPERATOR_QUERY_STRATEGY_NO_PRIVILEGE = new CodeMsg(ErrorCodeDef.OPERATOR_QUERY_STRATEGY_NO_PRIVILEGE, "操作员没有权限查询此策略！");
	public static final CodeMsg OPERATOR_ADD_STRATEGY_NO_PRIVILEGE = new CodeMsg(ErrorCodeDef.OPERATOR_ADD_STRATEGY_NO_PRIVILEGE, "操作员没有权限新增此策略！");
	public static final CodeMsg OPERATOR_NO_PRIVILEGE_CID_CALC_RECORD = new CodeMsg(ErrorCodeDef.OPERATOR_ADD_STRATEGY_NO_PRIVILEGE, "操作员没有权限查看当前报价详情！");
	public static final CodeMsgFormat BATCH_IMPORT_BEE_OPERATOR_NOT_HAVE = new CodeMsgFormat(ErrorCodeDef.BATCH_IMPORT_BEE_OPERATOR_NOT_HAVE, "渠道经理{%s}不存在，导入失败！");
	public static final CodeMsg ADD_BEE_CITY_NOT_EQUEST = new CodeMsg(ErrorCodeDef.ADD_BEE_CITY_NOT_EQUEST, "不能添加其它城市的经纪人！");
	public static final CodeMsg ADD_BEE_COUNTY_NOT_EQUEST = new CodeMsg(ErrorCodeDef.ADD_BEE_COUNTY_NOT_EQUEST, "不能添加其它区县的经纪人！");
	public static final CodeMsg ADD_BEE_IMPORT_FILE_NULL = new CodeMsg(ErrorCodeDef.ADD_BEE_IMPORT_FILE_NULL, "导入经纪人文件不能为空！");
	public static final CodeMsg ADD_BEE_IMPORT_FILE_FAILED = new CodeMsg(ErrorCodeDef.ADD_BEE_IMPORT_FILE_FAILED, "导入经纪人失败！");
	public static final CodeMsg CAR_CUSTOMER_QUERY_RESULT_NULL_ERROR = new CodeMsg(ErrorCodeDef.CAR_CUSTOMER_QUERY_RESULT_NULL_ERROR, "客户车辆查询为空！");
	public static final CodeMsg CAR_CALC_QUERY_RESULT_NULL_ERROR = new CodeMsg(ErrorCodeDef.CAR_CALC_QUERY_RESULT_NULL_ERROR, "客户车辆查询为空！");
	public static final CodeMsg BEE_UPDATE_INSURANCE_RECORD_ERROR = new CodeMsg(ErrorCodeDef.BEE_UPDATE_INSURANCE_RECORD_ERROR, "更新保单详情记录错误！");
	public static final CodeMsg BEE_CALC_CALCID_ERROR = new CodeMsg(ErrorCodeDef.BEE_CALC_CALCID_ERROR, "算价ID不正确！");
	public static final CodeMsg CALC_RECORD_ITEM_ID_IS_NOTEXISTS = new CodeMsg(ErrorCodeDef.CALC_RECORD_ITEM_ID_IS_NOTEXISTS, "算价详情不存在！");
	public static final CodeMsg BEE_CALC_SRV_RESULT_NULL_ERROR = new CodeMsg(ErrorCodeDef.BEE_CALC_SRV_RESULT_NULL_ERROR, "");
	public static final CodeMsg BEE_UPDATE_INSURANCE_RECORD_STATUS_ERROR = new CodeMsg(ErrorCodeDef.BEE_UPDATE_INSURANCE_RECORD_STATUS_ERROR, "更新保单记录状态错误！");
	public static final CodeMsg OPERATOR_ROLE_LOG_RECORD_INSERT_ERROR = new CodeMsg(ErrorCodeDef.OPERATOR_ROLE_LOG_RECORD_INSERT_ERROR, "操作员角色分配记录日志失败！");
	public static final CodeMsg OPERATOR_BEE_PRIVILEGE_ERROR = new CodeMsg(ErrorCodeDef.OPERATOR_BEE_PRIVILEGE_ERROR, "操作员不能操作此经纪人！");
	public static final CodeMsg ADD_BEE_TAG_NAME_REPEAT = new CodeMsg(ErrorCodeDef.ADD_BEE_TAG_NAME_REPEAT, "标签名称已存在！");
	public static final CodeMsg SELECT_OPERATOR_COUNTY_ERROR = new CodeMsg(ErrorCodeDef.SELECT_OPERATOR_COUNTY_ERROR, "查询操作员对应城市区县失败！");
	public static final CodeMsg INSERT_OPERATOR_COUNTY_ERROR = new CodeMsg(ErrorCodeDef.INSERT_OPERATOR_COUNTY_ERROR, "新增操作员对应城市区县失败！");
	public static final CodeMsg SELECT_CITY_MANAGER_ISHAVE_ERROR = new CodeMsg(ErrorCodeDef.SELECT_CITY_MANAGER_ISHAVE_ERROR, "判断是否存在城市经理失败！");
	public static final CodeMsg SELECT_CHANNEL_MANAGER_COUNT_ERROR = new CodeMsg(ErrorCodeDef.SELECT_CHANNEL_MANAGER_COUNT_ERROR, "查询城市渠道经理数量失败！");
	public static final CodeMsg SELECT_CITY_MANAGER_ERROR = new CodeMsg(ErrorCodeDef.SELECT_CITY_MANAGER_ERROR, "查询城市经理失败！");
	public static final CodeMsg SELECT_CITY_MEMBER_ERROR = new CodeMsg(ErrorCodeDef.SELECT_CITY_MEMBER_ERROR, "查询渠道经理失败！");
	public static final CodeMsg ADD_MEMBER_COUNTY_IS_NULL = new CodeMsg(ErrorCodeDef.ADD_MEMBER_COUNTY_IS_NULL, "城市区县不能为空！");
	public static final CodeMsg UPDATE_MEMBER_ERROR = new CodeMsg(ErrorCodeDef.UPDATE_MEMBER_ERROR, "修改渠道经理失败！");
	public static final CodeMsg ADD_BEE_MEMBER_CITY_NOT_EQUEST = new CodeMsg(ErrorCodeDef.ADD_BEE_MEMBER_CITY_NOT_EQUEST, "渠道经理和经纪人城市不相同！");
	public static final CodeMsg ADD_BEE_MEMBER_COUNTY_NOT_EQUEST = new CodeMsg(ErrorCodeDef.ADD_BEE_MEMBER_COUNTY_NOT_EQUEST, "经纪人区县不在渠道经理所管理区县内！");
	public static final CodeMsg SELECT_MEMBER_BEE_COUNTY_ERROR = new CodeMsg(ErrorCodeDef.SELECT_MEMBER_BEE_COUNTY_ERROR, "查询渠道经理名下经纪人所有区县失败！");
	public static final CodeMsg MEMBER_NOT_INCLUED_BEE_COUNTY = new CodeMsg(ErrorCodeDef.MEMBER_NOT_INCLUED_BEE_COUNTY, "渠道经理管理的区县不包含名下已有经纪人区县！");
	public static final CodeMsgFormat IMPORT_MEMBER_NOT_INCLUED_BEE_COUNTY = new CodeMsgFormat(ErrorCodeDef.IMPORT_MEMBER_NOT_INCLUED_BEE_COUNTY, "渠道经理{%s}不包含经纪人{%s}所属区县！");
	public static final CodeMsg APP_UPDATE_CONF_INSERT_ERROR = new CodeMsg(ErrorCodeDef.APP_UPDATE_CONF_INSERT_ERROR, "新增APP升级配置失败！");
	public static final CodeMsg APP_UPDATE_CONF_FILE_NULL = new CodeMsg(ErrorCodeDef.APP_UPDATE_CONF_FILE_NULL, "升级文件不能为空！");
	public static final CodeMsg APP_UPDATE_CONF_SELECT_ERROR = new CodeMsg(ErrorCodeDef.APP_UPDATE_CONF_SELECT_ERROR, "查询升级配置失败！");
	public static final CodeMsg BEE_TAG_UPDATE_STATUS_ERROR = new CodeMsg(ErrorCodeDef.BEE_TAG_UPDATE_STATUS_ERROR, "修改状态失败！");
	
	public static final CodeMsg SELECT_CHANNEL_MANAGER_NULL = new CodeMsg(ErrorCodeDef.SELECT_CHANNEL_MANAGER_NULL, "渠道经理不存在！");
	public static final CodeMsg BEE_MANAGER_CITY_COUNTY_NOT_EQUEST = new CodeMsg(ErrorCodeDef.BEE_MANAGER_CITY_COUNTY_NOT_EQUEST, "渠道经理和经纪人城市/区县不一致！");
	public static final CodeMsg BEE_UPDATE_ERROR = new CodeMsg(ErrorCodeDef.BEE_UPDATE_ERROR, "修改经纪人失败！");
	public static final CodeMsg BEE_UPDATE_CITY_COUNTY_NOT_WITH = new CodeMsg(ErrorCodeDef.BEE_UPDATE_CITY_COUNTY_NOT_WITH, "城市区县需要联动一起修改！");
	public static final CodeMsg BEE_UPDATE_PASSWORD_FAILURE = new CodeMsg(ErrorCodeDef.BEE_UPDATE_PASSWORD_FAILURE, "修改密码失败！");
	public static final CodeMsg PHONE_NUMBER_FORMAT_IS_NOT_CORRECT = new CodeMsg(ErrorCodeDef.PHONE_NUMBER_FORMAT_IS_NOT_CORRECT, "手机号码格式不正确！");
	public static final CodeMsg EMAIL_FORMAT_IS_NOT_CORRECT = new CodeMsg(ErrorCodeDef.EMAIL_FORMAT_IS_NOT_CORRECT, "邮箱格式不正确！");
	public static final CodeMsg OPERATOR_CITY_NULL = new CodeMsg(ErrorCodeDef.OPERATOR_CITY_NULL, "用户城市不能为空！");
	public static final CodeMsg OPERATOR_COUNTY_NULL = new CodeMsg(ErrorCodeDef.OPERATOR_COUNTY_NULL, "用户区县不能为空！");
	public static final CodeMsg OPERATOR_EXIST= new CodeMsg(ErrorCodeDef.OPERATOR_COUNTY_NULL, "用户已存在！");
	public static final CodeMsg DEL_BEE_BELONG_TAG_ERROR = new CodeMsg(ErrorCodeDef.DEL_BEE_BELONG_TAG_ERROR, "删除经纪人所属标签失败！");
	public static final CodeMsg SELECT_FIRST_ADMIN_IS_NULL = new CodeMsg(ErrorCodeDef.SELECT_FIRST_ADMIN_IS_NULL, "顶级管理员不存在失败！");
	public static final CodeMsg DEL_BEE_TAGID_IS_NULL = new CodeMsg(ErrorCodeDef.DEL_BEE_TAGID_IS_NULL, "经纪人所属标签不能为空！");
	public static final CodeMsg BEE_UPDATE_INSURANCE_PRE_ORDER_PRODUCT_ERROR = new CodeMsg(ErrorCodeDef.BEE_UPDATE_INSURANCE_PRE_ORDER_PRODUCT_ERROR, "更新保单，预下单过程中产品错误！");
	public static final CodeMsg BEE_INSURANCE_COMPANY_DOES_NOT_EXIST = new CodeMsg(ErrorCodeDef.BEE_INSURANCE_COMPANY_DOES_NOT_EXIST, "保险公司ID不存在！");
	public static final CodeMsg BEE_UPDATE_MAIN_CALC_RECORD_ERROR = new CodeMsg(ErrorCodeDef.BEE_UPDATE_MAIN_CALC_RECORD_ERROR, "更新主报价记录错误！");
	public static final CodeMsgFormat BATCH_IMPORT_BEE_ERROR = new CodeMsgFormat(ErrorCodeDef.BATCH_IMPORT_BEE_ERROR, "经纪人手机号为{%s}的记录上传失败！");
    public static final CodeMsg BEE_CANNOT_UPDATE_ORDER_RECIPENT = new CodeMsg(ErrorCodeDef.BEE_CANNOT_UPDATE_ORDER_RECIPENT, "此工作流状态中的收件人信息不可修改!");
    public static final CodeMsg BEE_CAN_ONLY_UPDATE_ORDER_RECIPENT = new CodeMsg(ErrorCodeDef.BEE_CAN_ONLY_UPDATE_ORDER_RECIPENT, "此工作流状态中只可修改收件人、联系电话和联系地址!");
	public static final CodeMsgFormat BEE_INSURANCE_ORDER_DUPLICATE = new CodeMsgFormat(ErrorCodeDef.BEE_INSURANCE_ORDER_DUPLICATE, "该车辆已有相同险种订单提交，操作员【%s】，车辆归属坐席【%s】，请先处理前期订单！");
	public static final CodeMsg BEE_OPERATOR_PRIVILEGE_FOR_CAR_INFO_ERROR = new CodeMsg(ErrorCodeDef.BEE_OPERATOR_PRIVILEGE_FOR_CAR_INFO_ERROR, "操作员无法操作车辆!");
	public static final CodeMsg BEE_CAR_CHANNEL_ERROR = new CodeMsg(ErrorCodeDef.BEE_CAR_CHANNEL_ERROR, "操作员只能操作渠道为经纪人和又一单的车辆!");
	public static final CodeMsg BEE_CAR_NULL = new CodeMsg(ErrorCodeDef.BEE_CAR_NULL, "操作员只能操作渠道为经纪人和又一单的车辆!");
	public static final CodeMsg BEE_MOBILE_NO_CUSTOMER_EXIST = new CodeMsg(ErrorCodeDef.BEE_MOBILE_NO_CUSTOMER_EXIST, "无此手机号对应的经纪人!");
	public static final CodeMsg BEE_CALC_RECORD_COUNTY_UPDATE_ERROR = new CodeMsg(ErrorCodeDef.BEE_CALC_RECORD_COUNTY_UPDATE_ERROR, "经纪人报价单区县修改失败!");
	public static final CodeMsg BEE_ADMIN_CAR_CID_FORCEINSURANCE_COMMIT_AUDIT = new CodeMsg(ErrorCodeDef.BEE_ADMIN_CAR_CID_FORCEINSURANCE_COMMIT_AUDIT, "当前小蜜蜂不可算此车交强险,已有交强险提交核保！");
	public static final CodeMsg BEE_ADMIN_CAR_CID_BUSINESINSURANCE_COMMIT_AUDIT = new CodeMsg(ErrorCodeDef.BEE_ADMIN_CAR_CID_BUSINESINSURANCE_COMMIT_AUDIT, "当前小蜜蜂不可算此车商业险,已有商业险提交核保！");
	public static final CodeMsg BEE_ADMIN_CAR_CID_COMMIT_AUDIT = new CodeMsg(ErrorCodeDef.BEE_ADMIN_CAR_CID_COMMIT_AUDIT, "当前小蜜蜂不可报价此车,已有提交核保！");
	public static final CodeMsg BEE_ADMIN_BEELIST_IS_NULL = new CodeMsg(ErrorCodeDef.BEE_ADMIN_BEELIST_IS_NULL, "查无小蜜蜂数据Push失败！");
	public static final CodeMsg BEE_ADMIN_BEELIST_PUSHAPP_IS_NULL = new CodeMsg(ErrorCodeDef.BEE_ADMIN_BEELIST_PUSHAPP_IS_NULL, "请选择Push的APP类型！");
	public static final CodeMsg BEE_ADMIN_BEELIST_PUSHURL_IS_ERROR = new CodeMsg(ErrorCodeDef.BEE_ADMIN_BEELIST_PUSHURL_IS_ERROR, "填写的页面地址跳转错误！");
	public static final CodeMsg BEE_ADMIN_BEELIST_PUSHAPP_ERROR = new CodeMsg(ErrorCodeDef.BEE_ADMIN_BEELIST_PUSHAPP_ERROR, "Push的APP类型错误！");
	public static final CodeMsg BEE_ADMIN_UPLOAD_IMAGE_ERROR = new CodeMsg(ErrorCodeDef.BEE_ADMIN_UPLOAD_IMAGE_ERROR, "图片上传错误！");
	public static final CodeMsg BEE_ADMIN_OPERATOR_IS_NOT_CITYMANGE_ERROR = new CodeMsg(ErrorCodeDef.BEE_ADMIN_OPERATOR_IS_NOT_CITYMANGE_ERROR, "操作员不是城市经理！");
	public static final CodeMsg BEE_ADMIN_CITYMANGE_EXIST_CITYS_ERROR = new CodeMsg(ErrorCodeDef.BEE_ADMIN_CITYMANGE_EXIST_CITYS_ERROR, "城市经理存在多个城市！");
	public static final CodeMsg BEE_ADMIN_MESSAGEDETAIL_BYID_ERROR = new CodeMsg(ErrorCodeDef.BEE_ADMIN_MESSAGEDETAIL_BYID_ERROR, "未查到信息！");
	public static final CodeMsg BEE_ADMIN_MESSAGEACTIVITYLIST_ERROR = new CodeMsg(ErrorCodeDef.BEE_ADMIN_MESSAGEACTIVITYLIST_ERROR, "活动消息查询失败！");
	public static final CodeMsg BEE_ADMIN_MESSAGENOTICELIST_ERROR = new CodeMsg(ErrorCodeDef.BEE_ADMIN_MESSAGENOTICELIST_ERROR, "公告消息查询失败！");
	public static final CodeMsg BEE_ADMIN_MESSAGENOTIC_EDEL_ERROR = new CodeMsg(ErrorCodeDef.BEE_ADMIN_MESSAGENOTICE_DEL_ERROR, "公告消息删除失败！");
	public static final CodeMsg BEE_ADMIN_MESSAGEACTIVITY_DEL_ERROR = new CodeMsg(ErrorCodeDef.BEE_ADMIN_MESSAGEACTIVITY_DEL_ERROR, "活动消息删除败！");
	public static final CodeMsg BEE_ADMIN_CAR_VIN_ERROR = new CodeMsg(ErrorCodeDef.BEE_ADMIN_CAR_VIN_ERROR, "车架号错误！");

	// srv-pay.........6000-6199
	public static final CodeMsg PAY_ALIPAY_APPLY_ERROR = new CodeMsg(ErrorCodeDef.PAY_ALIPAY_APPLY_ERROR, "支付宝支付申请失败！");
	public static final CodeMsg PAY_ALIPAY_CALLBACK_VERIFY_ERROR = new CodeMsg(ErrorCodeDef.PAY_ALIPAY_CALLBACK_VERIFY_ERROR, "支付宝支付同步回调验证失败！");
	public static final CodeMsg PAY_ALIPAY_NOT_APPLY = new CodeMsg(ErrorCodeDef.PAY_ALIPAY_NOT_APPLY, "支付宝支付无申请记录！");
	public static final CodeMsg PAY_ALIPAY_CALLBACK_ERROR = new CodeMsg(ErrorCodeDef.PAY_ALIPAY_CALLBACK_ERROR, "支付宝支付同步回调失败！");
	public static final CodeMsg PAY_ALIPAY_NOTIFY_VERIFY_ERROR = new CodeMsg(ErrorCodeDef.PAY_ALIPAY_NOTIFY_VERIFY_ERROR, "支付宝支付异步回调验证失败！");
	public static final CodeMsg PAY_ALIPAY_NOTIFY_ERROR = new CodeMsg(ErrorCodeDef.PAY_ALIPAY_NOTIFY_ERROR, "支付宝支付异步回调失败！");
	public static final CodeMsgFormat PAY_ALIPAY_SUPER_NUMBER = new CodeMsgFormat(ErrorCodeDef.PAY_ALIPAY_SUPER_NUMBER, "支付宝手机网站支付申请超过{%s}次！");
	public static final CodeMsg PAY_DETAIL_NOT_EXIST = new CodeMsg(ErrorCodeDef.PAY_DETAIL_NOT_EXIST, "支付记录不存在！");
	public static final CodeMsg PAY_ALIPAY_OUTTRADENO_NOT_EXIST = new CodeMsg(ErrorCodeDef.PAY_ALIPAY_OUTTRADENO_NOT_EXIST, "支付宝支付号不存在！");
	public static final CodeMsg PAY_APPLYID_IS_NULL = new CodeMsg(ErrorCodeDef.PAY_APPLYID_IS_NULL, "支付应用必填！");
	public static final CodeMsg PAY_CITYID_IS_NULL = new CodeMsg(ErrorCodeDef.PAY_CITYID_IS_NULL, "支付城市必填！");
	public static final CodeMsg PAY_CHANNELID_IS_NULL = new CodeMsg(ErrorCodeDef.PAY_CHANNELID_IS_NULL, "支付渠道必填！");
	public static final CodeMsg PAY_CONFIG_NOT_EXIST = new CodeMsg(ErrorCodeDef.PAY_CONFIG_NOT_EXIST, "支付参数不存在！");
	public static final CodeMsg PAY_APPLY_ERROR = new CodeMsg(ErrorCodeDef.PAY_APPLY_ERROR, "支付申请失败！");
	public static final CodeMsg PAY_NOTIFY_ERROR = new CodeMsg(ErrorCodeDef.PAY_NOTIFY_ERROR, "支付回调失败！");
	
	// es-dao..........6100-6299
	public static final CodeMsg ES_EXISTS_INDEX_EXCEPTION = new CodeMsg(ErrorCodeDef.ES_EXISTS_INDEX_EXCEPTION, "判断es中索引库是否存在异常！");
	public static final CodeMsg ES_EXISTS_TYPE_EXCEPTION = new CodeMsg(ErrorCodeDef.ES_EXISTS_TYPE_EXCEPTION, "判断es中索引类型是否存在异常！");
	public static final CodeMsg ES_CREATE_INDEX_EXCEPTION = new CodeMsg(ErrorCodeDef.ES_CREATE_INDEX_EXCEPTION, "创建es索引库异常！");
	public static final CodeMsg ES_CREATE_TYPE_EXCEPTION = new CodeMsg(ErrorCodeDef.ES_CREATE_TYPE_EXCEPTION, "创建es索引类型异常！");
	public static final CodeMsg ES_CREATE_MAPPING_EXCEPTION= new CodeMsg(ErrorCodeDef.ES_CREATE_MAPPING_EXCEPTION, "创建es映射异常！");
	public static final CodeMsg ES_CREATE_INSRET_COMMAND_EXCEPTION= new CodeMsg(ErrorCodeDef.ES_CREATE_INSRET_COMMAND_EXCEPTION, "创建es待插入索引结构命令异常！");
	public static final CodeMsg ES_SAVE_OR_UPDATE_EXCEPTION= new CodeMsg(ErrorCodeDef.ES_SAVE_OR_UPDATE_EXCEPTION, "es保存或修改文档异常！");
	public static final CodeMsg ES_DELETE_INDEX_RECORD_EXCEPTION= new CodeMsg(ErrorCodeDef.ES_DELETE_INDEX_RECORD_EXCEPTION, "es删除索引文档异常！");
	public static final CodeMsg ES_DELETE_INDEX_EXCEPTION= new CodeMsg(ErrorCodeDef.ES_DELETE_INDEX_EXCEPTION, "es删除索引异常！");
	public static final CodeMsg ES_SEARCH_BY_ID_EXCEPTION=new CodeMsg(ErrorCodeDef.ES_SEARCH_BY_ID_EXCEPTION, "es通过id查询文档异常！");
	public static final CodeMsg ES_SEARCH_BULK_EXCEPTION=new CodeMsg(ErrorCodeDef.ES_SEARCH_BULK_EXCEPTION, "es批量查询文档异常！");
	
	//api-calc-admin  6200-6399
	public static final CodeMsg API_CALC_ADMIN_INPUT_PARAM_ERR = new CodeMsg(ErrorCodeDef.API_CALC_ADMIN_INPUT_PARAM_ERR, "输入参数有误！");
	public static final CodeMsg API_CALC_ADMIN_CLAC_NODE_STATUS_BAD = new CodeMsg(ErrorCodeDef.API_CALC_ADMIN_CLAC_NODE_STATUS_BAD, "算价节点状态异常！");

	// srv-comet.........7000-8999
	public static final CodeMsg COMET_GET_CLIENT_ID_ERROR = new CodeMsg(ErrorCodeDef.COMET_GET_CLIENT_ID_ERROR, "获取客户ID失败！");
	public static final CodeMsg COMET_ADD_APP_INFO_ERROR = new CodeMsg(ErrorCodeDef.COMET_ADD_APP_INFO_ERROR, "新增APP信息失败！");
	public static final CodeMsg COMET_ADD_RECORD_INFO_ERROR = new CodeMsg(ErrorCodeDef.COMET_ADD_RECORD_INFO_ERROR, "新增消息记录失败！");
	public static final CodeMsg COMET_SELECT_APP_INFO_ERROR = new CodeMsg(ErrorCodeDef.COMET_SELECT_APP_INFO_ERROR, "查询APP信息失败！");
	public static final CodeMsg COMET_SELECT_APP_INFO_NULL = new CodeMsg(ErrorCodeDef.COMET_SELECT_APP_INFO_NULL, "APP信息不存在！");
	public static final CodeMsg COMET_SELECT_RECORD_INFO_ERROR = new CodeMsg(ErrorCodeDef.COMET_SELECT_RECORD_INFO_ERROR, "查询消息记录失败！");
	public static final CodeMsg COMET_UPDATE_CLIENT_ERROR = new CodeMsg(ErrorCodeDef.COMET_UPDATE_CLIENT_ERROR, "跟新客户信息失败！");
	public static final CodeMsg COMET_TEMPLATE_ERROR = new CodeMsg(ErrorCodeDef.COMET_TEMPLATE_ERROR, "消息模版错误！");
	public static final CodeMsg COMET_SINGLEPUSH_ERROR = new CodeMsg(ErrorCodeDef.COMET_SINGLEPUSH_ERROR, "消息PUSH失败！");
	public static final CodeMsg COMET_PUSH_TAG_IS_NULL = new CodeMsg(ErrorCodeDef.COMET_PUSH_TAG_IS_NULL, "PUSH标签为空！");
	
	// srv-activiti-workflow 6300-6499
	public static final CodeMsg ACTIVITI_WORKFLOW_ADD_BUSINESS_DATA_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_WORKFLOW_ADD_BUSINESS_DATA_EXCEPTION, "添加业务数据异常!");
	public static final CodeMsg ACTIVITI_WORKFLOW_UPDATE_BUSINESS_DATA_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_WORKFLOW_UPDATE_BUSINESS_DATA_EXCEPTION, "更新业务数据异常!");
	public static final CodeMsg ACTIVITI_WORKFLOW_QUERY_BUSINESS_DATA_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_WORKFLOW_UPDATE_BUSINESS_DATA_EXCEPTION, "查询数据异常!");
	public static final CodeMsg ACTIVITI_WORKFLOW_QUERY_VERSION_CONFIG_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_WORKFLOW_UPDATE_BUSINESS_DATA_EXCEPTION, "查询版本页面配置信息异常!");
	public static final CodeMsg ACTIVITI_WORKFLOW_QUERY_WORKFLOW_CONFIG_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_WORKFLOW_UPDATE_BUSINESS_DATA_EXCEPTION, "查询工作流配置信息异常!");
	
	
	//activiti-worker
	public static final CodeMsg ACTIVITI_WORKER_DO_WORK_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_WORKER_DO_WORK_EXCEPTION, "工作流woker处理失败!");
	public static final CodeMsg ACTIVITI_WORKER_NO_STATUS_EXCEPTION=new CodeMsg(ErrorCodeDef.ACTIVITI_WORKER_NO_STATUS_EXCEPTION, "工作流无此状态配置!");
	
	//srv-message.........9000-9999
	public static final CodeMsg MESSAGE_UPDATE_RECORD_ERROR = new CodeMsg(ErrorCodeDef.MESSAGE_UPDATE_RECORD_ERROR, "更新消息记录失败!");
	public static final CodeMsg MESSAGE_ADD_RECORD_ERROR = new CodeMsg(ErrorCodeDef.MESSAGE_ADD_RECORD_ERROR, "新增消息记录失败!");
	public static final CodeMsg MESSAGE_SELECT_RECORD_ERROR = new CodeMsg(ErrorCodeDef.MESSAGE_SELECT_RECORD_ERROR, "查询消息记录失败!");
	public static final CodeMsg MESSAGE_SEND_PARAM_APPID_ERROR = new CodeMsg(ErrorCodeDef.MESSAGE_SEND_PARAM_APPID_ERROR, "appId不能为空!");
	public static final CodeMsg MESSAGE_ADD_NOTICE_ERROR = new CodeMsg(ErrorCodeDef.MESSAGE_ADD_NOTICE_ERROR, "新增公告消息失败!");
	public static final CodeMsg MESSAGE_ADD_ACTIVITY_ERROR = new CodeMsg(ErrorCodeDef.MESSAGE_ADD_ACTIVITY_ERROR, "新增活动消息失败!");
	public static final CodeMsg MESSAGE_SELECT_ACTIVITY_ERROR = new CodeMsg(ErrorCodeDef.MESSAGE_SELECT_ACTIVITY_ERROR, "查询活动消息失败!");
	public static final CodeMsg MESSAGE_SELECT_NOTICE_ERROR = new CodeMsg(ErrorCodeDef.MESSAGE_SELECT_NOTICE_ERROR, "查询公告消息失败!");
	public static final CodeMsg MESSAGE_SELECT_PARAM_ERROR = new CodeMsg(ErrorCodeDef.MESSAGE_SELECT_PARAM_ERROR, "无效的查询条件!");
	public static final CodeMsg MESSAGE_UPDATE_NOTICE_ID_NULL = new CodeMsg(ErrorCodeDef.MESSAGE_UPDATE_NOTICE_ID_NULL, "公告消息或者ID不能为空!");
	public static final CodeMsg MESSAGE_UPDATE_NOTICE_ERROR = new CodeMsg(ErrorCodeDef.MESSAGE_UPDATE_NOTICE_ERROR, "公告消息更新失败!");
	public static final CodeMsg MESSAGE_UPDATE_ACTIVITY_ID_NULL = new CodeMsg(ErrorCodeDef.MESSAGE_UPDATE_ACTIVITY_ID_NULL, "活动消息或者ID不能为空!");
	public static final CodeMsg MESSAGE_UPDATE_ACTIVITY_ERROR = new CodeMsg(ErrorCodeDef.MESSAGE_UPDATE_ACTIVITY_ERROR, "活动消息更新失败!");
    
    //SRV-RESOURCE ........... 6500-6599
    public static final CodeMsg RESOURCE_FETCH_RESOURCE_ERROR = new CodeMsg(ErrorCodeDef.RESOURCE_FETCH_RESOURCE_ERROR, "获取资源配置出错!");

	// srv-dictionary 5000-5099
	public static final CodeMsg DICTIONARY_DUPLICATE_OFFICE_CITY = new CodeMsg(ErrorCodeDef.DICTIONARY_DUPLICATE_OFFICE_CITY, "城市已有存在!");

}
