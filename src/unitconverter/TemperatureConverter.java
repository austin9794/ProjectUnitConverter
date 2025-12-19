package unitconverter;

public class TemperatureConverter implements Converter {

    @Override
    public double convert(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    @Override
    public String getDescription() {
        return "Celsius to Fahrenheit";
    }
}
