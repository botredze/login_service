package kg.megacom.loginService.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "roles")

public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private  boolean isActive;

}
