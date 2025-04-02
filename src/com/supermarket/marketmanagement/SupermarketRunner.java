package com.supermarket.marketmanagement;

import com.supermarket.marketmanagement.supermarket.Supermarket;
import com.supermarket.marketmanagement.section.Section;
import com.supermarket.marketmanagement.product.Product;

public class SupermarketRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Product product1 = new Product();
        product1.productId = 101;
        product1.productName = "Rice";

        Product product2 = new Product();
        product2.productId = 102;
        product2.productName = "Wheat Flour";

        Product product3 = new Product();
        product3.productId = 103;
        product3.productName = "Pulses";


        Product product4 = new Product();
        product4.productId = 104;
        product4.productName = "Juice";

        Product product5 = new Product();
        product5.productId = 105;
        product5.productName = "milk";


        Section grocerySection = new Section();
        grocerySection.sectionId = 1;
        grocerySection.sectionName = "Grocery";
        grocerySection.products = new Product[]{product1, product2, product3};


        Section beverageSection = new Section();
        beverageSection.sectionId = 2;
        beverageSection.sectionName = "Beverages";
        beverageSection.products = new Product[]{product4, product5};


        Section[] sections = {grocerySection, beverageSection};

        Supermarket supermarket = new Supermarket();
        supermarket.marketId = 1;
        supermarket.name = "FreshMart";
        supermarket.location = "bngalore";
        supermarket.sections = sections;


        // Displaying details
        supermarket.display();

        System.out.println("Main ended");
    }
}


