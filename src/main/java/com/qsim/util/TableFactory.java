package com.qsim.util;

import com.qsim.model.Cliente;
import com.qsim.model.Hora;
import com.qsim.model.Producto;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author aleja
 */
public abstract class TableFactory {
    
    public static JTable crearProductoTable(List<Producto> productos) {
        return new ProductoTableModel().crearTable(productos);
    }
    
    public static JTable crearClienteTable(List<Cliente> clientes) {
        return new ClienteTableModel().crearTable(clientes);
    }
    
    public static JTable crearHoraTable(List<Hora> horas) {
        return new HoraTableModel().crearTable(horas);
    }
}
