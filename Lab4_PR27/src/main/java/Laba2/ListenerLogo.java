package Laba2;

import java.awt.event.*;
import javax.swing.JComponent;

//Слушатель, создающий при нажатии кнопки изображение(или двигает уже существующее)
public class ListenerLogo implements ActionListener {
	
	private JComponent image;
	
	public ListenerLogo(JComponent j) {
		image=j;
	}
	
	@Override // ключевое слово, которое позволяет в дочернем классе заново создать реализацию метода родительского класса
	public void actionPerformed(ActionEvent arg0) {
		image.setBounds(200,40,158,78);
	}
}
