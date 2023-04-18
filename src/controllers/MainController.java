package controllers;

import views.MainFrame;

public class MainController {
    MainFrame mainFrame;

    public MainController() {
        this.mainFrame = new MainFrame();   //szükség lesz a mainFrame-ben levő gombra, ezért példányosítom
        handleEvents();
    }

    private void handleEvents() {
        this.mainFrame.getCalcButton().addActionListener(e -> {
            System.out.println("Működik");
        });

    }
    
}
