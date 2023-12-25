package lesson37;

import lesson37.config.AppConfig;
import lesson37.service.UserService;
import lesson37.service.impl.DatabaseUserServiceImpl;
import lesson37.service.impl.InMemoryUserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplicationRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService inMemoryUserService = applicationContext.getBean(InMemoryUserServiceImpl.class);
        UserService databaseUserService = applicationContext.getBean(DatabaseUserServiceImpl.class);

        inMemoryUserService.addUser("John");
        inMemoryUserService.addUser("Alice");
        System.out.println("In-Memory Users: " + inMemoryUserService.getUsers());

        databaseUserService.addUser("Bob");
        databaseUserService.addUser("Eve");
        System.out.println("Database Users: " + databaseUserService.getUsers());
    }
}