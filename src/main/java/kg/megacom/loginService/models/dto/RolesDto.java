package kg.megacom.loginService.models.dto;
import lombok.Data;

@Data

public class RolesDto {
    private Long id;
    private String name;
    private  boolean isActive;
}
