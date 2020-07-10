package kg.megacom.loginService.models.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "phones")
public class Phone {

    @Column(name = "phone_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length =13)
    private String phoneNumber;

    private boolean isActive;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}
