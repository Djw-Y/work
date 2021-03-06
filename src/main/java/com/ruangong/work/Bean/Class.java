package com.ruangong.work.Bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "classes")
public class Class extends AbstractBean<Long> {

    private static final long serialVersionUID = -8279352715073581855L;

    @Column
    private String name;


}
