package srotavele.ninjagold;

import java.util.ArrayList;

public class User {
		public int gold;
		public ArrayList<String> actions;
		
		
		
		public User() {
			this.setGold(0);
			this.setActions(new ArrayList<String>());
		}
		
		public void printActions(String action) {
			actions.add(action);
		}



		public int getGold() {
			return gold;
		}



		public void setGold(int gold) {
			this.gold = gold;
		}



		public ArrayList<String> getActions() {
			return actions;
		}



		public void setActions(ArrayList<String> actions) {
			this.actions = actions;
		}

}
