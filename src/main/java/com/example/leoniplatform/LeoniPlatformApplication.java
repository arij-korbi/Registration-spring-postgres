package com.example.leoniplatform;

import com.example.leoniplatform.model.File;
import com.example.leoniplatform.model.Order;
import com.example.leoniplatform.repository.FileRepository;
import com.example.leoniplatform.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeoniPlatformApplication implements CommandLineRunner {
    @Autowired
    private FileRepository filesRepository;
    @Autowired
    private OrderRepository orderRepository;
    public static void main(String[] args) {
        SpringApplication.run(LeoniPlatformApplication.class, args);
    }
@Override
    public void run(String... args) throws  Exception{
    Order order =new Order("arij","arijplant");
    System.out.println("ariiiij");
    File files=new File("arij","lalalal");
    File files1=new File("lalala","arij");
    System.out.println("ariiiij222222222");
    System.out.println("files saved");
order.getFiles().add(files);
    order.getFiles().add(files1);

this.orderRepository.save(order);
}

}
