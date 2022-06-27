package fr.diginamic.jpaTP02;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "livre")
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @GenericGenerator(name = "seq", strategy = "increment")
    private int ID;

    @Column(name = "TITRE", nullable = false)
    private String TITRE;

    @Column(name = "AUTEUR", length = 50, nullable = false)
    private String AUTEUR;


}
