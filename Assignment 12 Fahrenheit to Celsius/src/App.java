public class App {
    public static void main(String[] args) throws Exception {

        TemperatureRunner cal = new TemperatureRunner();
        cal.setFahrenheit(98.6);
        cal.CalCelsius();
        cal.print();
    }

}
