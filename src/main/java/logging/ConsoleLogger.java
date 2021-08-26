package logging;

import java.sql.ResultSet;

public class ConsoleLogger {
    public static void writeInfo(String msg){
        System.out.println("Info: "+msg);
    }
    public static void writeError(Error error){
        System.out.println("Error: "+error);
    }
    public static void writeQueryResults(ResultSet resultSet){
        System.out.println("Result: "+resultSet);
    }
}
