package corejavapractice;

import java.util.Base64;

public class EncodeAndDecodePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String encryptData = "Password";
		 
		byte [] encodeBytes = Base64.getEncoder().encode(encryptData.getBytes());
		byte [] decodeBytes = Base64.getDecoder().decode( encodeBytes);
		System.out.println("Encode bytes ...." + new String(encodeBytes));
		System.out.println("Decode bytes ...." + new String(decodeBytes));
			
	}

}