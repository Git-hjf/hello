package spring.boot.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.test.dao.IAccountDAO;
import spring.boot.test.model.Account;
import spring.boot.test.service.IAccountService;

import java.util.List;

@Service
public class AccountServiceImpl implements IAccountService{
    @Autowired
    IAccountDAO accountDAO;

    @Override
    public List<Account> findAccountList() {
        return accountDAO.findAccountList();
    }

}
