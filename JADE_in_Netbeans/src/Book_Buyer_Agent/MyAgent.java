  /*************************************************************************
 *                                                                        *
 *                   Mureithi David Wachira	                          *
 *                                                                        *
 *                   P15/2204/2011                                        *
 *                                                                        *
 *                   Mobile: +254 (0) 722 413 699                         *
 *                   Email:  davidwachira90@students.uonbi.ac.ke          *
 *                                                                        *
 *                   Date:   Wednesday 19th November 2014                 *
 *                                                                        *
 *                   CSC 312 ARTIFICIAL INTELLIGENCE PROGRAMMING          *
 *                                                                        *
 *                   Running JADE in Netbeans                             *
 *                                                                        *
 *                                                                        *
 *************************************************************************/
package Book_Buyer_Agent;

import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;
import jade.core.behaviours.WakerBehaviour;

public class MyAgent extends Agent 
{
    protected void setup() 
    {
        System.out.println("Adding waker behaviour");
        addBehaviour(new WakerBehaviour(this, 10000) 
        {
            protected void handleElapsedTimeout() 
            {
            // perform operation X
            }
        } );
        
        addBehaviour(new TickerBehaviour(this, 10000) 
        {
            protected void onTick() 
            {
            // perform operation Y
            }
        } );
    }
}
