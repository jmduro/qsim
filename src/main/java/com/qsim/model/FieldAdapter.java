package com.qsim.model;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JTextField;

/**
 *
 * @author aleja
 */
public class FieldAdapter {

    public Map<Integer, Integer> fields = new HashMap<>();

    public Map<Integer, Integer> getFields() {
        return fields;
    }

    public void getNumericFromTextFields(JTextField[] textFields) {
        for (JTextField textField : textFields) {
            int hashCode = textField.hashCode();
            int number = Integer.parseInt(textField.getText());
            fields.put(hashCode, number);
        }
    }
}
