/**
 * The program estimates cost of the house
 * depending on the material used and 
 * area of the house and other features like automation
 * @author prudhvir3ddy
 *
 */
public class CostEstimator {
	int materialType;
	double areaOfHouse;
	boolean isAutomated;
	
	/**
	 * constructor for the CostEstimator class 
	 * job is to initialize class data
	 * @param materialType
	 * @param areaOfHouse
	 * @param isAutomated
	 */
	public CostEstimator(int materialType,double areaOfHouse,boolean isAutomated) {
		this.areaOfHouse=areaOfHouse;
		this.materialType=materialType;
		this.isAutomated=isAutomated;
	}
	
	/**
	 * function to calculate the cost of the house
	 * depending on the class instance data
	 * @return double cost of the house
	 */
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
