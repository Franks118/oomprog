import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Commnetfilter {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Reasons Not to Buy");
       
         frame.setPreferredSize(new Dimension(850, 300));
          Color color1 = new Color(223,215,159);
          Color color2 = new Color(200,150,100);


        // Create a JPanel to hold components
        JPanel panel = new JPanel();
  // Create a JButton to remove reasons
        JButton removeReasonButton = new JButton("Remove a Reason");

        // Create an array of labels with reasons
        String[] reasons = {
            "Bad quality,\n",
            "Unpleasant Customer service,\n",
            "Not satisfied with Options,\n",
            "Found a better alternative,\n",
            "Bad customer reviews.",
            "Awful Experience"
        };

      
        // Add the labels to the panel
        for (String reason : reasons) {
            panel.add(new JLabel(reason));
        }

        // Add the button to the panel
        panel.add(removeReasonButton);

        // Add an ActionListener to the button
        removeReasonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Find the first visible label and set it to invisible
                for (Component component : panel.getComponents()) {
                    if (component instanceof JLabel && component.isVisible()) {
                        component.setVisible(false);
                        break;
                    }
                }
            }
        });

        // Set JFrame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setLayout(new FlowLayout());
        frame.pack();
        frame.setVisible(true);
        panel.setBackground(color1);
        frame.getContentPane().setBackground(color2);
    }
}
