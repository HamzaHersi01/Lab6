import java.io.*;
import java.util.InputMismatchException;

public class RainfallProgram {
	public static void main(String[] args) throws IOException, InvalidRainfallException {
		BufferedReader keyboard = new BufferedReader(
			new InputStreamReader(System.in) 
		);
		
		RainfallStats stats = new RainfallStats();
		System.out.println("Enter rainfall measurements (in mm), or \"end\" to stop.");
		
		while(true) {
			System.out.print("> ");
			String line = keyboard.readLine(); 
			if("end".equals(line)) {
				break;
			}
				try {
				double measurment = Double.parseDouble(line);
				stats.addMeasurement(measurment);
				}
				
				catch(InvalidRainfallException measurment){
					System.out.print("This is not a number!");
					
				}
				
			// TODO: parse the measurement and add it to stats
			
			
			// TODO: print a message if the measurement cannot be parsed
			
			// TODO: print a message if the measurement is negative
			
		}
		
		System.out.println(stats.getCount() + " measurement(s) entered.");
		
		// TODO: prevent the exception when no measurements have been entered.
		System.out.println("Mean rainfall: " + stats.getMean() + " mm");
		System.out.println("Maximum rainfall: " + stats.getMax() + " mm");
	}
}
