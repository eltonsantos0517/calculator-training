public class SumSquare implements Operation{

    @Override
    public double calculate(OperationParameter parameter) {
        return Math.pow(parameter.getFirstNumber(), 2) + Math.pow(parameter.getSecondNumber(), 2);
    }
}
