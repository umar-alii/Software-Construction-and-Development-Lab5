package com.restfulapi.arraylistapis.Service;

import com.restfulapi.arraylistapis.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service
public class ProductService {

    ArrayList<Product> products = new ArrayList<>();

    public ProductService() {

        products.add(new Product(550, "Football", "Sports", 50000));
        products.add(new Product(1000, "Leather Jacket", "Garments", 15000));

    }

    public ArrayList<Product> getallproducts() {
        return products;

    }


    public void deleteproduct(String name){
        for(int i=0; i<products.size();i++){
            //using Objects.equals(val1,val2) is better approach then using ==
            if(Objects.equals(products.get(i).getName(), name)){
                products.remove(i);
                System.out.println("Product "+ name+" deleted successfully");
                break;
            }
        }

    }


    public ArrayList<Product> addnewproduct(Product product){
        products.add(product);
        return products;
    }

    public ArrayList<Product> updateproduct(Product product){
        for(int i=0; i<products.size();i++){
            if(Objects.equals(products.get(i).getName(), product.getName())){
                products.set(i,product);
                break;
            }

        }
        return products;
    }



}
