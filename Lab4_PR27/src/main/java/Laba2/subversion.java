package Laba2; //пакет Java классов

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //библиотека для события слушателя
import javax.swing.*; // Библиотека для GUI (построена на основе awt)

public class subversion {
	int[] randArr;
	JTextField outArrayAll;

	public subversion() {
	JFrame main_GUI = new JFrame("subversion");	// создание графического окна
	main_GUI.setTitle ("Using subversion for developers");
	main_GUI.setBounds(500,400,800,320);
	main_GUI.setResizable(false); // фиксированный размер окна
	
	
	
	JPanel main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	JLabel laba_info = new JLabel("Лабораторная работа №2"); // Отображение текста или изображения
	laba_info.setBounds(120,0,150,30);
	main_panel.add(laba_info);
	
	JButton button_exit = new JButton("Выход"); // добавляем кнопку
	button_exit.setBounds(250,200,120,50);
	ActionListener actionListener = new ListenerButton(); //создаем слушатель
	button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
	main_panel.add(button_exit);
		
	JButton button_info = new JButton("Информация"); // добавляем кнопку
	button_info.setBounds(30,200,120,50);
	ActionListener info_listener = new info_button(); //создаем слушатель 
	button_info.addActionListener(info_listener); // добавляем слушатель к кнопке
	main_panel.add(button_info);
	
	JMenuBar menu = new JMenuBar(); //Создаём полоску меню
	JMenu menuMain = new JMenu("Главная"); //Создаём главное меню
	JMenuItem menuExit = new JMenuItem("Выход"); //Создаём кнопку выход
	JMenuItem menuImage = new JMenuItem("Отобразить логотип УГАТУ"); //Создаём кнопку отображения логотипа
	JMenuItem menuLoad = new JMenuItem("Загрузить файл в проект27"); //Создаём загрузки файла
	
	
	Image image = new Image(); //Создаём элемент, который будет хранить изображение и добавляем к панельке
	main_panel.add(image);
	
	menuExit.addActionListener(actionListener); //добавление слушателя к кнопке выхода в меню
	ActionListener logo_Listener = new ListenerLogo(image); //создаём слушатель
	menuImage.addActionListener(logo_Listener); //добавление слушателя к кнопке отображения логотипа
		
	//добавляем пункты меню и само меню в полоску
	menu.add(menuMain);
	menuMain.add(menuExit);
	menuMain.add(menuImage);
	menuMain.add(menuLoad);
	main_GUI.setJMenuBar(menu);//Подключаем полоску меню к окну
	
	String[] transfer = {"Переместить логотип УГАТУ в верхний правый угол", "Переместить логотип УГАТУ в середину", "Переместить логотип УГАТУ в левый верхний угол", "Отсортировать данные в проекте27"};
	JComboBox combo_trans = new JComboBox(transfer);
	combo_trans.setBounds(30,140,350,30);
	outArrayAll = new JTextField("");
	ActionListener list_transfer1 = new list_transfer(image,outArrayAll,this);
	combo_trans.addActionListener(list_transfer1);
	main_panel.add(combo_trans);
	
	JLabel radiusLabel = new JLabel("Радиус: "); // Отображение текста или изображения
	radiusLabel.setBounds(450,10,50,30);
	main_panel.add(radiusLabel);
	JTextField inputRadius = new JTextField(""); // Отображение текста или изображения
	inputRadius.setBounds(500,10,40,30);
	main_panel.add(inputRadius);
	
	JLabel heightLabel = new JLabel("Высота: "); // Отображение текста или изображения
	heightLabel.setBounds(450,50,50,30);
	main_panel.add(heightLabel);
	JTextField inputHeight = new JTextField(""); // Отображение текста или изображения
	inputHeight.setBounds(500,50,40,30);
	main_panel.add(inputHeight);
	
	JLabel sLabel = new JLabel("Площадь цилиндра: "); // Отображение текста или изображения
	sLabel.setBounds(400,130,100,30);
	main_panel.add(sLabel);
	JTextField inputS = new JTextField(""); // Отображение текста или изображения
	inputS.setBounds(500,130,40,30);
	main_panel.add(inputS);
	inputS.setEditable(false);
	
	JButton Outbutton = new JButton("Расчитать"); // добавляем кнопку
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
	 // Отображение текста или изображения
	outArrayAll.setBounds(550,80,230,30);
	main_panel.add(outArrayAll);
	outArrayAll.setEditable(false);
	
	JButton OutbuttonMass = new JButton("Создать массив"); // добавляем кнопку
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

	
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
	}
	
	
	
	
	public static void main(String[] args) { // интересные заметки: http://www.mstu.edu.ru/study/materials/java/
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


