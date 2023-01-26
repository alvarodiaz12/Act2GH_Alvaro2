import java.util.Scanner;

public class Array {

  public static void main(String[] args) {
    
    final int LONGITUDNUMEROS = 30;
    final int NUMEROMINIMO = 1;
    final int NUMEROMAXIMO= 10;
   
    Scanner sc = new Scanner(System.in);
    
    System.out.println("NÚMEROS");
    
    int[] numeros = new int[LONGITUDNUMEROS]; 
    for (int i = 0; i < LONGITUDNUMEROS; i++) {
      numeros[i] = (int)(Math.random() * (NUMEROMAXIMO - NUMEROMINIMO + 1) + NUMEROMINIMO );
    }
    System.out.println("ARRAY ORIGINAL ");
    for (int i = 0; i < LONGITUDNUMEROS; i++) {
      System.out.print(numeros[i] + " ");
    }
    System.out.println();
    
    int[] ar = {1, 2, 2, 1, 1, 3, 5,1, 2};
    int contador=0;
    int aux=ar[0];
    for (int i = 0; i < ar.length; i++) {
        if(aux == ar[i]){
            contador++;
        } else {
            System.out.print(contador + ",");
            contador=1;
            aux=ar[i];
        }
    }
    System.out.print(contador );
    
    System.out.println("Fin del programa");
  }  
}