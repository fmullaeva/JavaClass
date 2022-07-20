package marketApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


    public class Market {
        public static void main(String[] args) {
            Product product=new Product("HP laptop",599.99,4);
            Product product2=new Product("Apple Mac",1599.99,2);
            Product product3=new Product("Lenovo",899.99,4);
            Product product4=new Product("Samsung",799,1);
            Product product5=new Product("Asus",499.99,10);
            Product product6=new Product("Acer",399.99,8);
            System.out.println(product);
            Product.printProductNames();
            Product.printProductPrices();
            ArrayList<Product> products=new ArrayList<>(Arrays.asList(product,product2,product3,product4,product5,product6));
            Product product9=new Product("Nike",799,1);
            Product product7=new Product("Adidas",499.99,10);
            Product product8=new Product("New Balance",399.99,8);
            ArrayList<Product> productList=new ArrayList<>(Arrays.asList(product8,product9,product7));
            printNames(products,800);
            printNamesSerial(products);
            List<ArrayList<Product>> bucket= new ArrayList<>();
            bucket.add(products);
            bucket.add(productList);
            //System.out.println(bucket.get(0));
            System.out.println("---------------");
            System.out.println(bucket.get(1));
        }
        public static void printNames(ArrayList<Product> products, double price){
            for (int i=0;i<products.size();i++){
                if(products.get(i).getPrice()<price){
                    System.out.println(products.get(i));
                    System.out.println("=========================");
                }
            }
        }

        public static void printNamesSerial(ArrayList<Product>  products){
            for (Product product:products) {
                System.out.println(product.getProductName()+" "+product.getSerialNumber());
            }
        }
    }