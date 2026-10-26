package Flyweight;

public class Client {
	public static void main(String str[]) {
		Tree tree1 = new Tree();
		Tree tree2 = new Tree();
		
		Bush bush1 = new Bush();
		Bush bush2 = new Bush();
		
		System.out.println(tree1.getRefereence()+" "+tree2.getRefereence());
		System.out.println(bush1.getRefereence()+" "+bush2.getRefereence());
	}
}

// The implementation is overall correct but the way i am exposing vector is incorrect
// Fly weight by definition has to hold immutable state 
// We must therefore call constructor with the vector instance given to the constructor
// so that fly weigth could create an copy of the list,
// So that fly weight could be created once

// Apparently fly weight should also have a method which takes in extrinsic state as input
// to show it's just not a cached object \
