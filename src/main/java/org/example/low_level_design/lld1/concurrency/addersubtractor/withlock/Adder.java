package org.example.low_level_design.lld1.concurrency.addersubtractor.withlock;


import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
   private  Count count;
   private  Lock lock;

   public Adder (Count count, Lock lock) {
	  this.count = count;
	  this.lock = lock;
   }

   @Override
   public void run () {

	  for (int i = 1; i <= 10000; i++) {
		 lock.lock ();
//		 System.out.println (lock.tryLock ());
		 System.out.println ("Adder " + i + " " + Thread.currentThread ().getName () + " Count= " + count.value);
		 count.value += 1;
		 lock.unlock ();
	  }
   }
}