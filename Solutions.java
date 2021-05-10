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


  /*
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. 
We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.*/

  // Start sleepIn
  // Create bool method with parameters of weekdays & vacations
  public boolean sleepIn(boolean weekday, boolean vacation) {
      // If it's not a weekday or vacation. 
      // return true. 
    if (!weekday | vacation){
      return true;
    }
    // If it is one of those 
    return false;
  }

  /* 
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. 
We are in trouble if they are both smiling or if neither of them is smiling. 
Return true if we are in trouble. */

// Create booleans to hold if they're smiling. 
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    // if Asmile & bSmile = true, return true. 
    if(aSmile && bSmile){
      return true;
    }
    // if aSmile & bSmile = false. 
    // return true. 
    
    if(!aSmile && !bSmile){ 
      return true;
  }
  return false;
  }
  
