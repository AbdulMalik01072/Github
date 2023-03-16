package com.abdul.HelloNameProject.HelloNameProject;

public class MainClass {
    public static void main(String [] args ){


        Bird bird1= new Bird();
        bird1.name  = "sparrow";
        bird1.colour= "Brown";
        bird1.canfly= true;

        Bird bird2 = new Bird();
        bird2.name= "kingfisher";
        bird2.colour="blue";
        bird2.canfly=true;

        Department department1= new Department();
        department1.name="physics";
        department1.address="HYD";

        Department department2= new Department();
        department2.name="social";
        department2.address="mumbai";


    System.out.println(bird1);
        System.out.println(bird2);
    System.out.println(department1);
    System.out.println(department2);
    }
}



