package com.kaptan.javasql.test.filterer;

import java.util.Date;

import com.kaptan.filterby.AbstractFilter;
import com.kaptan.javasql.test.model.TestData;

public class DateFilter extends AbstractFilter<TestData, TestData> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean isConditionMet(TestData target, TestData source) {

		boolean nullCheckControl=nullCheckEqualty(target, source);
		if(nullCheckControl){
			Date d1=target.getBirthDate();
			Date d2=source.getBirthDate();
			nullCheckControl=d1.equals(d2);
		}
		return nullCheckControl;
	}

}
