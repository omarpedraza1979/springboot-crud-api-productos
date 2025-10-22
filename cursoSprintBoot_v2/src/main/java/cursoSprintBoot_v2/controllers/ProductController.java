package cursoSprintBoot_v2.controllers;


import cursoSprintBoot_v2.configuration.ExternalizedConfigurations;
import cursoSprintBoot_v2.domain.Product;
import cursoSprintBoot_v2.service.ProducserviceImpl;
import cursoSprintBoot_v2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.SQLOutput;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductController {

    //ProductService productService = new ProducserviceImpl();
    @Autowired
    @Lazy
    //@Qualifier("jsonResourceService")
    private ProductService productService;

    @Autowired
    private ExternalizedConfigurations externalizedConfigurations;

    @GetMapping
    public ResponseEntity<List<Product>>  getProducts() {

        System.out.println("externalizedConfigurations = "+externalizedConfigurations.toString());

        List<Product> products = productService.getProducts();
        return ResponseEntity.ok(products);
    }

}
