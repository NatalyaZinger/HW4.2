public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(1.6, 50.5);
        System.out.println(bmi);

    }
}
