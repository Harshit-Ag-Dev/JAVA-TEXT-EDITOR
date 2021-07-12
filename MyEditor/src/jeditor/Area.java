
package jeditor;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.text.SimpleAttributeSet;

/**
 *
 * @author Harshit Agarwal
 */
class Area extends JScrollPane implements KeyListener {

    JTextPane jtp = new JTextPane();
    JPanel panel = new JPanel();
    SimpleAttributeSet attr = new SimpleAttributeSet();
    Font font;
    boolean saved = false;
    boolean edited;
    boolean hindi = false;
    public int caretPosition,len;

    public boolean isEdited() {
        return edited;
    }

    public void setEdited(boolean edited) {
        this.edited = edited;
    }

    public void setSaved(boolean saved) {
        this.saved = saved;
    }

    public boolean isSaved() {
        return saved;
    }

    public boolean isHindi() {
        return hindi;
    }

    public void setHindi(boolean flag) {
        hindi = flag;
    }

    public Area() {
        initComponent();
    }

    private void initComponent() {
        jtp.setBorder(new EmptyBorder(1, 1, 1, 1));//same border for synch list and jtp lines
        panel.setLayout(new BorderLayout());
        panel.add(jtp, BorderLayout.CENTER);
        setViewportView(panel);
        setFont("Aerial", Font.PLAIN, 12);
        jtp.addKeyListener(this);


    }

    public JTextPane getArea() {
        return jtp;
    }


    public void setFont(String face, int style, int size) {
        font = new Font(face, style, size);
        jtp.setFont(font);
    }

    @Override
    public Font getFont(){
        return font;
    }
    @Override
    public void keyTyped(KeyEvent e) {
    //    jtp.getHighlighter().removeAllHighlights();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //calculate caret position
        caretPosition = jtp.getCaretPosition();
        len = jtp.getText().length();
        setEdited(true);
    }


    @Override
    public void keyReleased(KeyEvent e) {
       //line count and update line numbers
        if (e.getKeyCode() != KeyEvent.VK_SPACE && e.getKeyCode() != KeyEvent.VK_LEFT && e.getKeyCode() != KeyEvent.VK_RIGHT && e.getKeyCode() != KeyEvent.VK_UP && e.getKeyCode() != KeyEvent.VK_DOWN && e.getKeyCode() != KeyEvent.VK_HOME && e.getKeyCode() != KeyEvent.VK_END && e.getKeyCode() != KeyEvent.VK_SHIFT && hindi) {
            String translated = Translator.toHindi(jtp.getText());
            jtp.setText(translated);
            int len2 = translated.length();
            if(caretPosition < jtp.getCaretPosition()){
                jtp.setCaretPosition(caretPosition+(len2-len));
            }
        }

    }

}
