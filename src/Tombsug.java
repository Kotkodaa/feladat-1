import java.util.Scanner;

public class Tombsug {
    public Tombsug() {
        feladat0312();
    }
    public static void feladat0312() {
        System.out.println("0312 megoldas");
        System.out.println("Rombuszba irhato kor sugara");
        //Bekérés
        //A Scanner osztály példányosítása
        Scanner scanner = new Scanner(System.in);
        System.out.print("Oldal: ");
        double side = Double.parseDouble(scanner.nextLine());
        System.out.print("Alfa szog: ");
        double alpha = Double.parseDouble(scanner.nextLine());
        scanner.close();

        Rhombus rhombus = new Rhombus();
        double radius = rhombus.calcRadius(side, alpha);
        System.out.println("Sugar: " + radius);
    }
}
