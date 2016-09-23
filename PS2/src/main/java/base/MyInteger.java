package base;

public class MyInteger {

	// int datafield
	private int iValue;

	// constructor
	public MyInteger(int iValue) {
		this.iValue = iValue;

	}

	// method
	public int getiValue() {
		return iValue;
	}

	// Methods isEven(), isOdd(), and isPrime() that return true if iValue is
	// even, odd, or prime,
	public boolean isEven() {

		if (iValue % 2 == 0) {

			return true;
		}
		return false;
	}

	public boolean isOdd() {

		if (iValue % 2 != 0) {
			return true;

		}
		return false;

	}

	public boolean isPrime() {
		for (int i = 2; i < iValue / 2; i++) {

			if (iValue % i == 0) {

				return false;

			}

		}
		return true;

	}

	// Static methods isEven(int), isOdd(int), and isPrime(int)
	public static boolean isEven(int num) {

		if (num % 2 == 0) {

			return true;
		}
		return false;
	}

	public static boolean isOdd(int num) {

		if (num % 2 != 0) {
			return true;

		}
		return false;

	}

	public static boolean isPrime(int num) {
		for (int i = 2; i < num / 2; i++) {

			if (num % i == 0) {

				return false;

			}

		}
		return true;

	}

	// Static methods isEven(MyInteger), isOdd(MyInteger), and
	// isPrime(MyInteger)
	public static boolean isEven(MyInteger num) {

		return num.isEven();

	}

	public static boolean isOdd(MyInteger num) {

		return num.isOdd();
	}

	public static boolean isPrime(MyInteger num) {

		return num.isPrime();
	}

	// Methods equals(int) and equals(MyInteger)
	public boolean equals(int num) {
		return iValue == num;
	}

	public boolean equals(MyInteger num) {

		return equals(num.getiValue());

	}

}












