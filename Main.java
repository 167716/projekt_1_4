import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Wybierz funkcje:");
    System.out.println("1 - potegowanie");
    System.out.println("2 - suma pierwiastków");
    System.out.println("3 - najwieksza liczba");
    System.out.println("4 - ");

    
    Scanner funkcja = new Scanner(System.in); 
    int x=funkcja.nextInt();
  
    switch(x){

    case 1:{
      System.out.println("Wybrałeś potęgowanie");
      System.out.println("Podaj a:");
      double a=funkcja.nextInt();
      System.out.println("Podaj b: ");
      double b=funkcja.nextInt();
      double c=Math.pow(a,b);
      System.out.println(a+" do potęgi "+b+" = "+c);
    }
    break;
      case 2:{
        System.out.println("Wybrałeś sumowanie pierwiastków");
        System.out.println("Podaj liczbę pod pierwiastek A: ");
        double a=funkcja.nextInt();
        System.out.println("Podaj liczbe pod pierwiastek b: ");
        double b=funkcja.nextInt();
        double suma=Math.sqrt(a)+Math.sqrt(b);
        System.out.println("Suma pierwiastków liczb "+a+" i "+b+" wynosi "+suma);
      }
        break;
      case 3:{
        
      }
        break;
      case 4:{
        
      }
        break;
    }
  }
}