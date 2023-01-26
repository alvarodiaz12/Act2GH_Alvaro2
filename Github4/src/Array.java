import java.util.Scanner;

public class Array {

  public static void main(String[] args) {
    
    final int LONGITUDNUMEROS = 20;
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
  }  
}