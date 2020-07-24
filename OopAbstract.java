package com.nang;
  abstract class Shape{
	  String color;
	  Boolean filled;
	 public Shape() {
		 
	 }
	
	public Shape(String color, Boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}

	abstract Double getArea() ;
	public double area;
	
	abstract Double getPerimeter();
	public double perimeter;
	@Override
	public String toString() {
		return "Color:\t" + color + "\nfilled\t" + filled +"\nArea\t"+getArea()+"Perimeter\t"+getPerimeter();
	}
	public Boolean getFilled() {
		return filled;
	}
	public void setFilled(Boolean filled) {
		this.filled = filled;
	}
	
	
	
  }
 class Circle extends Shape{
	   double radius=1.0;
	   public  Circle(){
		   
	   }
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	
	
	public Circle(double radius,String color, Boolean filled) {
		super(color, filled);
		this.radius=radius;
	}
	@Override
	Double getArea() {
		area=Math.PI*radius*radius;
		return area;
	}

	@Override
	Double getPerimeter() {
		 perimeter=2 * Math.PI * radius;
		return perimeter;
	}
	@Override
	public String toString() {
		return "Color:\t" + color + "\nfilled\t" + filled +"Circle area\t:"+getArea()+"Circle perimeter\t:"+getPerimeter();
	}
	  
  }
  class Rectangle extends Shape{
	  double width=1.0;
	  double length=1.0;
	  
	 public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public Rectangle() {
		 
	 }
	  
	public Rectangle(Double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	

	public Rectangle(double width, double length,String color, Boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	@Override
	Double getArea() {
		area=length * width;
		return area ;
	}

	@Override
	Double getPerimeter() {
		perimeter=2 * (length + width);
		return perimeter;
	}

	@Override
	public String toString() {
		return "Color:\t" + color + "\nfilled\t" + filled +"Rectangle area\t:"+getArea()+"\nRectangle perimeter\t"+getPerimeter();
	}
	  
  }
 class Square extends Rectangle{
	 double side;
	 
	 public Square() {
		 
	 }
	public Square(double side) {
		super();
		this.side = side;
	}
	
	public Square(double side, String color, Boolean filled) {
		super();
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	@Override
	Double getArea() {
		// TODO Auto-generated method stub
		return side*side;
	}
	@Override
	Double getPerimeter() {
		// TODO Auto-generated method stub
		return 4*side;
	}
	public String toString() {
	return "Color:\t"+color+"\nFilled:\t"+filled+"\nArea of square:\t"+getArea()+"\nPerimeter of square:\t"+getPerimeter();
	}

 }
 public class OopAbstract extends Shape {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Shape s1=new Circle(2.5, "green", true);
			System.out.println(s1.toString());
			
			
			
			Shape s2=new Rectangle(3.5, 2, "blue", false);
			System.out.println(s2.toString());
			
			
			Shape s3=new Square(3.5, "Grey", true);
			System.out.println(s3.toString());
		}

		@Override
		Double getArea() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		Double getPerimeter() {
			// TODO Auto-generated method stub
			return null;
		}
}
