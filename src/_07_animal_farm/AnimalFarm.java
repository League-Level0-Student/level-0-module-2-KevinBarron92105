//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _07_animal_farm;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {
	
	public static void main(String[] args) {
			
		/* 1. Ask the user which animal they want, then play the sound of that animal. */			 
		String name =JOptionPane.showInputDialog("What animal would u like");
		/* 2. Make it so that the user can keep entering new animals. */
		if(name.equals("cow")){
		playMoo();
		}if(name.equals("duck")) {
			playQuack();
		}if(name.equals("dog")) {
			playWoof();
		}if(name.equals("cat")) {
			playMeow();
		}if(name.equals("llama")){
			playLlama();
		}
	}
	
	
	
	static void playMoo() {
		playNoise(mooFile);

}

	static void playQuack() {
		playNoise(quackFile);
			
	}

	static void playWoof() {
		playNoise(woofFile);
	}
	
	static void playMeow() {
		playNoise(meowFile);
	}
	
	static void playLlama() {
		playNoise(llamaFile);
	}

	static String quackFile = "quack.wav";
	static String mooFile = "moo.wav";
	static String woofFile = "woof.wav";
	static String meowFile = "meow.wav";
	static String llamaFile = "llama.wav";

	/* Ignore this stuff */
	
	public static void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(AnimalFarm.class.getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}