package calculator.operators;

public class Multiply implements Operation {

    @Override
    public long calculate(long number1, long number2) {
        return number1 * number2;
    }
}
