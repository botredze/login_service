package kg.megacom.loginService.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "sessions" )
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String token;
    private Date start_date;
    private Date end_date;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
