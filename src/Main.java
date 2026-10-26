public class Main {
    public static void main(String[] args){
        OperationStrategy s = new AddStrategy();
        Calculator calculator = new Calculator(s);
        System.out.println(calculator.calculate(12, 5));

        s = new MultiplyStrategy();
        calculator.changeStrategy(s);
        System.out.println(calculator.calculate(12, 5));


        s= new SubtractStrategy();
        calculator.changeStrategy(s);
        System.out.println(calculator.calculate(12, 5));

    }
}
