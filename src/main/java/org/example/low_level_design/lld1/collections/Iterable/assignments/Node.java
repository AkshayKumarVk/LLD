package org.example.low_level_design.lld1.collections.Iterable.assignments;

import java.util.Iterator;

public class Node implements Iterable<Node> {
   private int data;
   private Node next;

   public Node (int data, Node next) {
	  this.data = data;
	  this.next = next;
   }
   @Override
   public  Iterator<Node> iterator(){
return null;
   }
}
