package classes;

import java.util.ArrayList;
import java.util.List;

public class ProductImplementation {
	List<String> products = new ArrayList<String>();

	
	public List<String> productList(){
		return products;
	}
	
	public List<String> addProduct(String product){
		products.add(product);

		return products;
	}
}
