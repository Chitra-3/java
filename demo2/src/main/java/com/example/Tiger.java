package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.ComponentScan;
// import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Configuration
// @ComponentScan()
// class Config{
//     @Bean
//     public String name(){
//         System.out.println("name() from config");
//         return "Jack";
//     }
// }
@Component("myTiger")
@Scope("prototype")
public class Tiger {
  String name;

    @Autowired
    Tiger(@Value("Jacky")
    String name){
        this.name=name;
        System.out.println(name+ " is a Tiger ");
    }
}
@Component("myBengal")
@Scope("prototype")
class BengalTiger extends Tiger{

    @Autowired
    BengalTiger(@Value("Jhony")
    String name){
        super(name);
        System.out.println(name+ " is also a Bengal Tiger  ");
    }
}
@Component
@Scope("prototype")
class Bear{
    String name;
    String color;
    String place;
    
    @Autowired
   public Bear(@Value("Black") String color,@Value("Forest")String place) {
    
    this.color=color;
    this.place=place;
    System.out.println("A "+color+ " Bear lives in "+place);
    }

void fetchHoney(String name){
        System.out.println("It's name is "+name);
    }
}