package com.java.paymentservice.repository;

import com.java.paymentservice.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
    Payment findByOrderId(int orderId);
}
