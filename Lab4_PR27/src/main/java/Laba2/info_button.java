package Laba2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class info_button implements ActionListener {

	@Override // ключевое слово, которое позволяет в дочернем классе заново создать реализацию метода родительского класса
	public void actionPerformed(ActionEvent arg0) {
		
		JFrame form2 = new JFrame("subversion");	// создание графического окна
		form2.setTitle ("Окно с информацией");
		form2.setBounds(500,400,400,350);
		form2.setResizable(false); // фиксированный размер окна
		form2.setVisible(true);
		
		JButton button = new JButton("Назад"); // добавляем кнопку
		button.setBounds(150,250,100,45);
		form2.add(button);
		
		//функция на закрытие окна
		button.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		form2.dispose();
		}
		});
		
		//добавление 
		JLabel info = new JLabel("Выполнили 2 курс группа ПИ-223:"); // Отображение текста или изображения
		info.setBounds(120,0,350,30);
		form2.add(info);
		
		try {
            
            BufferedReader reader = new BufferedReader (new FileReader(new File(new File(info_button.class.getProtectionDomain().getCodeSource().getLocation().getPath()).getParent()+File.separator+"Text.txt")));
            JLabel info_label1 = new JLabel(reader.readLine());  //читает первую строку
            info_label1.setBounds(50,50,350,100);
            form2.add(info_label1);
            JLabel info_label2 = new JLabel(reader.readLine()); //читает вторую строку
            info_label2.setBounds(50,100,350,100);
            form2.add(info_label2);
            JLabel info_label3 = new JLabel(reader.readLine()); //читает третью строку
            info_label3.setBounds(50,150,350,100);
            form2.add(info_label3);
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

		//JLabel info_label1 = new JLabel("Панаев С.И. - номер зачетной книжки: 19130630 ");
		//info_label1.setBounds(50,50,350,100);
		//form2.add(info_label1);
		
		//JLabel info_label2 = new JLabel("Никулова К.Д. - номер зачетной книжки: 19130619");
	    //info_label2.setBounds(50,100,350,100);
	    //form2.add(info_label2);
		
	    //JLabel info_label3 = new JLabel("Дёмин Р.А. - номер зачетной книжки: 19130602");
      	//info_label3.setBounds(50,150,350,100);
	   // form2.add(info_label3);
		
	    JLabel info_label = new JLabel();
	    form2.add(info_label);
	
	
	}

}
