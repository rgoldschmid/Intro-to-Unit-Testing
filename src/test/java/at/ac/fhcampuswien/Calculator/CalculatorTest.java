package at.ac.fhcampuswien.Calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    @DisplayName("Add: 1 + 2 = 3")
    void add() {
        // Arrange
        int a = 1;
        int b = 2;
        int expected = 3;

        // Act
        int result = calc.add(a, b);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Sub: 5 - 2 = 3")
    void givenIHaveTwoNumbers_whenISubtractThem_thenIGetTheirDifference() {
        // Given I have two numbers
        int a = 5;
        int b = 2;
        int expected = 3;

        // When I subtract them
        int result = calc.subtract(a, b);

        // Then I get their difference
        assertEquals(expected, result);
    }

    @Test
    void pow() {
    }

    @DisplayName("Divide: 10 / 5 = 2")
    @ParameterizedTest
    @CsvSource({
            "10, 5, 2.0",
            "100, 50, 2.0",
            "100, 4, 25.0"
    })
    void divide(int a, int b, double expected) {
        // Arrange & Act
        double result = calc.divide(a, b);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Divide by zero should throw an error")
    void divideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0));
        assertTrue(exception.getMessage().contains("Sorry, can't divide by zero!"));
    }
}