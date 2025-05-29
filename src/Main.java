import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*String pozdrav = "Ahoj svete";

        //Toto je pro vypsani textu
        System.out.println(pozdrav);
        System.out.println(pozdrav);
        System.out.println(pozdrav);
        System.out.println(pozdrav);*/

        /*int prvniCislo = 10;
        int druheCislo = 5;

        System.out.println(prvniCislo + druheCislo);
        System.out.println(prvniCislo - druheCislo);
        System.out.println(prvniCislo * druheCislo);
        System.out.println(prvniCislo / druheCislo);

        String pozdrav2 = "Ahoj";
        String jmeno = "Honza";

        System.out.println(pozdrav2 + " " + jmeno);*/

        //Uloha: Uzivatel napise sve jmeno a program ho pozdravi
        /*String pozdrav3 = "Ahoj, ";
        Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadej sve jmeno:");
        String jmeno = mujScanner.nextLine();
        System.out.println(pozdrav3 + jmeno);*/

        //Kalkulacka
        /*float prvniCislo;
        float druheCislo;
        Scanner mujScanner = new Scanner(System.in);

        System.out.println("Zadej prvni cislo:");
        prvniCislo = mujScanner.nextFloat();

        System.out.println("Zadej druhe cislo:");
        druheCislo = mujScanner.nextFloat();

        System.out.println(prvniCislo + druheCislo);
        System.out.println(prvniCislo - druheCislo);
        System.out.println(prvniCislo * druheCislo);
        System.out.println(prvniCislo / druheCislo);*/

        /*double a = 0.1;
        double b = 0.2;

        double soucet = a + b;
        System.out.println(soucet);*/

        //int NEJAKE_CISLO = 5;

        //Uzivatel zada slovo, ve vypisu budou vsechna pismena velke
        /*Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadej sve slovo:");
        String slovo = mujScanner.nextLine();

        System.out.println(slovo);*/
        //Prevod typu
        //int prevedeneCislo = Integer.parseInt("5");

        int prvniCislo = 8;
        int druheCislo = 3;
        //prvniCislo = prvniCislo + druheCislo;
        //prvniCislo += druheCislo;

        /*System.out.println(prvniCislo + druheCislo);
        System.out.println(prvniCislo - druheCislo);
        System.out.println(prvniCislo % druheCislo);
        System.out.println(prvniCislo <= druheCislo);*/

        /*int cisloPorovnani = 5;
        System.out.println(cisloPorovnani > 0  && cisloPorovnani <= 8);
        System.out.println(cisloPorovnani > 8 || cisloPorovnani < 0);
        System.out.println(!(cisloPorovnani > 8 || cisloPorovnani < 0));
        System.out.println(!(false));*/

        //Feature pro kontolu veku, bude li mít uzivatel 18 a vice vypis do kozole vitej v aplikaci
        int vek;
        Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadej svuj vek:");
        vek = mujScanner.nextInt();

        if (vek >= 18) {
            System.out.println("Uzivatel je dospely");
        }

    }
    }