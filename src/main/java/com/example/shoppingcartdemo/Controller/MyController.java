package com.example.shoppingcartdemo.Controller;

import com.example.shoppingcartdemo.Entity.shopproducts;
import com.example.shoppingcartdemo.Service.inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    // accepts URLs & calls server

    @RequestMapping("/")
    public String home(){
        return "<HTML>welcome to my shop - click <a href='/cart'>here</a> to shop</HTML>";
    }

    @Autowired
    private inventory get;
    @GetMapping("/cart")
    public List<shopproducts> getInventory(){
        return this.get.products();
    }

    @GetMapping("/cart/{ID}")
    public shopproducts getprodByid(@PathVariable String prodid){
        return this.get.getprodID(Integer.parseInt(prodid));
    }

    @PostMapping("/cart")
    public shopproducts addtoCart(@RequestBody shopproducts inventory){ // requests HTML body
        return this.get.addCart(inventory);
    }

    @PutMapping("/cart")
    public shopproducts updatetoCart(@RequestBody shopproducts inventory) {
        return this.get.updateCart(inventory);
    }

    @DeleteMapping("/cart/{ID}")
    public String deleteFromCart(@PathVariable String prodid){
        return this.get.deletefromCart(Integer.parseInt(prodid));
    }
}
