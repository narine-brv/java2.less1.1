package com.narine;

import java.util.Arrays;

public final class Dog extends Pet {

    private String name;
    private String breed;
    private String [] commands;

    public Dog () {
    }

    public Dog (String name, String breed, Color color, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        super.setColor(color);
        super.setShelter(shelter);
    }

    public Dog (String name, String breed, Color color, Shelter shelter, String [] commands) {
        this.name = name;
        this.breed = breed;
        super.setColor(color);
        super.setShelter(shelter);
        this.commands = commands;
    }

    public void makeVoice (String voice, int number){
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }

    public void makeVoice (String voice) {
        System.out.println(voice);
    }

    public void makeVoice (int number, String voice) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }

    public final String getInfo () {
        return "\nName: " + name + "\nBreed: " + breed
                + super.getInfo() + "\nCommands: " + Arrays.toString(commands);
    }
    public final String getInfo1 () {
        return "\nName: " + name + "\nBreed: " + breed
                + super.getInfo();
    }



    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }


}
