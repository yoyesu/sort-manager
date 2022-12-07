package com.sparta.ms.sort_manager.view.gui;

import com.sparta.ms.sort_manager.view.Starter;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private ResultsPanel resultsPanel;
    private ConfigPanel configPanel;

    public MainFrame(){
        super("Sort Manager");

        resultsPanel = new ResultsPanel();
        configPanel = new ConfigPanel();

        add(configPanel, BorderLayout.WEST);
        add(resultsPanel, BorderLayout.EAST);

        configPanel.setListenable(e -> Starter.startApp());

        configProgramMainWindow();
    }

    private void configProgramMainWindow() {
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the app when the window is closed
        setVisible(true);
    }

}
