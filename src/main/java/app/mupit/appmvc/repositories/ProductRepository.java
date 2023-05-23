package app.mupit.appmvc.repositories;

import app.mupit.appmvc.items.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private String filePath;

    public ProductRepository(String filePath) {
        this.filePath = filePath;
    }

    public List<Product> getAllProducts() {
        List<Product> productList = new ArrayList<>();

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            productList = (List<Product>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return productList;
    }

    public void saveProducts(List<Product> productList) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            outputStream.writeObject(productList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
