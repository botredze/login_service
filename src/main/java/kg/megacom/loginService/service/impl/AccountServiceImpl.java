package kg.megacom.loginService.service.impl;

import kg.megacom.loginService.database.AccountRepository;
import kg.megacom.loginService.exeptions.AccountNotFound;
import kg.megacom.loginService.mappers.AccountMapper;
import kg.megacom.loginService.models.dto.AccountDto;
import kg.megacom.loginService.models.entity.Account;
import kg.megacom.loginService.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public AccountDto saveAccount(AccountDto accountDto) {
        Account account= AccountMapper.INSTANSE.accountDtoToAccount(accountDto);
        accountRepository.save(account);
        accountDto = AccountMapper.INSTANSE.accountToAccountDto(account);

        return accountDto;
    }

    @Override
    public AccountDto getAccountById(Long id) {
        accountRepository.findById(id).orElse(null);
        if(id==null){
            throw  new AccountNotFound("Данный аккаунт не найден");
        }

        return AccountMapper.INSTANSE.getById(id);
    }

    @Override
    public List<AccountDto> getAllUsers() {
        return accountRepository.findAll()
                .stream()
                .map(AccountMapper.INSTANSE::accountToAccountDto)
                .collect(Collectors.toList());
    }
}
