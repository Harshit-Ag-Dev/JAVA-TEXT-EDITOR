
package jeditor;

import java.awt.EventQueue;

/**
 *
 * @author Harshit Agarwal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }
}
