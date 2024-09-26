//@autor Alexandro Stefan Dezso Florea

import java.util.Scanner;

public class UT2Problema2 {

    public static void main(String[] args) {
        //Asignación datos fijos
        final double nacen, mueren, inmig;
        nacen = 7;
        mueren = 13;
        inmig = 45;
        //Asignación de segundos en un año,pblación y año por el cual se empieza a operar.
        double poblacion = 312032486;
        double añoEntero= 31536000;
        int año = 2024;
        
        System.out.printf("\nPROYECCIÓN DE LA POBLACIÓN EN EEUU\n -------------------------------\nAño actual:\t%.0f personas\n", poblacion);
        //Dividimos los segundos del año entre los segundos que hemos asignado
        double nataTotal = añoEntero / nacen;
        double mortTotal = añoEntero / mueren;
        double inmiTotal = añoEntero / inmig;
        
        //Y aqui se hace el calculo incremental de natalidad total + el incremento de los años consecutivos.
        poblacion = (poblacion + nataTotal + inmiTotal) - mortTotal;
        System.out.printf("EN EL AÑO %d: %.0f personas\n",++año, poblacion);
        
        poblacion = (poblacion + nataTotal + inmiTotal) - mortTotal;
        System.out.printf("EN EL AÑO %d: %.0f personas\n",++año, poblacion);
        
        poblacion = (poblacion + nataTotal + inmiTotal) - mortTotal;
        System.out.printf("EN EL AÑO %d: %.0f personas\n",++año, poblacion);
        
        poblacion = (poblacion + nataTotal + inmiTotal) - mortTotal;
        System.out.printf("EN EL AÑO %d: %.0f personas\n",++año, poblacion);
        
        poblacion = (poblacion + nataTotal + inmiTotal) - mortTotal;
        System.out.printf("EN EL AÑO %d: %.0f personas\n",++año, poblacion);
        
        
        //Expansión de trabajo 
        
        //Aqui importamos el util Scanner para poder meter datos a través del teclado
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduzca seg de Natalidad: ");
        double nacimiento = input.nextDouble();
        
        System.out.print("Introduzca seg de Mortalidad: ");
        double muerte = input.nextDouble();
        
        System.out.print("Introduzca seg de Inmigración: ");
        double inmigrante = input.nextDouble();
        
        System.out.printf("\nPROYECCIÓN DE LA POBLACIÓN EN EEUU\n -------------------------------\nAño actual:\t%.0f personas\n", poblacion);
        
        //Dividimos los segundos del año entre los segundos que hemos asignado
        double natalidadTotal = añoEntero / nacimiento;
        double mortalidadTotal = añoEntero / muerte;
        double inmigracionTotal = añoEntero / inmigrante;
        
        //Y aqui se hace el calculo incremental de natalidad total + el incremento de los años consecutivos.
        poblacion = (poblacion + natalidadTotal + inmigracionTotal) - mortalidadTotal;
        System.out.printf("EN EL AÑO %d: %.0f personas\n",++año, poblacion);
        
        poblacion = (poblacion + natalidadTotal + inmigracionTotal) - mortalidadTotal;
        System.out.printf("EN EL AÑO %d: %.0f personas\n",++año, poblacion);
        
        poblacion = (poblacion + natalidadTotal + inmigracionTotal) - mortalidadTotal;
        System.out.printf("EN EL AÑO %d: %.0f personas\n",++año, poblacion);
        
        poblacion = (poblacion + natalidadTotal + inmigracionTotal) - mortalidadTotal;
        System.out.printf("EN EL AÑO %d: %.0f personas\n",++año, poblacion);
        
        poblacion = (poblacion + natalidadTotal + inmigracionTotal) - mortalidadTotal;
        System.out.printf("EN EL AÑO %d: %.0f personas\n",++año, poblacion);   
    }
}
