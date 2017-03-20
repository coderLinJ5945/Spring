package com.lin.spring.Service;

/**
 * 转账业务接口
 */
public interface AccountService {
	/**
	 * 
	 * @param in	转入账号
	 * @param out	转出账号
	 * @param account	转的钱数
	 */
	public void transfer(String in,String out, Double account);
}
