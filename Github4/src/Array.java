import java.util.Scanner;

public class Array {

  public static void main(String[] args) {
    
    final int LONGITUDNUMEROS = 20;
    final int NUMEROMINIMO = 1;
    final int NUMEROMAXIMO= 10;
   
    int[] numeros = new int[LONGITUDNUMEROS]; 
    for (int i = 0; i < LONGITUDNUMEROS; i++) {
      numeros[i] = (int)(Math.random() * (NUMEROMAXIMO - NUMEROMINIMO + 1) + NUMEROMINIMO );
    }

  }  
}