public class Division implements Operation {

    @Override
    public double action(double a, double b) {
        if (b == 0) {
            throw new UnsupportedOperationException("На ноль делть нельзя"); 
        }
        return a / b;
    }
    
}
