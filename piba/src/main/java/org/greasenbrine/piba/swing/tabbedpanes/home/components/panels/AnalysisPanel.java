package org.greasenbrine.piba.swing.tabbedpanes.home.components.panels;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AnalysisPanel {
	private JPanel analysisPanel;

	public AnalysisPanel() {
		analysisPanel = new JPanel(new BorderLayout());
		analysisPanel.setBorder(BorderFactory.createTitledBorder("Analysis"));

		JLabel placeholderLabel = new JLabel("Analysis placeholder", JLabel.CENTER);
		analysisPanel.add(placeholderLabel, BorderLayout.CENTER);
	}

	public JPanel getAnalysisPanel() {
		return analysisPanel;
	}
}
