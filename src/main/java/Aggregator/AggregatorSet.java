package Aggregator;

import com.apex.AdInfo;

import java.util.ArrayList;
import java.util.List;

public class AggregatorSet {
    List<Aggregator> aggregatorList = new ArrayList<>();

    void addAggregator(Aggregator aggregator) {
        aggregatorList.add(aggregator);
    }

    void processItem(AdInfo adInfo) {
        for (Aggregator aggr : aggregatorList) {
            aggr.add(adInfo);
        }
    }

    List<Aggregator> getAggregatorList() {
        return aggregatorList;
    }
}


/*
Pair{Keys=[4, TWITTER, AL], Values=[4.5, 12, 2]}
Pair{Keys=[4, TWITTER, AL], Values=[7.5, 15, 3]}
Pair{Keys=[4, TWITTER, AL], Values=[8.5, 18, 3]}

[4, TWITTER, AL] [13.0, 19, 4]

 */