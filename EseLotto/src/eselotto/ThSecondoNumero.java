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
public class ThSecondoNumero extends Thread {
    DatiCondivisi ptrDati;
    int num;
    int buffer;
    int num2;
    int vincita;

    public ThSecondoNumero(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
        this.num = ptrDati.getNum();
        this.buffer = ptrDati.getBuffer();
        this.num2 = ptrDati.getNum2();
        this.vincita = ptrDati.getVincita();
    }

    
    @Override
    public void run()
    {
    for(int i = 0; i < num; i++)
    {
        ptrDati.waitSem2();
    if(num2==buffer)
        {
        ptrDati.incVincita();
        
        }
    ptrDati.signalSem4();
    }
    }
}
