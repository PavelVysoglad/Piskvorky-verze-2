import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JPanel rozhrani = new JPanel();
JButton [] tlacitko = new JButton[3];

JLabel nazev = new JLabel();
JLabel pravidla_text = new JLabel();
boolean game = false;



    Menu(){
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1200,1200);
        frame.setBackground(new Color(58, 51, 51));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        frame.setResizable(false);

        nazev.setBackground(new Color(25,25,25));
        nazev.setForeground(new Color(25,255,0));
        nazev.setFont(new Font("Ink Free",Font.BOLD,150));
        nazev.setHorizontalAlignment(JLabel.CENTER);
        nazev.setText("Piškotvorky");
        nazev.setOpaque(true);

        panel.setLayout(new BorderLayout());
        panel.setBounds(0,0,1200,300);
        panel.add(nazev);

        frame.add(panel, BorderLayout.NORTH);

        rozhrani.setLayout(new GridLayout(3, 1));
        rozhrani.setBounds(0,0,1200,600);
        rozhrani.setBackground(new Color(12,120,120));
        rozhrani.setForeground(new Color(20,200,0));





        tlacitko[0]= new JButton();
        rozhrani.add(tlacitko[0]);
        tlacitko[0].setText("Nová Hra");
        tlacitko[0].setEnabled(true);
        tlacitko[0].setBackground(new Color(12,120,120));
        tlacitko[0].setForeground(new Color(20,200,0));
        tlacitko[0].setFont(new Font("MV Boli", Font.BOLD, 75));

        tlacitko[1]= new JButton();
        rozhrani.add(tlacitko[1]);
        tlacitko[1].setText("Pravidla");
        tlacitko[1].setEnabled(true);
        tlacitko[1].setBackground(new Color(12,120,120));
        tlacitko[1].setForeground(new Color(20,200,0));
        tlacitko[1].setFont(new Font("MV Boli", Font.BOLD, 75));

        tlacitko[2]= new JButton();
        rozhrani.add(tlacitko[2]);
        tlacitko[2].setText("Konec Hry");
        tlacitko[2].setEnabled(true);
        tlacitko[2].setBackground(new Color(12,120,120));
        tlacitko[2].setForeground(new Color(20,200,0));
        tlacitko[2].setFont(new Font("MV Boli", Font.BOLD, 75));


        frame.add(rozhrani);
    }
    @Override
public void actionPerformed (ActionEvent e) {
if (e.getSource()==tlacitko[0]){
     game = true;
}
else {
    game = false;
}

    }
}
