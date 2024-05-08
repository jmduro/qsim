package com.qsim.model;

import java.util.List;

/**
 *
 * @author aleja
 */
public record Hora(Integer id, Integer tasaLlegadas, Integer tasaServicio, List<Cliente> clientes) {

}
