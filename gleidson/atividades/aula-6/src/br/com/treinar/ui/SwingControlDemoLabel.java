package br.com.treinar.ui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingControlDemoLabel {
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;

	public SwingControlDemoLabel() {
		prepareGUI();
	}

	public static void main(String[] args) {
		SwingControlDemoLabel swingControlDemo = new SwingControlDemoLabel();
		swingControlDemo.showLabelDemo();
	}

	private void prepareGUI() {
		mainFrame = new JFrame("Java Swing Examples");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(3, 1));

		MeuAdapter adapter = new MeuAdapter();
		mainFrame.addWindowListener(adapter);
		
		headerLabel = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("", JLabel.CENTER);
		statusLabel.setSize(350, 100);
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());

		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(Boolean.TRUE);
	}

	private void showLabelDemo() {
		headerLabel.setText("Control in action: JLabel");
		JLabel label = new JLabel("", JLabel.CENTER);
		label.setText("Welcome to TutorialsPoint Swing Tutorial.");
		label.setOpaque(true);
		label.setBackground(Color.PINK);
		label.setForeground(Color.WHITE);
		controlPanel.add(label);

		mainFrame.setVisible(Boolean.TRUE);
	}
}