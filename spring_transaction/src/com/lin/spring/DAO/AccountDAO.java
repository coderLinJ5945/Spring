package com.lin.spring.DAO;

/**
 * 转账的DAO层接口
 * @author HSAEE
 *
 */
public interface AccountDAO {
	/**
	 * 
	 * @param out :转出账户
	 * @param account : 转出的钱数
	 */
	public void outMoney(String out,Double account);
	
	/**
	 * 
	 * @param in	:转入的账号
	 * @param account:转入的钱数
	 */
	
	public void inMoney(String in,Double account);
}
