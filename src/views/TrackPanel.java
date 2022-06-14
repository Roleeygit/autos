package views;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class TrackPanel extends JPanel {
    Car car1;
    Car car2;
    Car car3;
    public TrackPanel() {
        this.car1 = new Car(Color.BLUE, 5, "test1");
        this.car1.setBounds(5,5,100,30);

        this.car2 = new Car(Color.orange, 5, "test2");
        this.car2.setBounds(5,45,100,30);

        this.car3 = new Car(Color.green, 5, "test3");
        this.car3.setBounds(5,85,100,30);
        
        this.add(this.car1);
        this.add(this.car2);
        this.add(this.car3);
        this.setBounds(5, 5, 750, 125);
        Border border = BorderFactory.createLineBorder(Color.black);
        this.setBorder(border);
        this.setLayout(null);
    }
}
