/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message;
import java.util.Scanner;

/**
 *
 * @author MINH TAM
 */
public class Message 
{
    private String  messageContent;
        private Message messageNext;
        public Message (String messageContent)
        {
            this.messageContent = messageContent;
            this.messageNext = null;
        }           
        public String getMessageContent() 
        {
            return messageContent;
        }        
        public void setMessageContent(String messageContent) 
        {
            this.messageContent = messageContent;
        }       
        public Message getMessageNext() 
        {
            return messageNext;
        }       
        public void setMessageNext(Message messageNext) 
        {
            this.messageNext = messageNext;
        }
    
    public static void main(String[] args)
    {
        int choice = 0;
        MainFunction mainFunction = new MainFunction();
        while (choice !=3)
        {
            System.out.println("\n------------------");
            System.out.println("1. Send Message.");
            System.out.println("2. Show Message.");
            System.out.println("3. End.");
            System.out.println("------------------");
            Scanner scanner = new Scanner (System.in);
            
            try
            {
                choice = scanner.nextInt();
            }
            catch (Exception e)
            {
                System.out.println("Wrong input");
            }
            
            switch (choice)
            {
                case 1:
                {
                    mainFunction.Transfer();
                    break;
                }
                case 2:
                {
                    mainFunction.Process();
                    break;
                }
                case 3:
                {
                    System.exit(0);
                    break;
                }
                default:
                {
                    break;
                }
            }
        }     
    }
}