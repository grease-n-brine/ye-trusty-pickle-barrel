package org.greasenbrine.piba.swing.tabbedpanes.analysis;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AnalysisPanel {
    private JPanel analysisPanel;

    public AnalysisPanel() {
        analysisPanel = new JPanel(new BorderLayout());
        analysisPanel.setBounds(0, 0, 800, 600);

        JLabel analysisLabel = new JLabel("Welcome to the Analysis section", JLabel.CENTER);

        JPanel triagePanel = new JPanel(new BorderLayout());
        triagePanel.setBorder(BorderFactory.createTitledBorder("Triage"));
        triagePanel.add(new JLabel("Triage placeholder", JLabel.CENTER), BorderLayout.CENTER);

        analysisPanel.add(analysisLabel, BorderLayout.NORTH);
        analysisPanel.add(triagePanel, BorderLayout.CENTER);
    }

    public JPanel getAnalysisPanel() {
        return analysisPanel;
    }
}
