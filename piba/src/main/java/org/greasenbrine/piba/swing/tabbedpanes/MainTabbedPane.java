package org.greasenbrine.piba.swing.tabbedpanes;
import javax.swing.JTabbedPane;

import org.greasenbrine.piba.swing.tabbedpanes.analysis.AnalysisPanel;
import org.greasenbrine.piba.swing.tabbedpanes.cloud.CloudPanel;
import org.greasenbrine.piba.swing.tabbedpanes.forecasting.ForecastingPanel;
import org.greasenbrine.piba.swing.tabbedpanes.help.HelpPanel;
import org.greasenbrine.piba.swing.tabbedpanes.home.HomePanel;
import org.greasenbrine.piba.swing.tabbedpanes.terminal.TerminalPanel;
import org.greasenbrine.piba.swing.tabbedpanes.window.WindowPanel;

public class MainTabbedPane {
    JTabbedPane mainTabbedPane;

    public MainTabbedPane() {
        mainTabbedPane = new JTabbedPane();
        mainTabbedPane.setBounds(0, 0, 800, 600);
        mainTabbedPane.setAlignmentX(JTabbedPane.LEFT_ALIGNMENT);
        mainTabbedPane.setAlignmentY(JTabbedPane.TOP_ALIGNMENT);
        mainTabbedPane.setTabPlacement(JTabbedPane.TOP);
        mainTabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

        HomePanel homePanel = new HomePanel();
        AnalysisPanel analysisPanel = new AnalysisPanel();
        ForecastingPanel forecastingPanel = new ForecastingPanel();
        CloudPanel cloudPanel = new CloudPanel();
        TerminalPanel terminalPanel = new TerminalPanel();
        WindowPanel windowPanel = new WindowPanel();
        HelpPanel helpPanel = new HelpPanel();

        mainTabbedPane.addTab("Home", homePanel.getHomePanel());
        mainTabbedPane.addTab("Analysis", analysisPanel.getAnalysisPanel());
        mainTabbedPane.addTab("Forecasting", forecastingPanel.getForecastingPanel());
        mainTabbedPane.addTab("Cloud", cloudPanel.getCloudPanel());
        mainTabbedPane.addTab("Terminal", terminalPanel.getTerminalPanel());
        mainTabbedPane.addTab("Window", windowPanel.getWindowPanel());
        mainTabbedPane.addTab("Help", helpPanel.getHelpPanel());
    }

    public JTabbedPane getMainTabbedPane() {
        return mainTabbedPane;
    }
    
}
