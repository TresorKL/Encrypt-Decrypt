/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lumumbaapp;


import javax.swing.JOptionPane;

/**
 *
 * @author tresorkl
 */
public class LumumbaApp {

    /**
     * @param args the command line arguments
     */
    public static String getMesage(){
        
        String word;
        word = JOptionPane.showInputDialog(null, "Enter the word", "Getting the word",JOptionPane.INFORMATION_MESSAGE);
           
            
        return word;
     }
    
    public static String convertToUnreadableForm(String word){
        
        String  upperWord,unreadableWord="";
        StringBuffer newWord = new StringBuffer();
        char character,newChar;
        
     
       upperWord = word.toUpperCase();
        
       
       for(int i = 0; i<= word.length()-1;i++){
            
           character=(upperWord.charAt(i));
           //replacing every letter in the message with a letter that is three places away
               newChar = (char)(((int)character+3-65)%26+65);
               
               newWord.append(newChar);
               
               // convert StringBuffer to String so we can be able to apply the replace method
               unreadableWord = newWord.toString();
                  
                
            }
          //here we display the unreadable word
          JOptionPane.showMessageDialog(null,""+unreadableWord.replace('=', ' '),"UNREADABLE WORD",JOptionPane.INFORMATION_MESSAGE); 
      return unreadableWord;  
    }
    
    
    public static  String convertToReadableForm(String word){
        
        String upperWord,readableWord="";
        StringBuffer newWord = new StringBuffer();
        char character,newChar;
        
      
       upperWord = word.toUpperCase();
        
       
       for(int i = 0; i<= word.length()-1;i++){
            
           character=(upperWord.charAt(i));
           
           //Replacing every letter in the message with another letter that is three spaces behind it
               newChar = (char)(((int)character-3-65)%26+65);
               newWord.append(newChar);
                readableWord = newWord.toString();
        
    }
       
        JOptionPane.showMessageDialog(null,""+readableWord.replace('7', ' '),"RESULT",JOptionPane.INFORMATION_MESSAGE); 
      return readableWord; 
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
     
        String word, upperWord, strChoice;
        StringBuffer newWord = new StringBuffer();
        boolean runAgain= false;
        char character,newChar;
        int option,choice;
        
   
   
do{
  
    //allowing the the user to choose the action he/she wants to perform
    strChoice = JOptionPane.showInputDialog(null, "Please press:"+"\n"+
                                                  "1: to convert from readable to unreadable"+"\n"+
                                                  "2: to convert from unreadable to readable","CHOOSE THE ACTION YOU WANT",JOptionPane.INFORMATION_MESSAGE);
    
   choice = Integer.parseInt(strChoice);
   
   
     word = getMesage();
   
     if(choice == 1){
       convertToUnreadableForm(word);  
       
    }else if(choice == 2){
        
       convertToReadableForm(word);
    }
     
    //asking the user if he/she want to continue running the program
    option = JOptionPane.showConfirmDialog(null, "DO YOU WANT TO RUN THE PROGRAM AGAIN ?","OPTION TO RUN THE PROGRAM ", JOptionPane.YES_NO_OPTION);
    
    if(option == JOptionPane.YES_OPTION){
        runAgain = true;
     
     }else {
        runAgain =false;
        JOptionPane.showMessageDialog(null,"GOODBYE!!!", "CLOSING THE PROGRAM",JOptionPane.PLAIN_MESSAGE);      
        
    }
   
        
} while(runAgain);

 
   }
   
    
} 
    

