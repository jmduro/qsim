package com.qsim.model;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JTextField;

/**
 *
 * @author aleja
 */
public class NumericFieldParser {

    private final Map<JTextField, Double> numericFieldValues;

    public NumericFieldParser() {
        this.numericFieldValues = new HashMap<>();
    }

    public Double getDoubleFrom(JTextField field) {
        return numericFieldValues.getOrDefault(field, null);
    }

    public Integer getIntegerFrom(JTextField field) {
        Double d = getDoubleFrom(field);
        if (d != null) {
            return d.intValue();
        }
        return null;
    }

    public void parseNumbersFromTextFields(JTextField... textFields) {
        for (JTextField textField : textFields) {
            Double number = parseNumberFromText(textField.getText());
            numericFieldValues.put(textField, number);
        }
    }

    private Double parseNumberFromText(String text) {
        try {
            return Double.valueOf(text);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
