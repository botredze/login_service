package kg.megacom.loginService.mappers;

import kg.megacom.loginService.models.dto.PhoneDto;
import kg.megacom.loginService.models.entity.Phone;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PhoneMapper {

    PhoneMapper INSTANSE= Mappers.getMapper(PhoneMapper.class);

    PhoneDto phoneToPhoneDto (Phone phone);
    Phone phoneDtoToPhone(PhoneDto phoneDto);
}
