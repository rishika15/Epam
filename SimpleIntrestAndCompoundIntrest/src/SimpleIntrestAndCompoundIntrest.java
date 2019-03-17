/**
 * blueprint for finding simple intrest and compound intrest 
 * @author prudhvir3ddy
 *
 */
public class SimpleIntrestAndCompoundIntrest {
	
	float principle,rateOfIntrest,timePeriod;
	/**
	 * constructor initializes class data 
	 * @param principle
	 * @param rateOfIntrest
	 * @param timePeriod
	 */
	public SimpleIntrestAndCompoundIntrest(float principle,float rateOfIntrest,float timePeriod) {
		this.principle=principle;
		this.rateOfIntrest=rateOfIntrest;
		this.timePeriod=timePeriod;
	}
	/**
	 * finds simple intrest of existing class data instance
	 * @return double simple intrest
	 */
	public double calcSimpleIntrest() {
		return (principle*timePeriod*rateOfIntrest)/100;
	}
	/**
	 * finds compound intrest of existing class data instance
	 * @return double compound intrest
	 */
	public double calcCompoundIntrest() {
		return principle * 
                (Math.pow((1 + rateOfIntrest / 100), timePeriod));
	}
}
