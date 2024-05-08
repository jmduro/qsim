package com.qsim.util;

import com.qsim.model.Hora;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aleja
 */
public class HoraTableModel extends TableBuilder<Hora> {

    @Override
    protected void addColumns(DefaultTableModel model) {
        model.addColumn("No.");
        model.addColumn("Tasa Llegadas");
        model.addColumn("Tasa Servicio");
        model.addColumn("Total Clientes");
    }

    @Override
    protected void addRows(DefaultTableModel model, List<Hora> entities) {
        for (var hour : entities) {
            model.addRow(new Object[]{
                hour.id(),
                hour.tasaLlegadas(),
                hour.tasaServicio(),
                hour.clientes().size()
            });
        }
    }
}
