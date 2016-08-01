package exam2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Chect extends Thread {

	Socket socket;
	public Chect(Socket s){
		this.socket=s;
	};
	@Override
	public void run() {
		try {
			socket.getOutputStream();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
int i=0;
while(true){
	bw.write("loop:"+i);
	sleep(1000);
	
}


		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	
}
