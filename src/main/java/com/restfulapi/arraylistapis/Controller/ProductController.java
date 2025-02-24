package com.restfulapi.arraylistapis.Controller;


import com.restfulapi.arraylistapis.Model.Product;
import com.restfulapi.arraylistapis.Service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/student")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //@Autowired
    // private ProductService productservice
    //productservice.setname(ProductService productservice)




    // In Previous Lab i have used feild injection like "private ProductService prodservice;"
    //This above code uses contructor Injection

    @GetMapping("/getall")
    public ArrayList<Product> getstudents(){
        return productService.getallproducts();
    }

    @PostMapping("/addstudent")
    public ArrayList<Product> addnewstudent(@RequestBody Product product){
        return productService.addnewproduct(product);
    }

    @PutMapping("/update")
    public ArrayList<Product> updateproduct(@RequestBody Product product){
        return productService.updateproduct(product);
    }

    @DeleteMapping("/delete")
    public void deletestudent(@RequestParam String name){
        productService.deleteproduct(name);
    }



}
