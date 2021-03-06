//  /*************************************************************************
// *                                                                        *
// *                   Mureithi David Wachira	                          *
// *                                                                        *
// *                   P15/2204/2011                                        *
// *                                                                        *
// *                   Mobile: +254 (0) 722 413 699                         *
// *                   Email:  davidwachira90@students.uonbi.ac.ke          *
// *                                                                        *
// *                   Date:   Wednesday 19th November 2014                 *
// *                                                                        *
// *                   CSC 312 ARTIFICIAL INTELLIGENCE PROGRAMMING          *
// *                                                                        *
// *                   Running JADE in Netbeans                             *
// *                                                                        *
// *                                                                        *
// *************************************************************************/
//package Book_Buyer_Agent;
//
//import jade.core.Agent;
//import jade.core.behaviours.*;
//import java.util.*;
//
//public class BookSellerAgent extends Agent 
//{
//    // The catalogue of books for sale (maps the title of a book to its price)
//    private Hashtable catalogue;
//    
//    // The GUI by means of which the user can add books in the catalogue
//    private BookSellerGui myGui;
//    
//    
//    // Put agent initializations here
//    protected void setup() 
//    {
//        // Create the catalogue
//        catalogue = new Hashtable();
//        // Create and show the GUI
//        myGui = new BookSellerGui(this);
//        myGui.show();
//        // Add the behaviour serving requests for offer from buyer agents
//        addBehaviour(new OfferRequestsServer());
//        // Add the behaviour serving purchase orders from buyer agents
//        addBehaviour(new PurchaseOrdersServer());
//    }
//    
//    // Put agent clean-up operations here
//    protected void takeDown() 
//    {
//        // Close the GUI
//        myGui.dispose();
//        // Printout a dismissal message
//        System.out.println("Seller-agent "+getAID().getName()+" terminating.");
//    }
//    /**
//    This is invoked by the GUI when the user adds a new book for sale
//    */
//    public void updateCatalogue(final String title, final int price) 
//    {
//        addBehaviour(new OneShotBehaviour() 
//        {
//            public void action() 
//            {
//            catalogue.put(title, new Integer(price));
//            }
//        } );
//    }
//}    
