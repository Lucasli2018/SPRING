package cn.itcast.spring3.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringTest1 {
	@Autowired
	@Qualifier("accountService")
	private AccountService accountService;
	
	@Test
	public void demo1(){
		// 完成转账
		accountService.transfer("aaa", "bbb", 100d);
	}
}
