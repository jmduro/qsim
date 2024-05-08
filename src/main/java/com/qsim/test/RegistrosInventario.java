package com.qsim.test;

import com.qsim.model.Producto;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aleja
 */
public class RegistrosInventario {

    public static void main(String[] args) {
        
    }
    
    private void guardarRegistros(List<Producto> productos) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("lista.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productos);
            objectOutputStream.close();
            System.out.println("La lista se ha guardado correctamente en lista.bin");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<Producto> productosPredeterminados() {
        List<Producto> products = new ArrayList<>();

        products.add(new Producto(1, "Paracetamol", 5.0, 10.0));
        products.add(new Producto(2, "Ibuprofeno", 6.0, 12.0));
        products.add(new Producto(3, "Vitamina C", 3.0, 7.0));
        products.add(new Producto(4, "Analgésico", 4.0, 8.0));
        products.add(new Producto(5, "Antibiótico", 10.0, 20.0));
        products.add(new Producto(6, "Antiinflamatorio", 7.0, 15.0));
        products.add(new Producto(7, "Jarabe para la tos", 8.0, 16.0));
        products.add(new Producto(8, "Pastillas para la gripe", 9.0, 18.0));
        products.add(new Producto(9, "Colirio", 6.0, 12.0));
        products.add(new Producto(10, "Antiséptico", 5.0, 11.0));
        products.add(new Producto(11, "Crema antiarrugas", 15.0, 30.0));
        products.add(new Producto(12, "Protector solar", 12.0, 25.0));
        products.add(new Producto(13, "Loción hidratante", 8.0, 18.0));
        products.add(new Producto(14, "Shampoo anticaspa", 7.0, 14.0));
        products.add(new Producto(15, "Desodorante", 4.0, 9.0));
        products.add(new Producto(16, "Cepillo dental", 2.0, 5.0));
        products.add(new Producto(17, "Pasta dental", 3.0, 6.0));
        products.add(new Producto(18, "Enjuague bucal", 4.0, 8.0));
        products.add(new Producto(19, "Gasas estériles", 6.0, 12.0));
        products.add(new Producto(20, "Vendas elásticas", 7.0, 15.0));
        products.add(new Producto(21, "Algodón", 3.0, 7.0));
        products.add(new Producto(22, "Termómetro digital", 10.0, 20.0));
        products.add(new Producto(23, "Tijeras quirúrgicas", 15.0, 30.0));
        products.add(new Producto(24, "Guantes desechables", 8.0, 16.0));
        products.add(new Producto(25, "Mascarillas", 5.0, 11.0));
        products.add(new Producto(26, "Jeringas", 7.0, 15.0));
        products.add(new Producto(27, "Alcohol en gel", 6.0, 13.0));
        products.add(new Producto(28, "Pomada cicatrizante", 9.0, 19.0));
        products.add(new Producto(29, "Suplemento vitamínico", 12.0, 25.0));
        products.add(new Producto(30, "Gotas oftálmicas", 8.0, 17.0));

        return products;
    }
}
