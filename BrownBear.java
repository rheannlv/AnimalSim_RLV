import Invalid.*;

@SuppressWarnings("rawtypes")
public class BrownBear extends Animal implements Walkable, Swimmable {
		
	private String subSpecies;
	
	public BrownBear() {
		super();
		this.simID = 0;
		this.location = new Location (0,0);
		this.full=false;
		this.rested = true;
		this.subSpecies = "Alaskan";
	}//end empty argument constructor
	
	public BrownBear(int simID, Location l, String subSpecies) throws InvalidSubspeciesException {
		super();
		this.simID = simID;
		this.location=l;
		this.full=false;
		this.rested=true;
		this.setSubSpecies(subSpecies);
		
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
		
	}//end preferred constructor

	public String getSubSpecies() {
		return subSpecies;
	}//end getSub

	public void setSubSpecies(String subSpecies) throws InvalidSubspeciesException {
		
		try {
		switch(subSpecies) {//spells out the acronym for each position
		case "Alaskan":
			subSpecies = "Alaskan";
			break;
		case "Asiatic":
			subSpecies = "Asiatic";
			break;
		case "European": 
			subSpecies = "European";
			break;
		case "Grizzly": 
			subSpecies = "Grizzly";
			break;
		case "Kodiak":
			subSpecies = "Kodiak";
			break;
		case "Siberian":
			subSpecies = "Siberian";
			break;
		default:
			throw new InvalidSubspeciesException(subSpecies);
		}
		}
		catch (InvalidSubspeciesException e) {
			System.out.println(e.getMessage());
		}//end switch
		this.subSpecies = subSpecies;
	}//end setSub

	@Override
	public void swim(int direction) {
		
	int s = this.getLocation().getyCoor();
		
		if (direction > 0) {
			s += 2;
		} else {
			s -= 2;
		}
		this.location.update(s,  this.getLocation().getxCoor());
	}//end swim

	@Override
	public void walk(int direction) {
		
	int w = this.getLocation().getxCoor();
		
		if (direction > 0) {
			w += 3;
		} else {
			w -= 3;
		}
		this.location.update(w,  this.getLocation().getyCoor());
	}//end walk

	@Override
	public String toString() {
		return "BearBear | Species: " + subSpecies + "| simID: " + simID + "| " +
				location + "| Full: " + full + "| Rested: " + rested;
		
	}//end toString
	
}//end class
