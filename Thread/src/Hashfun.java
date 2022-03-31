
import java.io.*;
import java.util.HashSet;

class Group 
{

	public int index;
	public int value;

	public Group(int index, int value)
	{
		this.index = index;
		this.value = value;
	}
}


class Hashfun
{

	public static void main(String[] args)
	{

		Group arr[] = new Group[5];
		arr[0] = new Group(1, 5);
		arr[1] = new Group(6, 4);
		arr[2] = new Group(1, 5);
		arr[3] = new Group(3, 4);
		arr[4] = new Group(6, 4);

	
		HashSet<String> set = new HashSet<>();

		for (int i = 0; i < 5; i++) {
			set.add(arr[i].index + ", " + arr[i].value);
		}

		for (String e : set)
			System.out.println("(" + e + ")");
	}
}
