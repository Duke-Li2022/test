package comp41670.lab2;

public class Rectangle extends Shape {
	private double height;
	private double base;



	public Rectangle(double height, double base){
		this.height = height;
		this.base = base;
		
	}

	public void draw(){
		System.out.println("This is a rectangle - area: "+area+" and perimeter: "+perimeter);
	}
	
	@Override
	public void calculatePerimeter() {
		perimeter = this.height*2+this.base*2;
		
	}
	
	@Override
	public void calculateArea() {
		this.area = this.height * this.base;
		
	}
}