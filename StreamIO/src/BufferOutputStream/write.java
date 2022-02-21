package BufferOutputStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;



public class write {
	private static final String file_path = "D:\\text2.txt";
	
	public static void main(String[] args) throws IOException {
		File outFile = new File(file_path);
		outFile.getParentFile().mkdirs();
		
		OutputStream os = new FileOutputStream(outFile);
		
		BufferedOutputStream br = new BufferedOutputStream(os);
		
		br.write("Hello ".getBytes("UTF-8"));
		br.write("VietNam".getBytes("UTF-8"));
		
		br.flush();
		br.close();
	}
}
