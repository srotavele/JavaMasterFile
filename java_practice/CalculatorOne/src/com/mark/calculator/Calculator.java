package com.mark.calculator;

public class Calculator implements java.io.Serializable {
		private double operandOne;
		private double operandTwo;
		private String operation;
		private double results;
		
		public Calculator() {
			
		}
		public void performOperation() {
			if(this.getOperation().equals("+")) {
				double answer = getOperandOne() + getOperandTwo();
				setResults(answer);
			} else if(this.getOperation().equals("-")) {
				double answer = getOperandOne() - getOperandTwo();
				setResults(answer);
			}
					
		}

		public double getResults() {
			return results;
		}
		public void setResults(double results) {
			this.results = results;
		}
		public double getOperandOne() {
			return operandOne;
		}

		public void setOperandOne(double operandOne) {
			this.operandOne = operandOne;
		}

		public double getOperandTwo() {
			return operandTwo;
		}

		public void setOperandTwo(double operandTwo) {
			this.operandTwo = operandTwo;
		}

		public String getOperation() {
			return operation;
		}

		public void setOperation(String operation) {
			this.operation = operation;
		}
		
}

