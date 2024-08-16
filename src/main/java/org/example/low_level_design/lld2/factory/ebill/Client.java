package org.example.low_level_design.lld2.factory.ebill;

import java.util.Scanner;

public class Client {
   public static void main (String[] args) {
	  generateBill ();

   }

   private static void generateBill () {
	  Scanner sc = new Scanner (System.in);
	  PlanType planName = PlanType.COMMERCIAL_PLAN;

//	  System.out.println ("Enter the unit for bill will be calculated-");
//	  int unit=sc.nextInt ();
	  int unit = 10;
	  GetPlanFactory planFactory = new GetPlanFactory ();

	  Plan plan = planFactory.getPlan (planName);


	  System.out.println ("Generating Bill... \n" + "Please be patient...");

	  System.out.println ("Bill amount for " + planName.name () + " for " + unit + " unit is ");
	  plan.getRate ();
	  plan.calculateBill (unit);
	  System.out.println ("debug");

   }
}
