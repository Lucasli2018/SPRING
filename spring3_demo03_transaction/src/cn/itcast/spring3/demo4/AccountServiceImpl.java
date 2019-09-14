package cn.itcast.spring3.demo4;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=false)
public class AccountServiceImpl implements AccountService {
	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	/**
	 * 转账的方法
	 * 
	 * @param from
	 *            :从哪转出
	 * @param to
	 *            :转入的人
	 * @param money
	 *            :转账金额
	 */
	public void transfer(final String from, final String to, final Double money) {
		accountDao.out(from, money);
		//int d = 1 / 0;
		accountDao.in(to, money);
	}
}
