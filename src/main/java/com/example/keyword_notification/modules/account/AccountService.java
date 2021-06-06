package com.example.keyword_notification.modules.account;

import com.example.keyword_notification.modules.keyword.Keyword;
import com.example.keyword_notification.modules.keyword.KeywordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class AccountService {
  private final AccountRepository accountRepository;

  @Transactional
  public Long add(Account account) {
    accountRepository.save(account);
    return account.getId();
  }
}
