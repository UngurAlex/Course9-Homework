package org.fasttrackit.course9.HomeworkGood;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();

        basket.add("lemon");
        basket.add("apple");
        basket.add("apple");
        basket.add("lemon");
        basket.add("lemon");
        basket.add("strawberry");
        basket.add("strawberry");




        //ex.1-mi-a placut
        List<String> list = basket.getList();
        //1.1
        System.out.println("This is our fruits:");
        System.out.println(list);
        System.out.println("We see if our list has the next fruit, if not we add it.");
        System.out.println(basket.find("apple"));
        //1.2
        System.out.println("Now, we want to remove a fruit from our list :) First we see if we have that fruit and than we remove it.");
        System.out.println(basket.remove("lemon"));
        System.out.println(list);
        //1.3
        System.out.println("You can search to see what position your fruit has in the list.");
        System.out.println("The position of your fruit is: " + basket.position( "apple"));

        //1.5
        System.out.println("We want to add another fruit :)");
        basket.addAnotherFruit("strawberry");
        System.out.println("This is our list now " + list);
        //1.6
        System.out.println( "The length of list is: " + basket.count());

        //1.7
        System.out.println( "The length of your list is: " + basket.customCount());


        System.out.println(list);
        //1.4
        System.out.println(basket.distinct());


        //ex.2-sper sa fie in regula
        Buquet buquet = new Buquet();
        //acum adaug flori
        buquet.add("rose");
        buquet.add("rose");
        buquet.add("rose");
        buquet.add("chrysanthemum");
        buquet.add("chrysanthemum");
        buquet.add("tulip");
        buquet.add("tulip");
        buquet.add("rose");
        buquet.add("rose");
        buquet.add("rose");

        //acum imi va afisa flori unice
        System.out.println(buquet.listFlowers());
        //acum voi scoate anumite flori
        System.out.println(buquet.remove("tulip"));
        System.out.println(buquet.listFlowers());


        //ex.3
        //am inceput sa-l fac, dar nu l-am terminat, totusi voi reveni asupra lui zilele astea si voi incerca sa-l fac :)
        Person company = new Person();
        company.add3("Alex",11,"manager");
        company.add3("George",60,"welder");
        company.add3("Mihai",45,"carpenter");
        company.add3("Dorin",27,"plummer");
        System.out.println(company.getList());

    }
}