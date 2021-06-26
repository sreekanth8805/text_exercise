package test_package;

public class Model {

	    int itemid;
	    String shortDescription;
	    int price;
	    String brand;

	    Model(int itemid,String shortDescription, int price, String brand) {
	        this.itemid = itemid;
	        this.shortDescription = shortDescription;
	        this.price = price;
	        this.brand = brand;
	    }

	    @Override
	    public String toString() {
	    	return "{" +
                 "itemid='" + itemid + '\'' +
                 "shortDescription='" + shortDescription + '\'' +
                 "price='" + price + '\'' +
                 ", brand=" + brand +
                 '}';
        }
	    public int getPrice() {
	        return price;
	    }
	 
	   
	    
	}

