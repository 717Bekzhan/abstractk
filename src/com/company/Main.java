package com.company;

public class Main {

    public static void main(String[] args) {
        Cow cow = new Cow(500, 5, "Altay", "Bob");
        Cow cow1 = new Cow(222, 12, "magic", "lol");
        Cow cow2 = new Cow(200, 12, "pok", "jog");
        Cow cow3 = new Cow(344, 1, "hek", "Ger");
        Cow cow4 = new Cow(120, 22, "kill", "pok");
        Cow cow5 = new Cow(20,1,"ukj","bop");


        Sheep sheep = new Sheep(60, 3, "Gisar", "ak koi");
        Sheep sheep1 = new Sheep(220, 22, "kozu", "karakoi");
        Sheep sheep2 = new Sheep(34, 2, "kozu", "kyzylkoi");
        Sheep sheep3 = new Sheep(12, 2, "toktu", "kozu");

        Horse horse = new Horse(200, 6, "Don", "Ahiles");
        Horse horse1 = new Horse(150, 2, "arabic", "tanka");
        Horse horse2 = new Horse(200, 6, "Akkula", "Pushka");

        Farm farm1 = new Farm("street Manas 57","Bekzhan", new Cow[]{cow1,cow2,cow3,cow4,cow},
                new Sheep[]{sheep1,sheep2,sheep3}, new Horse[]{horse1,horse2});
        Farm farm2 = new Farm("Bishkek","Kaly",
                new Cow[]{cow}, new Sheep[]{sheep}, new Horse[]{horse});
        System.out.println(farm1);
        System.out.println(

        );
        System.out.println(farm2);



    }
}
