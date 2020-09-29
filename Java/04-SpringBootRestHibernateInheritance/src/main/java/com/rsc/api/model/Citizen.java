/*
 * package com.rsc.api.model;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
 * import javax.persistence.Inheritance; import
 * javax.persistence.InheritanceType;
 * 
 * import org.springframework.data.annotation.Id;
 * 
 * @Entity
 * 
 * @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) public class Citizen
 * {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.AUTO) private int id;
 * 
 * private String name;
 * 
 * @Column(nullable = false) private String email;
 * 
 * public int getId() { return id; }
 * 
 * public void setId(int id) { this.id = id; }
 * 
 * public String getName() { return name; }
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * public String getEmail() { return email; }
 * 
 * public void setEmail(String email) { this.email = email; }
 * 
 * 
 * }
 */