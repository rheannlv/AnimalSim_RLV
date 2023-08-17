import Invalid.*;

public class Goldfinch extends Animal implements Flyable, Walkable {
	
	private double wingSpan;
	
	public Goldfinch() {
		super();
		this.simID = 0;
		this.location = new Location (0,0);
		this.full=false;
		this.rested = true;
		wingSpan = 9.0;
	}//end empty argument constructor
	
	public Goldfinch(int simID, Location l, double ws) throws InvalidWingspanException {
		super();
		this.simID = simID;
		this.location=l;
		this.full=false;
		this.rested=true;
		this.setWingSpan(ws);
		
		try 
		{
		if (simID > 0) {
			this.simID = simID;
		} else {
			throw new InvalidSimIDException("The simID must be greater than 0");
			}
		}
		catch (InvalidSimIDException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			if (5.0 < ws && ws < 11.0) {
				this.wingSpan = ws;
		} else {
			throw new InvalidWingspanException("The wing span does not meet requirements");
		}
		}catch (InvalidWingspanException e) {
				System.out.println(e.getMessage());
		}
	}//end preferred constructor

	public double getWingSpan() {
		return wingSpan;
	}//end getWs

	public void setWingSpan(double ws) throws InvalidWingspanException {
		
		try {
			if (5.0 < ws && ws < 11.0) {
				this.wingSpan = ws;
		} else {
			throw new InvalidWingspanException("The wing span does not meet requirements");
		}
		}catch (InvalidWingspanException e) {
				System.out.println(e.getMessage());
		}
	
	}//end setWs

	@Override
	public String toString() {
		return "Goldfinch | Wing Span: " + wingSpan + "| simID: " + simID + "| " +
				location + "| Full: " + full + "| Rested: " + rested;
	}//end toString

	@Override
	public void walk(int direction) {
		
		int w = this.getLocation().getxCoor();
		
		if (direction > 0) {
			w += 1;
		} else {
			w -= 1;
		}
		this.location.update(w,  this.getLocation().getyCoor());
		
	}//end walk

	@Override
	public void fly(Location l) {
		
		this.location.update(l.getxCoor(), l.getyCoor());
		
	}//end fly
	
}//end class
