package org.fasttrackit;

import java.time.LocalDateTime;

/**
 * First Application in Java!
 *
 */
public class App 
{

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.name = "Kenzo";
        dog.sex = "male";
        dog.age = 0.6;
        dog.dogBreed ="French Bulldog";
        dog.happyLevel = 10;
        dog.healthLevel = 10;
        dog.hungerLevel = 5;
        dog.activity = "Run";
        dog.weight = 12;



        Adoptator adoptator = new Adoptator();
        adoptator.name = "Calin";
        adoptator.sex = "Male";
        adoptator.money = 10000;

        Food food = new Food();
        food.foodType = "Solid";
        food.manufacturer = "Taste Of The Wild";
        food.qty = 10;
        food.expiryDate = LocalDateTime.now().minusYears(2);
        food.stock = true;

        Vet vet = new Vet();
        vet.name = "Peter";
        vet.specialization = "Dogs";

        System.out.println(dog.name + " Is a " + dog.dogBreed + ", He Is Happy " + dog.happyLevel + " With " +
                adoptator.name  + " And His Prefered " + "Activity Is To " + dog.activity);

    }

}
