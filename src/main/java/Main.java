import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FormatInput formatInput = new FormatInput(scanner.nextLine());

        Operation sum = new SumSquare();
        Operation sub = new Subtract();
        Operation multi = new Multiplication();
        Operation div = new Division();
        Operation percent = new Percentage();

        OperationFactory factory = new OperationFactory(sum, sub, multi, div, percent);
        Executer executer = new Executer(factory);
        executer.execute(formatInput);
    }
}
