package mrjot.encyprtion.springdemo.Encryption;

import java.util.function.Function;
import java.util.function.Predicate;

public class CaesarCipher{

	private int password;
	private char[] messageToProcess;






	public CaesarCipher(int password) {
		super();
		this.password = password;
	}



	public char[] makeEncryption(char[] messageArray, T password) {
		int shift=-1;
		for (int i = 0; i < messageArray.length; i++) {
					for (int j = 0; j < ALPHA_LEN; j++) {
						if (Character.isLetter(messageArray[i])) {
							if (messageArray[i] == ALPHABET[j]) {
								if (isEncryptionFlag()) {
									shift = (password + j) % ALPHA_LEN;
								} else {
									shift = (j - (code % ALPHA_LEN) + ALPHA_LEN) % ALPHA_LEN;
								}
								returnArray[i] = ALPHABET[shift];
							}
						} else {
							returnArray[i] = msgToEncrypt[i];
						}
					}
				}



		return null;
	}





}










	//	public char[] makeEncryption(char[] msgToEncrypt) {
	//	int code = getCode();
	//	int shift = -1;
	//	char[] returnArray = new char[msgToEncrypt.length];
	//	for (int i = 0; i < msgToEncrypt.length; i++) {
	//		for (int j = 0; j < ALPHA_LEN; j++) {
	//			if (Character.isLetter(msgToEncrypt[i])) {
	//				if (msgToEncrypt[i] == ALPHABET[j]) {
	//					if (isEncryptionFlag()) {
	//						shift = (code + j) % ALPHA_LEN;
	//					} else {
	//						shift = (j - (code % ALPHA_LEN) + ALPHA_LEN) % ALPHA_LEN;
	//					}
	//					returnArray[i] = ALPHABET[shift];
	//				}
	//			} else {
	//				returnArray[i] = msgToEncrypt[i];
	//			}
	//		}
	//	}
	//
	//	return returnArray;
	//
	//}










































	//	private int code;
	//
	//	public int getCode() {
	//		return code;
	//	}
	//
	//	public void setCode(int code) {
	//		this.code = code;
	//	}
	//
	//	public CaesarCipher(boolean encryptionFlag) {
	//		setEncryptionFlag(encryptionFlag);
	//	}
	//
	//	private boolean encryptionFlag; // checks if encryption or decryption is required
	//
	//	@Override
	//	public boolean isEncryptionFlag() {
	//		return this.encryptionFlag;
	//	}
	//
	//	@Override
	//	public void setEncryptionFlag(boolean encryptionFlag) {
	//		this.encryptionFlag = encryptionFlag;
	//
	//	}
	//
	//	/**
	//	 * Funtion provides encryption/decryption using Casear method
	//	 * 
	//	 * @param char[] (small letters only)
	//	 * @return char[] (returns encrypted/decrypted [] )
	//	 */
	//
	//	public char[] makeEncryption(char[] msgToEncrypt) {
	//		int code = getCode();
	//		int shift = -1;
	//		char[] returnArray = new char[msgToEncrypt.length];
	//		for (int i = 0; i < msgToEncrypt.length; i++) {
	//			for (int j = 0; j < ALPHA_LEN; j++) {
	//				if (Character.isLetter(msgToEncrypt[i])) {
	//					if (msgToEncrypt[i] == ALPHABET[j]) {
	//						if (isEncryptionFlag()) {
	//							shift = (code + j) % ALPHA_LEN;
	//						} else {
	//							shift = (j - (code % ALPHA_LEN) + ALPHA_LEN) % ALPHA_LEN;
	//						}
	//						returnArray[i] = ALPHABET[shift];
	//					}
	//				} else {
	//					returnArray[i] = msgToEncrypt[i];
	//				}
	//			}
	//		}
	//
	//		return returnArray;
	//
	//	}

}
