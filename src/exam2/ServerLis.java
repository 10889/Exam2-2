package exam2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.locks.Condition;

import javax.swing.JOptionPane;

public class ServerLis extends Thread {
@SuppressWarnings("resource")
@Override
public void run() {
	try {
		
		ServerSocket serverSocket = new ServerSocket(12345);
		while(true){
			Socket	socket=serverSocket.accept();
			JOptionPane.showMessageDialog(null, 
					"�пͻ����ӵ��˱�����12345�˿�");
			new Chect(socket).start();
			
		}
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
