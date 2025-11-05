package site.litodev.productsapi.controller;

import org.springframework.web.bind.annotation.*;
import site.litodev.productsapi.model.Product;
import site.litodev.productsapi.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product store(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @GetMapping("/{id}")
    public Product show(@PathVariable("id") String id) {
        return productService.getProductById(id);
    }

    @GetMapping
    public List<Product> index() {
        return productService.getAllProducts();
    }

    @GetMapping("/search")
    public List<Product> search(@RequestParam("name") String name) {
        return productService.findByName(name);
    }

    @PutMapping("/{id}")
    public String update(@PathVariable("id") String id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") String id) {
        return productService.deleteProduct(id);
    }
}
