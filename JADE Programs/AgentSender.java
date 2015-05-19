package jade_in_netbeans;


import java.io.*;
import jade.core.*;
import jade.core.behaviours.*;
import jade.lang.acl.*;

public class AgentSender extends Agent 
{
    protected void setup() 
    {
      addBehaviour(new SimpleBehaviour(this) 
      {
        private boolean finished = false;
        public void action() 
        {
            try
            {
                System.out.println("\nEnter responder agent name: ");
                BufferedReader buff = new BufferedReader(new
                InputStreamReader(System.in));
                String responder = buff.readLine();
                ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
                msg.addReceiver(new AID(responder));
                msg.setContent("FirstInform");
                send(msg);
                System.out.println("\nFirst INFORM sent");
                doWait(5000);
                msg.setLanguage("PlainText");
                msg.setContent("SecondInform");
                send(msg);
                System.out.println("\nSecond INFORM sent");
                doWait(5000);
                // same that second
                msg.setContent("\nThirdInform");
                send(msg);
                System.out.println("\nThird INFORM sent");
                doWait(1000);
                msg.setOntology("ReceiveTest");
                msg.setContent("FourthInform");
                send(msg);
                System.out.println("\nFourth INFORM sent");
                finished = true;
                myAgent.doDelete();
            }

            catch (IOException ioe)
            {
                ioe.printStackTrace();
            }
          }
          public boolean done()
            {
               return finished;
            }
        });
     }
}