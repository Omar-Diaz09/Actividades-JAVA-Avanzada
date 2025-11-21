package principal;

import logica.GestionInventario;
import modelos.ElementoInventario;

public class Main {
    public static void main(String[] args) {
        GestionInventario gestor = new GestionInventario();

        // Agregar elementos de ejemplo
        ElementoInventario broca1 = new ElementoInventario("B001", "Broca HSS 10mm", "Broca", "Broca para metal", 50, "piezas", "Torno, Taladro", "");
        ElementoInventario aflojatodo = new ElementoInventario("A001", "Aflojatodo WD", "Preventivo", "Spray lubricante y aflojatodo", 20, "latas", "General", "");
        ElementoInventario grasaRoja = new ElementoInventario("G001", "Grasa de Litio Roja", "Grasa", "Grasa de alta temperatura", 15, "kg", "Torno, Perfiladora", "Roja");

        gestor.agregarElemento(broca1);
        gestor.agregarElemento(aflojatodo);
        gestor.agregarElemento(grasaRoja);

        // Listar inventario
        gestor.listarInventario();

        // Actualizar stock
        gestor.actualizarStock("B001", -5); // Salida de 5 brocas
        gestor.actualizarStock("G001", 10); // Entrada de 10 kg de grasa

        // Listar inventario actualizado
        gestor.listarInventario();
    }
}
