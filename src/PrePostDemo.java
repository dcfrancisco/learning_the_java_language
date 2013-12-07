/**
 * Created by rhenning on 12/7/13.
 */
class PrePostDemo {
    public static void main(String[] args) {
        int i = 3;
        i++;
        // prints 4
        System.out.println(i);
        ++i;
        // prints 5
        System.out.println(i);
        // prints 6
        System.out.println(++i);
        // still prints 6 since postfix incr evaluates to original value
        System.out.println(i++);
        // now prints 7
        System.out.println(i);
    }
}
