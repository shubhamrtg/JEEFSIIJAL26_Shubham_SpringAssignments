package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.AccountDao;
import com.cg.entity.Account;
import com.cg.exceptions.AccountException;

@Service("accountser")
@Transactional
public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountDao dao;
	
	@Override
	public boolean addAccount(List<Account> list) {
		list.forEach(acc->dao.addAccount(acc));
		return true;
	}

	@Override
	public boolean addAccount(Account account) {
		return dao.addAccount(account);
	}

	@Override
	public boolean transferFund(int from, int to, double amt) throws AccountException {
		Account fromAccount=dao.getAccount(from);
		Account toAccount=dao.getAccount(to);
		if(fromAccount.getBalance()<amt)
			throw new AccountException("Insufficient balance");
		fromAccount.setBalance(fromAccount.getBalance()-amt);
		toAccount.setBalance(toAccount.getBalance()+amt);
		dao.editAccount(fromAccount);
		dao.editAccount(toAccount);
		return true;
	}

	@Override
	@Transactional(readOnly=true)
	public Account viewAccount(int aid) throws AccountException {
		return dao.getAccount(aid);
	}

}
