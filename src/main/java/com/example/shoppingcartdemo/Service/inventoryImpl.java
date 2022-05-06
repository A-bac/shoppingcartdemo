package com.example.shoppingcartdemo.Service;

import com.example.shoppingcartdemo.DAO.invdao;
import com.example.shoppingcartdemo.Entity.shopproducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class inventoryImpl implements inventory{
    @Autowired
    private invdao getinventory;

    @Override
    public List<shopproducts> products() {
        return this.getinventory.findAll();
    }

    @Override
    public shopproducts getprodID(int pid) {
        Optional<shopproducts> opprod = this.getinventory.findById(pid);
        shopproducts sp = null;
        if(opprod.isPresent()){
            sp = opprod.get();
        } else {
            throw new RuntimeException("SORRY WE ARE OUT OF STOCK OF " + pid);
        }
        return sp;
    }

    @Override
    public shopproducts addCart(shopproducts inventory) {
        return this.getinventory.save(inventory);
    }

    @Override
    public shopproducts updateCart(shopproducts inventory){
        return this.getinventory.save(inventory);
    }

    @Override
    public String deletefromCart(int pid) {
        this.getinventory.deleteById(pid);
        return "Deleted Successfully";
    }
}
