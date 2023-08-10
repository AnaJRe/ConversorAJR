package converter;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

class CurrencyConverter {

    public static double convertToCurrency(double amount, double rate) {
        return amount * rate;
    }

    public static void currencyConversion() {
        String[] currencyOptions = {
            "Balboa a Dólar", 
            "Balboa a Euro",
            "Balboa a Libra esterlina",
            "Balboa a Yen japonés",
            "Balboa a Won sur-coreano",
            "Dólar a Balboa",
            "Euro a Balboa",
            "Libra esterlina a Balboa",
            "Yen japonés a Balboa",
            "Won sur-coreano a Balboa"
        };

        //JComboBox comboBox = new JComboBox(currencyOptions);
        
        JComboBox<String> comboBox = new JComboBox<>(currencyOptions);


        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        JLabel titleLabel = new JLabel("Conversor de Divisas");
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(titleLabel);
        panel.add(comboBox);

        int result = JOptionPane.showConfirmDialog(
            null,
            panel,
            "Conversor de Divisas",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE
        );

        if (result != JOptionPane.OK_OPTION) {
            return;
        }

        int currencyChoice = comboBox.getSelectedIndex();

        double amount;
        do {
            String inputAmount = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero:", "Conversor de Divisas", JOptionPane.QUESTION_MESSAGE);
            if (inputAmount == null) {
                return;
            }
            try {
                amount = Double.parseDouble(inputAmount);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese una cantidad válida.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (true);

        double resultValue;
        double rate = (currencyChoice < 5) ? getConversionRate(currencyChoice) : 1 / getConversionRate(currencyChoice - 5);
        resultValue = convertToCurrency(amount, rate);

        String[] currencyNames = {
            "Dólar",
            "Euro",
            "Libra esterlina",
            "Yen japonés",
            "Won sur-coreano",
            "Balboa"
        };

        int targetCurrency = (currencyChoice < 5) ? currencyChoice : 5;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
  
        String resultMessage;
        if (targetCurrency == 5) {
            resultMessage = "Resultado: " + decimalFormat.format(resultValue) + " Balboa";
        } else {
            resultMessage = "Resultado: " + decimalFormat.format(resultValue) + " " + currencyNames[targetCurrency];
        }
        
        JOptionPane.showMessageDialog(null, resultMessage, "Resultado de conversión", JOptionPane.INFORMATION_MESSAGE);

        int continueOption = JOptionPane.showConfirmDialog(null, "¿Desea continuar en el Conversor de Divisas?", "Continuar", JOptionPane.YES_NO_OPTION);
        if (continueOption == JOptionPane.NO_OPTION) {
            return;  // Regresa al menú principal de opciones
        }
        currencyConversion(); // Vuelve a presentar el cuadro de opciones de conversión
    }

    private static double getConversionRate(int currencyChoice) {
        double[] rates = {
            1.0,            // Dólar
            0.910581,       // Euro
            0.789336,       // Libra esterlina
            143.43,         // Yen japonés
            1326.52         // Won sur-coreano
        };
        return rates[currencyChoice];
    }
}

