package org.ait.project.transactionproject.modules.customer.service.seeder;

import org.ait.project.transactionproject.modules.customer.model.entity.Customer;
import org.ait.project.transactionproject.modules.customer.model.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomerSeeder implements CommandLineRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    //Seeding Customer data...
    public void run(String... args) throws Exception {
        loadCustomerData();
    }

    private void loadCustomerData() {
        if (customerRepository.count() == 0) {
            Customer customer1 = new Customer("Stephanie", "stephanie@akarinti.tech", "Jl. Sudirman 1 no 26", "081314829882");
            Customer customer2 = new Customer("Sonya", "sonya@akarinti.tech", "Jl. Sudi Mara 1 no 27", "081314829899");
            Customer customer3 = new Customer("Ivan Wijaya", "ivan@gmail.com", "Jl. Taman Sari 1 no 28", "08131499928");
            Customer customer4 = new Customer("Rama", "rama@akarinti.tech", "Jl. Gajah Mada 1 no 29B", "081314822882");
            customerRepository.save(customer1);
            customerRepository.save(customer2);
            customerRepository.save(customer3);
            customerRepository.save(customer4);
        }
        System.out.println(customerRepository.count());
    }
}
