package yogaSystem;

import java.util.ArrayList;
import java.util.List;

public class ManageYogaStudio {

    private static ManageYogaStudio instance = new ManageYogaStudio();

    private ManageYogaStudio() {
    }
    public static ManageYogaStudio getInstance() {
        return instance;
    }

    ArrayList<YogaStudio> studios = new ArrayList<>();

    public void addYogaStudio(String name, String address, String webaddress, String thumnail, String text, YogaClass yogaClass, int phone) {
        YogaStudio yogaStudio = new YogaStudio(name, address, webaddress, thumnail, text, yogaClass, phone);

        studios.add(yogaStudio);
    }

    public void printStudioList() {

        System.out.println("Här är alla Studios\n");

        for (int i = 0; i < studios.size(); i++) {
            System.out.println(studios.get(i));
            System.out.println("\n");
        }
    }

    public void seeChosenClass(YogaClass yogaClass) {
        System.out.println("Du har nu valt dessa klasser: " + yogaClass);
    }

    public void search(YogaClass yogaClass){

        System.out.println("Inne i loopen");

       for (int i = 0; i < studios.size(); i++) {

            if(yogaClass == YogaClass.HATHA){
                //yogaClass.equals(YogaClass.HATHA)
                System.out.println("CHECK");
            }
            else{
                System.out.println("NOT CHECKED");
            }

        }
        //Loopa igenom arrayen och titta på varje objekt idividuellt tills vi hittar en som matchat typen som anv skickade in
        // Använd listan med Yogaklass objekten
        // Sök igenom den efter matchande attribut
        // Lägg dessa objekt i en ny lista
        // returnera och skriv ut listan
    }

}
