package why.gender.gap;

import java.util.*;

class WhyGenderGapInProgramming {

	public static void main(String... args) {
		System.out.println("//-------------------------------------------------------------//");
		System.out.println("//-------------------------------------------------------------//");
		System.out.println("//---- WHY IS THERE A GENDER IMBALANCE IN PROGRAMMING JOBS ----//");
		System.out.println("//-------------------------------------------------------------//");
		System.out.println("//-------------------------------------------------------------//");

		List<Job> jobs = getSomeJobOptions();

		Woman jane = new Woman();
		Collections.shuffle(jobs);
		Job jobSelectedByWoman = jane.chooseJobFrom(jobs);
		System.out.println("Jane has chosen to become a " + jobSelectedByWoman);

		Man joe = new Man();
		Collections.shuffle(jobs);
		Job jobSelectedByMan = joe.chooseJobFrom(jobs);
		System.out.println("Joe has chosen to become a " + jobSelectedByMan);

		System.out.println("//-------------------------------------------------------------//");
		System.out.println("//-------------------------------------------------------------//");

	}

	private static List<Job> getSomeJobOptions() {
		List<Job> jobOptions = new ArrayList<>();
		jobOptions.add(new Job("Doctor", true, true, true, true));
		jobOptions.add(new Job("Teacher", true, true, false, false));
		jobOptions.add(new Job("Lawyer", true, true, true, true));
		jobOptions.add(new Job("Writer", false, true, true, false));
		jobOptions.add(new Job("Marketing manager", true, true, false, false));
		jobOptions.add(new Job("Developer", true, true, true, true));
		jobOptions.add(new Job("Interior designer", true, true, false, false));

		return jobOptions;

	}

}