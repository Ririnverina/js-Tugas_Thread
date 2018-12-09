/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbb;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
class Cetak implements Runnable
{ 
    private int id;
    public Cetak (int id){
        this.id = id;
    }
    public void run()
    {
         for (int i = 1; i <= 100; i+=2) {
            System.out.println(this.id + " " + i);
            try {
                Thread.sleep(250);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cetak.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }

public class Cbb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i <100; i++) {
            executor.submit(new Cetak(i));
            
        }
        executor.shutdown();
        System.out.println("All task submitted.");
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
        }
        System.out.println("All task completed");
        //  Buat Objek dari class Cetak
       
    }
    
    }
    

