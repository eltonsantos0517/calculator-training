public enum OperationEnum {
    SUM("+"), SUB("-"), MULTI("*"), DIV("/"), PERCENTAGE("%");

    private String value;

    OperationEnum(String value) {
        this.value = value;
    }
    
    public static OperationEnum get(String value) {
        switch (value) {
            case "+":
                return SUM;
            case "-":
                return SUB;
            case "*":
                return MULTI;
            case "/":
                return DIV;
            case "%":
                return PERCENTAGE;
            default:
                throw new IllegalArgumentException("Not exists operation for the value [" + value + "]");
        }
    }
}
