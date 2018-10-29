import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class Cliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket paquete_enviar = new Socket("127.0.0.1",9999);
		Paquete_envio salida = new Paquete_envio();
		ObjectOutputStream paquete_salida = new ObjectOutputStream(paquete_enviar.getOutputStream());
		paquete_salida.writeObject(salida);
		paquete_enviar.close();

	}

}

class Paquete_envio implements Serializable{
    public ArrayList<Boolean> lin1 = new ArrayList<Boolean>();
    public ArrayList<Boolean> lin2 = new ArrayList<Boolean>();
    public ArrayList<Boolean> lin3 = new ArrayList<Boolean>();
    public ArrayList<Boolean> lin4 = new ArrayList<Boolean>();

    public Paquete_envio(){
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
