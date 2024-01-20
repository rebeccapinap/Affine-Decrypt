//Rebecca Pina Partidas
// CIS3362

import java.util.Scanner;

public class AffineCipher {

	public static void main(String[] args) {
		// Variable initializations
		Scanner scanner = new Scanner(System.in);
		String encryptedCode = "";
		String decryptedCode = "";
		char decryptedLetter;
		int i;
		int j;
		int k;
		int counter = 0;
		
		// User input for encrypted code
		System.out.println("Please enter encrypted code:");
		encryptedCode = scanner.nextLine();
		
		//Ea,b(x) = (ax + b) mod 26
		// Value 			1 3  5  7 9 11 15 17 19 21 23 25
		//Inverse Mod 26    1 9 21 15 3 19  7 23 11  5 17 25
		
		System.out.println("Affine:");
		
		// Loops through each number that could be a
		for (i = 0; i < 26; i++) {
			// Affine cipher does not work with even numbers or the number 13
			if (i%2 == 0 || i == 13) {
				continue;
			}
			
			// Loops through each character of the encrypted text
			// Depending on the number for a the inverse was multiplied by the letter
			// Within the loop, there is another loop to also attempt every possibility that b could be (0-25)
			if (i == 1) {
				for (k = 0; k < 26; k++) {
					for (j = 0; j < encryptedCode.length(); j++) {
						decryptedLetter = (char)(((encryptedCode.charAt(j)- 'a') * 1 + k)%26 +'a'); 
						decryptedCode = decryptedCode + decryptedLetter;
					}
					
					// Counter to ensure 312 outputs are printed
					counter++;
					
					// Output for every possible decrypted text
					System.out.println(decryptedCode);
					decryptedCode = "";
				}
			}
			
			// Same process as for number 1; however, now multiplied by the inverse of 3 (=9)
			if (i == 3) {
				for (k = 0; k < 26; k++) {
					for (j = 0; j < encryptedCode.length(); j++) {
						decryptedLetter = (char)(((encryptedCode.charAt(j)- 'a') * 9 + k)%26 +'a'); 
						decryptedCode = decryptedCode + decryptedLetter;
					}
					
					counter++;
					System.out.println(decryptedCode);
					decryptedCode = "";
				}
			}
			
			// Same process as for number 1; however, now multiplied by the inverse of 5 (=21)
			if (i == 5) {
				for (k = 0; k < 26; k++) {
					for (j = 0; j < encryptedCode.length(); j++) {
						decryptedLetter = (char)(((encryptedCode.charAt(j)- 'a') * 21 + k)%26 +'a'); 
						decryptedCode = decryptedCode + decryptedLetter;
					}
					
					counter++;
					System.out.println(decryptedCode);
					decryptedCode = "";
				}
			}
			
			// Same process as for number 1; however, now multiplied by the inverse of 7 (=15)
			if (i == 7) {
				for (k = 0; k < 26; k++) {
					for (j = 0; j < encryptedCode.length(); j++) {
						decryptedLetter = (char)(((encryptedCode.charAt(j)- 'a') * 15 + k)%26 +'a'); 
						decryptedCode = decryptedCode + decryptedLetter;
					}
					
					counter++;
					System.out.println(decryptedCode);
					decryptedCode = "";
				}
			}
			
			// Same process as for number 1; however, now multiplied by the inverse of 9 (=3)
			if (i == 9) {
				for (k = 0; k < 26; k++) {
					for (j = 0; j < encryptedCode.length(); j++) {
						decryptedLetter = (char)(((encryptedCode.charAt(j)- 'a') * 3 + k)%26 +'a'); 
						decryptedCode = decryptedCode + decryptedLetter;
					}
					
					counter++;
					System.out.println(decryptedCode);
					decryptedCode = "";
				}
			}
			
			// Same process as for number 1; however, now multiplied by the inverse of 11 (=19)
			if (i == 11) {
				for (k = 0; k < 26; k++) {
					for (j = 0; j < encryptedCode.length(); j++) {
						decryptedLetter = (char)(((encryptedCode.charAt(j)- 'a') * 19 + k)%26 +'a'); 
						decryptedCode = decryptedCode + decryptedLetter;
					}
					
					counter++;
					System.out.println(decryptedCode);
					decryptedCode = "";
				}
			}
			
			// Same process as for number 1; however, now multiplied by the inverse of 15 (=7)
			if (i == 15) {
				for (k = 0; k < 26; k++) {
					for (j = 0; j < encryptedCode.length(); j++) {
						decryptedLetter = (char)(((encryptedCode.charAt(j)- 'a') * 7 + k)%26 +'a'); 
						decryptedCode = decryptedCode + decryptedLetter;
					}
					
					counter++;
					System.out.println(decryptedCode);
					decryptedCode = "";
				}
			}
			
			// Same process as for number 1; however, now multiplied by the inverse of 17 (=23)
			if (i == 17) {
				for (k = 0; k < 26; k++) {
					for (j = 0; j < encryptedCode.length(); j++) {
						decryptedLetter = (char)(((encryptedCode.charAt(j)- 'a') * 23 + k)%26 +'a'); 
						decryptedCode = decryptedCode + decryptedLetter;
					}
					
					counter++;
					System.out.println(decryptedCode);
					decryptedCode = "";
				}
			}
			
			// Same process as for number 1; however, now multiplied by the inverse of 19 (=11)
			if (i == 19) {
				for (k = 0; k < 26; k++) {
					for (j = 0; j < encryptedCode.length(); j++) {
						decryptedLetter = (char)(((encryptedCode.charAt(j)- 'a') * 11 + k)%26 +'a'); 
						decryptedCode = decryptedCode + decryptedLetter;
					}
					
					counter++;
					System.out.println(decryptedCode);
					decryptedCode = "";
				}
			}
			
			// Same process as for number 1; however, now multiplied by the inverse of 21 (=5)
			if (i == 21) {
				for (k = 0; k < 26; k++) {
					for (j = 0; j < encryptedCode.length(); j++) {
						decryptedLetter = (char)(((encryptedCode.charAt(j)- 'a') * 5 + k)%26 +'a'); 
						decryptedCode = decryptedCode + decryptedLetter;
					}
					
					counter++;
					System.out.println(decryptedCode);
					decryptedCode = "";
				}
			}
			
			// Same process as for number 1; however, now multiplied by the inverse of 23 (=17)
			if (i == 23) {
				for (k = 0; k < 26; k++) {
					for (j = 0; j < encryptedCode.length(); j++) {
						decryptedLetter = (char)(((encryptedCode.charAt(j)- 'a') * 17 + k)%26 +'a'); 
						decryptedCode = decryptedCode + decryptedLetter;
					}
					
					counter++;
					System.out.println(decryptedCode);
					decryptedCode = "";
				}
			}
			
			// Same process as for number 1; however, now multiplied by the inverse of 25 (=25)
			if (i == 25) {
				for (k = 0; k < 26; k++) {
					for (j = 0; j < encryptedCode.length(); j++) {
						decryptedLetter = (char)(((encryptedCode.charAt(j)- 'a') * 25 + k)%26 +'a'); 
						decryptedCode = decryptedCode + decryptedLetter;
					}
					
					counter++;
					System.out.println(decryptedCode);
					decryptedCode = "";
				}
			}
			
		}
		
		// Prints scanner count to ensure 312 outputs were printed
		System.out.println(counter);
		scanner.close();

	}

}
