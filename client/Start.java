import javax.swing.JOptionPane;
import java.net.Socket;


public class Start {
	static String port="4907";
	public static void main(String args[]) {
		
		String ip=JOptionPane.showInputDialog("Please Enter Server IP");
		new Start().initialize(ip,Integer.parseInt(port));
		
		
	}
	
	public void initialize(String ip, int port)
	{
	
		try
		{
			Socket sc=new Socket(ip,port);
			System.out.println("Connecting to server");
			Authentication framel=new Authentication(sc);
			framel.setSize(300,80);
			framel.setLocation(500,300);
			framel.setVisible(true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}