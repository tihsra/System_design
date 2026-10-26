package Flyweight;

public class Bush {
	private int height;
	private int width;
	private String family;
	private Flyweight reference;
	
	Bush(){
		this.reference = FlyWeightFactory.getInstance("Bush");
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
