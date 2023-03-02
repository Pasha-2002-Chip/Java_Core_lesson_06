package ua.lviv.lgs.task1;

public class Main {
	public static void main(String[] args) {
		HourlyWorker workerH = new HourlyWorker(80.23, 12, 25);
		workerH.salary();
		MonthlyWorker workerM = new MonthlyWorker(20023.21);
		workerM.salary();
	}
}
