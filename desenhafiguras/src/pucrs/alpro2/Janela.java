package pucrs.alpro2;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Janela {

	private JFrame frame;
	private PainelDesenho painel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela window = new Janela();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Janela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Desenho de figuras");
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		painel = new PainelDesenho();
        frame.getContentPane().add(painel);
        frame.setVisible(true);
	}

}
