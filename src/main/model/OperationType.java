package model;

public enum OperationType {
    ADD('+'),
    SUBSTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/'),
    EQUALS('=');

    private Character sign;

    OperationType(Character sign) {
        this.sign = sign;
    }

    public static OperationType getOperationTypeFromCharacter(Character sign) {
        for(OperationType operationType : OperationType.values()) {
            if(operationType.getSign().equals(sign)) {
                return operationType;
            }
        }
        throw new IllegalStateException("Invalid character!");
    }

    public Character getSign() {
        return sign;
    }
}
