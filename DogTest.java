package test;

import java.awt.*;

/**
 * Title      : DogTest.java
 * Description: This class contains the test class for Dog.
 * Copyright  : Copyright (c) 2006 - 2018
 * @author  Laurissa Tokarchuk
 * @version 1.0
 * @author  Paula Fonseca
 * @version 1.2
 */
public class DogTest {
    public static void main(String[] args) {
    Dog dog1 = new Dog("Buddy","short",true,Color.BLACK,500);
    Dog dog2 = new Dog("Beethoven","long",false,Color.GRAY,400);
	dog1.sleep(5);
        int m = dog1.run(10, true);

    System.out.println("I am "+dog1.getname());
    System.out.println("My speed is "+dog1.getspeed()+"m/s");
	System.out.println("I have run " + m + " metres.");	
	System.out.println("I am dog1 and my name is "+dog1.getname()+" My colour is "+dog1.getcolour()+dog1.run(10,true));
	System.out.println("I am dog1 and my name is "+dog2.getname()+" My colour is "+dog2.getcolour()+dog2.run(5,false));
	
    }
}