package com.chenxuan.service.impl;

import com.chenxuan.proj.Admin;  
import com.chenxuan.service.IUserService;  
  
import javax.annotation.Resource;  
  
import org.springframework.stereotype.Service;  
  
import com.chenxuan.dao.AdminMapper;  
  
@Service("userService")  
public class UserServiceImpl implements IUserService {  
      
    @Resource  
    private AdminMapper userMapper;  
      
    public Admin getUserById(int userId) {  
        return this.userMapper.selectByPrimaryKey(userId);  
    }  
}  