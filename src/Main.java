public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();
        double bmi = service.calculate(96.564, 1.76);
        System.out.println("Индекс массы тела равен:");
        System.out.printf("%.2f", bmi);

    }
}