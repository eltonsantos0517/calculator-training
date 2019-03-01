public class OperationFactory {

    private Operation sum;
    private Operation sub;
    private Operation multi;
    private Operation div;
    private Operation percent;

    public OperationFactory(Operation sum, Operation sub, Operation multi, Operation div, Operation percent) {
        this.sum = sum;
        this.sub = sub;
        this.multi = multi;
        this.div = div;
        this.percent = percent;
    }

    public Operation getOperation(OperationEnum operation) {
        switch (operation) {
            case DIV:
                return div;
            case SUM:
                return sum;
            case MULTI:
                return multi;
            case SUB:
                return sub;
            case PERCENTAGE:
                return percent;
            default:
                throw new IllegalArgumentException("Not exists operation for the value [" + operation + "]");
        }

    }

}
