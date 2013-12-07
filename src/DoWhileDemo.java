/**
 * Created by rhenning on 12/7/13.
 */
class DoWhileDemo {
    public static void main(String[] args) {
        int count = 1;
        // block is _always_ executed _at_least_once_
        do {
            System.out.println("Count is " + count);
            count++;
        } while (count < 11);
    }
}
