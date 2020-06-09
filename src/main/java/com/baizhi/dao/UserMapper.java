package com.baizhi.dao;

import com.baizhi.entity.User;
import com.baizhi.entity.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
//通用mapper作用通过实体类生成sql语句
public interface UserMapper extends Mapper<User> {

}