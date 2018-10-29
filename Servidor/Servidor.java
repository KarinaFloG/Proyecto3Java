import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;



public class Servidor{

	public static void main(String[] args) throws Exception,	 UnknownHostException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ServerSocket paquete_recibir = new ServerSocket(9999);
		ServerSocket funcion_parar = new ServerSocket(9998);

		Secuenciador recibido;
		ArrayList<Boolean> lins1;
		ArrayList<Boolean> lins2;
		ArrayList<Boolean> lins3;
		ArrayList<Boolean> lins4;
		int bpms;
		int contador;
		Boolean loops=false;




		while(true){

			Socket misocket = paquete_recibir.accept();
			ObjectInputStream paquete_recibido = new ObjectInputStream(misocket.getInputStream());
			recibido = (Secuenciador) paquete_recibido.readObject();

			bpms = recibido.bpm;
			loops = recibido.loop;
			contador = recibido.repeat;
			int j=0;
			if(loops == true){
			do{
			for (int i = 0;i<8 ;i++ ) {





				Thread.sleep(bpms);

				if(recibido.lin1.get(i)==true){
					Runnable t = new Reproducir("./dj1.wav");
					Thread c1 = new Thread(t);
					c1.start();
				}

				if(recibido.lin2.get(i)==true){
					Runnable t = new Reproducir("./dj2.wav");
					Thread c1 = new Thread(t);
					c1.start();
				}

				if(recibido.lin3.get(i)==true){
					Runnable t = new Reproducir("./dj3.wav");
					Thread c1 = new Thread(t);
					c1.start();
				}

				if(recibido.lin4.get(i)==true){
					Runnable t = new Reproducir("./dj4.wav");
					Thread c1 = new Thread(t);
					c1.start();
				}

				}



			}while(loops);

		}else{
			do{
			for (int i = 0;i<8 ;i++ ) {





				Thread.sleep(bpms);

				if(recibido.lin1.get(i)==true){
					Runnable t = new Reproducir("./dj1.wav");
					Thread c1 = new Thread(t);
					c1.start();
				}

				if(recibido.lin2.get(i)==true){
					Runnable t = new Reproducir("./dj2.wav");
					Thread c1 = new Thread(t);
					c1.start();
				}

				if(recibido.lin3.get(i)==true){
					Runnable t = new Reproducir("./dj3.wav");
					Thread c1 = new Thread(t);
					c1.start();
				}

				if(recibido.lin4.get(i)==true){
					Runnable t = new Reproducir("./dj4.wav");
					Thread c1 = new Thread(t);
					c1.start();
				}

				}


				j++;
			}while(j<contador);
		}


		}



	}

	}
