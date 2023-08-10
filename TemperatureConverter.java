package converter;

import javax.swing.JOptionPane;

class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void temperatureConversion() {
        String[] temperatureOptions = {
            "Convertir de Celsius a Fahrenheit",
            "Convertir de Fahrenheit a Celsius"
        };

        int temperatureChoice = JOptionPane.showOptionDialog(
            null,
            "Seleccione una opción de conversión:",
            "Conversor de Temperaturas",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE,
            null,
            temperatureOptions,
            temperatureOptions[0]
        );

        if (temperatureChoice < 0) {
            return;
        }

        double temperature;
        do {
            String inputTemperature = JOptionPane.showInputDialog(null, "Ingrese la temperatura:", "Conversor de Temperaturas", JOptionPane.QUESTION_MESSAGE);
            if (inputTemperature == null) {
                return;
            }
            try {
                temperature = Double.parseDouble(inputTemperature);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese una temperatura válida.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (true);

        double result;
        String resultUnit;
        if (temperatureChoice == 0) {
            result = celsiusToFahrenheit(temperature);
            resultUnit = "°F";
        } else {
            result = fahrenheitToCelsius(temperature);
            resultUnit = "°C";
        }

        String resultMessage = "Resultado: " + result + " " + resultUnit;

        JOptionPane.showMessageDialog(null, resultMessage, "Resultado de conversión", JOptionPane.INFORMATION_MESSAGE);

        int continueOption = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Continuar", JOptionPane.YES_NO_OPTION);
        if (continueOption == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa Terminado", "Fin", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
}
