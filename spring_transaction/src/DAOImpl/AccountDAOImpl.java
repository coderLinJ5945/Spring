package DAOImpl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;//����

import com.lin.spring.DAO.AccountDAO;

public class AccountDAOImpl extends JdbcDaoSupport implements AccountDAO {
	/**
	 * 
	 * @param out :ת���˻�
	 * @param account : ת����Ǯ��
	 */
	public void outMoney(String out,Double account){
		
	}
	/**
	 * 
	 * @param in	:ת����˺�
	 * @param account:ת���Ǯ��
	 */
	
	public void inMoney(String in,Double account){
		
	}
	
}