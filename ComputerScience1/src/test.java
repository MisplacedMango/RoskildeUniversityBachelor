import java.util.*;

public class test {
    public test() {
        ArrayList<Integer> myArray = new ArrayList<>();

        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        myArray.add(5);
        myArray.add(6);
        myArray.add(7);
        myArray.add(8);
        myArray.add(9);
        myArray.add(10);
        int i = 1;
        while (i > 0 && i < 11) {
            for (i = 1; i < 11; i++) {
                System.out.println(myArray);
            }
        }

    }
}