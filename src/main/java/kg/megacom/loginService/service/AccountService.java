package kg.megacom.loginService.service;

import kg.megacom.loginService.models.dto.AccountDto;

import java.util.List;

public interface AccountService {

AccountDto saveAccount(AccountDto accountDto);
AccountDto getAccountById(Long id);

List<AccountDto> getAllUsers();

}
