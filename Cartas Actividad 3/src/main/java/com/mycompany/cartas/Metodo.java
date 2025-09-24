
package com.mycompany.cartas;

import com.mycompany.cartas.Cartas.main.Card;
import com.mycompany.cartas.Cartas.main.Card;

public class Metodo {
    public static void main(String[] args) {
       
        Deck myDeck = new Deck();

        // 2. Crear instancias de Card (Cartas)
        Card card1 = new Card("Corazones", "As");
        Card card2 = new Card("Diamantes", "Rey");
        Card card3 = new Card("Picas", "10");

        // 3. "Unir" las cartas al Deck usando el método addCard
        myDeck.addCard(card1);
        myDeck.addCard(card2);
        myDeck.addCard(card3);

        // Opcional: Mostrar el estado del mazo
        System.out.println("Número de cartas en el mazo: " + myDeck.getCardCount());

        // Opcional: Repartir y mostrar una carta
        Card dealtCard = myDeck.dealCard();
        if (dealtCard != null) {
            System.out.println("Carta repartida: " + dealtCard);
        }
        System.out.println("Número de cartas restantes: " + myDeck.getCardCount());
    }
}
    

