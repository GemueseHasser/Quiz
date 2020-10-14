package de.jonas.quiz;

import java.util.Timer;
import java.util.TimerTask;

public class ChangeColor {
	
	Timer timer;
	
	static float h = 0;
	static float s = 254;
	static float b = 0;
	
	static boolean hHoch = true, hRunter = false;
	static boolean bHoch = true, bRunter = false;
	static boolean sHoch = false, sRunter = true;

	public ChangeColor() {
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				if(h < 255 && hHoch == true) {
					h = h + 0.1f;
				} else if(h >= 255 && hHoch == true) {
					hRunter = true;
					h = 254;
					hHoch = false;
				} else if(h <= 0 && hRunter == true) {
					hHoch = true;
					h = 0.5f;
					hRunter = false;
				} else if(h < 255 && hRunter == true) {
					h = h - 0.1f;
				}
				
				if(b < 255 && bHoch == true) {
					b = b + 0.1f;
				} else if(b >= 255 && bHoch == true) {
					bRunter = true;
					b = 254;
					bHoch = false;
				} else if(b <= 0 && bRunter == true) {
					bHoch = true;
					b = 0.5f;
					bRunter = false;
				} else if(b < 255 && bRunter == true) {
					b = b - 0.1f;
				}
				
				if(s < 255 && sHoch == true) {
					s = s + 0.1f;
				} else if(s >= 255 && sHoch == true) {
					sRunter = true;
					s = 254;
					sHoch = false;
				} else if(s <= 0 && sRunter == true) {
					sHoch = true;
					s = 0.5f;
					sRunter = false;
				} else if(s < 255 && sRunter == true) {
					s = s - 0.1f;
				}
			}
		}, 0, 25);
	}

}
