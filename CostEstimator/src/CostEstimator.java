/**
 * 
 * @author prudhvir3ddy
 *
 */
public class CostEstimator {
	int materialType;
	double areaOfHouse;
	boolean isAutomated;
	
	
	public CostEstimator(int materialType,double areaOfHouse,boolean isAutomated) {
		this.areaOfHouse=areaOfHouse;
		this.materialType=materialType;
		this.isAutomated=isAutomated;
	}
	
	public double findCost() {
		int cost = 0;
		if(materialType==0)
			cost = 1200;
		else if(materialType==1)
			cost = 1500;
		else if(materialType==2 && isAutomated)
			cost = 2500;
		else
			cost = 1800;
		return areaOfHouse*cost;
	}
}
