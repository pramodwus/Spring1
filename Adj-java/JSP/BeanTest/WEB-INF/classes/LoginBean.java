//LoginBean.java
package com.sathya.bean;
public class LoginBean
{
	private String uname,pwd;
	public void setUname(String uname)
	{
		this.uname=uname;
	}
	public String getUname()
	{
		return uname; 
	}
	public void setPwd(String pwd)
	{
		this.pwd=pwd;
	}
	public String getPwd()
	{
		return pwd;
	}
	public boolean check()
	{
		if(uname.equals(pwd))
			return true;
		else
			return false;
	}
}