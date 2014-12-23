package org.demonstratum.game.world;

public class LargeAsteroid extends Entity implements IMineable, IOrbiter {

	private int radius;
	private IOrbitable parent;
	private int orbitalVelocity;
	
	public LargeAsteroid(IOrbitable parent, int radius, int orbitalVelocity){
		this.orbitalVelocity = orbitalVelocity;
		this.radius = radius;
		this.parent = parent;
	}
	@Override
	public int getPeriod() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSemiMajor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSemiMinor() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public IOrbitable getParent() {
		// TODO Auto-generated method stub
		return parent;
	}

}
