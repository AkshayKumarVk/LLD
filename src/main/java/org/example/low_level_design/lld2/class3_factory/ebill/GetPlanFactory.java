package org.example.low_level_design.lld2.class3_factory.ebill;

public class GetPlanFactory {
   public Plan getPlan(PlanType planType){
	  if(planType.equals (PlanType.INSTITUTIONAL_PLAN)){
		 return new InstitutionalPlan ();
	  }
	  if (planType==PlanType.COMMERCIAL_PLAN){
		 return new CommercialPlan ();
	  }
	  if (planType==PlanType.DOMESTIC_PLAN){
		 return new DomesticPlan ();
	  }
	  return null;
   }
}
