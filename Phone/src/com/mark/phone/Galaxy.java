package com.mark.phone;

public class Galaxy extends Phone implements Ringable {
		public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringtone) {
			super(versionNumber, batteryPercentage, carrier, ringtone);
		}
		@Override
		public String ring() {
			String incomingCall = "Galaxy " + this.getVersionNumber() + " says " + this.getRingtone();
			return incomingCall;
			
		}
		@Override
		public String unlock() {
			return "Unlocking via fingerprint";
			
		}
		@Override
		public void displayInfo() {
			System.out.println("Galaxy " + this.getVersionNumber() + " from " + this.getCarrier());
		}
		
}
