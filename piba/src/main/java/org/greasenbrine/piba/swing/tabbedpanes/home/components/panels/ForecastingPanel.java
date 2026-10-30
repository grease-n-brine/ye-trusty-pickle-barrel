package org.greasenbrine.piba.swing.tabbedpanes.home.components.panels;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ForecastingPanel {
	private JPanel forecastingPanel;

	public ForecastingPanel() {
		forecastingPanel = new JPanel(new BorderLayout());
		forecastingPanel.setBorder(BorderFactory.createTitledBorder("Forecasting"));

		JLabel placeholderLabel = new JLabel("Forecasting placeholder", JLabel.CENTER);
		forecastingPanel.add(placeholderLabel, BorderLayout.CENTER);
	}

	public JPanel getForecastingPanel() {
		return forecastingPanel;
	}
}
