package classes;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name="ProductCatalog", portName="ProductCatalogPort", serviceName="ProductCatalogService")
public class Product {
	
	ProductImplementation ProductImplementation = new ProductImplementation();
	
	@WebMethod(action="fetch_categories", operationName="fetchProducts")
	public List<String> getProducts(){
		
		return ProductImplementation.productList();	
	}
	
	@WebMethod(action="add_categories", operationName="addProducts")
	public List<String> addProducts(String product){
		
		return ProductImplementation.addProduct(product);
	}

}
