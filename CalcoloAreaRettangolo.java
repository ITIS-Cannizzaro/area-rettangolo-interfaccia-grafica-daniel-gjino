import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcoloAreaRettangolo extends JFrame implements ActionListener {
   private JLabel labelBase, labelAltezza, labelRisultato;
   private JTextField campoBase, campoAltezza;
   private JButton bottoneCalcola;

   public CalcoloAreaRettangolo() {
      super("Calcola Area Rettangolo");

      // Aggiungi i componenti
      labelBase = new JLabel("Base:");
      labelAltezza = new JLabel("Altezza:");
      labelRisultato = new JLabel("Area:");
      campoBase = new JTextField(10);
      campoAltezza = new JTextField(10);
      bottoneCalcola = new JButton("Calcola");
      bottoneCalcola.addActionListener(this);

      // Imposta il layout
      setLayout(new GridLayout(3,2));

      // Aggiungi i componenti al frame
      add(labelBase);
      add(campoBase);
      add(labelAltezza);
      add(campoAltezza);
      add(bottoneCalcola);
      add(labelRisultato);

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(300,150);
      setVisible(true);
   }

   public void actionPerformed(ActionEvent e) {
      // Calcola l'area del rettangolo
      double base = Double.parseDouble(campoBase.getText());
      double altezza = Double.parseDouble(campoAltezza.getText());
      double area = base * altezza;

      // Aggiorna la label del risultato
      labelRisultato.setText("Area: " + area);
   }

   public static void main(String[] args) {
      CalcoloAreaRettangolo frame = new CalcoloAreaRettangolo();
   }
}