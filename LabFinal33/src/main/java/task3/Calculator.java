package task3;

public class Calculator implements Operation<Double>{
    @Override
    public Double add(Double t1, Double t2) {
        return t1+t2;
    }

    @Override
    public Double subtract(Double t1, Double t2) {
        return t1 - t2;
    }

    @Override
    public Double multiply(Double t1, Double t2) {
        return t1 * t2;
    }

    @Override
    public Double divide(Double t1, Double t2) {
        return t1/t2;
    }
}
