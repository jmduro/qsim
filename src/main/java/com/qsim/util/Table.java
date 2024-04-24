package com.qsim.util;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aleja
 * @param <T>
 */
public interface Table<T> {

    DefaultTableModel createTableModel(List<T> entities);
}
