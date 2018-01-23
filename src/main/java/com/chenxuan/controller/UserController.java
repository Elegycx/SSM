package com.chenxuan.controller;

import javax.annotation.Resource;  
import javax.servlet.http.HttpServletRequest;  
  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
  
import com.chenxuan.proj.Admin;  
import com.chenxuan.service.IUserService;  
  
@Controller  
@RequestMapping("/user")  
  
public class UserController {  
    @Resource  
    private IUserService userService;  
      
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model)  
    {  
        int userId = Integer.parseInt(request.getParameter("id"));  
        Admin user = this.userService.getUserById(userId);  
        model.addAttribute("user",user);  
        return "showUser";  
    }  
}  