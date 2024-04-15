package com.qsim.model;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JTextField;

/**
 *
 * @author aleja
 */
public class FieldAdapter {

    private final Map<JTextField, Integer> fieldNumbers;

    public FieldAdapter() {
        this.fieldNumbers = new HashMap<>();
    }

    public Map<JTextField, Integer> getFieldNumbers() {
        return fieldNumbers;
    }

    public void getNumbersFromTextFields(JTextField... textFields) {
        for (JTextField textField : textFields) {
            Integer number = getNumberFromText(textField.getText());
            fieldNumbers.put(textField, number);
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
