
public class Main {

	public static void main(String[] args) {
		
		Racket y = new Racket(); 
		y.setBrand("Yonex");
		y.setColour("Red");
		y.setLength(665);
		y.setWeight(76.0);
		
		System.out.println("Brand: " + y.getBrand());
		System.out.println("Colour: " + y.getColour());
		System.out.println("Length: " + y.getLength() + "mm");
		System.out.println("Weight: " + y.getWeight() + "g");
		y.Promotion();
		System.out.println();
		
		Racket l = new Racket();
		l.setBrand("Lining");
		l.setColour("Black");
		l.setLength(665);
		l.setWeight(75.0);
		
		System.out.println("Brand: " + l.getBrand());
		System.out.println("Colour: " + l.getColour());
		System.out.println("Length: " + l.getLength() + "mm");
		System.out.println("Weight: " + l.getWeight() + "g");
		l.Promotion();
	}

}
