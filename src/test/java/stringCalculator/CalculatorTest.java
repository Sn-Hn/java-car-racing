package stringCalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    @DisplayName("연산 테스트")
    void calculate() {
        assertThat(5).isEqualTo(calculator.calculate("2 + 3"));
    }

    @Test
    @DisplayName("다중 연산 테스트")
    void mutipleCalculate() {
        assertThat(5).isEqualTo(calculator.calculate("2 + 3 - 1 * 5 / 2"));
    }

    @Test
    @DisplayName("덧셈 테스트")
    void plus() {
        assertThat(7).isEqualTo(Operator.PLUS.operate(5, 2));
    }

    @Test
    @DisplayName("뺼셈 테스트")
    void minus() {
        assertThat(5).isEqualTo(Operator.MINUS.operate(7, 2));
    }

    @Test
    @DisplayName("곱셈 테스트")
    void multiplication() {
        assertThat(14).isEqualTo(Operator.MULTIPLICATION.operate(7, 2));
    }

    @Test
    @DisplayName("나눗셈 테스트")
    void division() {
        assertThat(4).isEqualTo(Operator.DIVISION.operate(8, 2));
    }

//    @Test
//    @DisplayName("0으로 나눴을 때 테스트")
//    void zero_division() {
//        assertThat();
//    }
}