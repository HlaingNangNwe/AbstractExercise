package com.nang;

import java.util.Scanner;

class Triangle implements Area{

	@Override
	public Double calArea(double width, double height) {
		
		return width*height/2;
	}
}
		 class Square implements Area{

			@Override
			public Double calArea(double width, double height) {
				// TODO Auto-generated method stub
				return width*width;
			}

			
		}
		 class Rectangle implements Area{

			@Override
			public Double calArea(double width, double height) {
				// TODO Auto-generated method stub
				return width*width;
			}

				
		
			}
	

public class CalculateMyArea  {
	
	public static void main(String[] args) {
		Triangle t=new Triangle();
		Rectangle r=new Rectangle();
		Square s=new Square();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter width");
		double w=sc.nextDouble();
		System.out.print("Enter height");
		double h=sc.nextDouble();
		System.out.print("Area of Triangle"+ t.calArea(w,h));
//		t.calArea(w,h);
		System.out.print("Area of Rectangle"+ r.calArea(w,h));
		System.out.print("Area of Square"+ s.calArea(w,h));
	}

}
 
