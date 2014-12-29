/**
 * Created by blin on 2014/12/25.
 */

import java.awt.*;
import javax.swing.*;

public class TestJava extends JApplet {
    public void paint(Graphics g) {
        try {
            g.drawString("百聞不如一見！", 100, 50);
        } catch (Exception e) {
            e.printStackTrace();
        }
        g.drawString("百聞不如見！", 200, 150);
    }

}
