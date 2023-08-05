package lk.ijse.gdse63.demo1.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/custome?")
public class Customer {
    @PostMapping
    public String saveCustomer(){
        System.out.println("Saved Customer");
        return "saved";
    }
    @GetMapping
    public String getCustomer(){
        return "Get Customer";
    }

}
