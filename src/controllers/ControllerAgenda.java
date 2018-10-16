/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelAgenda;
import views.ViewAgenda;

/**
 *
 * @author Salvador Hernandez Mendoza
 */
public class ControllerAgenda {

    public ModelAgenda modelAgenda;
    public ViewAgenda viewAgenda;

    /**
     * Objeto de tipo ActionListener para atrapar los eventos actionPerformed y
     * llamar a los metodos para ver los registros almacenados en la bd.
     */
    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == viewAgenda.jb_primero) {
                jbtn_primero_actionPerformed();
            } else if (e.getSource() == viewAgenda.jb_anterior) {
                jbtn_anterior_actionPerformed();
            } else if (e.getSource() == viewAgenda.jb_siguiente) {
                jbtn_siguiente_actionPerformed();
            } else if (e.getSource() == viewAgenda.jb_ultimo) {
                jbtn_ultimo_actionPerformed();
            }
            else if (e.getSource() == viewAgenda.jb_nuevo) {
                jbtn_nuevo_actionPerformed();
            } 
           else if (e.getSource() == viewAgenda.jb_insertar) {
                jbtn_insertar_actionPerformed();
            }
            else if (e.getSource() == viewAgenda.jb_modificar) {
                jbtn_modificar_actionPerformed();
            }
             else if (e.getSource() == viewAgenda.jb_eliminar) {
                jbtn_eliminar_actionPerformed();
            }

        }

    };

    /**
     * Constructor de Controlador para unir el ModelAgenda y ViewAgenda
     *
     * @param modelAgenda objeto de tipo ModelAgenda
     * @param viewAgenda objeto de tipo ViewAgenda
     */
    public ControllerAgenda(ModelAgenda modelAgenda, ViewAgenda viewAgenda) {
        this.modelAgenda = modelAgenda;
        this.viewAgenda = viewAgenda;
        setActionListener();
        initDB();
    }

    /**
     * Método que llama al método conectarBD del modelo y muestra el nombre y
     * email del primer registro en las cajas de texto de ViewAgenda.
     */
    private void initDB() {
        modelAgenda.conectarDB();
        viewAgenda.jtf_nombre.setText(modelAgenda.getNombre());
        viewAgenda.jtf_email.setText(modelAgenda.getEmail());
        viewAgenda.jtf_telefono.setText(modelAgenda.getTelefono());
        
    }

//    /**
//     * Metodo para inicializar la ViewAgenda
//     */
//    public void initComponents() {
//        viewAgenda.setLocationRelativeTo(null);
//        viewAgenda.setTitle("Agenda MVC");
//        viewAgenda.setVisible(true);
//    }

    /**
     * Método para agregar el actionListener a cada boton de la vista
     */
    private void setActionListener() {
        viewAgenda.jb_primero.addActionListener(actionListener);
        viewAgenda.jb_anterior.addActionListener(actionListener);
        viewAgenda.jb_siguiente.addActionListener(actionListener);
        viewAgenda.jb_ultimo.addActionListener(actionListener);
        viewAgenda.jb_nuevo.addActionListener(actionListener);
        viewAgenda.jb_insertar.addActionListener(actionListener);
        viewAgenda.jb_modificar.addActionListener(actionListener);
        viewAgenda.jb_eliminar.addActionListener(actionListener);
    }

    /**
     * Método para ver el primer registro de la tabla contactos
     */
    private void jbtn_primero_actionPerformed() {
         modelAgenda.moverPrimerRegistro();
        setValues();
    }

    /**
     * Método para ver el registro anterior de la tabla contactos.
     */
    private void jbtn_anterior_actionPerformed() {
        modelAgenda.moverAnteriorRegistro();
        setValues();
    }

    /**
     * Método para ver el último registro de la tabla contactos.
     */
    private void jbtn_ultimo_actionPerformed() {
        modelAgenda.moverUltimoRegistro();
        setValues();
    }

    /**
     * Método para ver el siguiente registro de la tabla contactos.
     */
    private void jbtn_siguiente_actionPerformed() {
        modelAgenda.moverSiguienteRegistro();
        setValues();
    }
    
    /**
     * Método para limpiar la pantalla de registro de los contactos.
     */
    public void jbtn_nuevo_actionPerformed() {
        viewAgenda.jtf_nombre.setText(""); 
        viewAgenda.jtf_email.setText("");
        viewAgenda.jtf_telefono.setText("");
    }
        /**
         * Metodo para insertar nuevos registros a la base de datos.
         */
     public void jbtn_insertar_actionPerformed() {
        modelAgenda.setNombre(viewAgenda.jtf_nombre.getText()); 
        modelAgenda.setEmail(viewAgenda.jtf_email.getText());
        modelAgenda.setTelefono(viewAgenda.jtf_telefono.getText());
        modelAgenda.insertarRegistro(); 
    }
     
     /*
     * Metodo para modificar los registros ya existentes.
     */
     public void jbtn_modificar_actionPerformed() {
        modelAgenda.setNombre(viewAgenda.jtf_nombre.getText()); 
        modelAgenda.setEmail(viewAgenda.jtf_email.getText()); 
        modelAgenda.setTelefono(viewAgenda.jtf_telefono.getText());
        modelAgenda.modificarRegistro(); 
    }

    /**
     * Muestra el nombre, email y telefono almacenados en el modelAgenda en el viewAgenda.
     */
    private void setValues() {
        viewAgenda.jtf_nombre.setText(modelAgenda.getNombre());
        viewAgenda.jtf_email.setText(modelAgenda.getEmail());
        viewAgenda.jtf_telefono.setText(modelAgenda.getTelefono());
    }
    
    /*
    *Metodo para eliminar el registro seleccionado
    */
     public void jbtn_eliminar_actionPerformed() {
        modelAgenda.eliminarRegistro(); 
    }
}
