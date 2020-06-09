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
    public void test1(){
        LianXi admin = lianXiDao.login("admin");
        System.out.println(admin);
    }
    @Resource
    UserMapper userMapper;
    //加入通用mapper的测试方法
    @Test
    public void test2(){
        List<User> users = userMapper.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
    //添加数据的方法
  /*  @Test
    //    public void test3(){
    //        User user=new User();
    //        user.setName("你好");
    //        user.setPassword("123");
    //        user.setRole("用户");
    //        userMapper.insert(user);
    //    }
    //    //根据id查询返回一个对象
    //    @Test
    //    public void test4(){
    //        User user1 = userMapper.selectByPrimaryKey(6);
    //        System.out.println(user1);
    //    }
    //    @Test
    //    public void test5(){
    //        //条件对象当没有指定id是为查询所有
    //        UserExample example=new UserExample();
    //        //example.createCriteria().andIdEqualTo(1);
    //        //根据条件进行查询
    //        List<User> users = userMapper.selectByExample(example);
    //        for (User user : users) {
    //            System.out.println(user);
    //        }
    //    }
    //    @Test
    //    public void test6(){
    //        User user=new User();
    //        user.setName("你好啊");
    //        user.setPassword("123");
    //        user.setRole("用户");
    //        //条件对象当没有指定id是为查询所有
    //        UserExample example=new UserExample();
    //        example.createCriteria().andIdEqualTo(6);
    //        //根据条件进行修改当有的字段为空时会改为默认null
    //       userMapper.updateByExample(user,example);
    //       //修改可选性当有的字段没指定值时不会改为null
    //       userMapper.updateByExampleSelective(user,example);
    //    }
    //    //注：当多表时至于要在dao中写方法   然后再mapper中进行sql语句书写即可*/
}
