package kg.megacom.loginService.mappers;

import kg.megacom.loginService.models.dto.RolesDto;
import kg.megacom.loginService.models.entity.Roles;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RolesMapper {

    RolesMapper INSTANSE= Mappers.getMapper(RolesMapper.class);

    Roles rolesDtoRoles(RolesDto rolesDto);
    RolesDto rolesToRolesDto(Roles roles);

}
