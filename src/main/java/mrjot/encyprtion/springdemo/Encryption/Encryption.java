package mrjot.encyprtion.springdemo.Encryption;

interface Encryption{
	

	
	public char[] makeEncryption(char[] messageArray, int Password);
	public char[] makeEncryption(char[] messageArray, char[] Password);
	
	
	public char[] makeDecryption(char[] messageArray, int Password);
	public char[] makeDecryption(char[] messageArray, char[] Password);

	
	final static char[] ALPHABET = "aąbcćdeęfghijklłmnńoópqrsśtuvwxyzźż".toCharArray();
	final static int ALPHA_LEN = ALPHABET.length;
	
	
}
