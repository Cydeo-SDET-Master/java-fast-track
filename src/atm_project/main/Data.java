package atm_project.main;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Data {

    private static Properties properties;
    public static List<Account> allAccounts;
    public static Account currentAccount;
    public static long currentAvailableNum = 214214420L;

    static {
        allAccounts = new ArrayList<>();
        properties = new Properties();
        try {
            properties.load(new FileReader("data.properties"));
        } catch (IOException e) {
            System.out.println("Data file not loaded");
            e.printStackTrace();
        }
    }

    public static String get(String key){
        return properties.getProperty(key);
    }

    public static void loadAccounts(){
        String[] arr = get("alldata").split(";");
        for(String each : arr){
            String[] forAccount = each.split(",");
            allAccounts.add(new Account(
                    forAccount[0],
                    Long.parseLong(forAccount[1]),
                    Double.parseDouble(forAccount[2]),
                    Integer.parseInt(forAccount[3])
            ));
        }
    }

}
