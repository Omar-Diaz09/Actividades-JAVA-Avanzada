
package com.mycompany.cartas;

public class Cartas {

    public static void main(String[] args) {
   
class Card {
    String suit; // ej: Corazones, Diamantes
    String rank; // ej: Rey, Reina, 10

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " de " + suit;
    }
}

// Definición de la clase Deck (Baraja)
   class Deck {
    java.util.ArrayList<Card> cards; // Una lista de cartas

    public Deck() {
        cards = new java.util.ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card dealCard() {
        if (!cards.isEmpty()) {
            return cards.remove(0); // Retira y devuelve la primera carta
        }
        return null; // O lanza una excepción si el mazo está vacío
    }

    public int getCardCount() {
        return cards.size();
    }
}
}
 
    }
