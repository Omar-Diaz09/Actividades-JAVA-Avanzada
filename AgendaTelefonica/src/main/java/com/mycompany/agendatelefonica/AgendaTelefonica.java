/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agendatelefonica;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class AgendaTelefonica {
private static final String NOMBRE_ARCHIVO = "agenda.csv";

    public static void main(String[] args) {
        AddressBook agenda = new AddressBook();
        agenda.load(NOMBRE_ARCHIVO); // Carga la agenda al iniciar
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    agenda.list();
                    break;
                case "2":
                    System.out.print("Ingrese el número de teléfono: ");
                    String numeroCrear = scanner.nextLine();
                    System.out.print("Ingrese el nombre del contacto: ");
                    String nombreCrear = scanner.nextLine();
                    agenda.create(numeroCrear, nombreCrear);
                    break;
                case "3":
                    System.out.print("Ingrese el número de teléfono a eliminar: ");
                    String numeroEliminar = scanner.nextLine();
                    agenda.delete(numeroEliminar);
                    break;
                case "4":
                    System.out.print("Ingrese el número de teléfono a actualizar: ");
                    String numeroActualizar = scanner.nextLine();
                    System.out.print("Ingrese el nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    agenda.update(numeroActualizar, nuevoNombre);
                    break;
                case "5":
                    agenda.save(NOMBRE_ARCHIVO); // Guarda los cambios al salir
                    System.out.println("Saliendo de la aplicación...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
            System.out.println(); // Salto de línea para mejor legibilidad
        }
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("--- Menú de Agenda Telefónica ---");
        System.out.println("1. Listar contactos");
        System.out.println("2. Crear nuevo contacto");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Actualizar contacto (Extra)");
        System.out.println("5. Salir");
    }
   
}
