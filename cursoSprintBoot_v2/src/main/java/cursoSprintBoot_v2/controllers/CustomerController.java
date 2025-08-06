package cursoSprintBoot_v2.controllers;

import cursoSprintBoot_v2.domain.Customer;
import org.apache.tomcat.util.digester.ArrayStack;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class CustomerController {

    private List<Customer> customers = new ArrayList<>(Arrays.asList(
            new Customer(123,"Omar Pedraza", "pedrazao", "pass123"),
            new Customer(456,"Noriela Pelaez","norip","pass456"),
            new Customer(789,"Mariana Pedraza","maryp","pass789"),
            new Customer(342,"Nohelia Garzon","nohep","pass342")
    ));

    @GetMapping
    public ResponseEntity<List<Customer>> getCustomers() {
        //return customers;
        return ResponseEntity.ok(customers);
    }

    @GetMapping("/{username}")
    public ResponseEntity<?> getCustomer(@PathVariable String username){
        System.out.println("Valor ingresado /username : "+username);
        for (Customer c: customers){
             if(c.getUserName().equalsIgnoreCase(username)){
                 System.out.println("Si se encontro el dato");
                 //return c;
                 return ResponseEntity.ok(c);
             }else{
                 System.out.println("No se encontro el dato");
             }
         }
        System.out.println("Se fue por el Null");
       return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente no encontrado : "+username);
    }

    @GetMapping("/findbyusername")
    public ResponseEntity<?> getCustomerByName(@RequestParam String username){
        System.out.println("Valor ingresado en getCustomerByName "+username);
        for (Customer c: customers){
            if(c.getUserName().equalsIgnoreCase(username)){
                System.out.println("Si se encontro el dato");
                //return c;
                return ResponseEntity.ok(c);
            }else{
                System.out.println("No se encontro el dato");
            }
        }
        System.out.println("Se fue por el Null");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente no encontrado : "+username);
    }


    @PostMapping
    public ResponseEntity<?> postCustomer(@RequestBody Customer customer){
        customers.add(customer);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{username}")
                .buildAndExpand(customer.getUserName()).toUri();

         return ResponseEntity.created(location).body(customer);
        //return ResponseEntity.status(HttpStatus.CREATED).body("Cliente creado exitosamente : "+customer.getUserName());
        //return customer;
    }

    @PutMapping
    public ResponseEntity<?> putCustomer(@RequestBody Customer customer){

        System.out.println("customer.getId() = "+customer.getId());
        System.out.println("customer.getId() = "+customer.getUserName());

        for (Customer c: customers){
            System.out.println("VALORES IDS c.getId() = "+c.getId());
            if(c.getId() ==  customer.getId()){
                c.setName(customer.getName());
                c.setUserName(customer.getUserName());
                c.setPassword(customer.getPassword());
                //return ResponseEntity.noContent().build();
                return ResponseEntity.status(HttpStatus.CREATED).body("Cliente actualizado exitosamente : "+customer.getUserName());
            }
        }
        System.out.println("Se fue por el Null");
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> DeleteCustomer(@PathVariable int id){
        for (Customer c: customers){
            if(c.getId() == id){
                customers.remove(c);
                return ResponseEntity.noContent().build();
            }
        }
        return ResponseEntity.notFound().build();
    }
    @PatchMapping
    public ResponseEntity<?>  patchCustomer(@RequestBody Customer customer){
        for (Customer c: customers){
            if(c.getId() == customer.getId()){
              if(customer.getName() != null){
                c.setName(customer.getName());
              }
              if(customer.getUserName() != null){
                 c.setUserName(customer.getUserName());
              }
              if(customer.getPassword() != null){
                 c.setUserName(customer.getUserName());
               }
                //return ResponseEntity.noContent().build();
               return ResponseEntity.ok("Cliente modificado satisfactoriamente : "+customer.getUserName());
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente no encontrado : "+customer.getId());
    }

}
