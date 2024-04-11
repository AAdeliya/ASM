public class ReverseWordsInString {
    //given an input string s, reverse the order of the words.
    //A word if defined as a sequence of non-space characters. The words in s will be separated by at least one space
    //Return a string of the words in reverse otder concacatreneted by a single space

    public String reverseWords(String s) {
        //the intuition behind this solution is to split the input string into individual words, 
        //reverse their order, and then concatenetate them back together with a single space between each word.
    
        // Trim the input string to remove leading and trailing spaces
         String[] str = s.trim().split("\\s+");
         //The input string s is trimmed to remove any leading or trailling spaces using the trim() methos
         //The trimmed string is then split into array of words using the split("\\s+") method
         //The regular expression "\s+" matches one or more whitespace characters, effictively
         //separating the words
 
         // Initialize the output string
         String out = "";
         //A variable out is initialized as an empty string to store the reversed words
 
         // Iterate through the words in reverse order
         for (int i = str.length - 1; i > 0; i--) {
            //Starting from the last word in the array(str.length-1), the loop iterates backwards
            //until the first word(index 0) is reached
             // Append the current word and a space to the output
             out += str[i] + " ";

             //In each iteration, the current word str[i] is appended to out along with a space (" ")
             //to separate the words
         }
 
         // Append the first word to the output (without trailing space)
         return out + str[0];
         //Finally, the first word str [0] is appended to out
         //the reversed string of words, stored in out, is returned as the result
     }
     
 }
    
