package beca.customers.infrastructure.hibernate.repository;

import org.springframework.stereotype.Repository;

import beca.common.infrastructure.hibernate.repository.BaseHibernateRepository;
import beca.customers.domain.entity.Customer;
import beca.customers.domain.repository.CustomerRepository;

@Repository
public class CustomerHibernateRepository extends BaseHibernateRepository<Customer> implements CustomerRepository {

}