package com.test.comparator;

import com.test.Person;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    private int result;
    @Override
    public int compare(Person p1, Person p2) {
        result=p1.getAge()-p2.getAge();
        return result;
    }
}
