package com.bridgelabz.designpattern.mediator;

public interface IAtc {
	public void registerFlight(Flight flight);
	public void registerRunway(Runway runway);
	public void setAvaility(boolean status);
	public boolean isAvailable();

}
