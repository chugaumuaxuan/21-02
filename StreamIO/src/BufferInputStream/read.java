package BufferInputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class read {
	
	private static String file_Path = "D:\\text1.txt";
	private static String urlString = "https://dictionary.cambridge.org/vi/images/thumb/flower_noun_002_14403.jpg?version=5.0.213";
	
	public static void main(String[] args) throws IOException {
		File file = new File(file_Path);
		InputStream is = new FileInputStream(file);
		
		BufferedInputStream bis = new BufferedInputStream(is);
		
		int code;
		while((code = bis.read()) != -1) {
			System.out.println(code + " " + (char)code);
		}
		bis.close();
		
		//
		URL url = new URL(urlString);
		InputStream ins = url.openConnection().getInputStream();
		
		BufferedInputStream biss = new BufferedInputStream(ins);
		
		int code1;
		while((code1 = biss.read()) != -1) {
			System.out.println((char)code1);
		}
		biss.close();
	}
}
