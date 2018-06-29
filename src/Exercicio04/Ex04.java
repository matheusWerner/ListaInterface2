/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio04;

import Exercicio01.JFrameInterfaceE;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Alunos
 */
public class Ex04 implements JFrameInterfaceE{
    
    private JFrame jFrame;
    private JLabel jLabelNumero;
    private JTextField jTextFieldNumero;
    private JButton jButtonVerificar; 
    
    public Ex04() {
        instanciarComponentes();
        gerarTela();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        acaoJButton();   
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
       jFrame = new JFrame();
       jFrame.setSize(500,500);
       jFrame.setLayout(null);
       jFrame.setLocationRelativeTo(null);
       jFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
    
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNumero);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jButtonVerificar);    
    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero = new JLabel("Número");
        jTextFieldNumero = new JTextField();
        jButtonVerificar = new JButton("Verificar");
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNumero.setLocation(10,10);
        jTextFieldNumero.setLocation(10,35);
        jButtonVerificar.setLocation(10,75);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNumero.setSize(100,15);
        jTextFieldNumero.setSize(125,25);
        jButtonVerificar.setSize(150,50);
    }
    
    public void acaoJButton() {
        jButtonVerificar.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               int numero = 0;
               try{
                   
               if(jTextFieldNumero.getText().trim().isEmpty()) {
               JOptionPane.showMessageDialog(null, "Número deve ser preenchdio");
               jTextFieldNumero.requestFocus(); return;  
               }
               
               numero = Integer.parseInt(jTextFieldNumero.getText());
               
               if(numero % 2 == 0 && numero < 0) {
                   JOptionPane.showMessageDialog(null, numero + "\n" + "Esse número é par e negativo");  
               }
               else if(numero % 2 == 1 && numero < 0) {
                   JOptionPane.showMessageDialog(null, numero + "\n" + "Esse número é impar e negativo");  
               }
               else if(numero % 2 == 0 && numero >= 0) {
                   JOptionPane.showMessageDialog(null, numero + "\n" + "Esse número é par e positivo");  
               }
               else if(numero % 2 == 1 && numero >= 0) {
                   JOptionPane.showMessageDialog(null, numero + "\n" + "Esse número é impar e positivo");  
               }
               }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Digite apenas números");
                    jTextFieldNumero.requestFocus(); return;
               }
           }
    });
        
  }
    
}
