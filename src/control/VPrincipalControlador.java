package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class VPrincipalControlador implements ActionListener , KeyListener{

	private JTextField txtContenido;
	
	public VPrincipalControlador(JTextField txtContenido) {
		super();
		this.txtContenido = txtContenido;
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		//Object o = e.getSource(); // Con el objeto
		String s= e.getActionCommand();//Con un action command que hemos determinado 
//		if(o==boton2) {
//			System.out.println("Boton dos");
//		}
//		else if (s.equals("Uno")) {
//			System.out.println("Boton uno");
//		}
//		else if(o==boton3) {
//		System.out.println("Boton 3");
//	}
		switch (s) {
		case "Uno":txtContenido.setText("Uno");break;
		case "Dos":txtContenido.setText("Dos");break;
		case "Tres":txtContenido.setText("Tres");break;
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
