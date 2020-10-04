package yogaSystem;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        ArrayList<YogaStudio> studios = new ArrayList<>();

        YogaStudio yogaStudio = new YogaStudio("Annas Lycka", "Hemvägen 2", "www.hemma.se",
                "Bild", "Hejsan", 0730);

        studios.add(yogaStudio);

        System.out.println("listan" + studios.get(0));
    }

    /*

        YogaStudio yogaStudio = new YogaStudio("Annas Lycka", "Hemvägen 2", "www.hemma.se",
                "Bild", "Hejsan", 0730);

        System.out.println(yogaStudio);
        System.out.println(yogaStudio.GetYogaProperties(YogaProperties.ADDRESS));

        System.out.println();

       yogaStudio.SetYogaProperty(YogaProperties.ADDRESS, "Hemvägen 3");

       System.out.println("Nytt värde: " + yogaStudio.GetYogaProperties(YogaProperties.ADDRESS));
    }


     */
}
