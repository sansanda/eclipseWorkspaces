package coding;

import java.io.UnsupportedEncodingException;

public class t1 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		byte[] b1 = "ç".getBytes("UTF-32");
		for (int i=0;i<b1.length;i++)
		{
			System.out.print("-"+b1[i]);
		}
	}

}
