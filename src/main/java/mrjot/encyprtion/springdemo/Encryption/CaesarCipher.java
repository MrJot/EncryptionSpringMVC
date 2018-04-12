package mrjot.encyprtion.springdemo.Encryption;


public class CaesarCipher implements Constants{

	private char[] messageArray;
	private String processedMessage;
	private int password;
	private Encryption operation;
	
	private StringConversion message;
	
	public void doStuff() {
		this.operation.processMessage(password)
	}
	


	public CaesarCipher(int password, Encryption operation, StringConversion message) {
		super();
		this.password = password;
		this.operation = operation;
		this.messageArray=message.getProcessedMessageToCipher();
		this.processedMessage = message.toUpperCase(processMessage(this.messageArray));
	}
	
	
	private Encryption makeEncryption =(number)->{
		return (password + number) % ALPHA_LEN;
	};
	
	public Encryption getMakeEncryption() {
		return makeEncryption;
	}


	public void setMakeEncryption(Encryption makeEncryption) {
		this.makeEncryption = makeEncryption;
	}


	public Encryption getMakeDecryption() {
		return makeDecryption;
	}


	public void setMakeDecryption(Encryption makeDecryption) {
		this.makeDecryption = makeDecryption;
	}


	private Encryption makeDecryption=(number)->{	
		return (number - (password % ALPHA_LEN) + ALPHA_LEN) % ALPHA_LEN;
	};
	
	
	
	private void findMatchingLetters(char[] messageArray, char[] returnArray, int i, int j) {
		if (Character.isLetter(messageArray[i])) {
			if (messageArray[i] == ALPHABET[j]) {
				returnArray[i] = ALPHABET[operation.processMessage(j)];
			}
		} else {
			returnArray[i] = messageArray[i];
		}
	}
	
	
	public char[] processMessage(char[] messageArray) {
		char[] returnArray = new char[messageArray.length];
		for (int i = 0; i < messageArray.length; i++) {
					for (int j = 0; j < ALPHA_LEN; j++) {
						findMatchingLetters(messageArray, returnArray, i, j);
					}
				}
		return returnArray;
	}
		
	public static void main(String[] args) {
		
		String inputMessage = "Ala ma kota !!! Please describe information resources that you rely on to do your corrosion-related work. "
				+ "Please mention specific resource names where possible (e.g., title of the book, publisher/society, "
				+ "standards body, or name of database) and not search engines (e.g. Google, EBSCO).";
		
		
		System.out.println("Input message processed by the use: "+inputMessage);
		CaesarCipher test = new CaesarCipher(124, makeEncryption,new StringConversion(inputMessage));
		String temp = test.processedMessage;
		System.out.println(temp);
		System.out.println("=========================");
		CaesarCipher test2 = new CaesarCipher(124, makeDecryption,new StringConversion(temp));
		String temp2 = test2.processedMessage;
		System.out.println(temp2);		
		
		
		
	}
	
	
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
