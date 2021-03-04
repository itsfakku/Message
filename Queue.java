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
public class Queue 
{
    private Message messageHead;
        private Message messageTail;
        public Queue(){
            this.messageHead = null;
            this.messageTail = null;   
        }
    
        public boolean isEmpty (){
            return (this.messageHead == null);
        }

        public void EnQueue(String messageContent){ 
            Message newMessage = new Message (messageContent);
                    if(this.isEmpty())
                    {
                        this.messageHead = newMessage;
                        this.messageTail = newMessage;
                    }
                    else
                    {
                        this.messageTail.setMessageNext(newMessage);
                        this.messageTail = newMessage;
                    }

        }

        public Message DeQueue()
        {
            if (isEmpty())
            {
                System.out.println("Empty !");
                return null;
            }
            else
            {
                Message temp = this.messageHead;
                this.messageHead = this.messageHead.getMessageNext();
                temp.setMessageNext(null);
                return temp;
            }
        }

        public void Clear()
        {

            if (this.isEmpty())
            {
                System.out.println("Empty !");
            }
            else
            {
                while (!this.isEmpty())
                {
                    this.DeQueue();
                }
            }

        }
}
