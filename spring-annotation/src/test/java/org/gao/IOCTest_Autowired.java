package org.gao;

import com.gao.annotation.bean.Boss;
import com.gao.annotation.bean.Car;
import com.gao.annotation.config.MainConfigOfAutowired;
import com.gao.annotation.dao.BookDAO;
import com.gao.annotation.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Autowired {

    @Test
    public void test01(){

        //1、创建IOC容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

        BookService bookService = applicationContext.getBean(BookService.class);
        System.out.println(bookService);

//        BookDAO bookDAO = applicationContext.getBean(BookDAO.class);
//        System.out.println(bookDAO);
        Boss boss = applicationContext.getBean(Boss.class);
        System.out.println(boss);
        Car car = applicationContext.getBean(Car.class);
        System.out.println(car);
        System.out.println("测试用的ioc容器:" + applicationContext);

        applicationContext.close();


    }

}
