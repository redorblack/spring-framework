package test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Red
 * @Descpription:
 * @Date: 14:59 2021/6/19
 */
@Configuration
public class MyConfig {



    @Bean
    public Red red(){
        return new Red();
    }

}
