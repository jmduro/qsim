package com.qsim.util;

import com.qsim.model.Cliente;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aleja
 */
public class CustomerTable implements Table<Cliente>{

    @Override
    public DefaultTableModel createTableModel(List<Cliente> entities) {
        DefaultTableModel model = new DefaultTableModel();
        addColumns(model);
        addRows(model, entities);
        return model;
    }

    private void addColumns(DefaultTableModel model) {
        model.addColumn("No.");
        model.addColumn("Total Productos");
        model.addColumn("Total Precio Compra");
        model.addColumn("Total Precio Venta");
    }

    private void addRows(DefaultTableModel model, List<Cliente> entities) {
        int id = 1;
        for (Cliente customer : entities) {
            model.addRow(new Object[]{
                id,
                customer.productos().size(),
                customer.productos().stream().mapToDouble(product -> product.precioCompra()).reduce(Double::sum).getAsDouble(),
                customer.productos().stream().mapToDouble(product -> product.precioVenta()).reduce(Double::sum).getAsDouble()
            });
            id++;
        }
    }
    
}
