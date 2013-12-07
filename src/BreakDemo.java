/**
 * Created by rhenning on 12/7/13.
 */
class BreakDemo {
    public static void main(String[] args) {
        int[] arrayOfInts = {
                32, 87, 3, 589,
                12, 1076, 2000,
                8, 622, 127
        };

        int searchFor = 12;

        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchFor) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("found " + searchFor + " at index " + i);
        } else {
            System.out.println(searchFor + " not found in array");
        }
    }
}
