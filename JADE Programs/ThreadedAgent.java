package jade_in_netbeans;

import jade.core.*;
import jade.core.behaviours.*;

public class ThreadedAgent extends Agent 
{
    private ThreadedBehaviourFactory tbf = new ThreadedBehaviourFactory();
    protected void setup() 
    {
        // Create a normal JADE behaviour
        Behaviour b = new OneShotBehaviour(this) 
        {
            public void action() 
            {
            // Perform some blocking operation that can take a long time
            }
        };
        // Execute the behaviour in a dedicated Thread
        addBehaviour(tbf.wrap(b));
    }
}