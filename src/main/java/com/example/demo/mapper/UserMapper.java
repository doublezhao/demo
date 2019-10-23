package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author kzhao
 * @Date 10/21/2019 3:09 PM
 **/
@Repository
public interface UserMapper {
     User Sel(int id);
}
