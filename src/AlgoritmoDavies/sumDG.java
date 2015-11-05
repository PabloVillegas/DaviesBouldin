/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmoDavies;

/**
 *
 * @author v
 */
public class sumDG {
    public double[] resSumDG(double[] distanciasE, int[][] grupos){
        double[] resultadoSDG =  new double[distanciasE.length];                      
        for (int i = 0; i < resultadoSDG.length; i++) {
            resultadoSDG[i] = (distanciasE[i]/grupos[i].length);
        }
        
        for (int i = 0; i < resultadoSDG.length; i++) {
            System.out.println(resultadoSDG[i]);
        }
        
        return resultadoSDG;
    }
}
