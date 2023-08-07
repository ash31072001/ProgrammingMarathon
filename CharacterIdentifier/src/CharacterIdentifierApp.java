import java.util.Scanner;
public class CharacterIdentifierApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character : ");
		char ch = scan.next().charAt(0);
		IdentifyCharacter(ch);
		
		
	}
	
	public static void IdentifyCharacter(char ch) {
		if(Character.isLowerCase(ch)) {
			if(ch == 'a' || ch =='e'||ch =='i'||ch=='o'||ch=='u') {
				System.out.println("Lowercase vowel");
			}
			else {
				System.out.println("Lowercase consonant");
			}
			

          }
		else if (Character.isUpperCase(ch)) {
			if(ch == 'A' ||ch =='E'||ch=='I'|| ch=='O'||ch=='U') {
				System.out.println("Uppercase vowel");
			}
			else {
				System.out.println("Uppercase consonant");
			}
			
		}
		else if(Character.isDigit(ch)){
			System.out.println("digit");
			
			
		}
		else {
			System.out.println("A special character");
		}
	}
}
	
