//@autor Alexandro Stefan Dezso Florea

import java.util.Scanner;

public class UT1Problema4 {

    public static void main(String[] args) {
        //Asignación de datos
        final double valor1,valor2,valor3,valor4,valor5,valor6;
        
        valor1 = 3.4;
        valor2 = 50.2;
        valor3 = 2.1;
        valor4 = 0.55;
        valor5 = 44.5;
        valor6 = 5.9;
        
        System.out.println("SISTEMA DE ECUACIONES LINEALES\n----------------------- ");
        System.out.printf("[%.1fx + %.1fy = %.1f\n[%.1fx + %.1fy  = %.1f\n",valor1,valor2,valor5,valor3,valor4,valor6);
        //Caluclo 
        double valorTotalX = (valor5 * valor4 - valor2 * valor6) / (valor1 * valor4 - valor2 * valor3);
        double valorTotalY = (valor1 * valor6 - valor5 * valor3) / (valor1 * valor4 - valor2 * valor3 );
        
        double comprobanteY1 = (valor5 - valor1 * valorTotalX) / valor2 ;
        double comprobanteY2 =  (valor6 - valor3 * valorTotalX ) / valor4;

        System.out.println("\nSOLUCIÓN DE CRAMER\n----------------------");
        System.out.printf("Valor de la X = %.2f\n",valorTotalX);
        System.out.printf("Valor de la Y = %.2f\n",valorTotalY);
        
        System.out.println("\nCOMPROBACIÓN DE LA X\n----------------------");
        System.out.printf("Valor de comprobante Y = %.2f\n",comprobanteY1);
        System.out.printf("Valor de comprobante Y = %.2f\n",comprobanteY2);
        
        //Importación de util Scanner para poder meter datos a trvés de teclado
        Scanner input = new Scanner(System.in);
        
        double val1,val2,val3,val4,val5,val6;
        
        System.out.print("Primer valor: ");
        val1 = input.nextDouble();
        
        System.out.print("Segundo valor: ");
        val2 = input.nextDouble();
        
        System.out.print("Tercer valor: ");
        val3 = input.nextDouble();
        
        System.out.print("Cuarto valor: ");
        val4 = input.nextDouble();
        
        System.out.print("Quinto valor: ");
        val5 = input.nextDouble();
        
        System.out.print("Sexto valor: ");
        val6 = input.nextDouble();
        
        System.out.println("SISTEMA DE ECUACIONES LINEALES\n----------------------- ");
        System.out.printf("[%.1fx + %.1fy = %.1f\n[%.1fx + %.1fy  = %.1f\n",val1,val2,val5,val3,val4,val6);
        //Caluclo
        double valTotalX = (val5 * val4 - val2 * val6) / (val1 * val4 - val2 * val3);
        double valTotalY = (val1 * val6 - val5 * val3) / (val1 * val4 - val2 * val3 );
        
        double compY1 = (val5 - (val1 * valTotalX)) / val2 ;
        double compY2 =  (val6 - (val3 * valTotalX )) / val4;

        System.out.println("\nSOLUCIÓN DE CRAMER\n----------------------");
        System.out.printf("Valor de la X = %.2f\n",valTotalX);
        System.out.printf("Valor de la Y = %.2f\n",valTotalY);
        
        System.out.println("\nCOMPROBACIÓN DE LA X\n----------------------");
        System.out.printf("Valor de comprobante Y = %.2f\n",compY1);
        System.out.printf("Valor de comprobante Y = %.2f\n",compY2);  
    }  
}
