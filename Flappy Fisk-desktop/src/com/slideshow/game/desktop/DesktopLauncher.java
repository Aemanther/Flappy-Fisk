package com.slideshow.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.slideshow.game.FlappyFisk;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Flappy Fisk";
		config.width = 360;
		config.height = 640;
		config.vSyncEnabled = true;
		config.resizable = false;
		
		new LwjglApplication(new FlappyFisk(), config);
	}
}