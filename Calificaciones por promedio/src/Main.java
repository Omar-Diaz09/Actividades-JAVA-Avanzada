//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class Main 
{

    
    public static void main(String[] args)
    {

   Scanner entrada = new Scanner (System.in);

   int calif1;
   int calif2;
   int calif3;
   int calif4;
   int calif5;
   int promedio;

   System.out.println("Dame la primera calificacion del alumno");
   calif1 = entrada.nextInt();
   System.out.println("Dame la segundo calificacion del alumno");
   calif2 = entrada.nextInt();
   System.out.println("Dame la tercera calificacion del alumno");
   calif3 = entrada.nextInt();
   System.out.println("Dame la cuarta calificacion del alumno");
   calif4 = entrada.nextInt();
   System.out.println("Dame la quinta calificacion del alumno");
   calif5 = entrada.nextInt();

   promedio = (calif1 + calif2 + calif3 + calif4 + calif5)/5;

   System.out.println("El promedio del alumno es" + " " + promedio);

    }

}