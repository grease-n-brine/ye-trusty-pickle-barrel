package org.greasenbrine.piba.swing.tabbedpanes.help;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HelpPanel {
    private JPanel helpPanel;

    public HelpPanel() {
        helpPanel = new JPanel();
        helpPanel.setBounds(0, 0, 800, 600);

        JLabel helpLabel = new JLabel("Welcome to the Help section");
        helpPanel.add(helpLabel);
    }

    public JPanel getHelpPanel() {
        return helpPanel;
    }
}
