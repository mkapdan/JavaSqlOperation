package com.kaptan.javasql.test.filterer;

import com.kaptan.filterby.AbstractFilter;
import com.kaptan.javasql.test.model.TestData;

public class AgeFilterer extends AbstractFilter<TestData, TestData> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean isConditionMet(TestData target, TestData source) {

		if (nullCheckEqualty(target, source)) {

			Integer age1 = target.getAge();
			Integer age2 = source.getAge();

			if (null == age1) {
				if (null == age2) {
					return true;
				} else {
					return false;
				}
			} else {
				if (null == age2) {
					return false;
				}
			}

			return age1.equals(age2);
		}
		return false;
	}

}
