
import java.util.ArrayList;
import java.io.Serializable;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hector
 */
public class Secuenciador implements Serializable{
    public ArrayList<Boolean> lin1 = new ArrayList<Boolean>();
    public ArrayList<Boolean> lin2 = new ArrayList<Boolean>();
    public ArrayList<Boolean> lin3 = new ArrayList<Boolean>();
    public ArrayList<Boolean> lin4 = new ArrayList<Boolean>();
    public int bpm = 0;
    public Boolean loop = false;
    public int repeat;
   
    public Secuenciador(){
        llenarFalse(lin1);
        llenarFalse(lin2);
        llenarFalse(lin3);
        llenarFalse(lin4);
    }
    public void llenarFalse(ArrayList<Boolean> lin){
       for(int i=0 ; i<8 ; i++){
            lin.add(false);
        }
    }
    
}
