package main;

import Factory.Website;
import Factory.WebsiteFactory;
import logging.ConsoleLogger;

public class factoryMain {
    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite("Ecommerce");
        ConsoleLogger.writeInfo(site.getPages().toString());
        site = WebsiteFactory.getWebsite("Blog");
        ConsoleLogger.writeInfo(site.getPages().toString());
    }
}
