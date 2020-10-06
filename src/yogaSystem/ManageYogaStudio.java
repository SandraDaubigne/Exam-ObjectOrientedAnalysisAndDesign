package yogaSystem;

import java.util.ArrayList;

public class ManageYogaStudio {

    private static ManageYogaStudio instance = new ManageYogaStudio();

    private ManageYogaStudio() {
    }

    public static ManageYogaStudio getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton");
    }


    ArrayList<YogaStudio> studios = new ArrayList<>();

    public void addYogaStudio(String name, String address, String webaddress, String thumnail, String text, YogaClass yogaClass, int phone) {
        YogaStudio yogaStudio = new YogaStudio(name, address, webaddress, thumnail, text, yogaClass, phone);

        studios.add(yogaStudio);
    }

    public void printStudioList() {
        for (int i = 0; i < studios.size(); i++) {
            System.out.println(studios.get(i));
            System.out.println("\n");
        }
    }


    public void search(ArrayList<YogaStudio> list, YogaClass yogaClass) {

        ArrayList<YogaStudio> searchresult = new ArrayList<>();

        for(YogaStudio studio : list){
            if(){}
        }

        System.out.println("Du har nu valt dessa klasser: " + yogaClass + "\nDessa är resultaten: \n");





    }

}
