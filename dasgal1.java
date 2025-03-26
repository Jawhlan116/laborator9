package lab9;

public class dasgal1 {
	public static double square(double x) {
		double t;
		double squareRoot=x/2;
		do {
			t=squareRoot;
			squareRoot=(t+(x/t))/2;
		}
		while((t-squareRoot) !=0);
		return squareRoot;
	}

	public static void main(String[] args) {
		double x=16;
		double root;
		root=square(x);
		System.out.println("Тоо : "+x);
		System.out.println(x+" тооны квадрат язгуур нь : "+root);
	}

}
