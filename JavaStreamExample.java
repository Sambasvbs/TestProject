import java.util.*;  
import java.util.stream.*;
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        List<Float> productPriceList = new ArrayList<Float>();  
        for(Product product: productsList){  
              
            // filtering data of list  
            if(product.price<30000){  
                productPriceList.add(product.price);    // adding price to a productPriceList  
            }  
        }  
        System.out.println(productPriceList);   // displaying data  

       List<Float> productPriceList2 =productsList.stream()  
                                     .filter(p -> p.price > 30000)// filtering data  
                                     .map(p->p.price)        // fetching price  
                                     .collect(Collectors.toList()); // collecting as list  
        System.out.println(productPriceList2);  

		//useing reduce() method in stream

		Float sumprice =
			productsList.stream().map(p->p.price).reduce(0.0f,(sum,price)->sum+price);
		Float sumprice =
			productsList.stream().map(p->p.price).reduce(0.0f,(sum,price)->sum+price);
// .reduce(0.0f,(sum, price)->sum+price);

		System.out.println("sumprice: "+sumprice);

		/*stream() copy the collection objects to stream
		  filter() conditional checking for collection objects
		  map() to update entire collection objects
		  collect() to collect the objects 
		  count() conting the objects based on conditional or map
		  reduce() it is use the sum of collection objects or cumulating elements
		  sorted() sorting elements in natural order/customized sorting useing comparator
		  forEach() display the stream objects
		  :: this oprator using reference method constructor or variable
		  toList()
		  asArray()


		*/

		JavaStreamExample jse= new JavaStreamExample();



    }  
}  