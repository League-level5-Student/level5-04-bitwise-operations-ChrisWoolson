package _04_Base64_Decoder;

import java.io.BufferedReader;
import java.io.FileReader;

public class Base64Decoder {
	/*
	 * Base 64 is a way of encoding binary data using text.
	 * Each number 0-63 is mapped to a character. 
	 * NOTE: THIS IS NOT THE SAME AS ASCII OR UNICODE ENCODING!
	 * Since the numbers 0 through 63 can be represented using 6 bits, 
	 * every four (4) characters will represent twenty four (24) bits of data.
	 * 4 * 6 = 24
	 * 
	 * For this exercise, we won't worry about what happens if the total bits being converted
	 * do not divide evenly by 24.
	 * 
	 * If one char is 8 bits, is this an efficient way of storing binary data?
	 * (hint: no)
	 * 
	 * It is, however, useful for things such as storing media data inside an HTML file (for web development),
	 * so that way a web site does not have to look for an image, sound, library, or whatever in a separate location.
	 * 
	 * View this link for a full description of Base64 encoding
	 * https://en.wikipedia.org/wiki/Base64
	 */
	
	
	final static char[] base64Chars = {
		'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 
		'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
		'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
		'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'
	};
	
	//1. Complete this method so that it returns the the element in
	//   the base64Chars array that corresponds to the passed in char.
	public static byte convertBase64Char(char c){
		for (int i = 0; i < base64Chars.length; i++) {
			if(c ==base64Chars[i]) {
				return (byte) i;
			}
			
		}
		return 0;
		
	}
	
	//2. Complete this method so that it will take in a string that is 4 
	//   characters long and return an array of 3 bytes (24 bits). The byte 
	//   array should be the binary value of the encoded characters.
	public static byte[] convert4CharsTo24Bits(String s){
		
		byte[] bytes = new byte[3];
		
		
			char c = s.charAt(0);
			byte b1 = convertBase64Char(c);
			
			char c2 = s.charAt(1);
			byte b2 = convertBase64Char(c2);
			
			char c3 = s.charAt(2);
			byte b3 = convertBase64Char(c3);
		
			char c4 = s.charAt(3);
			byte b4 = convertBase64Char(c4);
			
			//Byte bnew1 = (byte) (b1<<2);
			Byte bnew1 = (byte) ((b1<<2)|(b2>>4));
			
			Byte bnew2= (byte) ((b2<<4)|(b3>>2));
			
			Byte bnew3 = (byte) ((b3<<6)|(b4));
			
			bytes[0] = bnew1;
			bytes[1] = bnew2;
			bytes[2]= bnew3;
			
			
		
		return bytes;
	}
	
	//3. Complete this method so that it takes in a string of any length
	//   and returns the full byte array of the decoded base64 characters.
	public static byte[] base64StringToByteArray(String file) {
		
		byte[] bytes2 = new byte[(file.length()/4)*3];
		
		int place = 0;
		for (int i = 0; i < file.length(); i+=4) {
			byte[] bytes = convert4CharsTo24Bits(file.substring(i,i+4));
			bytes2[place*3] = bytes[0];
			bytes2[(place*3)+1] = bytes[1];
			bytes2[(place*3)+2] = bytes[2];
			place++;
		}
		
		
		
				
		
		
		return bytes2;
	}
}
