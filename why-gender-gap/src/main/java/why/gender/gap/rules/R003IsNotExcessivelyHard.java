package why.gender.gap.rules;

import java.util.function.Predicate;

import why.gender.gap.Job;

public class R003IsNotExcessivelyHard implements Predicate<Job> {

    @Override
    public boolean test(Job job) {
        return !job.isLikeReallyTough();

    }
}