package yogaSystem;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       ManageYogaStudio manageYogaStudio = ManageYogaStudio.getInstance();

        boolean user = true;

        while(user) {

        System.out.println("Hej är du admin eller kund? \n1. Logga in som  Admin. \n2. Logga in som Kund \n3. Avsluta systemet\n");
        Scanner scan = new Scanner(System.in);
        int check = scan.nextInt();

            switch(check){
                case 1:
                    System.out.println("Du är inloggad som Admin");
                    System.out.println("Du är inloggad som Admin vad vill du göra?" +
                            "\n1. Lägg till Studio" +
                            "\n2. Ta bort studio" +
                            "\n3. Redigera studio");
                    int adminChoice = scan.nextInt();
                    switch(adminChoice){
                        case 1:System.out.println("Du har valt Lägg till Studio\n");

                            manageYogaStudio.addYogaStudio("Annas Lycka", "Hemvägen 2", "www.hemma.se",
                                    "Bild", "Hejsan", YogaClass.BIKRAMYOGA, 0730);
                            manageYogaStudio.addYogaStudio("Sandras Cirkel", "herkulesgatan 2", "www.borta.se",
                                    "Bild", "Hejdå", YogaClass.HOTYOGA, 031);
                            manageYogaStudio.addYogaStudio("Nalas spa", "Redbergsgatan 2", "www.borta.se",
                                    "Bild", "Hejdå", YogaClass.YINYOGA, 033);
                            manageYogaStudio.addYogaStudio("Mattias Java Spa", "Annavägen 5", "www.borta.se",
                                    "Bild", "Hejdå", YogaClass.GONGBAD, 010);
                            manageYogaStudio.addYogaStudio("Nature Spa", "Hemmavidvägen 7", "www.borta.se",
                                    "Bild", "Hejdå", YogaClass.HATHA, 020);

                            manageYogaStudio.printStudioList();
                        break;
                        }
                    break;

                case 2:
                    System.out.println("Du är inloggad som Kund vad vill du söka för klass?" +
                            "\n1. HathaYoga" +
                            "\n2. BikramYoga" +
                            "\n3. Hot Yoga" +
                            "\n4. Gongbad" +
                            "\n5. Yin Yoga");
                    int search = scan.nextInt();
                    switch(search){
                        case 1:
                            System.out.println("Du har valt HathaYoga");
                            List<YogaStudio> list = manageYogaStudio.search(YogaClass.HATHA);
                            System.out.println(list);
                            break;
                        case 2:
                            System.out.println("Du har valt BikramYoga");
                            List<YogaStudio> list1 = manageYogaStudio.search(YogaClass.BIKRAMYOGA);
                            System.out.println(list1);
                            break;
                        case 3:
                            System.out.println("Du har valt Hot Yoga");
                            List<YogaStudio> list2 = manageYogaStudio.search(YogaClass.HOTYOGA);
                            System.out.println(list2);
                            break;
                        case 4:
                            System.out.println("Du har valt Gongbad");
                            List<YogaStudio> list3 = manageYogaStudio.search(YogaClass.GONGBAD);
                            System.out.println(list3);
                            break;
                        case 5:
                            System.out.println("Du har valt Yin Yoga");
                            List<YogaStudio> list4 = manageYogaStudio.search(YogaClass.YINYOGA);
                            System.out.println(list4);
                            break;
                    }
                break;

                case 3:
                    user = false;
                    System.out.println("Du har nu avslutat programmet");
                break;


            }


        }

    }

}
