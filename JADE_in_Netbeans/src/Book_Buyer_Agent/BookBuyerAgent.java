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

public class BookBuyerAgent extends Agent 
{
    protected void setup() 
    {   // Printout a welcome message
        System.out.println("Hello! Buyer-agent "+ getAID().getName() +" is ready.");
    }    
    
}