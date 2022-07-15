
public class CryptoManager {
	
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean stringInBounds (String plainText) {
		boolean answer = true;
		int outofbounds = 0;
		
		for(int k = 0; k<plainText.length(); k++) {
			if(plainText.charAt(k) > UPPER_BOUND ||  plainText.charAt(k) < LOWER_BOUND) {
				outofbounds++;
			}
		}
			if(outofbounds!=0) {
				answer = false;
				return answer;
			}
			
			else {
		return answer;
			}
	}
	
// 32 and 95
	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	
	public static String encryptCaesar(String plainText, int key) {
		String answer = "";
for(int k = 0; k < plainText.length(); k++) {
	char i = (char)(plainText.charAt(k)+ key);
	if( i > UPPER_BOUND)
		answer += (char)(plainText.charAt(k)+ key-RANGE);
	else
		answer += (char)(plainText.charAt(k)+ key);
}
		return answer;
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String encryptBellaso(String plainText, String bellasoStr) {
		String answer1 = "";
        int answer2 =  bellasoStr.length();
for(int k = 0; k<plainText.length();k++){
	char sup = plainText.charAt(k);
    int sup2 = ((int)sup+(int)bellasoStr.charAt(k%answer2));
    while(sup2 > UPPER_BOUND){
        sup2 -= RANGE;
            }
            answer1 += (char)sup2;
        }
        return answer1;
    }
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String decryptCaesar(String encryptedText, int key) {
		String answer = "";
for(int k = 0; k < encryptedText.length(); k++) {
	char i = (char)(encryptedText.charAt(k)- key);
	if( i > UPPER_BOUND)
		answer += (char)(encryptedText.charAt(k)- key-RANGE);
	else
		answer += (char)(encryptedText.charAt(k)- key);
}
		return answer;
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String decryptBellaso(String encryptedText, String bellasoStr) {
		 String answer1  = "";
	     int answer2 =  bellasoStr.length();
for(int k = 0; k < encryptedText.length(); k++){
	char sup = encryptedText.charAt(k);
	int sup2 = ((int)sup-(int)bellasoStr.charAt(k%answer2));
	while(sup2 < LOWER_BOUND) {
		sup2+= RANGE;
	}
	           
	            answer1 += (char)sup2;

	        }
	        return answer1;

	}
}
