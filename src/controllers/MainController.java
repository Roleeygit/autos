package controllers;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import models.MainModel;
import views.MainFrame;

public class MainController {
    MainFrame mainFrame;
    MainModel mainModel;
    Timer timer;
    public MainController() {
        this.mainFrame = new MainFrame();
        this.mainModel = new MainModel();
        this.timer = new Timer(200, event -> onTime());
        this.setEvents();
    }
    private void onTime(){
        this.mainFrame.trackPanel.car1.go();
        this.mainFrame.trackPanel.car1.setNewSpeed();

        this.mainFrame.trackPanel.car2.go();
        this.mainFrame.trackPanel.car2.setNewSpeed();

        this.mainFrame.trackPanel.car3.go();
        this.mainFrame.trackPanel.car3.setNewSpeed();

        if(this.mainFrame.trackPanel.car1.speedVisible && this.mainFrame.trackPanel.car2.speedVisible && this.mainFrame.trackPanel.car3.speedVisible){

            Integer actSpeed = this.mainFrame.trackPanel.car1.actSpeed;
            this.mainFrame.trackPanel.car1.setText(actSpeed.toString());
            this.mainFrame.trackPanel.car1.setForeground(Color.black);

            this.mainFrame.trackPanel.car2.setText(actSpeed.toString());
            this.mainFrame.trackPanel.car2.setForeground(Color.black);

            this.mainFrame.trackPanel.car3.setText(actSpeed.toString());
            this.mainFrame.trackPanel.car3.setForeground(Color.black);

        }else {
            this.mainFrame.trackPanel.car1.setText("┗|｀O′|┛");
            this.mainFrame.trackPanel.car2.setText("(⊙_⊙)？");
            this.mainFrame.trackPanel.car3.setText("(＃°Д°)");


        }


    }
    private void setEvents(){
        this.mainFrame.buttonPanel.startButton.addActionListener(event -> onClickStartButton());
        this.mainFrame.buttonPanel.stopButton.addActionListener(event -> onClickStopButton());
        this.mainFrame.buttonPanel.resetButton.addActionListener(event -> onClickResetButton());
        this.mainFrame.buttonPanel.speedButton.addActionListener(event -> onClickSpeedButton());
        this.mainFrame.buttonPanel.aboutButton.addActionListener(event -> onClickAboutButton());
        this.mainFrame.buttonPanel.exitButton.addActionListener(event -> onClickExitButton());
    }
    private void onClickStartButton(){
        this.timer.start();
    }
    private void onClickStopButton(){
        this.timer.stop();
    }
    private void onClickResetButton(){
        this.timer.stop();
        this.mainFrame.trackPanel.car1.setLocation(5, 5);
        this.mainFrame.trackPanel.car2.setLocation(5, 45);
        this.mainFrame.trackPanel.car3.setLocation(5, 85);
    }
    private void onClickSpeedButton(){
        this.mainFrame.trackPanel.car1.toggleSpeedVisible();
    }
    private void onClickAboutButton(){
        JOptionPane.showMessageDialog(mainFrame, "Juhász Roland 2022.06.14");
    }
    private void onClickExitButton(){
       System.exit(0);
    }
    
}
