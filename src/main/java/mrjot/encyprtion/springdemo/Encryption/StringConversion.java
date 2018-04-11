package mrjot.encyprtion.springdemo.Encryption;
import java.util.ArrayList;
import java.util.List;

public class StringConversion {
	
	private String messageToConvert;
	private char[] processedMessageToCipher;
	private List<Integer> indexNumberForCapitalizingLetters = new ArrayList<Integer>();
	
	
	
	public StringConversion(String messageToConvert) {
		super();
		this.messageToConvert = messageToConvert;
		this.processedMessageToCipher=new char[messageToConvert.length()];
	}

	//GETTERS AND SETTERS
	
	
	public String getMessageToConvert() {
		return messageToConvert;
	}

	public void setMessageToConvert(String messageToConvert) {
		this.messageToConvert = messageToConvert;
	}

	public char[] getProcessedMessageToCipher() {
		return processedMessageToCipher;
	}

	public void setProcessedMessageToCipher(char[] processedMessageToCipher) {
		this.processedMessageToCipher = processedMessageToCipher;
	}

	public List<Integer> getIndexNumberForCapitalizingLetters() {
		return indexNumberForCapitalizingLetters;
	}

	public void setIndexNumberForCapitalizingLetters(List<Integer> indexNumberForCapitalizingLetters) {
		this.indexNumberForCapitalizingLetters = indexNumberForCapitalizingLetters;
	}


	public void toLowerCase() {
		char[] inputArray = messageToConvert.toCharArray();
		for (int i = 0; i < inputArray.length; i++) {
			if (Character.isUpperCase(inputArray[i])) {
				indexNumberForCapitalizingLetters.add(i);
			}
			processedMessageToCipher[i] = Character.toLowerCase(inputArray[i]);
		}
	}
	
	
	public String toUpperCase(char input[]) {
		indexNumberForCapitalizingLetters.forEach(item->{
			input[item.intValue()]=Character.toUpperCase(input[item.intValue()]);
			
		});
		return new String(input);
}
	
	
	
	
	}
	
