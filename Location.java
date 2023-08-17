

import Invalid.InvalidCoordinateException;

public class Location {
	private int xCoor;
	private int yCoor;
	
	public Location() {
		this.xCoor = 0;
		this.yCoor = 0;
	}//end empty argument constructor
	
	public Location(int x, int y){
	
		this.setxCoor(x);
		this.setyCoor(y);
	}//end preferred constructor
	

	public void update(int x, int y) {
		
		Location lx = new Location(x,y);
		
		try {
			if (x >= 0) {
				this.xCoor = x;
			} else {
				throw new InvalidCoordinateException("Invalid x coordinate!");
			}
			
			if (y >= 0) {
				this.yCoor = y;
			} else {
				throw new InvalidCoordinateException("Invalid y coordinate!");
			}
			} catch (InvalidCoordinateException e) {
				System.out.println(e.getMessage());
			}//catch block
		
		System.out.println("Updated " + lx);
		
	}//end update
	
	public int getxCoor() {
		return xCoor;
	}

	public void setxCoor(int xCoor) {
		
		try {
			if (xCoor >= 0) {
				this.xCoor = xCoor;
			} else {
				throw new InvalidCoordinateException("Invalid x coordinate!");
			}	
			} catch (InvalidCoordinateException e) {
				System.out.println(e.getMessage());
			}
	}

	public int getyCoor() {
		return yCoor;
	}

	public void setyCoor(int yCoor) {
		
		try {
			if (yCoor>= 0) {
			this.yCoor = yCoor;
		} else {
			throw new InvalidCoordinateException("Invalid y coordinate!");
		}
		} catch (InvalidCoordinateException e) {
			System.out.println(e.getMessage());
		}
		}

	public int[] getCoordinates() {
		return new int[] {xCoor ,yCoor}; 
		

	}//end getCoordinates

	@Override
	public String toString() {
		return "Location: (" + xCoor + "," + yCoor + ")";
	}//end toString
	
	
}//end class
