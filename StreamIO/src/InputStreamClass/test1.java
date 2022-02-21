package InputStreamClass;
import java.io.*;

public class test1 extends InputStream{
	
	
	@Override
	public synchronized void mark(int readlimit) {  //mark danh dau vi tri hien tai cua luong vao, readlimit la so byte toi da co the doc
		super.mark(readlimit);
	}

	@Override
	public int read() throws IOException { // doc byte tiep theo tu InputStream
		return 0;
	}
	
	@Override
	public void close() throws IOException { // dong luong input va giai phong tai nguyen voi trinh thu gom rac
		super.close();
	}
	
	@Override
	public int read(byte[] b) throws IOException { // 
		return super.read(b);
	}
	
	@Override
	public synchronized void reset() throws IOException { // dinh vi lai InputStream vao vi tri danh dau
		super.reset();
	}
	
	@Override
	public boolean markSupported() { // goi lai phuon thuc mark 
		return super.markSupported();
	}
	
	@Override
	public long skip(long n) throws IOException { // bo qua byte va doi so trong InputStream
		return super.skip(n);
	}

}
