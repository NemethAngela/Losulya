package controllers;

import views.MainFrame;

public class MainController {
    MainFrame mainFrame;

    public MainController() {
        this.mainFrame = new MainFrame();   //szükség lesz a mainFrame-ben levő gombra, ezért példányosítom
        handleEvents();
    }

    private void handleEvents() { //kattintásra
        this.mainFrame.getCalcButton().addActionListener(e -> {
            this.startCalc(); //itt hívjuk meg
        });

    }

    private void startCalc() {
        System.out.println("Működik");
        double perimeter = Double.parseDouble(
            this.mainFrame.getPerimeterPanel().getValue());  //ezzel kérdezzük le, mi van az inputpanelben
        double lenght = Double.parseDouble(  //ló hossza
            this.mainFrame.getLongPanel().getValue());
        Double weight = calcWeight(perimeter, lenght);  //Stringgé konvertálás miatt írtuk nagyD-vel
        this.mainFrame.getWeightPanel().setValue(weight.toString());
    }

    private double calcWeight(double perimeter, double lenght) {    //ezt tudjuk tesztelni
        double weight = (perimeter * perimeter * lenght)/11/11877;
        return weight;
    }
    
}
