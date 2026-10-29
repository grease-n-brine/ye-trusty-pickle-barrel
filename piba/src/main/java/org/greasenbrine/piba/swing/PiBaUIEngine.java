package org.greasenbrine.piba.swing;
import javax.swing.JFrame;

import org.greasenbrine.piba.swing.tabbedpanes.MainTabbedPane;

public class PiBaUIEngine extends JFrame {
    public PiBaUIEngine() {
        setTitle("Ye' Trusty Pickle Barrel (Build-1.0.0)");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        MainTabbedPane mainTabbedPane = new MainTabbedPane();
        add(mainTabbedPane.getMainTabbedPane());
    }
}
