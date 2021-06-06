package com.example.keyword_notification.modules.keyword;

import com.example.keyword_notification.modules.account.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class KeywordService {
  private final KeywordRepository keywordRepository;

  @Transactional
  public Long add(Keyword keyword, Account account) {
    keywordRepository.save(keyword);
    account.addKeyword(keyword);
    return keyword.getId();
  }
}
