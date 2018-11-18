/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PassMan;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author WANDE
 */
public class Crypt {
	private static final String ALGO = "AES";
	private final byte[] keyValue;
	
	public Crypt(String key){
		keyValue = key.getBytes();
	}
	
	public String encrypt(String Data) throws Exception{
		SecretKeySpec key = generateKey();
		Cipher c = Cipher.getInstance(ALGO);
		c.init(Cipher.ENCRYPT_MODE, key);
		byte[] encVal = c.doFinal(Data.getBytes());
		String encryptedValue = new BASE64Encoder().encode(encVal);
		return encryptedValue;
	}
	
	public String decrypt(String encryptedData) throws Exception{
		SecretKeySpec key = generateKey();
		Cipher c = Cipher.getInstance(ALGO);
		c.init(Cipher.DECRYPT_MODE, key);
		byte[] decodedValue = new BASE64Decoder().decodeBuffer(encryptedData);
		byte[] decValue = c.doFinal(decodedValue);
		String decryptedValue = new String(decValue);
		return decryptedValue;
	}
	
	private SecretKeySpec generateKey() throws Exception{
		SecretKeySpec key = new SecretKeySpec(keyValue, ALGO);
		return key;
	}
}
