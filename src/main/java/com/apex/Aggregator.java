//package com.apex;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.ListIterator;
//
///**
// * Created by Akshay on 12/21/2016.
// */
//public class Aggregator
//{
//	public static List<AdInfo> adInfoListLocation = new ArrayList<>();
//	public static int adInfoListLocationCount=0;
//	public static double cost=0.0;
//
//	public void DISPLAY(List<AdInfo> adList)
//	{
//
//		ListIterator<AdInfo> listIterator = adList.listIterator();
//		while(listIterator.hasNext())
//		{
//			System.out.println(listIterator.next());
//		}
//		System.out.println();
//	}
//
//	public void COUNT_BY_PUBLISHER(List<AdInfo> adInfoList, Publisher publisher)
//	{
//		int count=0;
//		ListIterator<AdInfo> listIterator = adInfoList.listIterator();
//
//		while(listIterator.hasNext())
//		{
//			if(listIterator.next().getPublisher() == publisher)
//			{
//				count++;
//			}
//		}
//		System.out.println("Count of publisher "+publisher.toString()+" is : " +count);
//		System.out.println();
//	}
//
//	public void GROUP_BY_PUBLISHER(List<AdInfo> adInfoList, Publisher publisher)
//	{
//		ListIterator<AdInfo> listIterator = adInfoList.listIterator();
//
//		System.out.println("Grouped together according to publisher : "+publisher.toString());
//
//		while(listIterator.hasNext())
//		{
//			AdInfo tempPublisher = listIterator.next();
//			if(tempPublisher.getPublisher() == publisher)
//			{
//				System.out.println(tempPublisher);
//			}
//		}
//		System.out.println();
//	}
//
//	public void GROUP_BY_ADVERTISER(List<AdInfo> adInfoList, Advertiser advertiser)
//	{
//		ListIterator<AdInfo> listIterator = adInfoList.listIterator();
//
//		System.out.println("Grouped together according to location : "+advertiser.toString());
//
//		while(listIterator.hasNext())
//		{
//			AdInfo tempAdvertiser = listIterator.next();
//			if(tempAdvertiser.getAdvertiser() == advertiser)
//			{
//				System.out.println(tempAdvertiser);
//			}
//		}
//		System.out.println();
//	}
//
//	public void GROUP_BY_LOCATION(List<AdInfo> adInfoList, Location location)
//	{
//		ListIterator<AdInfo> listIterator = adInfoList.listIterator();
//		System.out.println("Grouped together according to location : "+location.toString());
//
//		while(listIterator.hasNext())
//		{
//			AdInfo tempLocation = listIterator.next();
//			if(tempLocation.getLocation() == location)
//			{
//				System.out.println(tempLocation);
//			}
//		}
//		System.out.println();
//	}
//
//	public void GROUP_BY_LOCATION_PUBLISHER(List<AdInfo> adInfoList, Publisher publisher, Location location)
//	{
//		ListIterator<AdInfo> listIterator = adInfoList.listIterator();
//		System.out.println("Grouped according to publisher : "+publisher.toString()+" and location : "+location.toString());
//
//		while(listIterator.hasNext())
//		{
//			AdInfo tempAdData = listIterator.next();
//			if(tempAdData.getPublisher() == publisher && tempAdData.getLocation() == location)
//			{
//				System.out.println(tempAdData);
//			}
//		}
//		System.out.println();
//	}
//
//	public void GROUP_BY_LOCATION(AdInfo adInfo, Location location)
//	{
//		if(adInfo.getLocation() == location)
//		{
//			adInfoListLocation.add(adInfo);
//			adInfoListLocationCount++;
//		}
//		System.out.println();
//	}
//
//	public double MAX_COST(AdInfo adInfo)
//	{
//		if(cost < adInfo.getCost())
//		{
//			cost = adInfo.getCost();
//		}
//		System.out.println();
//		return cost;
//	}
//
//}
