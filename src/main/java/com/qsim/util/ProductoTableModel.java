package com.qsim.util;

import com.qsim.model.Producto;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aleja
 */
public class ProductoTableModel extends TableBuilder<Producto> {

    @Override
    protected void addColumns(DefaultTableModel model) {
        model.addColumn("No.");
        model.addColumn("Nombre");
        model.addColumn("Precio Compra");
        model.addColumn("Precio Venta");
    }

    @Override
    protected void addRows(DefaultTableModel model, List<Producto> entities) {
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
