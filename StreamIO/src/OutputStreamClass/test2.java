package OutputStreamClass;
import java.io.*;

public class test2 extends OutputStream {
	
	public void close() throws IOException { //dong luong output stream va giai phong moi tai nguyen voi stream
		super.close();
	}
	
	public void flush() throws IOException { //xa luong output stream va buoc moi bytes phai in ra ngoai
		super.flush();
	}
	
	public void write(int b) throws IOException {	// ghi byte chi dinh vao luong dau ra nay
	}
	
	public void write(byte[] b, int off, int len) throws IOException { // ghi byte tu mang chi dinh ra output stream
		super.write(b, off, len);
	}
	 
	 
}
