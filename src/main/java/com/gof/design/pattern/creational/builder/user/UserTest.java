package com.gof.design.pattern.creational.builder.user;

import org.junit.Test;

public class UserTest {

 @Test

    public void buildUser(){

     User user1 =  new User.UserBuilder("Rakesh", "Sanghvi")
                .setAge(40)
                .setPhone("5456465456")
                .setAddress("4211 Bryce Canyon")
                .build();
     System.out.println("User1 " + user1);


     User user2 =  new User.UserBuilder("Jiya", "Sanghvi")
             .setAge(2)
             .setPhone("5121256")
              .build();
     System.out.println("User2 " + user2);

 }
}

