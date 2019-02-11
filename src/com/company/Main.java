package com.company;

public class Main {

    public static void main(String[] args) {
        Sofa sofa1 = new Sofa();
        Sofa sofa2 = new Sofa("Name", 5, 2, "beige");
        Sofa sofa3 = new Sofa("Name1", 10, 5 , "matte", 2, "cotton", 3, 200, "US");


        System.out.println(sofa1.toString());
        System.out.println(sofa2.toString());

        sofa2.resetValues("Name2", 4, 3, "white", 10, "polyester", 2, 300, "Ukraine");

        System.out.println(sofa2.toString());
        System.out.println(sofa3.toString());

        sofa1.printPillows();
        sofa2.printPillows();
        sofa3.printPillows();

        sofa1.printStaticPillows();
        sofa2.printStaticPillows();
        sofa3.printStaticPillows();


    }
}

