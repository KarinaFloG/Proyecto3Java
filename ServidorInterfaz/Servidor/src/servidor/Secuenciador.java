package servidor;

import java.util.ArrayList;
import java.io.Serializable;


public class Secuenciador implements Serializable{
    public ArrayList<Boolean> lin1 = new ArrayList<Boolean>();
    public ArrayList<Boolean> lin2 = new ArrayList<Boolean>();
    public ArrayList<Boolean> lin3 = new ArrayList<Boolean>();
    public ArrayList<Boolean> lin4 = new ArrayList<Boolean>();
    public int bpm;
    public Boolean loop;
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