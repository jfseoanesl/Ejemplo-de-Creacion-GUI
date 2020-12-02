/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.trescapas.presentacion;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author jairo
 */
public class GuiRegistro extends JDialog {
    
    private Container contenedor;
    private JPanel panelDatos;
    private JPanel panelBotones;
    private JPanel panelGrupo;
    
    private JLabel lbId, lbNombre, lbCiudad, lbCategoria, lbSedes, lbProgramas;
    private JTextField txtId, txtNombre, txtCiudad, txtSedes, txtProgramas;
    private JButton btnNuevo, btnBuscar, btnEliminar, btnCancelar;
    private ButtonGroup grupoCategoria;
    private JRadioButton rbPublica, rbPrivada;

    public GuiRegistro(Frame frame, String string, boolean bln) {
        super(frame, string, bln);
        this.iniciarComponentes();
        //this.pack(); 
        this.setSize(600, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    
    public void iniciarComponentes(){
        
        this.contenedor = this.getContentPane();
        this.contenedor.setLayout(new BorderLayout());
        this.crearPanelDatos();
        this.crearPanelBotones();
        
        
    }
    public void crearPanelBotones(){
        
        this.panelBotones = new JPanel();
        this.panelBotones.setLayout(new FlowLayout());
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,1,3,3));
        this.btnNuevo = new JButton("Nuevo");
        this.btnBuscar= new JButton("Buscar");
        this.btnEliminar= new JButton("Eliminar");
        this.btnCancelar = new JButton("Cancelar");
        
        panel.add(this.btnNuevo);
        panel.add(this.btnBuscar);
        panel.add(this.btnEliminar);
        panel.add(this.btnCancelar);
        
        this.panelBotones.add(panel);
        this.contenedor.add(this.panelBotones, BorderLayout.EAST);
        
    }
    public void crearPanelDatos(){
        this.panelDatos = new JPanel();
        this.panelDatos.setLayout(new GridLayout(6,2,5,5));
        
        this.lbId = new JLabel("Id: ");
        this.lbNombre = new JLabel("Nombre: ");
        this.lbCiudad= new JLabel("Ciudad: ");
        this.lbCategoria= new JLabel("Categoria: ");
        this.lbSedes= new JLabel("No Sedes: ");
        this.lbProgramas= new JLabel("No programas: ");
        
        this.txtId = new JTextField(null);
        this.txtNombre= new JTextField(null);
        this.txtCiudad= new JTextField(null);
        this.txtSedes= new JTextField(null);
        this.txtProgramas= new JTextField(null);
        
        this.grupoCategoria = new ButtonGroup();
        this.rbPublica = new JRadioButton("Publica");
        this.rbPublica.setSelected(true);
        this.rbPrivada = new JRadioButton("Privada");
        this.grupoCategoria.add(this.rbPublica);
        this.grupoCategoria.add(this.rbPrivada);
        
        panelGrupo = new JPanel();
        panelGrupo.add(this.rbPublica);
        panelGrupo.add(this.rbPrivada);
        
        this.panelDatos.add(this.lbId);
        this.panelDatos.add(this.txtId);
        this.panelDatos.add(this.lbNombre);
        this.panelDatos.add(this.txtNombre);
        this.panelDatos.add(this.lbCiudad);
        this.panelDatos.add(this.txtCiudad);
        this.panelDatos.add(this.lbCategoria);
        this.panelDatos.add(this.panelGrupo);
        this.panelDatos.add(this.lbSedes);
        this.panelDatos.add(this.txtSedes);
        this.panelDatos.add(this.lbProgramas);
        this.panelDatos.add(this.txtProgramas);
        
        this.contenedor.add(this.panelDatos, BorderLayout.CENTER);
        
    }
    
    
    
    
}
