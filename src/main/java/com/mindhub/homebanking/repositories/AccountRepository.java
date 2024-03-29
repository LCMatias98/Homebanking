package com.mindhub.homebanking.repositories;
import java.util.List;
import com.mindhub.homebanking.models.Account;
import com.mindhub.homebanking.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByNumber(String number);

    //    Boolean existsByBalanceBeetween(Double balanceMin, Double balanceMax);

    //    count
}