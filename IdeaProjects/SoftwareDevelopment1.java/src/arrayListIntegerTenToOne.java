import java.util.ArrayList;

public class arrayListIntegerTenToOne {
    arrayListIntegerTenToOne() {
        ArrayList<Integer> myArraylist = new ArrayList<Integer>();

        for ( int i = 10; i >= 1; i--) {
            while (i != 0) {
                System.out.println(i--);
            }
        }
    }
}

