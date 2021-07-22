package stringCalculator;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum Operator {
    PLUS("+", (a, b) -> a + b),
    MINUS("-", (a, b) -> a - b),
    MULTIPLICATION("*", (a, b) -> a * b),
    DIVISION("/", (a, b) -> a / b);

    private String operator;
    private BiFunction<Integer, Integer, Integer> operation;

    Operator(String operator, BiFunction<Integer, Integer, Integer> operation) {
        this.operator = operator;
        this.operation = operation;
    }

    public Operator getOperator(String type) {
        return Arrays.stream(Operator.values())
                .filter(operator -> operator.operator.equals(type))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("잘못된 연산자입니다. 사칙 연산자를 사용해주세요."));
    }

    public int operate(int a, int b) {
        return operation.apply(a, b);
    }
}
