package why.gender.gap;

import java.util.*;
import java.util.function.*;

abstract class Human {

    protected List<Predicate<Job>> rules;

    protected Job DEFAULT_JOB;

    public Job chooseJobFrom(List<Job> jobOptions) {
        return jobOptions.stream()
            .filter(rules
            .stream().reduce(job -> true, Predicate::and))
            .findFirst()
            .orElseGet(() -> DEFAULT_JOB);

    }
}