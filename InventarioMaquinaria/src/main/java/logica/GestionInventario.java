package logica;

import modelos.ElementoInventario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GestionInventario {
    // Usamos un mapa para acceso rápido por código de producto
    private final Map<String, ElementoInventario> inventario;

    public GestionInventario() {
        this.inventario = new HashMap<>();
    }

    public void agregarElemento(ElementoInventario elemento) {
        inventario.put(elemento.getCodigo(), elemento);
        System.out.println("Elemento agregado: " + elemento.getNombre());
    }

    public ElementoInventario buscarElemento(String codigo) {
        return inventario.get(codigo);
    }

    public void actualizarStock(String codigo, int cantidadAdicional) {
        ElementoInventario elemento = buscarElemento(codigo);
        if (elemento != null) {
            int nuevoStock = elemento.getCantidadStock() + cantidadAdicional;
            elemento.setCantidadStock(nuevoStock);
            System.out.println("Stock actualizado para " + elemento.getNombre() + ". Nuevo stock: " + nuevoStock);
        } else {
            System.out.println("Elemento con código " + codigo + " no encontrado.");
        }
    }

    public void listarInventario() {
        System.out.println("--- Inventario Actual ---");
        for (ElementoInventario elemento : inventario.values()) {
            System.out.println(elemento);
        }
        System.out.println("-------------------------");
    }
    
    // ... (métodos para eliminar elemento, generar reportes, etc.) ...
}
