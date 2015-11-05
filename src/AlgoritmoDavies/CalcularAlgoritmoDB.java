package AlgoritmoDavies;


import java.util.ArrayList;
import java.util.Arrays;


/**
 * Created by DaviesTeam
 */
public class CalcularAlgoritmoDB {

    //public double calcularAlgoritmo(Double[][] objetos, String[][] gruposS){
    public double calcularAlgoritmo(Double[][] objetos, int[][] grupos){
        //Creacion de objetos
        //conversiones conv = new conversiones();
        centros cen = new centros();
        formarGrupos fg = new formarGrupos();
        distanciaEuclidiana de = new distanciaEuclidiana();
        algoritmosCH ach = new algoritmosCH();        
        //Creacion Variables
        int nObjetos;
        int nAtributos;
        int nGrupos;
        
        
        //-----Objetos-------------------
        nObjetos = objetos.length;
        nAtributos = objetos[0].length;
        
        
        //----Grupos
        nGrupos = grupos.length;
        double [][] cGrupos = new double[nGrupos][nAtributos];
        //--Formar Grupos
        cGrupos=fg.formarGrupos(cGrupos,grupos, objetos); 
        /*for (int i = 0; i < cGrupos.length; i++) {
            System.out.println(Arrays.toString(cGrupos[i]));
        }*/
        //------Distancia euclidiana
        double[] distanciasE = new double[nGrupos];
        distanciasE = de.distanciaEuclidianas(distanciasE,grupos,objetos,cGrupos);
        /*for(int i = 0; i < distanciasE.length; i++){
            System.out.println(distanciasE[i]+" ");
        }*/
        /*//---------Distancia euclidiana Cnetros centros
        double[] distanciasCC = new double [cGrupos.length];
        //distanciasCC = de.distanciaECentros(distanciasCC, cGlobalT, cGrupos);
        //--------Resultado algoritmo
        double aNumerador;
        double aDenominador;
        aNumerador = ach.algoritmoNumerador(nObjetos, nGrupos, grupos, distanciasCC);
        aDenominador = ach.algoritmoDenominador(nGrupos, distanciasE);

        return (aNumerador/aDenominador);*/
        return 0;
    }


}
