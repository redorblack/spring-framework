package org.springframework.beans.factory.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Red
 * @Descpription:
 * @Date: 14:53 2021/6/15
 */
@Configuration
public class Spring {


    @Bean
    public Red red() {
        System.out.println("初始化了 ");
        return new Red();
    }


    static class Red {

        private String name;
        private Integer age;

        public Red() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }


}
