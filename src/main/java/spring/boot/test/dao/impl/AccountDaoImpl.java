package spring.boot.test.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import spring.boot.test.dao.IAccountDAO;
import spring.boot.test.model.Account;

import java.util.List;

@Repository
public class AccountDaoImpl implements IAccountDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Account> findAccountList() {
        List<Account> list = jdbcTemplate.query("select * from account", new Object[]{}, new BeanPropertyRowMapper(Account.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
    }

}
