package com.company;

public class Main {

    public static void main(String[] args) {
        Sofa sofa1 = new Sofa();
        Sofa sofa2 = new Sofa("Name", 5, 2, "beige");
        Sofa sofa3 = new Sofa("Name1", 10, 5 , "matte");


        System.out.println(sofa1.toString());
        System.out.println(sofa2.toString());
        System.out.println(sofa3.toString());
        sofa1.printFieldPillows();
        sofa1.printStaticPillows();

    }
}

