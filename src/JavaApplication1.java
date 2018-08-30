import javax.swing.JOptionPane;   
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

        
import javazoom.jl.player.Player;
 class Mp3Logic{
	 
	 static String getRandom(String[] array) {
	     int rnd = new Random().nextInt(array.length);
	     return array[rnd];
	 }
     
     public void playSong(String songName) {
         
         
    	   new Thread () {
    		   
    		   public void run () {
    		   try{
    	             
    	             FileInputStream fis = new FileInputStream(songName);  // file input stream to locate file on system
    	             
    	             BufferedInputStream bis = new BufferedInputStream(fis);  // converting file into buffer for further use
    	             
    	              Player play = new Player(bis); 
    	             
    	             
    	               play.play();
    	               
    	               
    	          
    	              
    	             
    	         }catch(Exception e) {
    	             
    	             System.out.println(e);
    	             
    	         }
    	     	   
    		   }	   
    	   }.start();
    	 
       
    	  new Thread() {
    		  
    		  public void run() {
                          try {
                              Thread.sleep(5000);
                          } catch (InterruptedException ex) {
                              Logger.getLogger(Mp3Logic.class.getName()).log(Level.SEVERE, null, ex);
                          }
    			   JOptionPane.showMessageDialog(null, "click me to stop song");
    			   
    			   System.exit(0);
    			  
    		  }
    		  
    	  }.start();
          
    	new Thread() {
    		  
    		  public void run() {
    			  
    			   JOptionPane.showMessageDialog(null, "Suggestion");
    			   
    			  // System.exit(0);
    			  
    		  }
    		  
    	  }.start();
    	     	  
     	  
     }
  }

 

public class JavaApplication1 {
    
   
    public static void main(String[] args) {
     
           Mp3Logic obj = new Mp3Logic();
           
        
           
           
           String sad[]= {"baby","Time"};
           String sira[]= {"baby"};
           Scanner input=new Scanner(System.in);
            System.out.println("song is playing ");
            int a=Integer.parseInt(JOptionPane.showInputDialog("Press 1 for Sad & 2 for Beat Playlist :"));
    //	while(a!=3)	
      //  {
            switch (a)
    		{
    		case 1:
    			String a1=Mp3Logic.getRandom(sad);
    			obj.playSong("C:\\Users\\Dev\\Documents\\NetBeansProjects\\mp3playerr\\music\\"+a1+".mp3");
    			break;
    		case 2:
    			String a2=Mp3Logic.getRandom(sira);
    			obj.playSong("C:\\Users\\Dev\\Documents\\NetBeansProjects\\mp3playerr\\music\\"+a2+".mp3");
    			break;
                case 3:
                    System.exit(0);
    		default:
    			System.out.println("Sorry :(.... Not Found !!");
    		}
          
        //}
    	}
    }