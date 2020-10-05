package yogaSystem;

import java.util.ArrayList;

public class ManageYogaStudio {

    //SIngleton

    ArrayList<YogaStudio> studios = new ArrayList<>();

    public void addYogaStudio(String name, String address, String webaddress, String thumnail, String text, YogaClass yogaClass, int phone){
        YogaStudio yogaStudio = new YogaStudio(name, address, webaddress, thumnail, text, yogaClass, phone);

        studios.add(yogaStudio);
    }

    public void printArray(){
        for(int i =0; i < studios.size(); i++){
            System.out.println(studios.get(i));
            System.out.println("\n");
        }
    }

}
