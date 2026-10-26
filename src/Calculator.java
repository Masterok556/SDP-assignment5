public class Calculator {
    private OperationStrategy strategy;

    public Calculator(OperationStrategy s){
        strategy=s;
    }

    void changeStrategy(OperationStrategy s){
        this.strategy=s;
    }

    public double calculate(double a, double b){
        return strategy.calculate(a,b);
    }
}
