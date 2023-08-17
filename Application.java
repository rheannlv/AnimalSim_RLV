import Invalid.*;
import java.util.*;

public class Application {

	public static void main(String[] args) throws Exception {
		System.out.println("*********************************************");
		System.out.println("Location Tests");
		System.out.println("*********************************************");
		System.out.println();
		
		Location loc1 = new Location (2,4);
		loc1.update(6, 8);
		loc1.setxCoor(2);
		System.out.println(loc1.getxCoor());
		
		Location loc2 = new Location (-3,1);
		System.out.println(loc2.getyCoor());
		System.out.println(loc2.toString());
		
		System.out.println();
		System.out.println("*********************************************");
		System.out.println("BrownBear Tests");
		System.out.println("*********************************************");
		System.out.println();
		
		BrownBear pooh = new BrownBear(-1, new Location(1,1), "Grizzly");
		pooh.setSimID(4); 
		System.out.println(pooh.getSimID());
		pooh.eat();
		pooh.walk(1);
		pooh.swim(1);
		pooh.setSubSpecies("Sun");
		pooh.eat();
		pooh.sleep();
		pooh.setLocation(loc1);
		System.out.println(pooh.getLocation());
		System.out.println(pooh.toString());
		
		
		System.out.println();
		System.out.println("*********************************************");
		System.out.println("Goldfinch Tests");
		System.out.println("*********************************************");
		System.out.println();
		
		Goldfinch tweety = new Goldfinch(2, new Location(2,5), 9.0);
		tweety.eat();
		System.out.println(tweety.isFull());
		tweety.walk(1);
		tweety.walk(1);
		tweety.fly(loc1);
		tweety.setWingSpan(3.0);
		tweety.eat();
		tweety.sleep();
		System.out.println(tweety.toString());
		
		System.out.println();
		System.out.println("*********************************************");
		System.out.println("Animal Tests");
		System.out.println("*********************************************");
		System.out.println();
		
		//Animal animal = new Animal();

		System.out.println();
		System.out.println("*********************************************");
		System.out.println("Generic Tests");
		System.out.println("*********************************************");
		System.out.println();
	
		ArrayList<Animal> animalArray = new ArrayList<Animal>();
		BrownBear yogi = new BrownBear(3, new Location (2,3), "Siberian");
		BrownBear booboo = new BrownBear(4, new Location (1,1), "Asiatic");
		Goldfinch errol = new Goldfinch(5, new Location (3,9), 6.9);
		Goldfinch hedwig = new Goldfinch(6, new Location (6,9), 7.8);
		
		animalArray.add(booboo);
		animalArray.add(yogi);
		animalArray.add(errol);
		animalArray.add(hedwig);
		
		 for (int i = 0; i < animalArray.size(); i++) 
		 {
		      System.out.println(animalArray.get(i));
		 }     
	
	
		
	}//end main

}//end class
