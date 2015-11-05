package AlgoritmoDavies;


import java.util.ArrayList;


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
        double [] cGlobal;
        //int [][] grupos;
        
        //-----Objetos-------------------
        nObjetos = objetos.length;
        nAtributos = objetos[0].length;
        cGlobal = cen.centros(objetos);
        Double[] cGlobalT = new Double [cGlobal.length];
        for(int i = 0; i< cGlobal.length; i++){
            cGlobalT[i] = cGlobal[i];
        }
        //----Grupos
        nGrupos = grupos.length;
        double [][] cGrupos = new double[nGrupos][nAtributos];
        //--Formar Grupos
        cGrupos=fg.formarGrupos(cGrupos,grupos, objetos);        
        //------Distancia euclidiana
        double[] distanciasE = new double[nGrupos];
        distanciasE = de.distanciaEuclidianas(distanciasE,grupos,objetos,cGrupos);
        //---------Distancia euclidiana Cnetros centros
        double[] distanciasCC = new double [cGrupos.length];
        distanciasCC = de.distanciaECentros(distanciasCC, cGlobalT, cGrupos);
        //--------Resultado algoritmo
        double aNumerador;
        double aDenominador;
        aNumerador = ach.algoritmoNumerador(nObjetos, nGrupos, grupos, distanciasCC);
        aDenominador = ach.algoritmoDenominador(nGrupos, distanciasE);

        return (aNumerador/aDenominador);
    }


}
