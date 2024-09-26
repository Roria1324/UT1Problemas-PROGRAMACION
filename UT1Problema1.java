//Alexandro Stefan Dezso Florea
import java.util.Scanner;

public class UT1Problema1 {

        public static void main(String[] args) {
            Scanner lectura = new Scanner(System.in);
            
            //Triangulo
            System.out.println("Datos para el aera del triangulo = A+B/2");
            System.out.print("Inserte altura del triangulo = ");
            double alturaTriangulo = lectura.nextDouble();
            System.out.print("Inserte base del triangulo = ");
            double baseTriangulo = lectura.nextDouble();
            double areaTriangulo  = (alturaTriangulo + baseTriangulo) / 2 ;
            double hipotenusaTri = (alturaTriangulo * alturaTriangulo) + (baseTriangulo * baseTriangulo);
            
            //Rectángulo
            System.out.println("Datos para el aera del rectángulo = A*B");
            System.out.print("Inserte altura del rectángulo = ");
            double alturaRectangulo = lectura.nextDouble();
            System.out.print("Inserte base del rectángulo = ");
            double baseRectangulo = lectura.nextDouble();
            double areaRectangulo  = alturaRectangulo * baseRectangulo;
            
            //Circulo
            System.out.println("Datos para el aera del rectángulo = πr2");
            System.out.print("Inserte diametro del circulo = ");
            double diametroCirculo = lectura.nextDouble();
            double areaTotal  = 3.14 * diametroCirculo * diametroCirculo;
            double perimetroCirculo = 2 * 3.14 * diametroCirculo;
            
             System.out.printf("\n-Total del area del Triangulo  = %.2f \n", areaTriangulo);
             System.out.printf("-Hipotenusa del Triangulo = %.2f \n",Math.sqrt(hipotenusaTri));
             
             System.out.printf("-Total del area del Rectángulo = %.2f \n", areaRectangulo);
             
             System.out.printf("-Total del area del Circulo = %.2f \n", areaTotal);
             System.out.printf("-Total del perímetro del Circulo = %.2f \n", perimetroCirculo);
    }

}