package com.company;


import static com.company.Doll.sayMaMa;

public class Shop {
    public static void main(String[] args) {

        Doll DollKatja =new Doll();
            Doll Masha = new Doll("Masha", "Blue", 25);
        System.out.println("Мы создали куклу с именем-"+ Masha.name+","+"Цвет-"+ Masha.color+","+"Размер-"+Masha.size+".");
        System.out.println("Mama");
        sayMaMa();
        System.out.println(Doll.sayPapa());
        String Papa= Doll.sayPapa();
        System.out.println(Papa);


    }

}


