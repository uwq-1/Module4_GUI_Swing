//import com.sun.tools.javac.Main;

/*
    Name : Garson Hutchinson        ID: 2101012660
*/

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Currency {


    private JPanel panel;
    private JTextField txtInputValue;
    private JLabel lblInput;
    private JComboBox cbCurrencyExchange;
    private JLabel lblCurrencyType;
    private JTextField txtResultAmount;
    private JLabel lblJMDAmount;
    private JButton btnClear;
    private JButton btnConvert;


    public Currency (){


/*        cbCurrencyExchange.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String value = cbCurrencyExchange.getSelectedItem().toString();
                    //txtResultAmount.setText(String.valueOf(value));

                    double firstNumber = Double.parseDouble(txtInputValue.getText());
                    //answer = firstNumber * 164.33;
                    //txtResultAmount.setText(String.valueOf(answer));

                    if (value.equals("CAN")) {
                        answer = firstNumber * 97.50;

                    }

                    if (value.equals("US")) {
                        answer = firstNumber * 129.02;
                    }

                    if (value.equals("Euro")) {
                        answer = firstNumber * 164.33;
                    }
                    txtResultAmount.setText(String.valueOf(answer));
                }
                catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Invalid data enter",
                            "Error Message", JOptionPane.ERROR_MESSAGE);
                }

            }
        });*/
        btnConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConvertCAN();
                ConvertUS();
                ConvertEuro();
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = " ";
                txtInputValue.setText(result);
                // Set the combo box to the default value (index)
                cbCurrencyExchange.setSelectedIndex(0);
                txtResultAmount.setText(result);
            }
        });
    }



    public JTextField getTxtInputValue() {
        return txtInputValue;
    }

    public void setTxtInputValue(JTextField txtInputValue) {
        this.txtInputValue = txtInputValue;
    }

    public JLabel getLblInput() {
        return lblInput;
    }

    public void setLblInput(JLabel lblInput) {
        this.lblInput = lblInput;
    }

    public JComboBox getCbCurrencyExchange() {
        return cbCurrencyExchange;
    }

    public void setCbCurrencyExchange(JComboBox cbCurrencyExchange) {
        this.cbCurrencyExchange = cbCurrencyExchange;
    }

    public JLabel getLblCurrencyType() {
        return lblCurrencyType;
    }

    public void setLblCurrencyType(JLabel lblCurrencyType) {
        this.lblCurrencyType = lblCurrencyType;
    }

    public JTextField getTxtResultAmount() {
        return txtResultAmount;
    }

    public void setTxtResultAmount(String txtResultAmount) {
        this.txtResultAmount.setText(txtResultAmount);
    }

    public JLabel getLblJMDAmount() {
        return lblJMDAmount;
    }

    public void setLblJMDAmount(JLabel lblJMDAmount) {
        this.lblJMDAmount = lblJMDAmount;
    }

    public JButton getBtnClear() {
        return btnClear;
    }

    public void setBtnClear(JButton btnClear) {
        this.btnClear = btnClear;
    }

    public JButton getBtnConvert() {
        return btnConvert;
    }

    public void setBtnConvert(JButton btnConvert) {
        this.btnConvert = btnConvert;
    }

    public JPanel getPanel() {
        return panel;
    }


    // Define Var
    double answer = 0;

    // Methods Conversion

    public void ConvertCAN(){
        try {
            String value = cbCurrencyExchange.getSelectedItem().toString();
            //txtResultAmount.setText(String.valueOf(value));

            double firstNumber = Double.parseDouble(txtInputValue.getText());

            if (value.equals("CAN")) {
                answer = firstNumber * 97.50;

            }
            txtResultAmount.setText(String.valueOf(answer));
            /*JOptionPane.showMessageDialog(null,
                    "Your convert option is : " + answer, "Message Info",
                    JOptionPane.INFORMATION_MESSAGE);*/
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Invalid data enter",
                    "Error Message", JOptionPane.ERROR_MESSAGE);
        }

    }


    public void ConvertUS(){

        try {
            String value = cbCurrencyExchange.getSelectedItem().toString();
            //txtResultAmount.setText(String.valueOf(value));

            double firstNumber = Double.parseDouble(txtInputValue.getText());

            if (value.equals("US")) {
                answer = firstNumber * 129.02;
            }
            txtResultAmount.setText(String.valueOf(answer));
            /*JOptionPane.showMessageDialog(null,
                    "Your convert option is : " + answer, "Message Info",
                    JOptionPane.INFORMATION_MESSAGE);*/
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Invalid data enter",
                    "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ConvertEuro(){

        try {
            String value = cbCurrencyExchange.getSelectedItem().toString();
            //txtResultAmount.setText(String.valueOf(value));

            double firstNumber = Double.parseDouble(txtInputValue.getText());

            if (value.equals("Euro")) {
                answer = firstNumber * 164.33;

            }
            txtResultAmount.setText(String.valueOf(answer));
            /*JOptionPane.showMessageDialog(null,
                    "Your convert option is : " + answer, "Message Info",
                    JOptionPane.INFORMATION_MESSAGE);*/
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Invalid data enter",
                    "Error Message", JOptionPane.ERROR_MESSAGE);
        }

    }

}
