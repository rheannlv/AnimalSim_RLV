import java.util.*;
import Invalid.*;

public abstract class Animal<T>{

	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested; 
	
	public Animal() {
		this.simID = 0;
		this.location = new Location(0,0);
		this.full = false;
		this.rested = true;
	}//end empty argument constructor
	
	public Animal(int simID, Location l) {
		this.simID = simID;
		this.location=l;
		this.full=false;
		this.rested=true;
	
	}//end of preferred constructor
	
	public int getSimID(){
	
		return simID;
	}//end getSim

	public void setSimID(int simID) throws InvalidSimIDException{
		try 
		{
		if (simID > 0) {
			this.simID = simID;
		} else {
			throw new InvalidSimIDException("The ID must be greater than 0");
			}
		}
		catch (InvalidSimIDException e) {
			System.out.println(e.getMessage());
		}
	
	}//end setSim

	public Location getLocation() {
		return location;
	}//end getLoc

	public void setLocation(Location location) {
		this.location = location;
	}//end setLoc

	public boolean isFull() {
		return full;
	}//end isFull

	public void setFull(boolean full) {
		this.full = full;
	}//end setFull

	public boolean isRested() {
		return rested;
	}//end isRested

	public void setRested(boolean rested) {
		this.rested = rested;
	}//end setRested

	
	public boolean eat() {
		Random r = new Random();
		double f = r.nextDouble(1);
		if (f <= 0.5) {
			full = false;
		} else {
			full = true;
		}
		
		return full;
	}//end eat
	
	public boolean sleep() {
		Random r = new Random();
		double s = r.nextDouble(1);
		if (s <= 0.5) {
			rested = false;
		} else {
			rested = true;
		}
		
		return rested;
	}//end sleep

	@Override
	public String toString() {
		return "Animal [simID=" + simID + ", location=" + location + ", full=" + full + ", rested=" + rested + "]";
	}//end toString
	
	
	
	
}//end class
