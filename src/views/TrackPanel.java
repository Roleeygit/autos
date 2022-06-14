package views;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class TrackPanel extends JPanel {
    public Car car1;
    public Car car2;
    public Car car3;
    public TrackPanel() {
        this.car1 = new Car(Color.red, 5, "┗|｀O′|┛");
        this.car1.setBounds(5,5,100,30);

        this.car2 = new Car(Color.white, 5, "(⊙_⊙)？");
        this.car2.setBounds(5,45,100,30);

        this.car3 = new Car(Color.green, 5, "(＃°Д°)");
        this.car3.setBounds(5,85,100,30);
        
        this.add(this.car1);
        this.add(this.car2);
        this.add(this.car3);
        this.setBounds(5, 5, 750, 120);
        Border border = BorderFactory.createLineBorder(Color.black);
        this.setBorder(border);
        this.setLayout(null);
    }
}
