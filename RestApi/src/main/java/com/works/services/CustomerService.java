package com.works.services;

import com.works.entities.Customer;
import com.works.repositories.CustomerRepository;
import com.works.utils.Util;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {

    final CustomerRepository customerRepository;
    final TinkEncDec tinkEncDec;
    final HttpServletRequest request;

    public ResponseEntity register(Customer customer) {
        Optional<Customer> optionalCustomer = customerRepository.findByEmailEqualsIgnoreCase(customer.getEmail());
        if (optionalCustomer.isPresent()) {
            return Util.fail("Email in Use", HttpStatus.BAD_REQUEST);
        }else {
            customer.setPassword( tinkEncDec.encrypt( customer.getPassword() ));
            customerRepository.save(customer);
            return Util.success(customer);
        }
    }


    public ResponseEntity login(String email, String password) {
        Optional<Customer> optionalCustomer = customerRepository.findByEmailEqualsIgnoreCase(email);
        if (optionalCustomer.isPresent()) {
            Customer customer = optionalCustomer.get();
            String dbPass = tinkEncDec.decrypt(customer.getPassword());
            if (dbPass.equals(password)) {
                request.getSession().setAttribute("user", customer);
                return Util.success(customer);
            }
        }
        return Util.fail("Email or Password Fail", HttpStatus.UNAUTHORIZED);
    }

}
