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
                System.out.println("Du är inloggad som Kund vad vill du söka för kurs?" +
                    "\n1. HathaYoga" +
                    "\n2. BikramYoga" +
                    "\n3. Hot Yoga" +
                    "\n4. Gongbad" +
                    "\n5. Yin Yoga");
                int search = scan.nextInt();
                switch(search){
                    case 1:
                        System.out.println("Du har valt HathaYoga");
                        break;
                    case 2:
                        System.out.println("Du har valt BikramYoga");
                        break;
                    case 3:
                        System.out.println("Du har valt Hot Yoga");
                        break;
                    case 4:
                        System.out.println("Du har valt Gongbad");
                        break;
                    case 5:
                        System.out.println("Du har valt Yin Yoga");
                        break;
                }
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
