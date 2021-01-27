package com.training.collection;

import java.util.Comparator;

public class EmpIDCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.getEid() > e2.getEid()) {
			return 1;
		} else if (e1.getEid() < e2.getEid())
			return -1;
		else
			return 0;
	}

}
