public class BmiService {
    public double calculate(double h, double m) {
        double bmi = m / (h * h);
        return bmi;
    }
}
