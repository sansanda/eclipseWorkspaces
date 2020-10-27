package audio;

import java.util.Timer;
import java.util.TimerTask;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Audio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ruido blanco
		Timer myTimer = new Timer();
		TimerTask tarea = new TimerTask() {
		   @Override
		   public void run() {
		       try {
		           Clip sonido = AudioSystem.getClip();
		           
		           //System.out.println((i +=1) +" Se carga con un fichero wav");
		           AudioInputStream audioStream = AudioSystem.getAudioInputStream(getClass().getResource("/audio/pip.wav"));
		           
		           sonido.open(audioStream);

		           sonido.start();


		     } catch (Exception e) {
		    	 e.printStackTrace();
		         System.out.println("" + e.toString());
		     }
		   }
		};  
		myTimer.schedule(tarea, 0,2000);
		//fin ruido blanco
	}

}
