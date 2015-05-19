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
package jade_in_netbeans;

import jade.core.Agent;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class JADE_in_Netbeans extends Agent 
{

    public static void main(String[] args) 
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        
        System.out.println("Message in JADE "+" ["+ dateFormat.format(date) + "] \n");
    }
    
}
