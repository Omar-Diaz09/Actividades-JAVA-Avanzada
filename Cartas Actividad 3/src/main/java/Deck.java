/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;public class Deck {
  

    private final List<Card> cartas; // Atributo de tipo ArrayList del Collection Framework

    public Deck() {
        cartas = new ArrayList<>();
        inicializarMazo();
    }

    private void inicializarMazo() {
        String[] palos = {"Tréboles", "Corazones", "Picas", "Diamantes"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String palo : palos) {
            String color = (palo.equals("Tréboles") || palo.equals("Picas")) ? "Negro" : "Rojo"; // Asigna color según el palo
            for (String valor : valores) {
                cartas.add(new Card(palo, color, valor));
            }
        }
    }

    public List<Card> getCartas() {
        return cartas;
    }

    // Opcional: Método para barajar el mazo
    public void barajar() {
        Collections.shuffle(cartas);
    }

    // Opcional: Método para repartir una carta
    public Card repartirCarta() {
        if (!cartas.isEmpty()) {
            return cartas.remove(0); // Remueve la primera carta del mazo
        }
        return null; // O lanza una excepción si no hay más cartas
    }

    public static void main(String[] args) {
        Deck mazo = new Deck();

        System.out.println("Mazo inicial (52 cartas):");
        for (Card carta : mazo.getCartas()) {
            System.out.println(carta);
        }

        System.out.println("\nMazo barajado:");
        mazo.barajar();
        for (Card carta : mazo.getCartas()) {
            System.out.println(carta);
        }

        System.out.println("\nRepartiendo una carta:");
        Card cartaRepartida = mazo.repartirCarta();
        if (cartaRepartida != null) {
            System.out.println("Se repartió: " + cartaRepartida);
        }

        System.out.println("\nCartas restantes en el mazo:");
        for (Card carta : mazo.getCartas()) {
            System.out.println(carta);
        }
    }
}

