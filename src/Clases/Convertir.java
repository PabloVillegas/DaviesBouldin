/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author v
 */
public class Convertir {

    public Convertir() {
    }
    
    public Double[][] convertirObjetos(String[][] objetos){
        Double[][] objetosD = new Double[objetos.length][objetos[0].length];
        for (int i = 0; i < objetos.length; i++) {
            for (int j = 0; j < objetos[i].length; j++) {
                if(objetos[i][j]==null){
                    objetosD[i][j] = null;
                }else{
                    objetosD[i][j] = objetos[i][j];
                }
            }
        }
        return objetosD;
    }
}
