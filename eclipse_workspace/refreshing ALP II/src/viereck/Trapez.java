// Trapez.java
//
// ALP III WS 12/13 - Uebung No. 1 
// by Christoph van Heteren-Frese and Sven Wildermann 

package viereck;
import java.awt.*; // Klasse Point verf�gbar machen

public class Trapez extends Viereck {
	
	// Ein Trapez hat mindestens zwei parallele Seiten
	protected MyLine2D p1,p2; 
	
		public Trapez(){
			super();
			}
		public Trapez(Point[] points){
			super(points);
			}
}
