package com.test;

import com.test.comparator.AgeComparator;
import com.test.comparator.NameComparator;

import java.util.TreeSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*TreeSet<Person> treeSet=new TreeSet();
        Person person1=new Person("Deshan",25);
        Person person2=new Person("Chathusanka",25);
        Person person3=new Person("Deshan",25);
        treeSet.add(person1);
        treeSet.add(person2);
        treeSet.add(person3);*/

        TreeSet<Person> treeSet=new TreeSet(new AgeComparator());
        Person person1=new Person("Deshan",25);
        Person person2=new Person("Chathusanka",60);
        Person person3=new Person("Wagarachchi",30);
        treeSet.add(person1);
        treeSet.add(person2);
        treeSet.add(person3);

        /*TreeSet<Person> treeSet=new TreeSet(new NameComparator());
        Person person1=new Person("Deshan",25);
        Person person2=new Person("Chathusanka",25);
        Person person3=new Person("Deshan",25);
        treeSet.add(person1);
        treeSet.add(person2);
        treeSet.add(person3);*/
        System.out.println(treeSet.size());
    }
}
