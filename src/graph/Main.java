package graph;

import java.awt.EventQueue;

import org.jfree.ui.RefineryUtilities;

public class Main {
   public static void main(String[] args) {
          //PieChart demo = new PieChart("Comparison", "Which operating system are you using?");
          //TimeSeriesChart demo = new TimeSeriesChart("Comparison", "Which operating system are you using?");
	   
	  /* final Barchart demo = new Barchart("Certas/Erradas");
       demo.pack();
       RefineryUtilities.centerFrameOnScreen(demo)
	   demo.pack();
       demo.setVisible(true);;*/  
	   
	   /*
	    * Animation
	    */
	   
	   EventQueue.invokeLater(new Runnable() {

           @Override
           public void run() {
               DTSCTest demo = new DTSCTest("Name");
               demo.pack();
               RefineryUtilities.centerFrameOnScreen(demo);
               demo.setVisible(true);
               demo.start();
           }
       });      
	   }
} 