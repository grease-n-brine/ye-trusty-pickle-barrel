package org.greasenbrine.piba.swing.panels;
import javax.swing.JTabbedPane;

public class MainTabbedPane {
    JTabbedPane mainTabbedPane;

    public MainTabbedPane() {
        mainTabbedPane = new JTabbedPane();
        mainTabbedPane.setBounds(0, 0, 800, 600);
    }

    public JTabbedPane getMainTabbedPane() {
        return mainTabbedPane;
    }
    
}
