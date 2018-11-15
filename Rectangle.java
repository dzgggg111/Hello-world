package test;

public class Rectangle {
	int l;
	int w;
	int area;
	
	public Rectangle() {
		this.l=l;
		this.w=w;
		this.area=area;
	}
	public int getl() {
		return l;
	}
	
	public int getw() {
		return w;
	}
	
	public int getarea() {
		return area;
	}
	
	
	public int calculator(int l,int w) {
		area=l*w;
		return area;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Rectangle r1=new Rectangle();
       Rectangle r2=new Rectangle();
       r1.l=8;
       r1.w=6;
       r2.l=7;
       r2.w=7;
       r1.calculator(r1.l, r2.w);{
    	   System.out.println(r1.area);
       }
       r2.calculator(r2.l, r2.w);{
    	   System.out.println(r2.area);
       }
       int a=6,b=7;
		double sum;
		double sum1=a+b/2.0;
	 System.out.println(sum1);
       
	}

}c
