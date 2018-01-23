package guideplatform;

import javax.annotation.Resource;  

import org.apache.log4j.Logger;  
import org.junit.Test;  
import org.junit.runner.RunWith;  
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;  
  
import com.alibaba.fastjson.JSON;  
import com.chenxuan.proj.Admin;  
import com.chenxuan.service.IUserService;  
  
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
  
public class TestMybatis {  
    private static Logger logger = Logger.getLogger(TestMybatis.class);  
      
      
    @Resource  
    private IUserService userService = null;  
      
    @Test  
    public void test1()  
    {  
        Admin user = userService.getUserById(1);  
        logger.info(JSON.toJSONString(user));  
    }  
}  