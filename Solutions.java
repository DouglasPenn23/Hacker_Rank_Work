// Start OZ
// Create a method for the function to be done in
public String startOz(String str) {
    // Create a string called the result
    String result = "";
    // If the string length is less than 1 and the char at the position is 0
    // return the result + the string with that char position. 
    if (str.length() >= 1 && str.charAt(0)=='o') {
      result = result + str.charAt(0);
    }
    // If the str.length is greater than or equal to 2 and the charAt position 1 = Z.
    // return the result + the string with the char At the posistion. 
    if (str.length() >= 2 && str.charAt(1)=='z') {
      result = result + str.charAt(1);
    }
    
    return result;
  }