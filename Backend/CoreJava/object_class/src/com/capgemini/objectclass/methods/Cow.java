package com.capgemini.objectclass.methods;

public class Cow 
{
	int id;
	String name;
	double height;

	public boolean equals(Object ref)
	{
		Cow c = (Cow)ref;
		if(this.id == c.id)
		{
			if(this.name.equals(c.name))
			{
				if(this.height == c.height)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}


}
