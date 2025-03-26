package lab9;

public class dasgal3 {

	public static void main(String[] args) {
		double x=1.0;
		double y=0.0;
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
		assert(y!=0):"0-ээс ялгаатай утга оруулах ёстой!";
		return x/y;
	}

}
