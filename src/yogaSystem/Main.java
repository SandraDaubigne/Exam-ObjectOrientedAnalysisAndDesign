package yogaSystem;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


ManageYogaStudio manageYogaStudio = new ManageYogaStudio();

        System.out.println("Lägg till Yogastudio: ");
        manageYogaStudio.addYogaStudio("Annas Lycka", "Hemvägen 2", "www.hemma.se",
        "Bild", "Hejsan", YogaClass.BIKRAMYOGA, 0730);

        System.out.println(YogaClass.BIKRAMYOGA);

        System.out.println("Hej är du admin eller kund? \n1. Logga in som  Admin. \n2. Logga in som Kund");
        Scanner scan = new Scanner(System.in);
        int check = scan.nextInt();

        switch(check){
            case 1:
                System.out.println("Du är inloggad som Admin");
                break;

            case 2:
                System.out.println("Du är inloggad som Kund");
                break;
        }


        //Swich(Hela menyn)
        //1 Admin
            //Swich (Admin meny)
            //Lägg till studio
            //Ta bort studio
            // Redigera studio
        //2 User
            //Swich(User meny)
            //1. Hatha
            //2. Bikram
            //3 .Hotyoga
            // search(skicka med den variabel från enum som ska sökas upp){}
        // }

    }

}
