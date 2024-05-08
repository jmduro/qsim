package com.qsim.util;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aleja
 * @param <T>
 */
public abstract class TableBuilder<T> {

    public JTable crearTable(List<T> entities) {
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        addColumns(modelo);
        addRows(modelo, entities);
        
        JTable tabla = new JTable(modelo);
        tabla.getTableHeader().setReorderingAllowed(false);
        
        return tabla;
    }

    protected abstract void addColumns(DefaultTableModel model);

    protected abstract void addRows(DefaultTableModel model, List<T> entities);
}
