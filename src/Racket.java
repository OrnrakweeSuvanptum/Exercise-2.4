
public class Racket {

	String brand;
	String colour;
	int length;
	double weight; 
	
	//Create Setter Method
	public void setBrand(String brand) {
		this.brand = brand; 
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//Create Getter Method
	public String getBrand() {
		return this.brand;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public Integer getLength() {
		return this.length;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void Promotion() {
		System.out.println("50% off if we buy 2 items!");
	}
}
