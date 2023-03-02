package ua.lviv.lgs.task1;

public class MonthlyWorker implements Salary {
		 private double monthlySalary;
		 

	public MonthlyWorker(double monthlySalary) {
			super();
			this.monthlySalary = monthlySalary;
		}


	@Override
	public void salary() {
		double salary = this.monthlySalary ;
		System.out.println("Заробітна плата працівника з фіксованою місячною зарплатою = " +salary+ " грн");
		
	}

}
