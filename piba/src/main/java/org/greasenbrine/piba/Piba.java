/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.greasenbrine.piba;

import javax.swing.SwingUtilities;
import org.greasenbrine.piba.swing.PiBaUIEngine;

/**
 *
 * @author nepsauce
 */
    public class PiBa {
    /**
     * Runs the program on the EDT (Event Dispatch Thread)
     * 
     * @param args Command-line arguments 
     */
    @SuppressWarnings({"Convert2Lambda", "unused"})
    public static void main(String[] args){
       SwingUtilities.invokeLater(new Runnable() {
        @Override
           public void run() {
               PiBaUIEngine piBaUIEngine = new PiBaUIEngine();
           }
       });
    }
}
