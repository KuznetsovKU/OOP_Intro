package org.example.Seminar3.Students.data;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfComparing == 0) {
                return o1.getPatronymic().compareTo(o2.getPatronymic());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }

    public String compareWithDescription(T o1, T o2) {
        int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
        String description0 = "Согласно логике сравнения, объект " + o1.getMinInfo() + " равен объекту " +
                o2.getMinInfo() + ". Объекты имеют одинаковые имя и фамилию";
        String descriptionPos = "Согласно логике сравнения, объект " + o1.getMinInfo() + " меньше объекта " +
                o2.getMinInfo() + ". В алфавитном списке объект " + o1.getMinInfo() + " встретится раньше объекта " +
                o2.getMinInfo();
        String descriptionNeg = "Согласно логике сравнения, объект " + o1.getMinInfo() + " больше объекта " +
                o2.getMinInfo() + ". В алфавитном списке объект " + o1.getMinInfo() + " встретится позже объекта " +
                o2.getMinInfo();
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfComparing == 0) {
                return description0;
            } else if (resultOfComparing < 0) {
                return descriptionNeg;
            } else {
                return descriptionPos;
            }
        } else if (resultOfComparing < 0) {
            return descriptionNeg;
        } else {
            return descriptionPos;
        }
    }
}
