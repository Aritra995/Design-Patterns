package main;

import logging.ConsoleLogger;
import prototype.Movie;
import prototype.Registry;

public class prototypeMain {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie)registry.createItem("Movie");
        ConsoleLogger.writeInfo(movie.toString());
        ConsoleLogger.writeInfo(movie.getTitle());
        ConsoleLogger.writeInfo(movie.getRuntime());
        ConsoleLogger.writeInfo("Price: "+movie.getPrice());

        Movie ironman = (Movie) registry.createItem("Movie");
        ironman.setTitle("Ironman");
        ironman.setRuntime("2hrs 15 mins");
        ironman.setPrice(599);
        ConsoleLogger.writeInfo("-----------------------");
        ConsoleLogger.writeInfo(ironman.toString());
        ConsoleLogger.writeInfo(ironman.getTitle());
        ConsoleLogger.writeInfo(ironman.getRuntime());
        ConsoleLogger.writeInfo("Price: "+ironman.getPrice());

    }
}
