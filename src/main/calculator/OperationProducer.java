package calculator;

import calculator.operators.*;
import model.OperationType;

public class OperationProducer {

    private OperationProducer() {
        // prevent from creatting instance of Producer
    }

    public static Operation produce(OperationType operationType) {
        switch (operationType) {
            case ADD:
                return new Add();
            case SUBSTRACT:
                return new Substract();
            case MULTIPLY:
                return new Multiply();
            case DIVIDE:
                return new Divide();
        }
        return null;
    }
}
