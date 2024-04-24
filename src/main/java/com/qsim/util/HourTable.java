package com.qsim.util;

import com.qsim.model.Hora;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aleja
 */
public class HourTable implements Table<Hora> {

    @Override
    public DefaultTableModel createTableModel(List<Hora> hours) {
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

    private void addRows(DefaultTableModel model, List<Hora> hours) {
        int id = 1;
        for (var hour : hours) {
            model.addRow(new Object[]{
                id,
                hour.tasaLlegadas(),
                hour.tasaServicio(),
                hour.clientes().size()
            });
            id++;
        }
    }
}
