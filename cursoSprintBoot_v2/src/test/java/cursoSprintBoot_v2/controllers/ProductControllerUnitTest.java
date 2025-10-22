package cursoSprintBoot_v2.controllers;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import cursoSprintBoot_v2.configuration.ExternalizedConfigurations;
import cursoSprintBoot_v2.domain.Product;
import cursoSprintBoot_v2.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

class ProductControllerUnitTest {

    @Mock
    private ExternalizedConfigurations externalizedConfigurations;

    @Mock
    private ProductService productService;  // <<---- mock del service

    @InjectMocks
    private ProductController productController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        // Evita NullPointerException del ExternalizedConfigurations
        when(externalizedConfigurations.toString()).thenReturn("Configuración mockeada");

        // Simula que productService.getProducts() devuelve una lista vacía o con datos de prueba
        List<Product> dummyProducts = new ArrayList<>();
        dummyProducts.add(new Product(1, "Producto 1", 100.0, 10));
        dummyProducts.add(new Product(2, "Producto 2", 200.0, 5));
        when(productService.getProducts()).thenReturn(dummyProducts);
    }

    @Test
    void testGetProducts() {
        // Llama al método del controlador
        ResponseEntity<List<Product>> response = productController.getProducts();

        // Obtén la lista de productos del ResponseEntity
        List<Product> products = response.getBody();

        // Validaciones básicas
        assertNotNull(products, "La lista de productos no debe ser null");
        assertEquals(2, products.size(), "Debe haber 2 productos en la lista");

        // Imprime los productos en consola (opcional)
        products.forEach(System.out::println);
    }
}