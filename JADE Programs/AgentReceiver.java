
package jade_in_netbeans;

import java.io.*;
import jade.core.*;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;


public class AgentReceiver extends Agent 
{
    class my3StepBehaviour extends SimpleBehaviour 
    {
        final int FIRST = 1;
        final int SECOND = 2;
        final int THIRD = 3;
        private int state = FIRST;
        private boolean finished = false;
        public my3StepBehaviour(Agent a) 
        {
           super(a);
        }
        public void action() 
        {
            switch (state){
            case FIRST: {if (op1())
            state = SECOND;
            else
            state= FIRST;
            break;}
            case SECOND:{op2(); state = THIRD; break;}
            case THIRD:{op3(); state = FIRST; finished = true; break;}
            
            }
        }
        
        public boolean done() 
        {
        return finished;
        }
        
        private boolean op1()
        {
            System.out.println( "\nAgent "+getLocalName()+" in state 1.1 is waiting for a message");
            MessageTemplate m1 =
            MessageTemplate.MatchPerformative(ACLMessage.INFORM);
            MessageTemplate m2 =
            MessageTemplate.MatchLanguage("PlainText");
            MessageTemplate m3 =
            MessageTemplate.MatchOntology("ReceiveTest");
            MessageTemplate m1andm2 = MessageTemplate.and(m1,m2);
            MessageTemplate notm3 = MessageTemplate.not(m3);
            MessageTemplate m1andm2_and_notm3 =
            MessageTemplate.and(m1andm2, notm3);
            //The agent waits for a specific message. If it doesn't arrive
            // the behaviour is suspended until a new message arrives.
            ACLMessage msg = receive(m1andm2_and_notm3);
            if (msg!= null){
            System.out.println("\nAgent "+ getLocalName() +
            " received the following message in state 1.1: " +
            msg.toString());
            return true;
            }
            else {
            System.out.println("\nNo message received in state 1.1");
            block();
            return false;
            }
        }
        private void op2()
        {
            System.out.println("\nAgent "+ getLocalName() + " in state 1.2 is waiting for a message");
            //Using a blocking receive causes the block
            // of all the behaviours
            ACLMessage msg = blockingReceive(5000);
            if(msg != null)
            System.out.println("\nAgent "+ getLocalName() +
            " received the following message in state 1.2: "
            +msg.toString());
            else
            System.out.println("\nNo message received in state 1.2");
        }
        
        private void op3() 
        {
            System.out.println("\nAgent: "+getLocalName()+
            " in state 1.3 is waiting for a message");
            MessageTemplate m1 =
            MessageTemplate.MatchPerformative(ACLMessage.INFORM);
            MessageTemplate m2 = MessageTemplate.MatchLanguage("PlainText");
            MessageTemplate m3 =
            MessageTemplate.MatchOntology("ReceiveTest");
            MessageTemplate m1andm2 = MessageTemplate.and(m1,m2);
            MessageTemplate m1andm2_and_m3 =
            MessageTemplate.and(m1andm2, m3);
            //blockingReceive and template
            ACLMessage msg = blockingReceive(m1andm2_and_m3);
            if (msg!= null)
            System.out.println("\nAgent "+ getLocalName() +
            " received the following message in state 1.3: "
            + msg.toString());
            else
            System.out.println("\nNo message received in state 1.3");
        }
}
    // End of my3StepBehaviour class
        protected void setup() 
        {
            my3StepBehaviour mybehaviour = new my3StepBehaviour(this);
            addBehaviour(mybehaviour);
        }
}