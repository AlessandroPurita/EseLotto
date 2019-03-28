/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eselotto;

/**
 *
 * @author aless
 */
public class ThPrimoNumero extends Thread {
    DatiCondivisi ptrDati;
    int num;
    int buffer;
    int num1;
    int vincita;
    public ThPrimoNumero(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
        this.num = ptrDati.getNum();
        this.num1=ptrDati.getNum1();
        this.buffer=ptrDati.getBuffer();
        this.vincita=ptrDati.getVincita();
    }
    @Override
    public void run()
    {
    for(int i = 0; i < num; i++)
    {
        ptrDati.waitSem1();
        if(num1==buffer)
        {
        ptrDati.incVincita();
        
        }
       ptrDati.signalSem3();
    }
    
    
    }
}
