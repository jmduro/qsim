package com.qsim.view;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JDialog;

/**
 *
 * @author aleja
 */
public class CustomDialog extends JDialog {

    public CustomDialog() {
        super();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                FormPrincipal.stack--;
            }
        });
    }
}
