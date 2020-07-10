package kg.megacom.loginService.mappers;


import kg.megacom.loginService.models.dto.AccountDto;
import kg.megacom.loginService.models.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper {

    AccountMapper INSTANSE= Mappers.getMapper(AccountMapper.class);

    Account accountDtoToAccount(AccountDto accountDto);
    AccountDto accountToAccountDto(Account account);

    AccountDto getById(Long id);
}
