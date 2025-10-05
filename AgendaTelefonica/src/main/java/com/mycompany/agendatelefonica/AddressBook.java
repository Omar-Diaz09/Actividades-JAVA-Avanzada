/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendatelefonica;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Lenovo
 */
public class AddressBook {
  private Map<String, String> contactos;

    public AddressBook() {
        this.contactos = new HashMap<>();
    }

    // Carga los contactos desde un archivo CSV
    public void load(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 2) {
                    contactos.put(partes[0].trim(), partes[1].trim());
                }
            }
            System.out.println("Contactos cargados exitosamente desde " + archivo + ".");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo " + archivo + " no encontrado. Se creará uno nuevo.");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    // Guarda los contactos en un archivo CSV
    public void save(String archivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (Map.Entry<String, String> entry : contactos.entrySet()) {
                bw.write(entry.getKey() + "," + entry.getValue());
                bw.newLine();
            }
            System.out.println("Contactos guardados exitosamente en " + archivo + ".");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    // Lista todos los contactos
    public void list() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda está vacía.");
        } else {
            System.out.println("--- Contactos ---");
            for (Map.Entry<String, String> entry : contactos.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
            System.out.println("-----------------");
        }
    }

    // Crea un nuevo contacto
    public void create(String numero, String nombre) {
        if (contactos.containsKey(numero)) {
            System.out.println("Error: El número de teléfono ya existe.");
        } else {
            contactos.put(numero, nombre);
            System.out.println("Contacto agregado: " + nombre + " (" + numero + ")");
        }
    }

    // Elimina un contacto existente
    public void delete(String numero) {
        if (contactos.remove(numero) != null) {
            System.out.println("Contacto con el número " + numero + " eliminado.");
        } else {
            System.out.println("Error: No se encontró el número de teléfono.");
        }
    }

    // Actualiza el nombre de un contacto existente (funcionalidad extra)
    public void update(String numero, String nuevoNombre) {
        if (contactos.containsKey(numero)) {
            contactos.put(numero, nuevoNombre);
            System.out.println("Contacto con el número " + numero + " actualizado con el nuevo nombre: " + nuevoNombre);
        } else {
            System.out.println("Error: No se encontró el número de teléfono para actualizar.");
        }
    }   
}
