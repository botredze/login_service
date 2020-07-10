package kg.megacom.loginService.database;

import kg.megacom.loginService.models.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  PhoneRepository extends JpaRepository<Phone, Long> {
}
