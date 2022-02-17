package Lab8;

import java.util.ArrayList;
import java.util.Collections;

public class Management {
	ArrayList<Students> dshs = new ArrayList<>();

	public Management(ArrayList<Students> dshs) {
		this.dshs = dshs;
	}

	public Management() {
	}

	public void addStudents() {
		Students std = new Students();
		std.inputStudents();
		dshs.add(std);
	}

//	public void showListInformationStudents() {
//		for(Students info : dshs) {
//			System.out.println(info.showInformationStudents());
//		}
//	}
//	
	public void showListInformationStudents() {
		dshs.stream().forEach((std) -> {
			std.showInformationStudents();
		});
	}

	public void sortingClassName() {
		int i = 0;
		for (Students sorting : dshs) {
			if (dshs.get(i).getClassName().compareTo(dshs.get(i + 1).getClassName()) > 0) {
				Collections.swap(dshs, i, i + 1);
			}
		}
	}

}
