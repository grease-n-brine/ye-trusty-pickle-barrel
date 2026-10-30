package org.greasenbrine.piba.swing.tabbedpanes.home.components.panels;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class QuickOverviewPanel {
	private JPanel quickOverviewPanel;

	public QuickOverviewPanel() {
		quickOverviewPanel = new JPanel(new BorderLayout());
		quickOverviewPanel.setBorder(BorderFactory.createTitledBorder("Quick Overview"));

		JLabel placeholderLabel = new JLabel("Quick Overview placeholder", JLabel.CENTER);
		quickOverviewPanel.add(placeholderLabel, BorderLayout.CENTER);
	}

	public JPanel getQuickOverviewPanel() {
		return quickOverviewPanel;
	}
}
