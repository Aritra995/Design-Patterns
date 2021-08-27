package main;

import logging.ConsoleLogger;
import prototype.Record;
import prototype.Statement;

import java.util.ArrayList;
import java.util.List;

public class sqlPrototypeMain {
    public static void main(String[] args) {
        String sql = "SELECT * from Address ORDER BY name DESC";
        List<String> parameters = new ArrayList<>();
        parameters.add("Accomodation");
        Record record = new Record();
        Statement statement = new Statement(sql,parameters,record);
        ConsoleLogger.writeInfo(statement.getSql());
        ConsoleLogger.writeInfo(statement.getParameters().toString());
        ConsoleLogger.writeInfo(statement.getRecord().toString());
        Statement second = statement.clone();
        ConsoleLogger.writeInfo(second.getSql());
        ConsoleLogger.writeInfo(second.getParameters().toString());
        ConsoleLogger.writeInfo(second.getRecord().toString());

    }
}
