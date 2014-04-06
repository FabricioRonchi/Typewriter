/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maquinadeescrever;

/**
 *
 * @author rubens.silva
 */
public class Counter  {
    private AbstractWrite writer;
    private int counter = 0;
    
    public Counter(AbstractWrite writer) {        
        this.writer = writer;
    }

    public void write() {
        writer.write();
        increment();
    }
    
    public void increment() {
        counter++;
    }            
}
