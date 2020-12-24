package com.common.lib.users.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "role")
public class Role {
  @Id()
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idRole;

  @Column(unique = true)
  private String name;

  public Long getIdRole() {
    return idRole;
  }

  public void setIdRole(Long idRole) {
    this.idRole = idRole;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
}
