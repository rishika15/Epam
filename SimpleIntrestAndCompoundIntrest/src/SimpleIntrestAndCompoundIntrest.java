
public class SimpleIntrestAndCompoundIntrest {
	
	float principle,rateOfIntrest,timePeriod;
	public SimpleIntrestAndCompoundIntrest(float principle,float rateOfIntrest,float timePeriod) {
		this.principle=principle;
		this.rateOfIntrest=rateOfIntrest;
		this.timePeriod=timePeriod;
	}
	public double calcSimpleIntrest() {
		return (principle*timePeriod*rateOfIntrest)/100;
	}
	public double calcCompoundIntrest() {
		return principle * 
                (Math.pow((1 + rateOfIntrest / 100), timePeriod));
	}
}
