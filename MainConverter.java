package converter;

import javax.swing.JOptionPane;

public class MainConverter {

    public static void main(String[] args) {
        while (true) {
            String[] mainOptions = {
                "Conversor de Divisas",
                "Conversor de Temperaturas",
                "Conversor de Distancias",
                "Salir"
            };

            int mainChoice = JOptionPane.showOptionDialog(
                null,
                "Seleccione una opción:",
                "Conversores",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                mainOptions,
                mainOptions[0]
            );

            if (mainChoice == 3) {
                JOptionPane.showMessageDialog(null, "Programa Terminado", "Fin", JOptionPane.INFORMATION_MESSAGE);
                break;
            }

            switch (mainChoice) {
                case 0:
                    CurrencyConverter.currencyConversion();
                    break;
                case 1:
                    TemperatureConverter.temperatureConversion();
                    break;
                case 2:
                    DistanceConverter.distanceConversion();
                    break;
            }
        }
    }
}


