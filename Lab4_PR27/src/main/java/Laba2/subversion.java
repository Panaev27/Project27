package Laba2; //����� Java �������

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //���������� ��� ������� ���������
import javax.swing.*; // ���������� ��� GUI (��������� �� ������ awt)

public class subversion {
	int[] randArr;
	JTextField outArrayAll;

	public subversion() {
	JFrame main_GUI = new JFrame("subversion");	// �������� ������������ ����
	main_GUI.setTitle ("Using subversion for developers");
	main_GUI.setBounds(500,400,800,320);
	main_GUI.setResizable(false); // ������������� ������ ����
	
	
	
	JPanel main_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	JLabel laba_info = new JLabel("������������ ������ �2"); // ����������� ������ ��� �����������
	laba_info.setBounds(120,0,150,30);
	main_panel.add(laba_info);
	
	JButton button_exit = new JButton("�����"); // ��������� ������
	button_exit.setBounds(250,200,120,50);
	ActionListener actionListener = new ListenerButton(); //������� ���������
	button_exit.addActionListener(actionListener); // ��������� ��������� � ������
	main_panel.add(button_exit);
		
	JButton button_info = new JButton("����������"); // ��������� ������
	button_info.setBounds(30,200,120,50);
	ActionListener info_listener = new info_button(); //������� ��������� 
	button_info.addActionListener(info_listener); // ��������� ��������� � ������
	main_panel.add(button_info);
	
	JMenuBar menu = new JMenuBar(); //������ ������� ����
	JMenu menuMain = new JMenu("�������"); //������ ������� ����
	JMenuItem menuExit = new JMenuItem("�����"); //������ ������ �����
	JMenuItem menuImage = new JMenuItem("���������� ������� �����"); //������ ������ ����������� ��������
	JMenuItem menuLoad = new JMenuItem("��������� ���� � ������27"); //������ �������� �����
	
	
	Image image = new Image(); //������ �������, ������� ����� ������� ����������� � ��������� � ��������
	main_panel.add(image);
	
	menuExit.addActionListener(actionListener); //���������� ��������� � ������ ������ � ����
	ActionListener logo_Listener = new ListenerLogo(image); //������ ���������
	menuImage.addActionListener(logo_Listener); //���������� ��������� � ������ ����������� ��������
		
	//��������� ������ ���� � ���� ���� � �������
	menu.add(menuMain);
	menuMain.add(menuExit);
	menuMain.add(menuImage);
	menuMain.add(menuLoad);
	main_GUI.setJMenuBar(menu);//���������� ������� ���� � ����
	
	String[] transfer = {"����������� ������� ����� � ������� ������ ����", "����������� ������� ����� � ��������", "����������� ������� ����� � ����� ������� ����", "������������� ������ � �������27"};
	JComboBox combo_trans = new JComboBox(transfer);
	combo_trans.setBounds(30,140,350,30);
	outArrayAll = new JTextField("");
	ActionListener list_transfer1 = new list_transfer(image,outArrayAll,this);
	combo_trans.addActionListener(list_transfer1);
	main_panel.add(combo_trans);
	
	JLabel radiusLabel = new JLabel("������: "); // ����������� ������ ��� �����������
	radiusLabel.setBounds(450,10,50,30);
	main_panel.add(radiusLabel);
	JTextField inputRadius = new JTextField(""); // ����������� ������ ��� �����������
	inputRadius.setBounds(500,10,40,30);
	main_panel.add(inputRadius);
	
	JLabel heightLabel = new JLabel("������: "); // ����������� ������ ��� �����������
	heightLabel.setBounds(450,50,50,30);
	main_panel.add(heightLabel);
	JTextField inputHeight = new JTextField(""); // ����������� ������ ��� �����������
	inputHeight.setBounds(500,50,40,30);
	main_panel.add(inputHeight);
	
	JLabel sLabel = new JLabel("������� ��������: "); // ����������� ������ ��� �����������
	sLabel.setBounds(400,130,100,30);
	main_panel.add(sLabel);
	JTextField inputS = new JTextField(""); // ����������� ������ ��� �����������
	inputS.setBounds(500,130,40,30);
	main_panel.add(inputS);
	inputS.setEditable(false);
	
	JButton Outbutton = new JButton("���������"); // ��������� ������
	Outbutton.setBounds(450,200,100,45);
	main_panel.add(Outbutton);
	
	Outbutton.addActionListener(new ActionListener() {	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (isNumeric(inputRadius.getText())&&isNumeric(inputHeight.getText())) { 	
		inputS.setText(String.valueOf(2*3.14*Double.parseDouble(inputRadius.getText())*(Double.parseDouble(inputRadius.getText())+Double.parseDouble(inputHeight.getText()))));
		}
		}
	});
	 // ����������� ������ ��� �����������
	outArrayAll.setBounds(550,80,230,30);
	main_panel.add(outArrayAll);
	outArrayAll.setEditable(false);
	
	JButton OutbuttonMass = new JButton("������� ������"); // ��������� ������
	OutbuttonMass.setBounds(600,200,150,45);
	main_panel.add(OutbuttonMass);
	
	OutbuttonMass.addActionListener(new ActionListener() {	
	@Override
	public void actionPerformed(ActionEvent e) {
		String output ="";
		randArr = ArrayLab5.randomArray();
		for (int i=0;i<randArr.length;i++) {
			output+=randArr[i]+";";
		}
		outArrayAll.setText(output);
		}
	});

	main_GUI.setVisible(true);

	
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �������� ���� JFrame � �������� Java
	}
	
	
	
	
	public static void main(String[] args) { // ���������� �������: http://www.mstu.edu.ru/study/materials/java/
		subversion student= new subversion();
		
	}
	public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
	
	public void sortRandArr() {
		String output ="";
		int[] sortedArr = BubbleSort.bubbleSort(randArr);
		for (int i=0;i<sortedArr.length;i++) {
			output+=sortedArr[i]+";";
		}
		outArrayAll.setText(output);
	}
}


