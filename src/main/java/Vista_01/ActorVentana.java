/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista_01;

import Controlador.ActorControl;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author paulp
 */
public class ActorVentana extends JFrame implements ActionListener{

    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JButton> jButtonList;
    private List<JPanel> jPanelList;
    private ActorControl actorControl = new ActorControl();

    public ActorVentana(String title) throws HeadlessException {
        this.setTitle(title);
        this.setSize(300,275);
        this.setLocation(10,5);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
    }

    public void iniciarComponentes(){
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
        this.iniciarBotones();
        
        this.jPanelList.get(0).setLayout(new FlowLayout());
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(0).add(this.jTextFieldList.get(0));
        this.jPanelList.get(0).add(this.jLabelList.get(1));
        this.jPanelList.get(0).add(this.jTextFieldList.get(1));
        this.jPanelList.get(0).add(this.jLabelList.get(2));
        this.jPanelList.get(0).add(this.jTextFieldList.get(2));
        this.jPanelList.get(0).add(this.jLabelList.get(3));
        this.jPanelList.get(0).add(this.jTextFieldList.get(3));
        
        this.jPanelList.get(0).add(this.jButtonList.get(0));
        this.jPanelList.get(0).add(this.jButtonList.get(1));
        
    }
    
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(0).setBackground(Color.GRAY);
        this.setContentPane(this.jPanelList.get(0));
        
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Ingrese el Nombre del actor o actrix:"));
        this.jLabelList.add(new JLabel("Ingrese su Nacionalidad:"));
        this.jLabelList.add(new JLabel("Ingrese su Fecha de Nacimiento:"));
        this.jLabelList.add(new JLabel("Ingrese su Edad:"));
    }
    
    public void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField(20));
        this.jTextFieldList.add(new JTextField(20));
        this.jTextFieldList.add(new JTextField(20));
        this.jTextFieldList.add(new JTextField(20));
    }
    
    public void iniciarBotones(){
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Guardar"));
        this.jButtonList.add(new JButton("Listar"));
        this.jButtonList.get(0).addActionListener(this);
        this.jButtonList.get(1).addActionListener(this); 
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.jButtonList.get(0))){
            String [] params = new String[4];
            params[0]=this.jTextFieldList.get(0).getText();
            params[1]=this.jTextFieldList.get(1).getText();
            params[2]=this.jTextFieldList.get(2).getText();
            params[3]=this.jTextFieldList.get(3).getText();

            
            this.actorControl.crear(params); 
            
            this.jTextFieldList.get(0).setText("");
            this.jTextFieldList.get(1).setText("");
            this.jTextFieldList.get(2).setText("");
            this.jTextFieldList.get(3).setText("");

        }
        
        if(e.getSource().equals(this.jButtonList.get(1))){
            System.out.println(this.actorControl.listar().toString());
        }}
    
}
