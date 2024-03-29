package DAOImpl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;//可以

import com.lin.spring.DAO.AccountDAO;

public class AccountDAOImpl extends JdbcDaoSupport implements AccountDAO {
	
	/**
	 * 
	 * @param out :转出账户
	 * @param account : 转出的钱数
	 */
	public void outMoney(String out,Double account){
		StringBuffer sql = new StringBuffer();
		sql.append("update account set money=money - ? where id=?" );
		this.getJdbcTemplate().update(sql.toString(), account, out);
		
	}
	/**
	 * 
	 * @param in	:转入的账号
	 * @param account:转入的钱数
	 */
	
	public void inMoney(String in,Double account){
		StringBuffer sql = new StringBuffer();
		sql.append("update account set money=money + ? where id=?" );
		this.getJdbcTemplate().update(sql.toString(), account, in);
	}
	
}
