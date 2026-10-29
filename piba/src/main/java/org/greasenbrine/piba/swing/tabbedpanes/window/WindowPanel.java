package org.greasenbrine.piba.swing.tabbedpanes.window;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WindowPanel {
    private JPanel windowPanel;

    public WindowPanel() {
        windowPanel = new JPanel();
        windowPanel.setBounds(0, 0, 800, 600);

        JLabel windowLabel = new JLabel("Welcome to the Window section");
        windowPanel.add(windowLabel);
    }

    public JPanel getWindowPanel() {
        return windowPanel;
    }
}
