import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main{
    public static void main(String[] args) {
        Frame frame = new Frame("Canvas");
        UlamSpiral ulam_spiral = new UlamSpiral(1000, 1000, 1000, 25, Color.WHITE, false, true);

        setup(frame, ulam_spiral);
    }

    public static void setup(Frame f, UlamSpiral ulam_spiral){
        f.add(ulam_spiral);
        f.pack();
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        //To be able to close the window
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
                System.exit(0);
            }
        }
        );
    }
}