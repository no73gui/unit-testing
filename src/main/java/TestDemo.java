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
	
	
	
	
	
	
	
	
	
	
	// specific to positive integer values. straight forward.
	int multiplyPositive(int a, int b) {
		// if the parameters passed in are both 1 or more, return the value of those ints multiplied.
		if (a > 0 && b > 0) {
			// return
			return a * b;
		} else {
			// if conditional fails, throw new IllegalArgumentException with a message.
			// IAE is what will be thrown and seen in console, this will allow the user to see the exact exception thats causing the issue. its very specific 
			// and says illegal arg....not much more to say
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
	
	
	
	
	
	
	
	
	
