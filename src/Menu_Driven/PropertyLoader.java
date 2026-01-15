package Menu_Driven;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

// this class is used to load the properties data into  PropertyLoader object and that we used in every where in DB coneection.

public class PropertyLoader {
    public static final String driver;
    public static final String url;
    public static final String user;
    public static final String Password;
    static {
        Properties Properties=new Properties();
        try {
            Properties.load(new FileInputStream("Resources/database.Properties"));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        driver=Properties.getProperty("db.driver");
        url=Properties.getProperty("db.url");
        user=Properties.getProperty("db.user");
        Password=Properties.getProperty("db.password");
    }
}
