public class FormatInput {

    private String input;

    public FormatInput(String input) {
        this.input = input;
    }

    public double getFirstNumber() {
        return Double.parseDouble(input.substring(0, getOperationPosition(input)));
    }

    public double getSecondNumber() {
        return Double.parseDouble(input.substring(getOperationPosition(input) + 1, (isPercent(input) ? (input.length() - 1) : input.length())));
    }

    public OperationEnum getOperation() {
        return isPercent(input) ? OperationEnum.PERCENTAGE :
                OperationEnum.get(input.substring(getOperationPosition(input), getOperationPosition(input) + 1));
    }

    private int getOperationPosition(String input) {

        int pos1 = input.lastIndexOf("*");
        int pos2 = input.lastIndexOf("/");
        int pos3 = input.lastIndexOf("+");
        int pos4 = input.lastIndexOf("-");

        return Math.max(Math.max(pos1, pos2), Math.max(pos3, pos4));
    }

    private boolean isPercent(String input) {
        return input.contains("%");
    }
}
