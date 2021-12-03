package com.yz.base.util;

public interface StatusCode {
	
	//成功
	public static final int OK = 0; 
	
	//失败
	public static final int ERROR = 20001;
	
	//会话超时
	public static final int SESSION_TIMEOUT = 20002;
	
	//用户名或密码错误
	public static final int LOGINERROR = 20003; 
	
	//权限不足
	public static final int ACCESSERROR = 20004; 
	
	//远程调用失败
	public static final int REMOTEERROR = 20005; 
	
	//重复操作
	public static final int REPERROR = 20006; 
	
}
