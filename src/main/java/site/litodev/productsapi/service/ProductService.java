package site.litodev.productsapi.service;

import org.springframework.stereotype.Service;
import site.litodev.productsapi.model.Product;
import site.litodev.productsapi.repository.ProductRepository;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product product) {
        product.setId(UUID.randomUUID().toString());
        System.out.println("Produto Recebido: " + product);
        return productRepository.save(product);
    }

    public Product getProductById(String id) {
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> findByName(String name) {
        return productRepository.findByName(name);
    }

    public String updateProduct(String id, Product product) {
        product.setId(id);
        productRepository.save(product);
        return "Produto Atualizado com sucesso!";
    }

    public String deleteProduct(String id) {
        productRepository.deleteById(id);
        return "Produto Deletado com sucesso!";
    }
}
