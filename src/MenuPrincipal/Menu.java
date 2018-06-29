/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuPrincipal;

import Exercicio01.Ex01;
import Exercicio01.JFrameInterfaceE;
import Exercicio02.Ex02;
import Exercicio03.Ex03;
import Exercicio04.Ex04;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
/**
 *
 * @author Alunos
 */
public class Menu implements JFrameInterfaceE{
    
    private JFrame jFrame;
    private JButton jButton01,
                    jButton02,
                    jButton03,
                    jButton04,
                    jButton05,
                    jButton06,
                    jButton07,
                    jButton08,
                    jButton09;
    
    public Menu() {
        instanciarComponentes();
        gerarTela();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        acaoJButton01();
        acaoJButton02();
        acaoJButton03();
        acaoJButton04();
        acaoJButton05();
        acaoJButton06();
        acaoJButton07();
        acaoJButton08();
        acaoJButton09();
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
        jFrame.add(jButton01);
        jFrame.add(jButton02);
        jFrame.add(jButton03);
        jFrame.add(jButton04);
        jFrame.add(jButton05);
        jFrame.add(jButton06);
        jFrame.add(jButton07);
        jFrame.add(jButton08);
        jFrame.add(jButton09);
    }

    @Override
    public void instanciarComponentes() {
        jButton01 = new JButton("Button 01");
        jButton02 = new JButton("Button 02");
        jButton03 = new JButton("Button 03");
        jButton04 = new JButton("Button 04");
        jButton05 = new JButton("Button 05");
        jButton06 = new JButton("Button 06");
        jButton07 = new JButton("Button 07");
        jButton08 = new JButton("Button 08");
        jButton09 = new JButton("Button 09");
    }

    @Override
    public void gerarLocalizacoes() {
        jButton01.setLocation(10,10);
        jButton02.setLocation(10,120);
        jButton03.setLocation(10,230);
        jButton04.setLocation(10,340);
        jButton05.setLocation(120,10);
        jButton06.setLocation(120,120);
        jButton07.setLocation(120,230);
        jButton08.setLocation(120,340);
        jButton09.setLocation(230,10);
    }

    @Override
    public void gerarDimensoes() {
        jButton01.setSize(100,100);
        jButton02.setSize(100,100);
        jButton03.setSize(100,100);
        jButton04.setSize(100,100);
        jButton05.setSize(100,100);
        jButton06.setSize(100,100);
        jButton07.setSize(100,100);
        jButton08.setSize(100,100);
        jButton09.setSize(100,100);
    }
    
    public void acaoJButton01(){
        jButton01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ex01();
            }
        });
    }
    
    public void acaoJButton02(){
        jButton02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ex02();
            }
        });
    }
    
    public void acaoJButton03(){
        jButton03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new Ex03(); 
            }
        });
    }
    
    public void acaoJButton04(){
        jButton04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ex04();
            }
        });
    }
    
    public void acaoJButton05(){
        jButton02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }
    
    public void acaoJButton06(){
        jButton02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }
    
    public void acaoJButton07(){
        jButton02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }
    
    public void acaoJButton08(){
        jButton02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }
    
    public void acaoJButton09(){
        jButton02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }
    
   
    
    
    
}
