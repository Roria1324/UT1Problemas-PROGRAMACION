import java.util.Scanner;
import java.util.Arrays;
        
public class Java2Programa {

    public static void main(String[] args) {
/**
        Scanner input = new Scanner(System.in);
        
        System.out.println("Numero de la tabla: ");
        
        int tabla = input.nextInt();
        
        int multiplicador = 0;

        while (multiplicador < 10){
            
            int total = tabla * ++multiplicador;
           
            System.out.printf("%d * %d = %d \n", tabla, multiplicador, total );
            * */
        
        int[] array = {1,98,5,3,54,7,69,24,22,35};
        
        for ( int j = 1; j < array.length; j++ ){
            int key = array[j];
            int i = j - 1;
            while (i >= 0 && array[i] > key){  
                array[i+1] = array[i];
                i -= 1;
            }
            array[i+1] = key;
            System.out.println(Arrays.toString(array));
        }      
        
    }
}

