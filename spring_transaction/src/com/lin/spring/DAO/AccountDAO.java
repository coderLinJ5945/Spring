package com.lin.spring.DAO;

/**
 * ת�˵�DAO��ӿ�
 * @author HSAEE
 *
 */
public interface AccountDAO {
	/**
	 * 
	 * @param out :ת���˻�
	 * @param account : ת����Ǯ��
	 */
	public void outMoney(String out,Double account);
	
	/**
	 * 
	 * @param in	:ת����˺�
	 * @param account:ת���Ǯ��
	 */
	
	public void inMoney(String in,Double account);
}
