package chapters.chapter_04;


public class Exercise4_03 {

	public static void main(String[] args) {

		
		
		double radius= 6371.01;
		
		double aY = -84.3879824;
        double aX = 33.7489954;

        double oY = -81.3792364999;
        double oX = 28.5383355;

        double sY = -81.09983419999998;
        double sX = 32.0835407;

        double cY = -80.84312669999997;
        double cX = 35.2270869;
        
        double d1ao = radius * Math.acos((
				Math.sin(Math.toRadians(aX))*
				Math.sin(Math.toRadians(oX)) + 
				Math.cos(Math.toRadians(aX))*
				Math.cos(Math.toRadians(oX))*
				Math.cos(Math.toRadians(aY)- Math.toRadians(oY))));
        
        double d2os = radius * Math.acos((
				Math.sin(Math.toRadians(oX))*
				Math.sin(Math.toRadians(sX)) + 
				Math.cos(Math.toRadians(oX))*
				Math.cos(Math.toRadians(sX))*
				Math.cos(Math.toRadians(oY)- Math.toRadians(sY))));
        
        double d3as = radius * Math.acos((
				Math.sin(Math.toRadians(aX))*
				Math.sin(Math.toRadians(sX)) + 
				Math.cos(Math.toRadians(aX))*
				Math.cos(Math.toRadians(sX))*
				Math.cos(Math.toRadians(aY)- Math.toRadians(sY))));
        
        double d4ac = radius * Math.acos((
				Math.sin(Math.toRadians(aX))*
				Math.sin(Math.toRadians(cX)) + 
				Math.cos(Math.toRadians(aX))*
				Math.cos(Math.toRadians(cX))*
				Math.cos(Math.toRadians(aY)- Math.toRadians(cY))));
        
        double d5cs = radius * Math.acos((
				Math.sin(Math.toRadians(cX))*
				Math.sin(Math.toRadians(sX)) + 
				Math.cos(Math.toRadians(cX))*
				Math.cos(Math.toRadians(sX))*
				Math.cos(Math.toRadians(cY)- Math.toRadians(sY))));
        
        double s1 = (d1ao + d2os + d3as) / 2;
		
		double area1 = (int)((Math.pow(s1 * (s1 - d1ao) * (s1 - d2os) * (s1 - d3as), 0.5)) * 10) /10;
		
		double s2 = (d3as + d5cs + d4ac) /2;
		
		double area2 = (int)((Math.pow(s2 * (s2 - d3as) * (s2 - d5cs) * (s2 - d4ac), 0.5)) * 10) /10;
		double areaTotal = area1 + area2;
		
		System.out.println("The area enclosed by four cities is :" + areaTotal);
        
        
	}

}
