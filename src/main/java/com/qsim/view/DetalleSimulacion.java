package com.qsim.view;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aleja
 */
public class DetalleSimulacion extends javax.swing.JPanel {

    /**
     * Creates new form DetalleHora
     */
    public DetalleSimulacion() {
        initComponents();
        addListener();
    }

    public void setModel(DefaultTableModel model) {
        table.setModel(model);
        repaint();
    }

    private void addListener() {
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = table.getSelectedRow();
                    if (selectedRow != -1) {
                        showDetailDialog((int) table.getModel().getValueAt(selectedRow, 0)); // Pasar el ID del registro seleccionado
                    }
                }
            }
        });
    }
    
    private void showDetailDialog(int selectedID) {
        // Aquí deberías cargar los detalles del registro seleccionado y mostrarlos en una nueva JTable dentro de un JDialog
        JDialog detailDialog = new JDialog(this, "Detalle del Registro", true);
        DefaultTableModel detailTableModel = new DefaultTableModel();
        detailTableModel.addColumn("ID");
        detailTableModel.addColumn("Detalle");
        // Agregar más columnas según los detalles que desees mostrar

        // Aquí deberías cargar los detalles del registro seleccionado en detailTableModel

        JTable detailTable = new JTable(detailTableModel);
        JScrollPane scrollPane = new JScrollPane(detailTable);
        detailDialog.add(scrollPane);

        detailDialog.pack();
        detailDialog.setLocationRelativeTo(this);
        detailDialog.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(363, 384));
        setLayout(null);

        table.setModel(null);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(16, 42, 380, 350);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
