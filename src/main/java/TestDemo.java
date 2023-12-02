import java.util.Random;

public class TestDemo {
	
	public int addPositive(int a , int b) {
		// conditionals to determine what the test will expect when addPositive() is called.
		// if the conditional fails, an exception will be thrown.
		if (a > 0 && b > 0) {
			return a + b;
		} else {
			// if parameters are not 1 or more, the IllegalArgumentException is thrown with a message.
			// IllegalArgumentException part of java.lang package, no need to import.
			throw new IllegalArgumentException("Both Parameters Must Be Positive!");
		}
	}
	
	
	
	
	int multiplyPositive(int a, int b) {
		if (a > 0 && b > 0) {
			return a * b;
		} else {
			throw new IllegalArgumentException("Both Parameters Must Be Positive!");
		}
	}
	
	
	
	
	// no params. 
	int randomNumberSquared() {
		// holder value for getRandomInt().
		int randoHolder = getRandomInt();	
		return randoHolder * randoHolder;
	}
	
	
	
	
	
	// no params.
	int getRandomInt() {
		// instantiate a new Random object
		Random randomInt = new Random();
		// return randomInt next Int
		return randomInt.nextInt(10)+1;
		// declare a variable to store result from getRandomInt in the random methods elsewhere.
		}
	}
	
	
	
	
	
	
	
	
	
