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

    public class rename {
    int contadorpares=0;
    for(int i=0;i<10;i++){
        comparar();
    System.out.println("hay"+contadorpares+"números pares del 0 al 10");
    }

    private void comparar() {
        if(i%2==0){
            contadorpares++;
        }
    }
}

