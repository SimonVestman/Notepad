import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIeditorExempe {
    private JTextArea text;
    private JButton button1;
    private JScrollBar scrollBar1;
    private JList list1;
    private JPanel panel;

    public GUIeditorExempe() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                text.append(".i.");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUIeditorExempe");
        frame.setContentPane(new GUIeditorExempe().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
