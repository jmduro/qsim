package com.qsim.util;

import com.qsim.model.Hour;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aleja
 */
public class HourTable implements Table<Hour> {

    @Override
    public DefaultTableModel createTableModel(List<Hour> hours) {
        DefaultTableModel model = new DefaultTableModel();
        addColumns(model);
        addRows(model, hours);
        return model;
    }

    private void addColumns(DefaultTableModel model) {
        model.addColumn("No.");
        model.addColumn("Tasa Llegadas");
        model.addColumn("Tasa Servicio");
        model.addColumn("Total Clientes");
    }

    private void addRows(DefaultTableModel model, List<Hour> hours) {
        for (var hour : hours) {
            model.addRow(new Object[]{
                hour.id(),
                hour.tasaLlegadas(),
                hour.tasaServicio(),
                hour.clientes().size()
            });
        }
    }
}
