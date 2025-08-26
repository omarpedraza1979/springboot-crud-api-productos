package cursoSprintBoot_v2.service;

import cursoSprintBoot_v2.domain.Product;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Primary
//@Service("listResourceService")
@Lazy
@Service
@ConditionalOnProperty(name = "service.products", havingValue = "list")
public class ProducserviceImpl implements ProductService{

    public ProducserviceImpl() {
        System.out.println("Instancia de la clase ProducserviceImpl");
    }

    private List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1, "Laptop", 100.799, 10),
            new Product(1, "SmarthWatch", 30.799, 12),
            new Product(1, "SmarthPhone", 60.799, 14),
            new Product(1, "Tablet", 40.799, 20)
    ));

    @Override
    public List<Product> getProducts() {

        return products;
    }

}
