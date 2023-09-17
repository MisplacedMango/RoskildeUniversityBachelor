import java.util.ArrayList;

public class arrayListIntegerTenToOne {
    arrayListIntegerTenToOne() {
        ArrayList<Integer> myArraylist = new ArrayList<>();
        int l;
        for (l = 1; l <= 11; l++) ;
        int length = l;
        while (myArraylist.size() <=11 && myArraylist.size() >0) {
            myArraylist.add(length);

            for (int i = 10; i >= 1; i--) {
                while (i != 0) {
                    System.out.println(myArraylist.get(i));
                }
            }
        }
    }
}
