public class BmiService {
    public double calculate(double weightKg, double heightM) {

        double result = weightKg / (heightM * heightM);
        return result;
    }
}
