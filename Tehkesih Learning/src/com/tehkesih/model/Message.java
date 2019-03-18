package com.tehkesih.model;



import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Message implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) @Lob
    private @NotNull String text;
}
