package main;

import Factory.Website;
import Factory.WebsiteFactory;
import Factory.WebsiteType;
import logging.ConsoleLogger;

public class factoryMain {
    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        ConsoleLogger.writeInfo(site.getPages().toString());
        site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        ConsoleLogger.writeInfo(site.getPages().toString());
    }
}
