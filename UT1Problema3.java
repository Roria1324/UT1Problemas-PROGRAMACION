import java.util.Scanner;

public class UT1Problema3 {
    
    public static void main(String[] args) {
        
        //Asignamos valores
        double km, milla, min, seg, hora, vcmd, ritmo;
        
        km = 14;
        milla = km * 0.621371;
        min = 45;
        seg = 30;
        //Hacemos las conversiones necesarias para luego sacar los datos que se piden
        hora =(min / 60) + (seg / 3600);
        min = hora * 60;
        vcmd = milla / hora;
        ritmo = min / milla;
        
        System.out.printf("Distancia: %.2f km (%.2f millas)\n",km,milla);
        System.out.printf("Tiempo: %.0f minutos %.0f segundos (%.2f horas)\n",min,seg,hora);
        System.out.printf("Velocidad media: %.2f mph\n",vcmd);
        System.out.printf("Ritmo: %.2f min/milla\n", ritmo);
        
        //Importamos Scanner para poder asignar por teclado varios datos 
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduzaca los KM: ");
        km = input.nextDouble();
        
        milla = km * 0.621371;
        
        System.out.print("Introduzaca los MIN: ");
        min = input.nextDouble();
        
        System.out.print("Introduzaca los Seg: ");
        seg = input.nextDouble();
        
        //Hacemos las conversiones necesarias para luego sacar los datos que se piden
        hora =(min / 60) + (seg / 3600);
        min = hora * 60;
        vcmd = milla / hora;
        ritmo = min / milla;
        
        System.out.printf("Distancia: %.2f km (%.2f millas)\n",km,milla);
        System.out.printf("Tiempo: %.0f minutos %.0f segundos (%.2f horas)\n",min,seg,hora);
        System.out.printf("Velocidad media: %.2f mph\n",vcmd);
        System.out.printf("Ritmo: %.2f min/milla\n", ritmo);
        
    }
}
