package BufferOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DinhNghia extends BufferedOutputStream {

	public DinhNghia(OutputStream out, int size) { //constructor
		super(out, size);
	}
	
	@Override
	public synchronized void write(int b) throws IOException { //ghi bytes chi dinh vao BufferOutputStream
		super.write(b);
	}
	
	@Override
	public synchronized void write(byte[] b, int off, int len) throws IOException { //ghi bytes tu dau vao chi dinh vao mot mang byte chi dinh, bat dau tu do lech da cho
		super.write(b, off, len);
	}
	
	@Override
	public synchronized void flush() throws IOException { //xa luong output stream va buoc moi bytes phai in ra ngoai
		super.flush();
	}
	
	@Override
	public void close() throws IOException { //dong luong output stream va giai phong moi tai nguyen voi stream
		super.close();
	}
	
}
