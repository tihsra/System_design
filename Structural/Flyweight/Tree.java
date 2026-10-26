package Flyweight;

public class Tree {
	
	private int height;
	private int width;
	private String family;
	private Flyweight reference;
	
	Tree(){
		this.reference = FlyWeightFactory.getInstance("Tree");
	}
	
	public Flyweight getRefereence() {
		return this.reference;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public String getFamily() {
		return family;
	}
	
	public void setFamily(String family) {
		this.family = family;
	}

}
