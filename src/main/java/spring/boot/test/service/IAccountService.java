package spring.boot.test.service;

import spring.boot.test.model.Account;

import java.util.List;

public interface  IAccountService {

    List<Account> findAccountList();
}
