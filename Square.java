package comp41670.lab2;

public class Square extends Rectangle{
	
	public Square(double s1){
		super(s1,s1);
		
	}
	
	public void draw(){
		System.out.println("This is a square - area: "+area+" and perimeter: "+perimeter);
	}

}
