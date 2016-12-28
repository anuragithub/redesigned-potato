package Aggregator;

import com.apex.*;

public class Generator_v2 {
    private static RandomEnumGenerator<Publisher> randomPublisher = new RandomEnumGenerator<Publisher>(Publisher.class);
    private static RandomEnumGenerator<Advertiser> randomAdvertiser = new RandomEnumGenerator<Advertiser>(Advertiser.class);
    private static RandomEnumGenerator<Location> randomLocation = new RandomEnumGenerator<Location>(Location.class);
    private static RandomValueGenerator randomValueGenerator = new RandomValueGenerator();

    public static void main(String[] args) {
        AggregatorSet aggregatorSet = new AggregatorSet();
        for (int i = 1; i <= 7; i++) {
            AggregatorById aggregator = new AggregatorById(i);
            aggregatorSet.addAggregator(aggregator);
        }

        long startTime = System.currentTimeMillis();
        long currentTime = 0;
        while ((currentTime - startTime) != (5000 * 60)) {
            AdInfo adInfo = new AdInfo(randomPublisher.random().toString(), randomAdvertiser.random().toString(), randomLocation.random().toString(),
                    randomValueGenerator.randomCost(), randomValueGenerator.randomImpressions(), randomValueGenerator.randomClicks());
            aggregatorSet.processItem(adInfo);
            currentTime = System.currentTimeMillis();
        }

        for (Aggregator aggr : aggregatorSet.getAggregatorList()) {
            aggr.dump();
        }
    }
}

