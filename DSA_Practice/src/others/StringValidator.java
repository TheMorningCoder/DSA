package others;
/* Java program that checks a string for special characters, numbers, and letters. 
 * It throws custom exceptions for different cases: special characters, letters, or insufficient numbers. 
 * If no exception is thrown, it displays a "Good to go" message; otherwise, 
 * it shows a "Can't process further" message. */

//Custom exception class for different validation errors
class StringValidationException extends Exception {
	// Adding a serialVersionUID
    //private static final long serialVersionUID = 1L;
    public StringValidationException(String message) {
     super(message);
 }
}

public class StringValidator {

 // Method to check the string for errors
 public static void checkString(String str) throws StringValidationException {
     int numberCount = 0;

     for (char ch : str.toCharArray()) {
         if (Character.isDigit(ch)) {
             numberCount++;
         } else if (Character.isLetter(ch)) {
             throw new StringValidationException("Letters found in the string.");
         } else {
             throw new StringValidationException("Special characters found in the string.");
         }
     }

     if (numberCount < 1000) {
         throw new StringValidationException("Less than 1000 numbers in the string.");
     }
 }

 // Method to validate the string
 public static void validateString(String str) {
     try {
         checkString(str);
         System.out.println("Good to go.");
     } catch (StringValidationException e) {
         System.out.println(e.getMessage());
         System.out.println("Can't process further.");
     }
 }

 public static void main(String[] args) {
     // Test strings
     String validString = "1234567890".repeat(100); // 1000 numbers
     String stringWithLetters = "12345abc67890";
     String stringWithSpecialChars = "12345@67890";
     String insufficientNumbers = "12345";

     // Test cases
     System.out.println("Validating validString:");
     validateString(validString);

     System.out.println("\nValidating stringWithLetters:");
     validateString(stringWithLetters);

     System.out.println("\nValidating stringWithSpecialChars:");
     validateString(stringWithSpecialChars);

     System.out.println("\nValidating insufficientNumbers:");
     validateString(insufficientNumbers);
 }
}
