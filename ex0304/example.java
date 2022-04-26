package ex0304;

public class example {	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c, d, e;
		c=++a+(++b);
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		d=(a++)+(++b);
		System.out.println(d);
		System.out.println(a);
		System.out.println(b);
		e=a+++b;
		System.out.println(e);
		System.out.println(a);
		System.out.println(b);
		int f=10, g=20, h;
		h=f+ ++g;
		System.out.println(h);
		System.out.println(f);
		System.out.println(g);
				
}

}
