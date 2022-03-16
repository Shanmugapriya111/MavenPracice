package git.com;

import git.com.EmpTax;

	public class Employees {

		public static void main(String[] args) {
			EmpTax e = new EmpTax();
			double t=e.tax(26000);
			System.out.println("Employee Tax : " + t);
			

}
	}
