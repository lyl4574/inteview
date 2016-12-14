package self;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		 BufferedReader br = null;
		 int i=1;
		 BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\a.txt"));
	
		 while (i!=0){
		  br =new BufferedReader(new InputStreamReader(System.in));
		  String in = br.readLine();
		  Thread.sleep(1000);
			 bw.write(in);
			 bw.flush();
		 }
		 bw.close();
	}
}
