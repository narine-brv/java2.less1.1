package com.narine;

import java.util.Random;

public class Pet {

    private int age = generateDefaultAge();
    private Color color;
    private Shelter shelter;

    public int getAge () {
        return age;
    }

    public Color getColor () {
        return color;
    }

    public void setColor (Color color) {
        this.color = color;
    }

    public Shelter getShelter () {
        return shelter;
    }

    public void setShelter (Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge () {
        // return new Random ().nextInt(18) + 1;
        return (int) (Math.random() * 10 + 5); // от math random 0 до 1

        // Random random = new Random();
        // int n = random.nextInt (18) + 1;
        // return n;
    }

    public String getInfo () {
        return "\nAge =  " + age + "\nColor = " + color + "\nShelter name: "+ shelter.getName() +
                "\nShelter address: " + shelter.getAddress();
    }



}
