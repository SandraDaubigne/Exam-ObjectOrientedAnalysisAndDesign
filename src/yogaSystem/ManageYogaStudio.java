package yogaSystem;

import java.util.ArrayList;

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

    public ArrayList<YogaStudio> search(YogaClass yogaClass) {

        ArrayList<YogaStudio> result = new ArrayList<>();

        for (YogaStudio studio : studios) {
            YogaClass yogaClassName = (YogaClass) studio.GetYogaProperties(YogaProperties.YOGACLASS);

            if (yogaClassName == yogaClass) {
                result.add(studio);
            }
        }

        return result;
    }

}
