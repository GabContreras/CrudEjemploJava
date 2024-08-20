/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Estudiante
 */
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.tbVisitas;
import vista.frmVisitas;

public class ctrlVisitas implements MouseListener, KeyListener {

//3- Heredar de la clase que detecta las acciones 
    //1- Mandar a llamar a las otras capas 
    private tbVisitas modelo;
    private frmVisitas Vista;

    //2- Crear el constructor 
    public ctrlVisitas(tbVisitas modelo, frmVisitas Vista) {
        this.modelo = modelo;
        this.Vista = Vista;

        Vista.btnAgregar.addMouseListener(this);
        modelo.Mostrar(Vista.jtbPacientes);
        Vista.btnEliminar.addMouseListener(this);
        Vista.btnActualizar.addMouseListener(this);
        Vista.BtnLimpiar.addMouseListener(this);
        Vista.jtbPacientes.addMouseListener(this);
        Vista.txtBuscar.addKeyListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == Vista.btnAgregar) {
            modelo.setNombre(Vista.txtNombre.getText());
            modelo.setEdad(Integer.parseInt(Vista.txtEdad.getText()));
            modelo.setEspecialidad(Vista.txtEspecialidad.getText());

            modelo.Guardar();
            modelo.Mostrar(Vista.jtbPacientes);

        }
        if (e.getSource() == Vista.btnEliminar) {
            modelo.Eliminar(Vista.jtbPacientes);
            modelo.Mostrar(Vista.jtbPacientes);
        }
        if (e.getSource() == Vista.jtbPacientes) {
            modelo.cargarDatosTabla(Vista);
        }
        if (e.getSource() == Vista.btnActualizar) {
            modelo.setNombre(Vista.txtNombre.getText());
            modelo.setEdad(Integer.parseInt(Vista.txtEdad.getText()));
            modelo.setEspecialidad(Vista.txtEspecialidad.getText());
            modelo.Actualizar(Vista.jtbPacientes);
            modelo.Mostrar(Vista.jtbPacientes);
        }
        if (e.getSource() == Vista.BtnLimpiar) {
            modelo.Limpiar(Vista);
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

    @Override
    public void keyTyped(KeyEvent e) {
          if (e.getSource() == Vista.txtBuscar) {
            modelo.Buscar(Vista.jtbPacientes, Vista.txtBuscar);
        }
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
