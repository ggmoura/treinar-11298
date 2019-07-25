package br.com.treinar.ui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MeuAdapter extends WindowAdapter {
	public void windowClosing(WindowEvent windowEvent) {
		System.exit(0);
	}

}
