/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio05;

import Exercicio01.JFrameInterfaceE;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Alunos
 */
public class Ex05 implements JFrameInterfaceE {
    
    private JFrame jFrame;
    private JLabel jLabelNumero01,
                   jLabelNumero02,
                   jLabelResultado;
    private JTextField jTextFieldNumero01,
                       jTextFieldNumero02;
    private JTextArea  jTextAreaResultado;
    private JScrollPane jScrollPaneResultado;
    private JButton jButtonSomar,
                    jButtonSubtrair,
                    jButtonMultiplicar,
                    jButtonDividir;
            
    public Ex05(){ 
        instanciarComponentes();
        gerarTela();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        configurarJScrollPane();
        acaoSomar();
        acaoSubtrair();
        acaoMultiplicar();
        acaoDividir();
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
        jFrame.add(jLabelNumero01);
        jFrame.add(jLabelNumero02);
        jFrame.add(jLabelResultado);
        jFrame.add(jTextFieldNumero01);
        jFrame.add(jTextFieldNumero02);
        jFrame.add(jScrollPaneResultado);
        jFrame.add(jButtonSomar);
        jFrame.add(jButtonSubtrair);
        jFrame.add(jButtonMultiplicar);
        jFrame.add(jButtonDividir); 
    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero01 = new JLabel("Número 01");
        jLabelNumero02 = new JLabel("Número 02");
        jLabelResultado = new JLabel("Resultado");
        jTextFieldNumero01 = new JTextField();
        jTextFieldNumero02 = new JTextField();
        jScrollPaneResultado = new JScrollPane();
        jTextAreaResultado = new JTextArea();
        jButtonSomar = new JButton("Somar");
        jButtonSubtrair = new JButton("Subtrair");
        jButtonMultiplicar = new JButton("Multiplicar");
        jButtonDividir = new JButton("Dividir");
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNumero01.setLocation(10,10);
        jLabelNumero02.setLocation(10,70);
        jLabelResultado.setLocation(10,125);
        jTextFieldNumero01.setLocation(10,25);
        jTextFieldNumero02.setLocation(10,85);
        jScrollPaneResultado.setLocation(10,150);
        jButtonSomar.setLocation(160,10);
        jButtonSubtrair.setLocation(160,80);
        jButtonMultiplicar.setLocation(320,10);
        jButtonDividir.setLocation(320,80);
    }
    
    @Override
    public void gerarDimensoes() {
        jLabelNumero01.setSize(100,15);
        jLabelNumero02.setSize(100,15);
        jLabelResultado.setSize(100,15);
        jTextFieldNumero01.setSize(125,25);
        jTextFieldNumero02.setSize(125,25);
        jScrollPaneResultado.setSize(450,300);
        jButtonSomar.setSize(150,50);
        jButtonSubtrair.setSize(150,50);
        jButtonMultiplicar.setSize(150,50);
        jButtonDividir.setSize(150,50);
    }
    
    public void configurarJScrollPane() {
        jScrollPaneResultado.setViewportView(jTextAreaResultado);
        jScrollPaneResultado.setHorizontalScrollBarPolicy(
        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPaneResultado.setVerticalScrollBarPolicy(
        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jTextAreaResultado.setLineWrap(true);
    }
    
    public void acaoSomar() {
        jButtonSomar.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String resultadoSomar = "";
               int numero01 = 0;
               int numero02 = 0;
               try{
                  numero01 = Integer.parseInt(jTextFieldNumero01.getText());
                  numero02 = Integer.parseInt(jTextFieldNumero02.getText());
                  resultadoSomar += numero01 + numero02;
                  jTextAreaResultado.setText(resultadoSomar);
               }catch(NumberFormatException ex) {
                  JOptionPane.showMessageDialog(null, "Digite apenas números");
                  jTextFieldNumero01.requestFocus(); return;
               }
               
           }
           
        });
    }
    
    public void acaoSubtrair() {
        jButtonSubtrair.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               
           
               
               }
        });
    }
    
    public void acaoMultiplicar() {
        jButtonMultiplicar.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               
           }
        });
    }
    
    public void acaoDividir() {
        jButtonDividir.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               
           }
           
        });
    }
    
   public void limparCampos() {
       jTextFieldNumero01.setText("");
   } 
    
    
}
