package com.banking.prototype.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table
@Entity
@Data
@NoArgsConstructor
public class CompanyAccountInfo {

    @Id
    @GeneratedValue
    private long id;

    private String companyName;

    private String phoneNum;

    private long bankAccountId;

    private String address;

}
