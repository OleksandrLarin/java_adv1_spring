package com.alevel;

import com.alevel.annotated.ComponentExample;
import com.alevel.beans.BeanContainer;
import com.alevel.service.GroupService;
import com.alevel.service.StudentService;
import com.alevel.user.User;
import com.alevel.user.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/app.xml");
//        BeanExample beanExample = context.getBean("beanExample", BeanExample.class);
//        beanExample.info();
//
//        Calendar calendar = context.getBean(Calendar.class);
//        System.out.println(calendar);
//
//        User user = context.getBean("user", User.class);
//
//        System.out.println(user);
//
//        UserService userService = context.getBean("userService", UserService.class);
//        User userById = userService.getUserById(1);
//        System.out.println(userById);
//        System.out.println(userById.getName() + " : " + userService.getEmailByName(userById.getName()));
//        User user = userService.getUserById(2);
//        System.out.println(user);
//        System.out.println(user.getName() + " : " + userService.getEmailByName(user.getName()));
//
//        BeanContainer beanContainer = context.getBean("beanContainer", BeanContainer.class);
//        beanContainer.info();
//
//        context.getBean("beanExampleTwo");
//
//        ComponentExample bean = context.getBean(ComponentExample.class);
//
//        context.close();
        GroupService groupService = context.getBean(GroupService.class);
        groupService.createNewGroup();

        StudentService studentService = context.getBean(StudentService.class);
        studentService.createNewUser();
    }
}
