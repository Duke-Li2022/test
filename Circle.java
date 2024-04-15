package comp41670.lab2;

public class Circle extends Shape {
	
	
	private double radius;
	
	
	public Circle(double radius){ 
		this.radius = radius;
		
	}
	
	@Override
	public void draw(){
		System.out.println("This is a circle - radius: "+radius+" and area: "+area);
	}
	
	public double getRadius(){
		return radius;
	}
	
	@Override
	public void calculateArea(){
		area = Math.PI * Math.pow(radius, 2);
		
	}

	@Override
	public void calculatePerimeter(){
		perimeter = 2 * Math.PI * radius;
	}
	

}
