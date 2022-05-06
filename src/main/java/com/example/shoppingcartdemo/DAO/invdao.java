package com.example.shoppingcartdemo.DAO;

import com.example.shoppingcartdemo.Entity.shopproducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface invdao extends JpaRepository<shopproducts, Integer> {
}
