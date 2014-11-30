import com.sun.tools.doclets.internal.toolkit.util.SourceToHTMLConverter;
import org.w3c.dom.css.Rect;

import java.awt.*;

/**
 * Created by rhenning on 12/8/13.
 */
public class CreateObjectDemo {
    public static void main(String[] args) {
        // declare and create a point object and 2 rectangle objects
        //// this would work with Java7
        //// Point originOne = new Point(23, 94);
        //// Rectangle rectOne = new Rectangle(originOne, 100, 200);
        //// let's try this instead on java6:
        Point originOne = new Point(23, 94);
        Dimension dimensionOne = new Dimension(100, 200);
        Rectangle rectOne = new Rectangle(originOne, dimensionOne);
        Rectangle rectTwo = new Rectangle(50, 100);

        // display rectOne's width, height and area
        System.out.println("width of rectOne: " + rectOne.width);
        System.out.println("height of rectOne: " + rectOne.height);
        System.out.println("area of rectOne: " + rectOne.width * rectOne.height);

        // set rectTwo's position
        rectTwo.setLocation(originOne);

        // display rectTwo's position
        System.out.println("x,y pos of rectTwo: " + rectTwo.x + ',' + rectTwo.y);

        // move rectTwo and display position
        rectTwo.move(40, 72);
        System.out.println("x,y pos of rectTwo: " + rectTwo.x + ',' + rectTwo.y);
    }
}
