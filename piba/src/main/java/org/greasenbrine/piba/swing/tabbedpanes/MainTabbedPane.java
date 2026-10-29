package org.greasenbrine.piba.swing.tabbedpanes;
import javax.swing.JTabbedPane;

import org.greasenbrine.piba.swing.tabbedpanes.home.HomePanel;

public class MainTabbedPane {
    JTabbedPane mainTabbedPane;

    public MainTabbedPane() {
        mainTabbedPane = new JTabbedPane();
        mainTabbedPane.setBounds(0, 0, 800, 600);

        HomePanel homePanel = new HomePanel();
        mainTabbedPane.addTab("Home", homePanel.getHomePanel());
    }

    public JTabbedPane getMainTabbedPane() {
        return mainTabbedPane;
    }
    
}
