package Factory;

public class WebsiteFactory {
    public static Website getWebsite(String type){
        switch (type){
            case "Blog":{
                return new Blog();
            }
            case "Ecommerce":{
                return new Ecommerce();
            }
            default:{
                return null;
            }
        }
    }
}
