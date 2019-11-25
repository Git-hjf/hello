package spring.boot.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.test.dao.HelloDao;
import spring.boot.test.model.Account;
import spring.boot.test.model.Hello;
import spring.boot.test.service.IAccountService;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    IAccountService accountService;
    @Autowired
    HelloDao helloDao;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Account> getAccounts(){
        return accountService.findAccountList();
    }

    @RequestMapping(value = "/listByJpa", method = RequestMethod.GET)
    public List<Hello> getHellos() {
        return helloDao.findAll();
    }
}
