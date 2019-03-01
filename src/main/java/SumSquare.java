public class SumSquare implements Operation{

    @Override
    public double calculate(OperationParameter parameter) {
        return parameter.getFirstNumber() + parameter.getSecondNumber();
    }
}
