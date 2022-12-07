package com.sparta.ms.sort_manager.view.gui;

import com.sparta.ms.sort_manager.view.Starter;

import javax.swing.*;
import java.awt.*;

public class ConfigPanel extends JPanel {

    private JButton runBtn;
    private Listenable listenable;

    public ConfigPanel(){
        runBtn = new JButton("Start");

        setFormPanelDimensions();
        placeElementsOnFormPanel();
        listenToRunBtn();
    }

    public void setListenable(Listenable listenable) {
        this.listenable = listenable;
    }

    private void setFormPanelDimensions() {
        Dimension dim = getPreferredSize();
        dim.width = 250;
        setPreferredSize(dim);
    }
    private void placeElementsOnFormPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        placeOKButton(constraints);
    }

    private void placeOKButton(GridBagConstraints constraints) {
        constraints.weightx = 1;
        constraints.weighty = 2.0;

        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.anchor = GridBagConstraints.FIRST_LINE_START;
        constraints.insets = new Insets(0,0,0,0);
        add(runBtn, constraints);
    }

    private void listenToRunBtn() {
        runBtn.addActionListener(e ->{
            ConfigEvent event = new ConfigEvent(this);

            if(listenable != null){
                listenable.startBtnEventOccurred(event);
            }
        } );

    }
}
