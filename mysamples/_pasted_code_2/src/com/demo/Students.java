package com.demo;

public class Students {
    String name;

    public Students(String name) {
        this.name = name;
    }

    public void printInstanceVariable() {
        System.out.println("Instance Variable: " + name);
    }

    public static void main(String[] args) {
        Students s1 = new Students("Reena");
        Students s2 = new Students("Malar");
        Students s3 = new Students("Pratheeksha");

        Thread t1 = new Thread(s1::printInstanceVariable);
        Thread t2 = new Thread(s2::printInstanceVariable);
        Thread t3 = new Thread(s3::printInstanceVariable);

        t1.start();
        t2.start();
        t3.start();
    }
}
