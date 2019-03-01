public class Executer {

    private OperationFactory operationFactory;

    public Executer(OperationFactory operationFactory) {
        this.operationFactory = operationFactory;
    }

    public void execute(FormatInput input) {
        double result = operationFactory.getOperation(input.getOperation())
                .calculate(new OperationParameter(input.getFirstNumber(), input.getSecondNumber()));
        System.out.println("Result = [" + result + "]");
    }
}
