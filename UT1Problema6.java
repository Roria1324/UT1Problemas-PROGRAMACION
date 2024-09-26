//@autor Alexandro Stefan Dezso Florea

import java.util.Scanner;

public class UT1Problema6 {
    public static void main(String[] args) {
        //Aignación de datos fijos
        final int uncent, doscent, cincocent, diezcent, veintecent, cincuentacent;
        
        uncent = 1;
        doscent = 2;
        cincocent = 5;
        diezcent = 10;
        veintecent = 20;
        cincuentacent = 50;
        //Importación de Scanner para asignar valores desde teclado
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduce el precio de la bebida que quieres: ");
        
        int precio = input.nextInt();
        System.out.print("\nDinero que introduces en la máquina en céntimos (max 100): \n");
        int moneda = input.nextInt();
        //Calculo del resto 
        int cambio = moneda - precio;
        System.out.printf("Tu cambio es: %d céntimos\n", cambio);
        
        //Comprobación a traves de divisiones y restos (modulos) para saber que monedas se necesitan para dar el cambio bien
        int mon50 = cambio / cincuentacent;
        cambio = cambio % cincuentacent;
        int mon20 = cambio / veintecent;
        cambio = cambio % veintecent;
        int mon10 = cambio / diezcent;
        cambio = cambio % diezcent;
        int mon5 = cambio / cincocent;
        cambio = cambio % cincocent;
        int mon2 = cambio / doscent;
        cambio = cambio % doscent;
        int mon1 = cambio / uncent;
        cambio = cambio % uncent;
        
        //Print de cada moneda apareciendo que monedas se necesitan para dar el cambio bien.
        System.out.printf("\nLa cantidad de monedas de 50 cent es: %d\n",mon50);
        System.out.printf("La cantidad de monedas de 20 cent es: %d\n",mon20);
        System.out.printf("La cantidad de monedas de 10 cent es: %d\n",mon10);
        System.out.printf("La cantidad de monedas de 5 cent es: %d\n",mon5);
        System.out.printf("La cantidad de monedas de 2 cent es: %d\n",mon2);
        System.out.printf("La cantidad de monedas de 1 cent es: %d\n",mon1);
    }
}
