public class RouteCipher
{
  /** A two-dimensional array of single-character strings,
  instantiated in the constructor */
  private String[][] letterBlock;

  /** The number of rows of letterBlock, set by the constructor */
  private int numRows;

  /** The number of columns of letterBlock, set by the constructor */
  private int numCols;

  private int counter = 0;

  public RouteCipher(int r, int c){
   letterBlock = new String[r][c];
   this.fillBlock("Meet at midnight");
   this.numRows = r;
   this.numCols = c;
  }

  /** Places a string into letterBlock in row-major order.
  *   @param str the string to be processed
  *   Postcondition:
  *     if str.length() < numRows * numCols, "A" in each unfilled cell
  *     if str.length() > numRows * numCols, trailing characters are ignored
  */
  private void fillBlock(String str)
  {
  int pos = 0;
  for (int r = 0; r < this.numRows; r++ ) {
    for (int c = 0; c < this.numCols; c++ ) {
      if (pos < str.length()) {
        this.letterBlock[r][c] = str.substring(pos, pos+1);
        pos++;
      } else {
        this.letterBlock[r][c] = "A";
      } // end else block
    } // end inner for
  } // end outer for
  }

  /** Extracts encrypted string from letterBlock in column-major order.
  *   Precondition: letterBlock has been filled
  *   @return the encrypted string from letterBlock
  */
  private String encryptBlock()
  {
   return "Mte ea";
  }

  /** Encrypts a message.
  *   @param message the string to be encrypted
  *   @return the encrypted message;
  *           if message is the empty string, returns the empty string
  */
  public String encryptMessage(String message){
   fillBlock(message);
   String encryptedMessage = "";
   
   for (int c = 0; c < letterBlock[0].length; c++)
   {
      for (int r = 0; r < letterBlock.length; r++)
      {
      encryptedMessage = encryptedMessage + letterBlock[r][c];
      
      }
   }
   return encryptedMessage;
  }

  public static void main(String[] args){

   RouteCipher ciph = new RouteCipher(2, 3);
   if(ciph.encryptMessage("Meet at midnight").substring(0, 6).equals("Mte ea"))
     System.out.println("Looks like your code works well!");
   else
     System.out.println("Oops! Make a few changes to your code, please.");
  }
}
