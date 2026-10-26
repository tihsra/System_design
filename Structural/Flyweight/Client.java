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
