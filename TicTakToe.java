import java.awt.*;
import java.awt.event.*;

class TicTakToe extends Frame implements ActionListener
{
	Button[] b = new Button[9];
	int k=0;
	int x=100;
	int y = 100;
TicTakToe()
{
	Font f = new Font("Broadway",Font.BOLD,24);
	setFont(f);
setLocation(100,50);
setSize(700,600);
setLayout(null);
setVisible(true);
addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});

for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		b[k] = new Button("");
		b[k].setLocation(x,y);
		b[k].setSize(100,100);
		add(b[k]);
		b[k].addActionListener(this);
		x += 100;
        k++;		
	}
	x = 100;
	y += 100;
}

}
int c=0;
public void actionPerformed(ActionEvent e)
{
	Button bu = (Button)e.getSource();
	if(c%2 == 0)
		bu.setLabel("0");
	else
		bu.setLabel("X");
	c++;
		
	if(b[0].getLabel() == "0"&& b[1].getLabel()== "0" && b[2].getLabel() == "0" || 
	b[3].getLabel() == "0"&& b[4].getLabel()== "0" && b[5].getLabel() == "0" || 
	b[6].getLabel() == "0"&& b[7].getLabel()== "0" && b[8].getLabel() == "0" ||
	b[0].getLabel() == "0"&& b[3].getLabel()== "0" && b[6].getLabel() == "0" ||
	b[1].getLabel() == "0"&& b[4].getLabel()== "0" && b[7].getLabel() == "0" ||
	b[2].getLabel() == "0"&& b[5].getLabel()== "0" && b[8].getLabel() == "0" ||
	b[0].getLabel() == "0"&& b[4].getLabel()== "0" && b[8].getLabel() == "0" ||
	b[2].getLabel() == "0"&& b[4].getLabel()== "0" && b[6].getLabel() == "0"){
    System.out.println("Player 1 is Winner");
    System.exit(0);
	
	}
	
	
	
	else if(b[0].getLabel() == "X"&& b[1].getLabel()== "X" && b[2].getLabel() == "X" || 
	b[3].getLabel() == "X"&& b[4].getLabel()== "X" && b[5].getLabel() == "X" || 
	b[6].getLabel() == "X"&& b[7].getLabel()== "X" && b[8].getLabel() == "X" ||
	b[0].getLabel() == "X"&& b[3].getLabel()== "X" && b[6].getLabel() == "X" ||
	b[1].getLabel() == "X"&& b[4].getLabel()== "X" && b[7].getLabel() == "X" ||
	b[2].getLabel() == "X"&& b[5].getLabel()== "X" && b[8].getLabel() == "X" ||
	b[0].getLabel() == "X"&& b[4].getLabel()== "X" && b[8].getLabel() == "X" ||
	b[2].getLabel() == "X"&& b[4].getLabel()== "X" && b[6].getLabel() == "X"){
    System.out.println("Player 2 is Winner"); 
    System.exit(0);
	
	}
	
	bu.removeActionListener(this);

	
	
}


public static void main(String []args)
{
   TicTakToe tik = new TicTakToe();
}

}