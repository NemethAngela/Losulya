package views;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.Dimension;

public class InputPanel extends JPanel {
    JLabel label;   //felirat
    JTextField field;

    public InputPanel() {
        this.initComponent();   //meghívjuk
        this.setupComponents(); 
        this.addComponent();
        this.setupPanel();
    }

    public InputPanel(String text) {
        this.initComponent();  
        this.label.setText(text);
        this.addComponent();
        this.setupPanel();
    }

    private void initComponent() {
        this.label = new JLabel();
        this.field = new JTextField();
    }

    private void setupComponents() {
        this.label.setPreferredSize(new Dimension(100, 27));   //felirat
        this.field.setPreferredSize(new Dimension(100, 27));  
    }

    //SZEGÉLY (eltartás):
    private void setupPanel() {
        this.setBorder(new EmptyBorder(10, 10, 10, 10));
    }

    //beállítók:
    public void setLabel(String text) { //label-(felirat) beállítása
        this.label.setText(text);
    }

    public void setValue(String text) {
        this.field.setText(text);
    }

    public String getValue() {
        return this.field.getText();
    }
    
    private void addComponent() {   //hozzáadás  A PANELHEZ
        this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS)); //egymás mellé kerülnek a komponensek
        this.add(this.label);
        this.add(this.field);
    }
}
