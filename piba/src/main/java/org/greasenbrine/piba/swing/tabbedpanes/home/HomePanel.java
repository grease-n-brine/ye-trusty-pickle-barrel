package org.greasenbrine.piba.swing.tabbedpanes.home;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

import org.greasenbrine.piba.swing.tabbedpanes.home.components.panels.AlertsPanel;
import org.greasenbrine.piba.swing.tabbedpanes.home.components.panels.AnalysisPanel;
import org.greasenbrine.piba.swing.tabbedpanes.home.components.panels.ForecastingPanel;
import org.greasenbrine.piba.swing.tabbedpanes.home.components.panels.QuickOverviewPanel;

public class HomePanel {
    private JPanel homePanel;

    public HomePanel() {
        this(null);
    }

    public HomePanel(Runnable openAnalysisAction) {
        homePanel = new JPanel(new GridBagLayout());
        homePanel.setBounds(0, 0, 800, 600);

        AlertsPanel alertsPanel = new AlertsPanel(openAnalysisAction);
        QuickOverviewPanel quickOverviewPanel = new QuickOverviewPanel();
        AnalysisPanel analysisPanel = new AnalysisPanel();
        ForecastingPanel forecastingPanel = new ForecastingPanel();

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.fill = GridBagConstraints.BOTH;
        constraints.gridwidth = 1;

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 0.3;
        constraints.weighty = 0.08;
        homePanel.add(alertsPanel.getAlertsPanel(), constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.weightx = 0.7;
        constraints.weighty = 0.18;
        homePanel.add(quickOverviewPanel.getQuickOverviewPanel(), constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.weightx = 1.0;
        constraints.weighty = 0.56;
        homePanel.add(analysisPanel.getAnalysisPanel(), constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.weightx = 1.0;
        constraints.weighty = 0.18;
        homePanel.add(forecastingPanel.getForecastingPanel(), constraints);
    }

    public JPanel getHomePanel() {
        return homePanel;
    }
}
