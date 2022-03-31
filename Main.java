import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Wybierz funkcje:");
    System.out.println("1 - potegowanie");
    System.out.println("2 - suma pierwiastków");
    System.out.println("3 - najwieksza liczba");
    System.out.println("4 - dzielenie");

    
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
        System.out.println("Wybrałeś szukanie największej liczby");
        System.out.println("Podaj liczbe a: ");
        double a=funkcja.nextInt();
        System.out.println("podaj liczbe b: ");
        double b=funkcja.nextInt();
        System.out.println("Podaj liczbe c:");
        double c=funkcja.nextInt();

        double wieksza=Math.max(a,b);
       double najwieksza=Math.max(wieksza,c);
        System.out.println("Największa z podanych liczb to: "+najwieksza);
      }
        break;
      case 4:{
        System.out.println("Wybrałeś dzielenie");
        System.out.println("Podaj dzielną: ");
        double dzielna=funkcja.nextInt();
        System.out.println("Podaj dzielnik:");
        double dzielnik=funkcja.nextInt();
        while(dzielnik == 0){
          System.out.println("Podaj dzielnik inny niż 0");
          dzielnik=funkcja.nextInt();
        }
        double wynik=dzielna/dzielnik;
        System.out.println("Wynik dzielenia to: "+wynik);
      }
        break;
    }
  }
}