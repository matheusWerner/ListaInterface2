
package Exercicio01;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.JFrame.DISPOSE_ON_CLOSE;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


/**
 *
 * @author Alunos
 */
public class Ex01 implements JFrameInterfaceE{
      
    private JFrame jFrame;
    private JLabel jLabelNome,
                   jLabelSobreNome;
    private JTextField jTextFieldNome,
                       jTextFieldSobreNome;
    private JButton jButtonConcatenar;
    
            
    public Ex01() {
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
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setSize(500,500);
        jFrame.setLocationRelativeTo(null);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNome);
        jFrame.add(jTextFieldNome);
        jFrame.add(jLabelSobreNome);
        jFrame.add(jTextFieldSobreNome);
        jFrame.add(jButtonConcatenar);
    }

    @Override
    public void instanciarComponentes() {
        jButtonConcatenar = new JButton("Concatenar");
        jLabelNome = new JLabel("Nome");
        jLabelSobreNome = new JLabel("Sobrenome");
        jTextFieldNome = new JTextField();
        jTextFieldSobreNome = new JTextField();    
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNome.setLocation(10,10);
        jTextFieldNome.setLocation(10,25);
        
        jLabelSobreNome.setLocation(10,55);
        jTextFieldSobreNome.setLocation(10,70);
        
        jButtonConcatenar.setLocation(10,120);
        
    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(150,15);
        jTextFieldNome.setSize(150,25);
        
        jLabelSobreNome.setSize(150,15);
        jTextFieldSobreNome.setSize(150,25);
        
        jButtonConcatenar.setSize(149,100);
    }
    
    public void acaoJButton() {
        jButtonConcatenar.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String nome = jTextFieldNome.getText();
               String sobrenome = jTextFieldSobreNome.getText();
               
               //nome
               
               if(jTextFieldNome.getText().trim().isEmpty()) {
                   JOptionPane.showMessageDialog(null, "Nome deve ser preenchdio");
                   jTextFieldNome.requestFocus(); return;
               }
               if(jTextFieldNome.getText().trim().length() < 3) {
                   JOptionPane.showMessageDialog(null, "Nome deve conter no mínimo 3 caracteres");
                   jTextFieldNome.requestFocus(); return;
               }
               
              
               
               //sobrenome
               
               if(jTextFieldSobreNome.getText().trim().isEmpty()) {
                   JOptionPane.showMessageDialog(null, "Sobrenome deve ser preenchdio");
                   jTextFieldSobreNome.requestFocus(); return;
               }
               if(jTextFieldSobreNome.getText().trim().length() < 3) {
                   JOptionPane.showMessageDialog(null, "Sobrenome deve conter no mínimo 3 caracteres");
                   jTextFieldSobreNome.requestFocus(); return;
               }
               
              
              JOptionPane.showMessageDialog(null, nome + " " + sobrenome);
               
           }
    });
    
    
    
}
}
