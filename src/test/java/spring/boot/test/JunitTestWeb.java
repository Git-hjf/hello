package spring.boot.test;


import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class JunitTestWeb {

    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate template;

    @Before
    public void setUp() throws Exception {
        this.base = new URL("http://localhost:" + port + "/");
    }

    @Test
    public void getHello(){
        ResponseEntity<String> response = template.getForEntity(base.toString(),
                String.class);
        //返回来的不是"Greetings from Spring Boot!",所以报错是正常的
        MatcherAssert.assertThat(response.getBody(), equalTo("Greetings from Spring Boot!"));
    }

    /**
     * 获取雅阁车系的基本信息
     */
    @Test
    public void getSerialGroup(){
        String serialGroupUrl = "http://price.pcauto.com.cn/price/api/v1/serialgroup/atom/90/basic_info";
        ResponseEntity<String> response = template.getForEntity(serialGroupUrl,
                String.class);
        System.out.println(response.getBody());
    }


    @Test
    public void sayHi(){
        System.out.println("hi!");
    }

}