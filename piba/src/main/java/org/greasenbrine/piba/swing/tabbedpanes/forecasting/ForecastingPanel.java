package org.greasenbrine.piba.swing.tabbedpanes.forecasting;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ForecastingPanel {
    private JPanel forecastingPanel;

    public ForecastingPanel() {
        forecastingPanel = new JPanel();
        forecastingPanel.setBounds(0, 0, 800, 600);

        JLabel forecastingLabel = new JLabel("Welcome to the Forecasting section");
        forecastingPanel.add(forecastingLabel);
    }

    public JPanel getForecastingPanel() {
        return forecastingPanel;
    }
}
