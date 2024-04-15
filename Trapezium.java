package comp41670.lab2;

public class Trapezium extends Shape{
	private double height;
	private double baseMajor;
	private double baseMinor;
	private double side;


	public Trapezium(float h, float b1, float b2, float s){
		this.height = h;
		this.baseMajor = b1;
		this.baseMinor = b2;
		side = s;	
	}

	public void draw(){
		System.out.println("This is a trapezium - area: "+area+" and perimeter: "+perimeter);
	}
	
	public void calculatePerimeter() {
		perimeter = (2 * side) + baseMajor + baseMinor;	
	}
	
	public void calculateArea() {
		area = (baseMajor + baseMinor) *height/2;		
	}
}