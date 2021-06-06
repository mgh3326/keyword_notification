package com.example.keyword_notification.modules.account;

import com.example.keyword_notification.modules.keyword.Keyword;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = "id", callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class Account {

  @Id
  @GeneratedValue
  private Long id;


  @Column(unique = true)
  private String email;
  private String nickname;
  private String password;

  @OneToMany(mappedBy = "account", cascade = CascadeType.PERSIST, orphanRemoval = true)
  private List<Keyword> keywords = new ArrayList<>();
}
