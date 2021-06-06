package com.example.keyword_notification.modules.keyword;

import com.example.keyword_notification.modules.account.Account;
import com.example.keyword_notification.modules.account.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest
class KeywordServiceTest {
  @Autowired
  KeywordService keywordService;
  @Autowired
  AccountService accountService;

  @Test
  void add() {
    Account account = Account.createAccount("mgh3326@naver.com", "robin", "123456");
    accountService.add(account);
    Keyword keyword = Keyword.createKeyword("test");
    System.out.println("keyword = " + keyword);
    keywordService.add(keyword, account);
    System.out.println("keyword = " + keyword);
    Keyword keyword2 = Keyword.createKeyword("test2");
    keywordService.add(keyword2, account);
  }
}