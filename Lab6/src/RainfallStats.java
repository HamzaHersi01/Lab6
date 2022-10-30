import java.util.*;
public class RainfallStats {

	private int count=0;
	private  double total=0.00;
	private double max=0;
	
	RainfallStats(){
		count = this.count;
		total = this.total;
		max = this.max;
	}
	
	int getCount() {
		return count;
	}
	
	void addMeasurement(double measurment) throws InvalidRainfallException {
		if(measurment<0) {
			throw new InvalidRainfallException("Measurment cant be less than 0.");
		}
		count +=1;
		
		
		total= total + measurment;
		if (measurment > max) {
			max = measurment;
		}
	}
	double getMean(){
		
		return total/Double.valueOf(count);
	}
	
	double getMax() {
		return max;
	}
		
	}



