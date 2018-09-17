package common.mail;

import org.jasypt.util.text.StrongTextEncryptor;

public class TextEncrypter {

	public static void main(String[] args) {
		StrongTextEncryptor textEncryptor = new StrongTextEncryptor();
		textEncryptor.setPassword("Password2015");
		String myEncryptedText = textEncryptor.encrypt("myPassword2015");
		System.out.println("Encrypted Text: " + myEncryptedText);
		String plainText = textEncryptor.decrypt(myEncryptedText);
		System.out.println("Plain Text:" + plainText);
	}

}
