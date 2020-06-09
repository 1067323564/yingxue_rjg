package com.baizhi.test;

import com.baizhi.dao.LianXiDao;
import com.baizhi.dao.UserMapper;
import com.baizhi.entity.LianXi;
import com.baizhi.entity.User;
import com.baizhi.entity.UserExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LianXitest {
    @Autowired
    private LianXiDao lianXiDao;

    @Test
    public void test1() {
        LianXi admin = lianXiDao.login("admin");
        System.out.println(admin);
        System.out.println("我来了");
        soutem.out.println("aaaaa");
    }
}
