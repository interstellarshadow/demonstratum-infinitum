package org.demonstratum.game.world;

public interface IOrbiter {
	public int getPeriod();
	public int getSemiMajor();
	public int getSemiMinor();
	public IOrbitable getParent();
}
