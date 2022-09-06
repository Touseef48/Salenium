package config;

public class ConfigProperties {

    public static ApplicationConfigReader appConfig = new ApplicationConfigReader();
    public static String Url=appConfig.getWebUrl();
    public static String User=appConfig.getUserName();
    public static String Password=appConfig.getPassword();
    public static String Browser=appConfig.getBrowser();

    public static void main(String[] args) {
        System.out.println(Url);
        System.out.println(User);
        System.out.println(Password);
        System.out.println(Browser);
    }
}
