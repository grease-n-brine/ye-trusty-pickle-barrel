package org.greasenbrine.piba.swing.tabbedpanes.home;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomePanel {
    private JPanel homePanel;

    public HomePanel() {
        homePanel = new JPanel();
        homePanel.setBounds(0, 0, 800, 600);

        JLabel homeLabel = new JLabel("Welcome to the Home Panel");
        homePanel.add(homeLabel);
    }

    public JPanel getHomePanel() {
        return homePanel;
    }
}
