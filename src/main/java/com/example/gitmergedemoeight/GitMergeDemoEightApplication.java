package com.example.gitmergedemoeight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitMergeDemoEightApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitMergeDemoEightApplication.class, args);
        System.out.println("111");
    }
    public void hello(){
        System.out.println("111");
        System.out.println("222");
    }
    public void helloOne(){
        System.out.println("555");
        System.out.println("111");
        System.out.println("333");
    }

}
