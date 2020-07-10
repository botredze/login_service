package kg.megacom.loginService.models.dto;

import java.util.Date;

import lombok.Data;

@Data

public class SessionDto {
    private Long id;
    private String token;
    private Date start_date;
    private Date end_date;

}
