package ua.lviv.lgs.task1;

public class HourlyWorker implements Salary {

	private double hourlyWage;
	private int workTime;
	private int workingDays;

	public HourlyWorker(double hourlyWage, int workTime, int workingDays) {
		super();
		this.hourlyWage = hourlyWage;
		this.workTime = workTime;
		this.workingDays = workingDays;
	}

	@Override
	public void salary() {
		double salary = hourlyWage * workTime * workingDays;
		System.out.println("Заробітна плата працівника з погодинною платою за місяць = "
				+ salary + " грн");

	}

}
