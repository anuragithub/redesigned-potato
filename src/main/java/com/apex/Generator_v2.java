//package com.apex;
//
//import java.util.ListIterator;
//
///**
// * Created by Akshay on 12/21/2016.
// */
//public class Generator_v2
//{
//	private static RandomEnumGenerator<Publisher> randomPublisher = new RandomEnumGenerator<Publisher>(Publisher.class);
//	private static RandomEnumGenerator<Advertiser> randomAdvertiser = new RandomEnumGenerator<Advertiser>(Advertiser.class);
//	private static RandomEnumGenerator<Location> randomLocation = new RandomEnumGenerator<Location>(Location.class);
//	private static RandomValueGenerator randomValueGenerator = new RandomValueGenerator();
//
//	public static void main(String[] args)
//	{
//		Aggregator aggregator = new Aggregator();
//
//		for (int i = 0; i < 100; i++) {
//			AdInfo adInfo = new AdInfo(randomPublisher.random().toString(), randomAdvertiser.random().toString(), randomLocation.random().toString(),
//					randomValueGenerator.randomCost(),randomValueGenerator.randomImpressions(), randomValueGenerator.randomClicks());
//
//			aggregator.GROUP_BY_LOCATION(adInfo, Location.AK);
//			//aggregator.MAX_COST(adInfo);
//		}
//
////		ListIterator<AdInfo> listIterator = aggregator.adInfoListLocation.listIterator();
////
////		while(listIterator.hasNext())
////		{
////			System.out.println(listIterator.next());
////		}
////		System.out.println("The number of records are : "+aggregator.adInfoListLocationCount);
//	}
//}
