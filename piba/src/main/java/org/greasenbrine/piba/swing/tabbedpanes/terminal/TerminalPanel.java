package org.greasenbrine.piba.swing.tabbedpanes.terminal;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TerminalPanel {
    private JPanel terminalPanel;

    public TerminalPanel() {
        terminalPanel = new JPanel();
        terminalPanel.setBounds(0, 0, 800, 600);

        JLabel terminalLabel = new JLabel("Welcome to the Terminal section");
        terminalPanel.add(terminalLabel);
    }

    public JPanel getTerminalPanel() {
        return terminalPanel;
    }
}
