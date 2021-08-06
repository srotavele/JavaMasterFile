package com.mark.phone;

public class IPhone extends Phone implements Ringable {
		public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringtone) {
			super(versionNumber, batteryPercentage, carrier, ringtone);
		}
		@Override
		public String ring() {
			String incomingCall = "IPhone " + this.getVersionNumber() + " says " + this.getRingtone();
			return incomingCall;	
			
		}
		@Override
		public String unlock() {
			return "Unlocking via facial recognition";
			
		}
		@Override
		public void displayInfo() {
			System.out.println("IPhone " + this.getVersionNumber() + " from " + this.getCarrier());
		}
		
}
