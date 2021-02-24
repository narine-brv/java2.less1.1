package com.narine;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("Лайма");
		dog.setBreed("алабай");
		dog.setColor(Color.WHITE);
		dog.setShelter(new Shelter("Shelter 1", "Abdrahmanova 1"));
		dog.setCommands(new String[]{"sit", "run", "bark"});
		System.out.println(dog.getInfo());

		dog.makeVoice("гав-гав", 3);

		System.out.println("-------------------");

		Dog dog1 = new Dog("Белла", "овчарка", Color.BROWN, dog.getShelter());
		dog1.setShelter(new Shelter("Shelter 2", "Abdrahmanova 2"));
		System.out.println(dog1.getInfo1());

		dog1.makeVoice("рррррр");

		System.out.println("-------------------");

		Dog dog2 = new Dog("Вспыш", "хаски", Color.GRAY, dog.getShelter(),
				new String[]{"sit", "run", "bark"});
		dog2.setShelter(new Shelter("Shelter 3", "Abdrahmanova 3"));
		System.out.println(dog2.getInfo());

		dog2.makeVoice(1, "ууууу");
	}




}
