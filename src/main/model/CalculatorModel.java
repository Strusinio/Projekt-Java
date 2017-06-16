package model;

public class CalculatorModel {

    private long firstNumber;
    private OperationType operator;
    private boolean start;

    public CalculatorModel() {
        firstNumber = 0;
        start = true;
    }

    public long getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(long firstNumber) {
        this.firstNumber = firstNumber;
    }

    public OperationType getOperator() {
        return operator;
    }

    public void setOperator(OperationType operator) {
        this.operator = operator;
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }
}

//przechowuje wszystkie dane, odpowiada za sesję z userem