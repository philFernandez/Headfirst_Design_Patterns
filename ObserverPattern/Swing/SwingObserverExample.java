import java.awt.BorderLayout;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(event -> System.out.println("Don't do it, you might regret it!"));
        button.addActionListener(event -> System.out.println("Come on, do it!"));
        // We're using lambda functions instead ^^
        // button.addActionListener(new AngelListener());
        // button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    // Could use these inner classes instead of lambdas
    /*
     * class AngelListener implements ActionListener { public void
     * actionPerformed(ActionEvent event) {
     * System.out.println("Don't do it... That's bad!"); } }
     * 
     * class DevilListener implements ActionListener { public void
     * actionPerformed(ActionEvent event) {
     * System.out.println("Common boi!! Do it pussy!!"); } }
     */
}