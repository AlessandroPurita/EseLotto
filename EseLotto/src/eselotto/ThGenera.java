/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eselotto;

import java.util.Random;

/**
 *
 * @author aless
 */
public class ThGenera extends Thread{
    
    DatiCondivisi ptrDati;
    int buffer;
    int num;

    

    public ThGenera(DatiCondivisi ptrDati) {
        this.ptrDati=ptrDati;
        this.num = ptrDati.getNum();
        this.buffer=ptrDati.getBuffer();
    }
    @Override
    public void run()
    {
        Random rand = new Random();
    for(int i = 0; i < num; i++)
    {
        ptrDati.waitSem3();
        ptrDati.waitSem4();
    buffer= rand.nextInt(2);
    ptrDati.setBuffer(buffer);
     
    ptrDati.signalSem1();
    ptrDati.signalSem2();                                                                                                                   
    }
        
    }


}
