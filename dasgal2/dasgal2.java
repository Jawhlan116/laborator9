package lab9;
import java.util.*;

public class dasgal2 {

		public static double square(double x) {
			double t;
			assert x>0:"x-ийн утга 0-ээс их тоо байх ёстой!";
			double squareRoot=x/2;
			do {
				t=squareRoot;
				squareRoot=(t+(x/t))/2;
			}
			while((t-squareRoot) !=0);
			return squareRoot;
		}

		public static void main(String[] args) {
			System.out.println("Ямар нэгэн тоо оруулна уу!");
			Scanner sc=new Scanner(System.in);
			double x=sc.nextInt();
			double root;
			root=square(x);
			System.out.println("Тоо : "+x);
			System.out.println(x+" тооны квадрат язгуур нь : "+root);
			sc.close();
	}}
