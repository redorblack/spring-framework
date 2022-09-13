package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Red
 * @Descpription:
 * @Date: 14:56 2021/6/19
 */
public class SpringResourceTest {


    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            System.out.println(beanName);

        }
    }
}
