package lab9;
import java.util.Scanner;

public class dasgal4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Тоо оруул:");
		double x=sc.nextInt();
		double y=sc.nextInt();
		sc.close();
		try {
			double z=divide(x,y);
			System.out.println("z = "+z);
			System.out.println("Бүх зүйл хэвийн байна.");
		}
		catch (ArithmeticException ex) {
			System.out.println("Тоог 0-д хувааж болохгүй!");
			return;
		}

	}
	private static double divide(double x,double y) {
		if(y==0.0) {
			throw new ArithmeticException();
		}
		return x/y;
	}

}
