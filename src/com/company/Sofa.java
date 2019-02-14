package com.company;

public class Sofa {
    int length;
    int width;
    String color;
    String firm;
    private int height;
    private String material;
    private static int pillows = 3;
    protected int price;
    protected String country;


    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public Sofa() {

    }


    public Sofa(String firm, int length, int width,
                String color) {
        this.firm = firm;
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public Sofa(String firm, int length, int width,
                String color, int height,
                String material, int pillows,
                int price, String country) {
        this(firm, length, width, color);
        this.height = height;
        this.material = material;
        this.pillows = pillows;
        this.price = price;
        this.country = country;

    }

    public String toString () {
        return  "Sofa: " + "\n" +
                "Firm name: " + firm + "\n" +
                " Length: " + length + "\n" +
                " Width: " + width + "\n" +
                " Color: " + color + "\n" +
                " Height: " + height + "\n" +
                " Material: " + material + "\n" +
                " Number of pillows: " + pillows + "\n" +
                " Price: " + price + "\n" +
                " Country: " + country + "\n" +
           '}';
    }

    public void printStaticPillows(){
        System.out.println(" Number of pillows: " + pillows);

    }
    
    public void printPillows() {
        System.out.println(" Number of pillows: " + pillows);
    }

    public void resetValues(String firm, int length, int width,
                            String color, int height, String material,
                            int pillows, int price, String country) {
        this.firm = firm;
        this.length = length;
        this.width = width;
        this.color = color;
        this.height = height;
        this.material = material;
        this.pillows = pillows;
        this.price = price;
        this.country = country;
    }

}


