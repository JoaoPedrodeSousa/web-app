package com.example.WepApplication.config;

import com.example.WepApplication.model.entities.Category;
import com.example.WepApplication.model.entities.Order;
import com.example.WepApplication.model.entities.User;
import com.example.WepApplication.model.enums.OrderStatus;
import com.example.WepApplication.model.repositories.CategoryRepository;
import com.example.WepApplication.model.repositories.OrderRepository;
import com.example.WepApplication.model.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

@Autowired
private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {

        Category c1 = new Category(null,"Electronics");
        Category c2 = new Category(null,"Computers");
        Category c3 = new Category(null,"Books");

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1, OrderStatus.PAID);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2, OrderStatus.WAITING_PAYMENT);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1, OrderStatus.CANCELED);

        userRepository.save(u1);
        userRepository.save(u2);

        orderRepository.save(o1);
        orderRepository.save(o2);
        orderRepository.save(o3);


        categoryRepository.save(c1);
        categoryRepository.save(c2);
        categoryRepository.save(c3);
    }
}
