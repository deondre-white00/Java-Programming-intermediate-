package package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonTest
{
    public static void main(String[] args)
    {
	List<Person> personList = new ArrayList<>();
	
	personList.add(new Person("John", "Doe", 45));
	personList.add(new Person("Jane", "King", 30));
	personList.add(new Person("Bill", "Peterson", 25));
	personList.add(new Person("David", "Calvin", 60));
	personList.add(new Person("Frank", "Abraham", 51));
	    
	Collections.sort(personList);
	    
	for (Persons person : personList)
	{
	    System.out.println(person);
	}
     }
}