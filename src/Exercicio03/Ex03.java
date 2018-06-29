package Exercicio03;

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
 * @author Matheus Ruan Werner
 */
public class Ex03 implements JFrameInterfaceE{

    private JFrame jFrame;
    private JLabel jLabelNumero, jLabelTabuada;
    private JTextField jTextFieldNumero;
    private JTextArea jTextAreaTabuada;
    private JScrollPane jScrollPaneTabuada;
    private JButton jButtonTabuada;
    
    
    public Ex03() {
        instanciarComponentes();
        gerarTela();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        configurarScroll();
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
        jFrame.add(jLabelTabuada);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jScrollPaneTabuada);
        jFrame.add(jButtonTabuada);
        
    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero = new JLabel("Número");
        jLabelTabuada = new JLabel("Tabuada");
        jTextFieldNumero = new JTextField();
        jScrollPaneTabuada = new JScrollPane();
        jTextAreaTabuada = new JTextArea();
        jButtonTabuada = new JButton("Tabuada");
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNumero.setLocation(10,10);
        jTextFieldNumero.setLocation(10,35);
        jButtonTabuada.setLocation(10,65);
        jLabelTabuada.setLocation(170,20);
        jScrollPaneTabuada.setLocation(170,40);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNumero.setSize(100,15);
        jTextFieldNumero.setSize(150,25);
        jButtonTabuada.setSize(150,50);
        jLabelTabuada.setSize(100,15);
        jScrollPaneTabuada.setSize(300,400);
    }
    
    public void configurarScroll() {
        jScrollPaneTabuada.setViewportView(jTextAreaTabuada);
        jScrollPaneTabuada.setHorizontalScrollBarPolicy(
        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPaneTabuada.setVerticalScrollBarPolicy(
        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jTextAreaTabuada.setLineWrap(true);
    }
    
    public void acaoJButton() {
        jButtonTabuada.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
                int numero = 0;
                try {
                   if(jTextFieldNumero.getText().trim().isEmpty()) {
                   JOptionPane.showMessageDialog(null, "Número deve ser preenchdio");
                   jTextFieldNumero.requestFocus(); return;  
               
               }
               numero = Integer.parseInt(jTextFieldNumero.getText());
               String resultado =  "";
               for(int i = 0; i <= 20; i++) {
               resultado +=  numero + " x " + i + " = " + numero*i + "\n";
                 
               }
               jTextAreaTabuada.setText(resultado);
               
          }catch(NumberFormatException ex) { 
              JOptionPane.showMessageDialog(null, "Digite apenas números");
                    jTextFieldNumero.requestFocus(); return;
           }
          }  
      });
    }  
 }
  


            
    


