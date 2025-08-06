package Day5;
import javax.swing.*;
import java.awt.event.*;
public class CurrencyConverter {




        public static void main(String[] args) {
            // Create frame
            JFrame frame = new JFrame("Currency Converter");
            frame.setSize(400, 250);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);

            // Input label
            JLabel label = new JLabel("Enter amount in INR:");
            label.setBounds(50, 30, 200, 30);
            frame.add(label);

            // Text field
            JTextField inrField = new JTextField();
            inrField.setBounds(200, 30, 100, 30);
            frame.add(inrField);

            // Combo box for currency options
            String[] currencies = { "USD", "EUR", "JPY" };
            JComboBox<String> currencyBox = new JComboBox<>(currencies);
            currencyBox.setBounds(50, 80, 100, 30);
            frame.add(currencyBox);

            // Convert button
            JButton convertButton = new JButton("Convert");
            convertButton.setBounds(160, 80, 100, 30);
            frame.add(convertButton);

            // Result label
            JLabel resultLabel = new JLabel("Converted amount: ");
            resultLabel.setBounds(50, 130, 300, 30);
            frame.add(resultLabel);

            // Action listener
            convertButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        double inr = Double.parseDouble(inrField.getText());
                        String currency = (String) currencyBox.getSelectedItem();
                        double result = 0;

                        switch (currency) {
                            case "USD":
                                result = inr * 0.012; // Example conversion rate
                                break;
                            case "EUR":
                                result = inr * 0.011;
                                break;
                            case "JPY":
                                result = inr * 1.74;
                                break;
                        }

                        resultLabel.setText("Converted amount: " + String.format("%.2f", result) + " " + currency);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Please enter a valid number");
                    }
                }
            });

            frame.setVisible(true);
        }


}
