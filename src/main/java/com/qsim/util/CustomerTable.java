package com.qsim.util;

import com.qsim.model.Customer;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aleja
 */
public class CustomerTable implements Table<Customer>{

    @Override
    public DefaultTableModel createTableModel(List<Customer> entities) {
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

    private void addRows(DefaultTableModel model, List<Customer> entities) {
        int id = 1;
        for (Customer customer : entities) {
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
