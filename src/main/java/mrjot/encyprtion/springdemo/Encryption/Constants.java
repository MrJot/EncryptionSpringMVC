package mrjot.encyprtion.springdemo.Encryption;

import java.util.List;
import java.util.stream.Collectors;


public interface Constants {
	
	final static char[] ALPHABET = "aąbcćdeęfghijklłmnńoópqrsśtuvwxyzźż".toCharArray();
	final static int ALPHA_LEN = ALPHABET.length;
	
	
	
//	final static List<Character> ALPHABET = "aąbcćdeęfghijklłmnńoópqrsśtuvwxyzźż".chars().mapToObj(c ->
//		(char) c).collect(Collectors.toList());
//	
//	
//	final static int ALPHA_LEN = ALPHABET.size();
	
	
	

}
