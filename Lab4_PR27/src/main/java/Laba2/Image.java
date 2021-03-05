package Laba2;

import java.awt.Graphics;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class Image extends JComponent {
	
	BufferedImage image;
	
	public Image() {
		try
		{
			image = ImageIO.read(new URL("http://326605.selcdn.ru/03005/iblock/d81/a1HGnqQl1BI.jpg"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		if(image == null) return;
		
		g.drawImage(image.getScaledInstance(158, 78, java.awt.Image.SCALE_SMOOTH), 0, 0, null);
	}
}
