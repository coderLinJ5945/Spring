package test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lin.spring.DAO.AccountDAO;

/**
 * ת�˲�����
 * @author HSAEE
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test {
	 @Autowired  
	 private AccountDAO accountDao;
	 @org.junit.Test
	 public void test() {
		 accountDao.inMoney("aaa", 100d);
	 }
	
	/**8//����ҵ����
	@Resource(name="accountDao")
	private AccountService accountService;
	//@Resource(name="accountDao")
	//private AccountDAO accountDao;
	@org.junit.Test
	public void test() {
		System.out.println("123");
		//accountDao.inMoney("aaa", 200d);
		accountService.transfer("aaa","bbb", 300d);
	}*/

}
