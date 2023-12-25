package lesson37.config;

import lesson37.service.UserService;
import lesson37.service.impl.DatabaseUserServiceImpl;
import lesson37.service.impl.InMemoryUserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
@Bean
    public UserService inMemoryUserServiceImpl(){
    return new InMemoryUserServiceImpl();
}
@Bean
    public  UserService databaseUserServiceImpl(){
    return new DatabaseUserServiceImpl();
}
}
