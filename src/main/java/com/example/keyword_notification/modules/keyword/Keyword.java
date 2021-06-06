package com.example.keyword_notification.modules.keyword;


import com.example.keyword_notification.modules.account.Account;
import lombok.*;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = "id", callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class Keyword {

  @Id
  @GeneratedValue
  private Long id;
  private String name;
  @ManyToOne(fetch = LAZY)
  @JoinColumn(name = "keyword_id")
  private Account account;
}
