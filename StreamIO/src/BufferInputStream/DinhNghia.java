package BufferInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class DinhNghia extends BufferedInputStream {

	public DinhNghia(InputStream in, int size) { //Constructor
		super(in, size);
	}
	
	@Override
	public synchronized int read() throws IOException { //doc 1 byte, tra ve -1 khi den cuoi luong
		return super.read();
	}
	
	@Override
	public int read(byte[] b) throws IOException { //doc cac byte tu InputStream va gan cho phan tu cua mang va tra ve so bytes vua doc 
		return super.read(b);
	}
	
	@Override
	public int readNBytes(byte[] b, int off, int len) throws IOException { 
		return super.readNBytes(b, off, len);
	}
	
	@Override
	public byte[] readAllBytes() throws IOException {
		return super.readAllBytes();
	}
	
	@Override
	public void close() throws IOException { // dong luong va giai phong tai nguyen he thong lien ket voi cac luong do
		super.close();
	}
	
	@Override
	public synchronized long skip(long n) throws IOException { // chan toi khi co bytes hoac xay ra loi io hoac da den cuoi luong
		return super.skip(n);
	}
	
	@Override
	public long transferTo(OutputStream out) throws IOException { // doc tat ca cac byte tu InputStream, roi ghi toi doi tuong OutputStream chi dinh, 
																//dong thoi tra ve so bytes duoc chuyen den OutputStream
		return super.transferTo(out);
	}
	
	@Override
	public synchronized void mark(int readlimit) { //danh dau vi tri hien tai tren luong, co the doc cac byte tiep theo, readlimit la so bytes toi da co the doc sau khi danh dau ma k mat vitri
		super.mark(readlimit);
	}
	
	@Override
	public boolean markSupported() { //kiem tra xem roi tuong inputstream co ho tro thao tac mark(int) khong
		return super.markSupported();
	}
	
	@Override
	public synchronized void reset() throws IOException {	//tra ve vi tri danh dau mark(int)
		super.reset();
	}
	
}
