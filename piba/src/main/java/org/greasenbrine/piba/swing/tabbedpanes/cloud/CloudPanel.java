package org.greasenbrine.piba.swing.tabbedpanes.cloud;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CloudPanel {
    private JPanel cloudPanel;

    public CloudPanel() {
        cloudPanel = new JPanel();
        cloudPanel.setBounds(0, 0, 800, 600);

        JLabel cloudLabel = new JLabel("Welcome to the Cloud section");
        cloudPanel.add(cloudLabel);
    }

    public JPanel getCloudPanel() {
        return cloudPanel;
    }
}
