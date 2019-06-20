package com.forkjoin;

import java.util.ArrayList;
import java.util.List;

public class ProductGenerator {

    public List<Product> generate(int size) {
        List<Product> ret = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Product product = new Product();
            product.setName("product" + i);
            product.setPrice(10);
            ret.add(product);
        }
        return ret;
    }
}
