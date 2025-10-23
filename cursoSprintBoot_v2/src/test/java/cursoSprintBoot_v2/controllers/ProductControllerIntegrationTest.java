package cursoSprintBoot_v2.controllers;

import cursoSprintBoot_v2.configuration.ExternalizedConfigurations;
import cursoSprintBoot_v2.domain.Product;
import cursoSprintBoot_v2.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductController.class) // Solo carga el controlador
public class ProductControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    // Mockeamos las dependencias del controlador
    @MockBean
    private ProductService productService;

    @MockBean
    private ExternalizedConfigurations externalizedConfigurations;

    @Test
    void testGetProducts() throws Exception {
        // Datos simulados
        List<Product> mockProducts = Arrays.asList(
                new Product(1, "Producto1", 100.0, 50),
                new Product(2, "Producto2", 200.0, 30)
        );

        // Definir comportamiento del mock
        when(productService.getProducts()).thenReturn(mockProducts);

        // Simular GET /products
        mockMvc.perform(get("/productos"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(2))
                .andExpect(jsonPath("$[0].name").value("Producto1"))
                .andExpect(jsonPath("$[0].price").value(100.0))
                .andExpect(jsonPath("$[0].stock").value(50))
                .andExpect(jsonPath("$[1].name").value("Producto2"))
                .andExpect(jsonPath("$[1].price").value(200.0))
                .andExpect(jsonPath("$[1].stock").value(30));
    }
}