/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Arrays;

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
                    objetosD[i][j] = Double.parseDouble(objetos[i][j]);
                }
            }
        }
        
        /*for (int i = 0; i < objetosD.length; i++) {
            System.out.println(Arrays.toString(objetosD[i]));
        }*/
        return objetosD;
    }
    
    public int[][] convertirGruposObjetos(String[][] gruposObjetos){
        int[][] objetosG = new int[gruposObjetos.length][];
        for (int i = 0; i < gruposObjetos.length; i++) {
            objetosG[i] = new int[gruposObjetos[i].length-1];
            for (int j = 0; j < gruposObjetos[i].length-1; j++) {                
                objetosG[i][j] = Integer.parseInt(gruposObjetos[i][j+1]);                
            }
        }
        
        /*for (int i = 0; i < objetosG.length; i++) {
            System.out.println(Arrays.toString(objetosG[i]));
        }*/
        
        return objetosG;
    }
}
