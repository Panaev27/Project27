package Laba2;

import java.awt.event.*;
import javax.swing.JComponent;

//���������, ��������� ��� ������� ������ �����������(��� ������� ��� ������������)
public class ListenerLogo implements ActionListener {
	
	private JComponent image;
	
	public ListenerLogo(JComponent j) {
		image=j;
	}
	
	@Override // �������� �����, ������� ��������� � �������� ������ ������ ������� ���������� ������ ������������� ������
	public void actionPerformed(ActionEvent arg0) {
		image.setBounds(200,40,158,78);
	}
}
