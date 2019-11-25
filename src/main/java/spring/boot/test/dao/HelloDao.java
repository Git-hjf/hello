package spring.boot.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.boot.test.model.Hello;

public interface  HelloDao extends JpaRepository<Hello,Integer> {
}
