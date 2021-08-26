package main;

import Builder.LunchOrder;
import logging.ConsoleLogger;

public class builderMain {
    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Bread").dressing("Dressing").meat("Meat");
        LunchOrder lunchOrder = builder.build();
        ConsoleLogger.writeInfo(lunchOrder.getBread());
        ConsoleLogger.writeInfo(lunchOrder.getCondiments());
        ConsoleLogger.writeInfo(lunchOrder.getDressing());
        ConsoleLogger.writeInfo(lunchOrder.getMeat());
    }
}
