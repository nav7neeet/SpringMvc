package model;

public class User
{
	String userName;
	String password;
	String city;
	String pickOne;
	String hiddenVar;
	
	public String getHiddenVar()
	{
		return hiddenVar;
	}
	
	public void setHiddenVar(String hiddenVar)
	{
		this.hiddenVar = hiddenVar;
	}
	
	public String getPickOne()
	{
		return pickOne;
	}
	
	public void setPickOne(String pickOne)
	{
		this.pickOne = pickOne;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
}
