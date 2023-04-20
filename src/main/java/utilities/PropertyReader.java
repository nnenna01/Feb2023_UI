package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    public Properties prop;
    //get the file path
    File file = new File ("src/main/resources/Configuration.Properties");
    //Read the content of the file
    FileInputStream fis = new FileInputStream(file);
public PropertyReader() throws IOException {
    prop =new Properties();
    prop.load(fis);

}
public String getSwagLabUrl(){return prop.getProperty("SwagLabUrl");}

public String getFirstName(){return prop.getProperty("FirstName");}

public String getLastName(){return prop.getProperty("lastName");}

public String getPostCode(){return prop.getProperty("PostCode");}

// public String enterUserName(){return prop.getProperty("username");}
//
//
// public String enterPassword(){return prop.getProperty("password");}
    }

