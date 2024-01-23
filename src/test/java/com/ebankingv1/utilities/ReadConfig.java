package com.ebankingv1.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
Properties pro;
public ReadConfig()
{
	
File f=new File("./Configuration/config.properties");
try {FileInputStream fi=new FileInputStream(f);
pro=new Properties();

	pro.load(fi);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}

public String geturl()
{
String url=pro.getProperty("baseurl");
return url;
}
public String username()
{
String username=pro.getProperty("username");
return username;
}
public String pass()
{
String pass=pro.getProperty("password");
return pass;
}
}
