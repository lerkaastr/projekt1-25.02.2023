import java.util.Scanner;

     public class MojProgram {
        public static void main(String [] args) {
            Scanner scan = new Scanner (System.in);
            System.out.print("Jak się nazywasz?"); // za pomocą metody "print" z obiektu System.out. Następnie użytkownik zostaje poproszony o wpisanie swojego imienia
            String name = scan.nextLine(); // a wprowadzone przez niego dane zostają zapisane do zmiennej "name" za pomocą metody "nextLine" z obiektu Scanner.
            System.out.print("Ile masz lat?"); // użytkownik zostaje poproszony o wpisanie swojego wieku
            int age = scan.nextInt(); // wprowadzone przez niego dane zostają zapisane do zmiennej "age" za pomocą metody "nextInt" z obiektu Scanner.
            System.out.println("Mam lat" + age); //wyświetlenie na ekranie informacji o wieku użytkownika za pomocą metody "println" z obiektu System.out, w której łączone są tekst "Mam lat " oraz zmienna "age".

        }
    }

