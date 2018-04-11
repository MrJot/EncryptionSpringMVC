package mrjot.encyprtion.springdemo.Encryption;


public class CaesarCipher implements Constants{

	private int password;


	public CaesarCipher(int password) {
		super();
		this.password = password;
	}
	
	
	Encryption makeEncryption =(number)->{
		return (password + number) % ALPHA_LEN;
	};
	
	Encryption makeDecryption=(number)->{	
		return (number - (password % ALPHA_LEN) + ALPHA_LEN) % ALPHA_LEN;
	};
	
	



	public char[] processMessage(Encryption operation, char[] messageArray) {
		char[] returnArray = new char[messageArray.length];
		for (int i = 0; i < messageArray.length; i++) {
					for (int j = 0; j < ALPHA_LEN; j++) {
						if (Character.isLetter(messageArray[i])) {
							if (messageArray[i] == ALPHABET[j]) {
								returnArray[i] = ALPHABET[operation.processMessage(j)];
							}
						} else {
							returnArray[i] = messageArray[i];
						}
					}
				}

		return returnArray;
	}
	
	public static void main(String[] args) {
		CaesarCipher test = new CaesarCipher(1);
		char[] testArray = "to jest bardzo zaawansowana wiadomość i chuj wie 123ds2123ds jak zostanie zinterpretowana??!!!><".toCharArray();
		
		char [] encryptedString = test.processMessage(test.makeEncryption, testArray);
		char [] decryptedString = test.processMessage(test.makeDecryption, encryptedString);
		
		System.out.println(encryptedString);
		System.out.println(decryptedString);
		
		
		
		
		
		
	}
//
//
//
//
//
//}
//
//

//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//	//	private int code;
//	//
//	//	public int getCode() {
//	//		return code;
//	//	}
//	//
//	//	public void setCode(int code) {
//	//		this.code = code;
//	//	}
//	//
//	//	public CaesarCipher(boolean encryptionFlag) {
//	//		setEncryptionFlag(encryptionFlag);
//	//	}
//	//
//	//	private boolean encryptionFlag; // checks if encryption or decryption is required
//	//
//	//	@Override
//	//	public boolean isEncryptionFlag() {
//	//		return this.encryptionFlag;
//	//	}
//	//
//	//	@Override
//	//	public void setEncryptionFlag(boolean encryptionFlag) {
//	//		this.encryptionFlag = encryptionFlag;
//	//
//	//	}
//	//
//	//	/**
//	//	 * Funtion provides encryption/decryption using Casear method
//	//	 * 
//	//	 * @param char[] (small letters only)
//	//	 * @return char[] (returns encrypted/decrypted [] )
//	//	 */
//	//
//	//	public char[] makeEncryption(char[] msgToEncrypt) {
//	//		int code = getCode();
//	//		int shift = -1;
//	//		char[] returnArray = new char[msgToEncrypt.length];
//	//		for (int i = 0; i < msgToEncrypt.length; i++) {
//	//			for (int j = 0; j < ALPHA_LEN; j++) {
//	//				if (Character.isLetter(msgToEncrypt[i])) {
//	//					if (msgToEncrypt[i] == ALPHABET[j]) {
//	//						if (isEncryptionFlag()) {
//	//							shift = (code + j) % ALPHA_LEN;
//	//						} else {
//	//							shift = (j - (code % ALPHA_LEN) + ALPHA_LEN) % ALPHA_LEN;
//	//						}
//	//						returnArray[i] = ALPHABET[shift];
//	//					}
//	//				} else {
//	//					returnArray[i] = msgToEncrypt[i];
//	//				}
//	//			}
//	//		}
//	//
//	//		return returnArray;
//	//
//	//	}
//
//}
}