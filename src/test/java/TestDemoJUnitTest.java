import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;



class TestDemoJUnitTest {
	
	private TestDemo testDemo;

	@BeforeEach
	void setUp() throws Exception {
		testDemo = new TestDemo();
	}

	
	
	@ParameterizedTest
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForAddPositive")
	// see @CsvSource annotation.
	void assertThatTwoPositiveNumbersAreAddedCorrectly(int a , int b , int expected , boolean expectException) {
		
		 if (!expectException) {
			 // if exception is not expecting, assert that addition is working as expected for the test case.
			 assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
		 } 
		 else {
			 // if exception is expected, assert that an IllegalArgumentException is thrown.
			 //
			 assertThatThrownBy( () -> testDemo.addPositive(a, b)).isInstanceOf(IllegalArgumentException.class);
		 }
		 
		 
		 
		}
	
	
	@Test
	void assertThatPairsOfPositiveNumbersAreAddedCorrectly(){
		// use assertThat() to test the return value from addPositive
		// testDemo is name of private instance of TestDemo object created at start of this class.
		// addPos being passed to test object with 2 parameters and an expected outcome. 
		assertThat(testDemo.addPositive(245, 111)).isEqualTo(356);
		assertThat(testDemo.addPositive(2, 111)).isEqualTo(113);
		assertThat(testDemo.addPositive(24, 100)).isEqualTo(124);
		assertThat(testDemo.addPositive(1, 1)).isEqualTo(2);
		assertThat(testDemo.addPositive(25, 30)).isEqualTo(55);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	// i chose @Test for sake of brevity and simplicity.
	void assertTwoPositivesMultiplyCorrectly() {
		// in the test case for multiply two positives, i used the same assertThat method as above in assertThatTwoPairsOfPositiveNumbersAreAddedCorrectly
		
		assertThat(testDemo.multiplyPositive(72, 68)).isEqualTo(4896);
		assertThat(testDemo.multiplyPositive(12, 155)).isEqualTo(1860);
		assertThat(testDemo.multiplyPositive(1, 234)).isEqualTo(234);
		assertThat(testDemo.multiplyPositive(6, 7)).isEqualTo(42);
		assertThat(testDemo.multiplyPositive(45, 45)).isEqualTo(2025);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// method returns Stream of arguments.
	static Stream argumentsForAddPositive() {
		// each parameter should be wrapped in an arguments() call.
		// if no exception is expected, false.
		// if exception expected, true.
		arguments(2, 4, 6, false);
		arguments(4, 10, 15, true);
		arguments(42, 79, 111, false);
		arguments(2524, 13245, 15770, false);
		arguments(1254, 854, 2108, false);
		arguments(4, 21, 24, true);
		arguments(4, 0, 14, true);
		arguments(4545, 1254, 5799, false);
		
		// return a Stream
		return Stream.of(null);
	}

	
	
	
	
	
	void assertThatSquaredIsCorrect() {
		// instantiate TestDemo instance using spy and passing testDemo into it. spy will mimic testDemo. "spy" on the object...
		TestDemo mockDemo = spy(testDemo);
		// doReturn specifies the value of the return. 
		// whem in used with do return to define conditions for the mock method to know when to return the doReturn.
		doReturn(5).when(mockDemo).getRandomInt();
		// call the mocked squared method.
		int fiveSquared = mockDemo.randomNumberSquared();
		// the doReturn forces the randomInt to be 5. when mockDemo just means were using that object (mockDemo) as the test essentially.
		assertThat(fiveSquared).isEqualTo(25);
	}
	
	
	
	
	
	
	
	

}
