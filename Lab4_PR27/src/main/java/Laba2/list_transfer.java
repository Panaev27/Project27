package Laba2;

import java.awt.event.*;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTextField;

//���������, ��������� ��� ������� ������ �����������(��� ������� ��� ������������)
public class list_transfer implements ActionListener {
	
	private JComponent image;
	private JTextField outputArea;
	subversion mainFrame;
	
	public list_transfer(JComponent j, JTextField output, subversion frame) {
		mainFrame=frame;
		outputArea=output;
		image=j;
	}
	
	@Override // �������� �����, ������� ��������� � �������� ������ ������ ������� ���������� ������ ������������� ������
	public void actionPerformed(ActionEvent arg0) {
		JComboBox box = (JComboBox) arg0.getSource();
		switch (box.getSelectedIndex()) {
		case (0): 
			image.setLocation(200,40);
		    break;
		case (1):
			image.setLocation(120,40);
			break;
		case (2):
			image.setLocation(10,40);
			break;
		case (3):
			mainFrame.sortRandArr();
			break;
		}
		// ����������� �������� � ����������� �� ������ ������������.
	}
}
