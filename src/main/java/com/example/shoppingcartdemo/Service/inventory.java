package com.example.shoppingcartdemo.Service;

//import com.example.shoppingcartdemo.DAO.invdao;
import com.example.shoppingcartdemo.Entity.shopproducts;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface inventory {

   List<shopproducts> products();
   shopproducts getprodID(int pid);
   shopproducts addCart(shopproducts inventory);
   shopproducts updateCart(shopproducts inventory);
   String deletefromCart(int pid);

}
