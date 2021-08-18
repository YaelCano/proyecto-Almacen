/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;

/**
 *
 * @author ACER
 */
public class controladorUsuario {
     public void controladorAccion(ActionEvent evento,Usuario unUsuario ){
         String accion=evento.getActionCommand();
         switch(accion){
             case "insertar":
                 unUsuario.insertar();
             break;
             case "modificar":
                 unUsuario.modificar();
             break;
             case "eliminar":
                 unUsuario.eliminar();
             break;
         }
     }
}
