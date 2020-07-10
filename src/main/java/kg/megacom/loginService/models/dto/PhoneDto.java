package kg.megacom.loginService.models.dto;

import javax.persistence.Column;
import lombok.Data;

@Data
public class PhoneDto {
    private Long id;

    @Column(length =13)
    private String phoneNumber;

    private boolean isActive;
}
