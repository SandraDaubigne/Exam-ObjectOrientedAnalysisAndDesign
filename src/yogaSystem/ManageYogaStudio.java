package yogaSystem;

import java.util.ArrayList;

public class ManageYogaStudio {

    //SIngleton

    ArrayList<YogaStudio> studios = new ArrayList<>();

    public void addYogaStudio(String name, String address, String webaddress, String thumnail, String text, YogaClass yogaClass, int phone){
        YogaStudio yogaStudio = new YogaStudio(name, address, webaddress, thumnail, text, yogaClass, phone);

        studios.add(yogaStudio);
    }

    /*
    public YogaStudio searchYogaClass(Skicka med det värdet in som ska letas efter i objektet){

     //Ta in arraylistan här och loopa igenom den

        return YogaStudio;
    }
    */

    public void deleteYogastudio(YogaStudio yogastudio){
        studios.remove(yogastudio);
    }


}
