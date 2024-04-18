package com.qsim.model;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JTextField;

/**
 *
 * @author aleja
 */
public class NumericFieldParser {

    private final Map<JTextField, Integer> numericTextFieldValues;

    public NumericFieldParser() {
        this.numericTextFieldValues = new HashMap<>();
    }

    public Map<JTextField, Integer> getNumericTextFieldValues() {
        return numericTextFieldValues;
    }
    
    public Integer getNumberOf(JTextField textField) {
        return numericTextFieldValues.getOrDefault(textField, null);
    }

    public void getNumbersFromTextFields(JTextField... textFields) {
        for (JTextField textField : textFields) {
            Integer number = getNumberFromText(textField.getText());
            numericTextFieldValues.put(textField, number);
        }
    }

    private Integer getNumberFromText(String text) {
        try {
            return Integer.valueOf(text);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
