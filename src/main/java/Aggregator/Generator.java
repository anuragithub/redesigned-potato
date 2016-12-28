package Aggregator;

import com.apex.*;

public class Generator {
    private static RandomEnumGenerator<Publisher> randomPublisher = new RandomEnumGenerator<Publisher>(Publisher.class);
    private static RandomEnumGenerator<Advertiser> randomAdvertiser = new RandomEnumGenerator<Advertiser>(Advertiser.class);
    private static RandomEnumGenerator<Location> randomLocation = new RandomEnumGenerator<Location>(Location.class);
    private static RandomValueGenerator randomValueGenerator = new RandomValueGenerator();

    public static void main(String[] args) {
        String[] key = {"Publisher", "Location", "Advertiser"};
        String[] metrics = {"0"};

        Aggregator aggregator = new Aggregator(key, metrics, 0);
        AggregatorSet aggregatorSet = new AggregatorSet();
        aggregatorSet.addAggregator(aggregator);

        for (int i = 0; i < 10; i++) {
            AdInfo adInfo = new AdInfo(randomPublisher.random().toString(), randomAdvertiser.random().toString(), randomLocation.random().toString(),
                    randomValueGenerator.randomCost(), randomValueGenerator.randomImpressions(), randomValueGenerator.randomClicks());
            aggregatorSet.processItem(adInfo);
        }
    }
}
