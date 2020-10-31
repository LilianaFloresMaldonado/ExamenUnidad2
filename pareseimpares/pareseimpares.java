package pareseimpares;

import java.util.Scanner;


public class PareseImpares {
 public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        int arreglo[]= new int[10];
        int conteo_pares=0, conteo_impares=0;
        System.out.println("Llenar el arreglo:");
        for(int i=0;i<10;i++){
            System.out.println((i+1)+"Digite un numero");
            arreglo[i]=leer.nextInt();
            if(arreglo[i]%2==0){
                conteo_pares++;
            }
            else{
                 impar[conteo_impares]=arreglo[i];
                 conteo_impares++;
            }
        }
        System.out.println("Arreglo pares");
        for(int i=0;i<conteo_pares;i++){
            System.out.println(par[i]+"-");
        }
         System.out.println("Arreglo pares");
        for(int i=0;i<conteo_impares;i++){
            System.out.println(impar[i]+"-");
        
    }
    
}
