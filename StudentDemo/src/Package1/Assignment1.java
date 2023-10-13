package Package1;

public class Assignment1 {
	
	public int sum(int a, int b){
		int c;
		c=a+b;
		System.out.println("Sum of the two numbers" +c);
		return c;
	}
	public int sub(int x, int y){
		int z;
		z=x-y;
		System.out.println("subtract of two numbers" +z);
		return z;
	}
	
	public int mul(int m1, int m2){
		int m3;
		m3=m1*m2;
		System.out.println("multiplication of two numbers" +m3);
		return m3;
	}
	public int div (int d1, int d2){
		int d3;
		d3=d1/d2;
		System.out.println("division of two numbers" +d3);
		return d3;	
	}
	public static void main(String[] args){
		Assignment1 obj=new Assignment1();
		int sumresult=obj.sum(10,2);
		int sumresult2=obj.sum(sumresult,2);
		int subresult=obj.sub(sumresult2,2);
		int multiresult=obj.mul(subresult,2);
		obj.div(multiresult,2);		
		
	}
	
	
	
	
	

}
