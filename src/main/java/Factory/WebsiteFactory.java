package Factory;

public class WebsiteFactory {
    public static Website getWebsite(WebsiteType type){
        switch (type){
            case BLOG:{
                return new Blog();
            }
            case SHOP:{
                return new Ecommerce();
            }
            default:{
                return null;
            }
        }
    }
}
