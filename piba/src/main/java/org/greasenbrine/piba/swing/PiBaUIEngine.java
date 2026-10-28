package org.greasenbrine.piba.swing;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PiBaUIEngine extends JFrame {
    public PiBaUIEngine() {
        setTitle("Ye' Trusty Pickle Barrel (Build-1.0.0)");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JLabel ownershipLabel = new JLabel("Owned by NepSauce, Grease & Brine");
        add(ownershipLabel);
    }
}
