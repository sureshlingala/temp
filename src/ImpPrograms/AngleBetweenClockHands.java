package ImpPrograms;

public class AngleBetweenClockHands {
	
	public static void main (String[] args){
		
		AngleBetweenClockHands obj= new AngleBetweenClockHands();
		System.out.println(obj.angle(12, 30));
	}
	
	//hr is the input hour and min is the input minute
	public double angle(int hr, int min){
	
		//*30 coz :- 360 degrees in a clock and for each hr it is 30 degrees i.e 360/12
		// to calculate angle 
		float h= (hr%12+(float)min/60)*30; // will be calculating how much angle made by hour hand
		//*6 coz: 360 degrees in a clock and for each minute angle would be 6 degrees as (360degree/60 min = 6 degrees) 
		float m= min*6; // wil be calculating how much angle made by minute hand
		float angle= Math.abs(h-m);
		if(angle>180){
			
			return angle=360-angle;
		}else
			return angle;
			
	}

}
