package part2;

public class Distance {
	
	// treasure location
	private double goalX;
	private double goalY ;
 
	//player location
	private double playerX ;
	private double playerY;
public double DistanceCalculator(double gx, double gy, double px, double py)
{
	this.goalX=gx;
	this.goalY=gy;
	this.playerX=px;
	this.playerY=py;
	
	
    double a = (playerX - goalX); 
	double b = (playerY - goalY); 
	double c = Math.sqrt((a*a)+(b*b)); 
    return c;
	
}
}
