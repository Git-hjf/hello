package spring.boot.test.dao;

import spring.boot.test.model.Account;

import java.util.List;

public interface  IAccountDAO {

    List<Account> findAccountList();

}
