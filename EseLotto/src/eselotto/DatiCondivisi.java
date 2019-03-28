/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eselotto;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aless
 */
public class DatiCondivisi {
    
    private int num;
    private int buffer;
    private int num1;
    private int num2;

    
    private int vincita;

    
    private Semaphore sem1;
    private Semaphore sem2;
    private Semaphore sem3;
    private Semaphore sem4;

    

    public DatiCondivisi(int num,int num1,int num2) {
        this.num = num;
        this.num1=num1;
        this.num2=num2;
        this.sem1=new Semaphore(0);
        this.sem2=new Semaphore(0);
        this.sem3=new Semaphore(1);
        this.sem4=new Semaphore(1);
        
    }
     public void setNum(int num) {
        this.num = num;
    }
public int getVincita() {
        return vincita;
    }

    public void setVincita(int vincita) {
        this.vincita = vincita;
    }
    
 public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int getNum() {
        return num;
    }

    
    public void waitSem1()
    {
        try {
            sem1.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void waitSem2()
    {
        try {
            sem2.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void waitSem3()
    {
        try {
            sem3.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void waitSem4()
    {
        try {
            sem4.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void signalSem1()
    {
    
    sem1.release();
    
    }
    public void signalSem2()
    {
    
    sem2.release();
    }
    public void signalSem3()
    {
    
    sem3.release();
    }
    public void signalSem4()
    {
    
    sem4.release();
    }
    public int getBuffer() {
        return buffer;
    }

    public void setBuffer(int buffer) {
        this.buffer = buffer;
    }
    public synchronized void incVincita()
    {
    vincita++;
    }
}
