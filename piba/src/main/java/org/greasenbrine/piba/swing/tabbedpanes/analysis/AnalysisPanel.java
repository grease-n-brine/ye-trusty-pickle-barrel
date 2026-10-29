package org.greasenbrine.piba.swing.tabbedpanes.analysis;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AnalysisPanel {
    private JPanel analysisPanel;

    public AnalysisPanel() {
        analysisPanel = new JPanel();
        analysisPanel.setBounds(0, 0, 800, 600);

        JLabel analysisLabel = new JLabel("Welcome to the Analysis section");
        analysisPanel.add(analysisLabel);
    }

    public JPanel getAnalysisPanel() {
        return analysisPanel;
    }
}
