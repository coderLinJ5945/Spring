package com.lin.springServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.lin.spring.DAO.AccountDAO;
import com.lin.spring.Service.AccountService;

public class AccountServiceImpl implements AccountService {
	//SET注入转账DAO
	private AccountDAO accountDao;
	public void setAccountDao(AccountDAO accountDao) {
		this.accountDao = accountDao;
	}

	/**
	 * 
	 * @param in	转入账号
	 * @param out	转出账号
	 * @param account	转的钱数
	 */
	public void transfer(String in,String out, Double account){
		accountDao.outMoney(out, account);
		accountDao.inMoney(in, account);
	}
}
