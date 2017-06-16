package calculator;

import calculator.operators.Operation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import model.CalculatorModel;
import model.OperationType;

public class CalculatorController {

    @FXML
    private Text output;
    private CalculatorModel model = new CalculatorModel();


    @FXML
    private void processNumpad(ActionEvent event) {
        if (model.isStart()) {
            output.setText("");
            model.setStart(false);
        }

        String value = ((Button) event.getSource()).getText();
        output.setText(output.getText() + value);
    }

    @FXML
    private void processOperator(ActionEvent event) {
        String operatorSign = ((Button) event.getSource()).getText();
        OperationType operationType = OperationType.getOperationTypeFromCharacter(operatorSign.charAt(0));
        if (OperationType.EQUALS != operationType) {
            if (model.getOperator() != null)
                return;

            model.setOperator(operationType);
            model.setFirstNumber(Long.parseLong(output.getText()));
            output.setText("");
        } else {
            if (model.getOperator() == null) {
                return;
            }
            output.setText(String.valueOf(calculate(model.getFirstNumber(), Long.parseLong(output.getText()), model.getOperator())));
            model.setOperator(null);
            model.setStart(true);
        }
    }

    private long calculate(long number1, long number2, OperationType operationType) {
        Operation operation = OperationProducer.produce(operationType);
        if (operation == null) {
            return 0;
        }
        return operation.calculate(number1, number2);
    }
}

//logika kodu , cała klasa to obliczenia