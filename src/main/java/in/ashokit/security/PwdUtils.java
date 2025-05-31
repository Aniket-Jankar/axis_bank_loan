package in.ashokit.security;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdUtils {
	
//	Encoder encoder= Base64.getEncoder();
//	
//	Byte[] encode= encoder.encode(pwd.getBytes());
	
	public String encodePwd(String pwd)
	{
		Encoder encoder= Base64.getEncoder();
		
		byte[] encode= encoder.encode(pwd.getBytes());
		
		String encodePwd =new String(encode);
		
		return encodePwd;
	}

}
