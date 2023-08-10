package converter;

import javax.swing.JOptionPane;

class DistanceConverter {

    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }

    public static void distanceConversion() {
        String[] distanceOptions = {
            "Convertir de Millas a Kilómetros",
            "Convertir de Kilómetros a Millas"
        };

        int distanceChoice = JOptionPane.showOptionDialog(
            null,
            "Seleccione una opción de conversión:",
            "Conversor de Distancias",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE,
            null,
            distanceOptions,
            distanceOptions[0]
        );

        if (distanceChoice < 0) {
            return;
        }

        double distance;
        do {
            String inputDistance = JOptionPane.showInputDialog(null, "Ingrese la distancia:", "Conversor de Distancias", JOptionPane.QUESTION_MESSAGE);
            if (inputDistance == null) {
                return;
            }
            try {
                distance = Double.parseDouble(inputDistance);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese una distancia válida.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (true);

        double result;
        String resultUnit;
        if (distanceChoice == 0) {
            result = milesToKilometers(distance);
            resultUnit = "km";
        } else {
            result = kilometersToMiles(distance);
            resultUnit = "mi";
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