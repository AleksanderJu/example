package com.company;

public class Doll {
    public static String sayPapa;
    public static Doll Masha;
    public static Doll newDoll;
    String name;
    String color;
    int size;
    public Doll(){
        this.name="Katja";
        this.color="white";
        this.size=20;
        System.out.println(name+","+color+","+size);
    }
        public  Doll (String name, String color, int size){
            this.name=name;
            this.color=color;
            this.size=size;
            System.out.println(name+","+color+","+size);
    }
    public static void sayMaMa() {
        System.out.println("Mama!");

    }
    public static String sayPapa() {
        return "Papa!";
    }


    }

