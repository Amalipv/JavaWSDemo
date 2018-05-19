package demo;

class A {
	static int y=8;
	A(int y){
		this.y=y;
	}
}
public class StaticEx extends A{
	static int x=3;
	static int y=6;
	StaticEx(int x,int y){
		super(y);
	}
	public static void main(String[] args){
		System.out.println(x);
		System.out.println(y);
		System.out.println(A.y);
		StaticEx st = new StaticEx(5,6);
	}
}
