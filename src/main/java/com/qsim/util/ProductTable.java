package com.qsim.util;

import com.qsim.model.Producto;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aleja
 */
public class ProductTable implements Table<Producto> {

    @Override
    public DefaultTableModel createTableModel(List<Producto> entities) {
        DefaultTableModel model = new DefaultTableModel();
        addColumns(model);
        addRows(model, entities);
        return model;
    }

    private void addColumns(DefaultTableModel model) {
        model.addColumn("No.");
        model.addColumn("Nombre");
        model.addColumn("Precio Compra");
        model.addColumn("Precio Venta");
    }

    private void addRows(DefaultTableModel model, List<Producto> entities) {
        int id = 1;
        for (Producto product : entities) {
            model.addRow(new Object[]{
                id,
                product.nombre(),
                product.precioCompra(),
                product.precioVenta()
            });
            id++;
        }
    }
    
}
