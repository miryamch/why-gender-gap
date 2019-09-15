package why.gender.gap.rules;

import java.util.function.Predicate;

import why.gender.gap.Job;

public class R004WillMakeYouAShitTonOfMoney implements Predicate<Job> {

    @Override
    public boolean test(Job job) {
        return job.isYouWillMakeAShitTonOfMoney();

    }
}