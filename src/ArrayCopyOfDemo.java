/**
 * Created by rhenning on 12/7/13.
 */
class ArrayCopyOfDemo {
    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                            'i', 'n', 'a', 't', 'e', 'd' };

        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 10);

        System.out.println(new String(copyTo));
    }
}
