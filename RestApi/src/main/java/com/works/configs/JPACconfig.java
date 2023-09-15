package com.works.configs;

import com.works.entities.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Configuration
@RequiredArgsConstructor
public class JPACconfig implements AuditorAware<String> {

    final HttpServletRequest req;

    @Override
    public Optional<String> getCurrentAuditor() {
        boolean status = req.getSession().getAttribute("user") == null;
        if ( status ) {
            return Optional.empty();
        }else {
            Customer customer = (Customer) req.getSession().getAttribute("user");
            Optional<String> optional = Optional.of(customer.getEmail());
            return optional;
        }

    }

}
