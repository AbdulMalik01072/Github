package com.abdul.HelloNameProject.HelloNameProject;

public class Bird {

    public String name;
    public String colour;
    public boolean canfly;


    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", canfly=" + canfly +
                '}';
    }
}
