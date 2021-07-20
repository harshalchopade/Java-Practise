package Practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingOnArrayList {

	public static void iteratingOnArrayList() {

		List<String> tvSeries = new ArrayList<String>();
		tvSeries.add("GOT");
		tvSeries.add("BreakingBad");
		tvSeries.add("Friends");
		tvSeries.add("MoneyHeist");

		// Aproach1 - using iterator()
		Iterator<String> itr = tvSeries.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		// Approach2 - using lambda expression
		tvSeries.forEach(shows -> {
			System.out.println(shows);
		});

		// Approach3 - using foreach
		itr = tvSeries.iterator();
		itr.forEachRemaining(show -> System.out.println(show));

		// Approach4 - using for each
		for (String shows : tvSeries)
			System.out.println(shows);

		// Approach5 - using for loop
		
		//Approach6 - using listIterator
		ListIterator<String> listItr  = tvSeries.listIterator();
		while(listItr.hasPrevious())
			System.out.println(listItr.next());
		
	}

	public static void main(String[] args) {
		iteratingOnArrayList();
	}

}
