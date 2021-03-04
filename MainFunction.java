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
public class MainFunction 
{
        Queue transferQueue = new Queue();
        Stack processingStack = new Stack(100);
        public void Transfer()
        {
            System.out.println("Enter message :(type 'send' to end)");
            String newMessage = " ";
            do {
                Scanner scanner = new Scanner (System.in);
                newMessage = scanner.nextLine();
                if(!("send").equals(newMessage))
                {
                    transferQueue.EnQueue(newMessage);
                }
                
            }while (!("send").equals(newMessage));
                    while (!transferQueue.isEmpty())
                    {
                        String x = transferQueue.DeQueue().getMessageContent();
                        processingStack.Push(x);
                        
                        System.out.println("Completed !");
                    }
        }
        
        public void Process()
        {
            System.out.println("Message : ");
            while(!processingStack.isEmpty())
            {
                System.out.println(processingStack.Pop());
            }
        } 
}
