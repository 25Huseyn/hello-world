package az.atlacademy.lesson20_p3;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;

public final class CollectionUtil {

    private CollectionUtil() {
        throw new IllegalStateException("Constructor access is prohibited!");
    }

    public static final Function<List<Integer>, IntSummaryStatistics> COLLECTION_STATS_FUNC = nums -> {
        IntSummaryStatistics statistic = new IntSummaryStatistics();
        nums.forEach(statistic::accept);
        return statistic;
    };

    public static final Function<List<Integer>, IntSummaryStatistics> COLLECTION_STATS_FUNC_V2 = nums -> {
        return nums.stream().mapToInt(Integer::intValue).summaryStatistics();
    };

}
