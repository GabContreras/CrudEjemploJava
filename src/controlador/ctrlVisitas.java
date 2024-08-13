/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Estudiante
 */
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.tbVisitas;
import vista.frmVisitas;

public class ctrlVisitas implements MouseListener {
    
//3- Heredar de la clase que detecta las acciones 
   
    //1- Mandar a llamar a las otras capas 
    private tbVisitas modelo;
    private frmVisitas Vista;

    //2- Crear el constructor 
    public ctrlVisitas(tbVisitas modelo, frmVisitas Vista) {
        this.modelo = modelo;
        this.Vista = Vista;

        Vista.btnAgregar.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       if(e.getSource()== Vista.btnAgregar){
        modelo.setNombre(Vista.txtNombre.getText());
        modelo.setEdad(Integer.parseInt(Vista.txtEdad.getText()));
        modelo.setEspecialidad(Vista.txtEspecialidad.getText());
        
        modelo.Guardar();
       }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}

