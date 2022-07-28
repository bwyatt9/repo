/*
 * Class: CMSC203 
 * Instructor:farnaz eivazi
 * Description:Assignment 5 holidaybonus calc
 * Due: 7/28/2022
 * Platform/compiler: eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: bruce wyatt
*/
public class HolidayBonus extends java.lang.Object{
	//constructor
	public HolidayBonus() {
		}
	public static double[] calculateHolidayBonus(double[][] data,
            double high,
            double low,
            double other) {
		    double[] holidaybonus = new double[data.length];
		    double[] testholiday =holidaybonus;
			do {
		    for (int row = 0; row < data.length; row++) {
				for (int col = 0; col < data[row].length; col++) {
					double highest = TwoDimRaggedArrayUtility.getHighestInColumn(data, col);
					double lowest = TwoDimRaggedArrayUtility.getLowestInColumn(data, col);
			if (data[row][col] > 0){
						if (data[row][col] == highest) {
							holidaybonus[row] += high;
						} 
						else if (data[row][col] == lowest) {
							holidaybonus[row] += low;
						} else {
							holidaybonus[row] += other;
				}
						
				}
				}
			}
			}while(!testholiday.equals(testholiday));

			return holidaybonus;
		  }

	public static double calculateTotalHolidayBonus(double[][] data,
            double high,
            double low,
            double other) {
		    double[] HolidayBonus = calculateHolidayBonus(data, high, low, other);
		    double totalbonus = 0;
		    if(HolidayBonus.length>0) {
		    for (int i=0; i<HolidayBonus.length;i++) {
		      totalbonus+=HolidayBonus[i];
		    }
		    
		    }
		    return totalbonus;
		  }
		}

