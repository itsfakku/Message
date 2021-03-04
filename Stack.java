/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message;

/**
 *
 * @author MINH TAM
 */
public class Stack 
{
    private final int maxStack;
    private String[] messageContent;
    private int messageTopIndex;
    
    public Stack( int maxStack) {
        
        this.maxStack = maxStack;
        this.messageContent = new String[maxStack];
        this.messageTopIndex = -1;
        
    }
    
    public boolean isEmpty(){
        return (this.messageTopIndex == -1);
    }
    
    public void Push(String newMessageContent){
        
        if(this.messageTopIndex == (this.maxStack - 1))
        {
            
            System.out.println("Full !");
            
        }
        else
        {
            
            this.messageContent[(++this.messageTopIndex)] = newMessageContent;
            
        }
        
    }
    
    public String Pop()
    {
        
        String popMessage = "";
        try{
            
            popMessage = this.messageContent[this.messageTopIndex];
            this.messageTopIndex--;
            
        }
        catch(Exception e)
        {
            System.out.println("Empty Stack !");
        }
        return popMessage;
    }
    
    public void Clear()
    {
        while (!this.isEmpty())
        {
            this.Pop();
        }
    }
}