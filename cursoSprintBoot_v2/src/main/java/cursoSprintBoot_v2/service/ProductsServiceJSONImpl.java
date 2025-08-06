package cursoSprintBoot_v2.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import cursoSprintBoot_v2.domain.Product;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

//@Primary
//@Service("jsonResourceService")
@Lazy
@Service
@ConditionalOnProperty(name = "service.products", havingValue = "json")
public class ProductsServiceJSONImpl implements ProductService{

    public ProductsServiceJSONImpl() {
        System.out.println("Instancia de la clase ProductsServiceJSONImpl");
    }

    @Override
    public List<Product> getProducts() {
     List<Product> products;
        try{
          products = new ObjectMapper()
                      .readValue(this.getClass().getResourceAsStream("/products.json"),
                            new TypeReference<List<Product>>() {});

           return products;

        }catch(IOException e){
          throw new RuntimeException(e);
        }

    }

}
