/*
# Get properties values and set into variables
*/
package config;
/*
# Get properties values and set into variables
*/

import ru.qatools.properties.Property;
import ru.qatools.properties.PropertyLoader;
import ru.qatools.properties.Resource.Classpath;

@Classpath({"ApplicationConfig.properties"})

public class ApplicationConfigReader {

    @Property("Url")
    private String Url;

    @Property("Username")
    private String Username;

    @Property("Password")
    private String Password;

    @Property("Browser")
    private String Browser;



    public ApplicationConfigReader() {
        PropertyLoader.newInstance().populate(this);
    }
    public String getWebUrl() {
        return this.Url;
    }
    public String getUserName() {
        return this.Username;
    }
    public String getPassword() {
        return this.Password;
    }
    public String getBrowser() {
        return this.Browser;
    }

}