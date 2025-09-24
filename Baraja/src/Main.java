//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String... args) {

            int palos = (int)(Math.random()*4+1);
            String palosb = " ";

            if (palos==1){
                palosb = "picas";
            }
            if(palos==2){
                palosb = "corazones";
            }
            if (palos==3){
                palosb = "diamantes";
            }
            if (palos==4){
                palosb = "trevoles";
            }
            int numeros = (int)(Math.random()*13+1);
            String numerosb = " ";

            if (numeros == 1){
                numerosb = "AS";
            }

            if (numeros == 2){
                numerosb = "dos";
            }

            if (numeros == 3){
                numerosb = "tres";
            }

            if (numeros == 4){
                numerosb = "cuatro";
            }

            if (numeros == 5){
                numerosb = "cinco";
            }

            if (numeros == 6){
                numerosb = "seis";
            }

            if (numeros == 7){
                numerosb = "siete";
            }

            if (numeros == 8){
                numerosb = "ocho";
            }

            if (numeros == 9){
                numerosb = "nueve";
            }

            if (numeros == 10){
                numerosb = "diez";
            }

            if (numeros == 11){
                numerosb = "Jota";
            }

            if (numeros == 12){
                numerosb = "Reyna";
            }

            if (numeros == 13){
                numerosb = "Rey";
            }

System.out.println( numeros +"de"+ palosb );
        }


    }

