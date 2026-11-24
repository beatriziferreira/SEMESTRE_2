package Semestre2;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

public class SaudacaoUI extends JFrame {
    private JTextField txtNome = new JTextField(12);
    private JCheckBox chkMaiusculas = new JCheckBox("Maiúsculas");
    private JButton btnSaudar = new JButton("Saudar");
    private JLabel lblMensagem = new JLabel("...");

 public SaudacaoUI() {
 super("Saudação");
 setLayout(new FlowLayout());
 add(txtNome); add(chkMaiusculas);
 add(btnSaudar); add(lblMensagem);
 btnSaudar.addActionListener(e -> saudar());
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 setSize(330, 110);
 }
 private void saudar() {
 String msg = "Olá, " + txtNome.getText() + "!";
 if (chkMaiusculas.isSelected()) {
 msg = msg.toUpperCase();
 }
 lblMensagem.setText(msg);
 }
 public static void main(String[] args) {
 new SaudacaoUI().setVisible(true);
 }
}

