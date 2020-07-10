package kg.megacom.loginService.mappers;

import kg.megacom.loginService.models.dto.SessionDto;
import kg.megacom.loginService.models.entity.Session;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SessionMapper {

    SessionMapper INSTANSE= Mappers.getMapper(SessionMapper.class);

    Session sessionDtoToSession(SessionDto sessionDto);
    SessionDto sessionsToSessionDto(Session session);

}
