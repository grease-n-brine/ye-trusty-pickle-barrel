package org.greasenbrine.piba.swing.tabbedpanes.home.components.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AlertsPanel {
	private JPanel alertsPanel;

	public AlertsPanel(Runnable openAnalysisAction) {
		alertsPanel = new JPanel(new BorderLayout());
		alertsPanel.setBorder(BorderFactory.createTitledBorder("Alerts"));
		alertsPanel.setPreferredSize(new Dimension(240, 64));
		alertsPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		JPanel severityPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 18, 6));
		severityPanel.add(createSeverityLabel("0", new Color(46, 160, 67)));
		severityPanel.add(createSeverityLabel("0", new Color(198, 130, 0)));
		severityPanel.add(createSeverityLabel("0", new Color(200, 64, 64)));
		severityPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		JLabel navigationHint = new JLabel("Click for Analysis triage");
		navigationHint.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		MouseAdapter openAnalysisMouseListener = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent event) {
				if (openAnalysisAction != null) {
					openAnalysisAction.run();
				}
			}
		};

		alertsPanel.addMouseListener(openAnalysisMouseListener);
		severityPanel.addMouseListener(openAnalysisMouseListener);
		navigationHint.addMouseListener(openAnalysisMouseListener);

		alertsPanel.add(severityPanel, BorderLayout.CENTER);
		alertsPanel.add(navigationHint, BorderLayout.SOUTH);
	}

	private JLabel createSeverityLabel(String text, Color color) {
		JLabel severityLabel = new JLabel(text);
		severityLabel.setForeground(color);
		return severityLabel;
	}

	public JPanel getAlertsPanel() {
		return alertsPanel;
	}
}
