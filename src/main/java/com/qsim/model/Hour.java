package com.qsim.model;

import java.util.List;

/**
 *
 * @author aleja
 */
public record Hour(Integer id, Integer tasaLlegadas, Integer tasaServicio, List<Customer> clientes) {

}
