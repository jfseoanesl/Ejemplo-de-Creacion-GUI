
package edu.unicesar.trescapas.presentacion;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.*;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jairo
 */
public class GuiConsulta extends JDialog {
    private Container contenedor;
    private JPanel pFiltro;
    private JScrollPane pTabla;
    private JTable tabla;
    private DefaultTableModel modelo;
    private String titulos[]={"Id", "Nombre", "Ciudad", "Categoria","No sedes", "No programas"};
    private String datos[][]={null,null, null,null,null, null};
    private JLabel lBusqueda;
    private JTextField tBusqueda;
    
    

    public GuiConsulta(JFrame frame, boolean bln) {
        this(frame, "Consulta de Registros", bln);
        
    }

    public GuiConsulta(JFrame frame, String string, boolean bln) {
        super(frame, string, bln);
        this.iniciarComponentes();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    
    public void iniciarComponentes()
    {   this.setIconImage(new ImageIcon("src/Recursos/consultaImg.png").getImage());
        this.contenedor = this.getContentPane();
        this.contenedor.setLayout(new BorderLayout());
        this.crearPanelFiltro();
        this.crearPanelTabla();
        
    }
    
    public void crearPanelFiltro(){
        this.pFiltro = new JPanel();
        this.pFiltro.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.lBusqueda = new JLabel("Filtro de busqueda: ");
        this.tBusqueda = new JTextField(20);
        
        
        this.pFiltro.add(this.lBusqueda);
        this.pFiltro.add(this.tBusqueda);
        
        this.contenedor.add(this.pFiltro, BorderLayout.NORTH);
    }
    
    
    
    public void crearPanelTabla(){
        this.tabla = new JTable();
        this.modelo = new DefaultTableModel(null, titulos);
        this.tabla.setModel(modelo);
        
        this.pTabla = new JScrollPane();
        this.pTabla.setViewportView(this.tabla);
        
        this.contenedor.add(this.pTabla, BorderLayout.CENTER);
    
    }
    
   
    
    
}
