public class TemperatureRunner {

    private double fahrenheit;

    public void setFahrenheit(double fahren) {

        fahrenheit = fahren;
    }

    public double CalCelsius() {

        double celsius = 0.0;
        celsius = (fahrenheit - 32)*5/9;
        return celsius;
    }

    public void print() {
        System.out.println(CalCelsius());
    }
}
