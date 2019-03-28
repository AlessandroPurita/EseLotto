/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eselotto;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aless
 */
public class EseLotto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Scanner input = new Scanner(System.in);
            int num;
            int num2;
            int num1;
            System.out.println("Inserisci il numero di numeri da generare");
            num = input.nextInt();
            System.out.println("Inserisci il primo numero che punti");
            num1 = input.nextInt();
            System.out.println("Inserisci il secondo numero che punti");
            num2 = input.nextInt();
            DatiCondivisi ptrDati = new DatiCondivisi(num,num1,num2);
            ThGenera thg= new ThGenera(ptrDati);
            ThPrimoNumero th1 = new ThPrimoNumero(ptrDati);
            ThSecondoNumero th2 = new ThSecondoNumero(ptrDati);
            
            thg.start();
            th1.start();
            th2.start();
            
            thg.join();
            th1.join();
            th2.join();
            
             System.out.println("hai vinto "+ptrDati.getVincita()+" volte");
             System.out.println("Fine programma");
        } catch (InterruptedException ex) {
            Logger.getLogger(EseLotto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
