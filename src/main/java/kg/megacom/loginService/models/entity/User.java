package kg.megacom.loginService.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tables")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private String name;
    private String address;

    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @OneToOne
    @JoinColumn(name = "roles_id")
    private Roles roles;

}
