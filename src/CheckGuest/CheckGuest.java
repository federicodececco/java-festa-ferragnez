package CheckGuest;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] guests = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        System.out.print("Inserire nome da conntrollare");
        String toCheck = in.nextLine();
        in.close();
        //////////////////for
        boolean notBreak = true;
        int i;
        for (i = 0; i < guests.length && notBreak; i++) {
            if (guests[i].toLowerCase().trim().equals(toCheck.toLowerCase().trim())) {
                System.out.print("Il nome è presente nella lista");
                notBreak = false;
            }
        }
        if (guests.length == i) {
            System.out.print("Il nome non è presente");
        }
        /////////////////////////while
        // int i = 0;
        // boolean isPresent = false;
        // while (guests.length != i && guests[i] != toCheck) {
        // if (guests[i].toLowerCase().trim().equals(toCheck.toLowerCase().trim())){
        // isPresent=true;
        // System.out.print("Il nome è presente nella lista");

        // }
        // i++;
        // }
        // if (!isPresent) {
        // System.out.print("Il nome non è presente");
        // }
    }
}
