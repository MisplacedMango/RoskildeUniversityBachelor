public class arrayOneToTen {
    arrayOneToTen() {

        int[] myArray = new int[11];
        int i = 1;
        while (i < myArray.length) {
            for (i = 1; i < myArray.length; i++) {
                System.out.println(myArray[i] + i);
            }
        }
    }
}



