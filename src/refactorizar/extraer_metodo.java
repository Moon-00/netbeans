/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizar;

/**
 *
 * @author 1cfgs
 */
public class extraer_metodo {
 
    public void imprimirTodo(){
        imprimirbanner();
        String nombre="hola";
        int cantidad=8;
        imprimirgetdetalles(nombre);
    }

    private void imprimirgetdetalles(String nombre) {
        System.out.println("nombre: "+ nombre);
        System.out.println("cantidad "+getCargoPendiente());
    }
}

