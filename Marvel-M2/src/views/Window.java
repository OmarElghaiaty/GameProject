package views;

/*//import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.abilities.Ability;
import engine.Game;
import engine.Player;

//	public class Window extends JFrame implements ActionListener{
		
		private PlayerNameWindow playerNameWindow ;
		private ChampionSelectWindow championSelectWindow ;
		private GamePlay gamePlay;
		private Game game;
		private Player p1;
		private	Player p2;
		
		public Window() throws IOException {
			
//			File file = new File("My Song.wav");
//			AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
//			Clip clip = AudioSystem.getClip();
//			clip.open(audioStream);
			
			//playerNameWindow = new PlayerNameWindow();
//			championSelectWindow = new ChampionSelectWindow();

			Game.loadAbilities("Abilities.csv");
			Game.loadChampions("Champions.csv");
			
			this.setLocation(0,0);
			this.setSize(1000,1000);
			this.setLayout(null);
			this.setTitle("Marvel: EndGame");
			//this.add(playerNameWindow);
			//this.getContentPane().add(championSelectWindow);
//			clip.start();
//			clip.loop(1000);
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
//		public void ToSelection(String n1, String n2){	
//			p1 = new Player(n1);
//			p2 = new Player(n2);
//			
//			try {
//				Game.loadAbilities("Abilities.csv");
//				Game.loadChampions("Champions.csv");
//				this.setBounds(0, 0, 600, 600);
//				this.remove(playerNameWindow);
////				championSelectWindow = new  ChampionSelectWindow(this); 
////				this.getContentPane().add(championSelectWindow);
//				
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			
//		}
		
		public void ToNames(){
			
		}

		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == playerNameWindow.getButton())
			{
				if(playerNameWindow.getField1().getText().equals("") || playerNameWindow.getField2().getText().equals("") )
				{
					JOptionPane.showMessageDialog(this, "Both players must have a name" , "Error" , JOptionPane.ERROR_MESSAGE);
					return;
				}
				System.out.println(playerNameWindow.getField1().getText());
				System.out.println(playerNameWindow.getField2().getText());
				
				
//				p1 = new Player(playerNameWindow.getField1().getText());
//				p2 = new Player(playerNameWindow.getField2().getText());
				System.out.println("woah");
				championSelectWindow = new ChampionSelectWindow(playerNameWindow.getP1(), playerNameWindow.getP2());
				
				this.add(championSelectWindow);
				playerNameWindow.hide();
			
		}
		
//		public static void main(String[]args){
////			Window w = new Window();
//		}
		}
//	}*/



