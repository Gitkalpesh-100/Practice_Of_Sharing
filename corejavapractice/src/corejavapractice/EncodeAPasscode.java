package corejavapractice;

import java.util.Base64;

public class EncodeAPasscode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String encryptData = "Password";
		byte [] encodeBytes = Base64.getEncoder().encode(encryptData.getBytes());
		System.out.println("Encode bytes ...." + new String(encodeBytes));
		
		
		
	}

}
