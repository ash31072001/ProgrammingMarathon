import java.util.Scanner;
public class CharacterIdentifierNewApproach {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the digit or letter or special character : ");
		char ch = scan.next().charAt(0);
		IdentifyCharacter(ch);
		
	}
	
	public static void IdentifyCharacter(char ch) {
		if(Character.isDigit(ch)) {
			System.out.println("Entered chracter "+ch+" is a digit");
		}
		else if(!Character.isLetter(ch)) {
			System.out.println("Entered character "+ch+" is not a letter ");
			
		}
		else {
			switch(Character.toLowerCase(ch)) {
			case'a':
			case'e':
			case'i':
			case'o':
			case'u':
				if(Character.isLowerCase(ch)) {
					System.out.println("Entered character "+ch+ " is lowercase vowel");
				}
				else {
					System.out.println("Entered character "+ch+ " is uppercase vowel");
				}
				break;
				
			default:
				if(Character.isLowerCase(ch)) {
					System.out.println("Entered character "+ch+" is lower case consonant");
					
				}
				else {
					System.out.println("Entered character "+ch+ " is upper case consonant");
				}
				
			}
			
			
		}
		
	}
	
	

}
