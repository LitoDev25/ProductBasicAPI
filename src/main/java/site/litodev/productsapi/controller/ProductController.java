package site.litodev.productsapi.controller;

import org.springframework.web.bind.annotation.*;
import site.litodev.productsapi.model.Product;
import site.litodev.productsapi.repository.ProductRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("products")
public class ProductController
{
    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    @PostMapping
    public Product store(@RequestBody Product product)
    {
        var id = UUID.randomUUID().toString();
        product.setId(id);
        productRepository.save(product);
        System.out.println("Produto Recebido: " + product);
        return product;
    }

    @GetMapping("/{id}")
    public Product show(@PathVariable("id") String id)
    {
        return productRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<Product> index()
    {
        return productRepository.findAll();
    }

    @GetMapping("/search")
    public List<Product> search(@RequestParam("name") String name)
    {
        return productRepository.findByName(name);
    }

    @PutMapping("/{id}")
    public String update(@PathVariable("id") String id, @RequestBody Product product)
    {
        product.setId(id);
        productRepository.save(product);
        return "Produto Atualizado com sucesso!";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") String id)
    {
        productRepository.deleteById(id);
        return "Produto Deletado com sucesso!";
    }
}
