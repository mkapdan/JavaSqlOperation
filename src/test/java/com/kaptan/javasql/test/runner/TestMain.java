package com.kaptan.javasql.test.runner;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.kaptan.filterby.FilterBy;
import com.kaptan.filterby.Filterer;
import com.kaptan.groupby.Grouper;
import com.kaptan.javasql.test.comprator.NameComparator;
import com.kaptan.javasql.test.filterer.AgeFilterer;
import com.kaptan.javasql.test.filterer.DifferentObjectNameFilterer;
import com.kaptan.javasql.test.filterer.NameFilterer;
import com.kaptan.javasql.test.grouper.AgeGrouper;
import com.kaptan.javasql.test.grouper.DateGrouper;
import com.kaptan.javasql.test.grouper.NameGrouper;
import com.kaptan.javasql.test.model.CopyOfTestData;
import com.kaptan.javasql.test.model.TestData;
import com.kaptan.orderby.OrderBy;

public class TestMain {

	public static void main(String[] args) {

		Calendar inst = Calendar.getInstance();
		inst.setTime(new Date());
		inst.add(Calendar.DATE, 3);
		Date tomorrow = inst.getTime();
		// Init Data
		TestData o1 = new TestData("ZZZ", 24, new Date());
		TestData o2 = new TestData("AAA", 24, new Date());
		TestData o3 = new TestData("AAA", 25, tomorrow);

		List<TestData> items = new ArrayList<TestData>();
		items.add(o1);
		items.add(o2);
		items.add(o3);

		System.out.println("************************** Order Operations ************************");

		items = orderOperationTests(items);

		System.out.println("************************** Filter Operations ************************");

		// Filter By Data
		filterOperations(o1, items);

		System.out.println("************************** Group Operations ************************");

		grouperOperations(items);

	}

	private static void grouperOperations(List<TestData> items) {
		Grouper<String, TestData> nameGrouper = new NameGrouper();
		TestDataTextGroupByOperator groupOperator = new TestDataTextGroupByOperator(nameGrouper);
		Map<String, List<TestData>> groupedData = groupOperator.group(items);

		for (Map.Entry<String, List<TestData>> mapEnt : groupedData.entrySet()) {

			System.out.println("###" + mapEnt.getKey() + "###");
			printData("Result", mapEnt.getValue());
		}

		Grouper<Integer, TestData> ageGrouper = new AgeGrouper();
		TestDataIntegerGroupByOperator integerGrouper = new TestDataIntegerGroupByOperator(ageGrouper);
		Map<Integer, List<TestData>> integerData = integerGrouper.group(items);

		for (Map.Entry<Integer, List<TestData>> mapEnt : integerData.entrySet()) {

			System.out.println("###" + mapEnt.getKey() + "###");
			printData("Result", mapEnt.getValue());
		}

		Grouper<Date, TestData> birthGrouper = new DateGrouper();
		TestDataDateGroupByOperator dateGroupOperator = new TestDataDateGroupByOperator(birthGrouper);
		Map<Date, List<TestData>> dateData = dateGroupOperator.group(items);

		for (Map.Entry<Date, List<TestData>> mapEnt : dateData.entrySet()) {

			System.out.println("###" + mapEnt.getKey() + "###");
			printData("Result", mapEnt.getValue());
		}
	}

	private static void filterOperations(TestData o1, List<TestData> items) {

		/***************** Age Filterer ********************/

		Filterer<TestData, TestData> filterer = new AgeFilterer();
		FilterBy<TestData, TestData> filterOperator = new TestDataFilterByOperator(filterer);
		List<TestData> filtereds = filterOperator.filter(items, o1);
		printData("After", filtereds);

		/******************* Name Filterer ****************************/

		filterer = new NameFilterer();
		filterOperator.setFilterer(filterer);

		filtereds = filterOperator.filter(items, o1);
		printData("After", filtereds);

		/******************* Name Filterer ****************************/
		CopyOfTestData cp1 = new CopyOfTestData("AAA", 24, new Date());
		Filterer<TestData, CopyOfTestData> diffFilterer = new DifferentObjectNameFilterer();
		TestDataFilterByDiffObjOperator diffFilterOper = new TestDataFilterByDiffObjOperator(diffFilterer);
		List<TestData> myFiltereds = diffFilterOper.filter(items, cp1);
		printData("After", myFiltereds);

	}

	private static List<TestData> orderOperationTests(List<TestData> items) {

		Comparator<TestData> comparator = new NameComparator();
		OrderBy<TestData> orderer = new TestDataOrderByOperator(comparator);

		printData("Before", items);
		items = orderer.orderBy(items);
		printData("After", items);
		return items;
	}

	private static void printData(String title, List<TestData> items) {

		System.out.println("###" + title + "###");
		for (TestData t : items) {
			System.out.println(t.getName() + "\t" + t.getAge() + "\t" + t.getBirthDate());
		}
		System.out.println("*****************************");
	}
}
