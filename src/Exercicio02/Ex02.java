/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio02;

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
public class Ex02 implements JFrameInterfaceE{
    
    private JFrame jFrame;
    private JLabel jLabelNumero;
    private JTextField jTextFieldNumero;
    private JButton jButtonTabuada;
    
               
    
    
    
    public Ex02() {
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
        jFrame.add(jButtonTabuada);        
    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero = new JLabel("Número");
        jTextFieldNumero = new JTextField();
        jButtonTabuada = new JButton("Resultado");
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNumero.setLocation(10,10);
        jTextFieldNumero.setLocation(10,25);
        jButtonTabuada.setLocation(10, 80);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNumero.setSize(100,15);
        jTextFieldNumero.setSize(150,25);
        jButtonTabuada.setSize(149,50);   
    }
    
    public void acaoJButton() {
         jButtonTabuada.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               try{
               if(jTextFieldNumero.getText().trim().isEmpty()) {
                   JOptionPane.showMessageDialog(null, "Número deve ser preenchdio");
                   jTextFieldNumero.requestFocus(); return;
               }
               double numero = Double.parseDouble(jTextFieldNumero.getText().replace(",", "."));

               double resultado = numero*50;  
               
               }catch(Exception ex) {
               
                   JOptionPane.showMessageDialog(null, "Digite apenas números");
                   jTextFieldNumero.requestFocus(); return;
               }
               double numero = Double.parseDouble(jTextFieldNumero.getText().replace(",", "."));
               
               double resultado = numero*50;
               
               JOptionPane.showMessageDialog(null, "50 x " + numero + " = " + resultado);
              
           }
    });
    
    
}
}
