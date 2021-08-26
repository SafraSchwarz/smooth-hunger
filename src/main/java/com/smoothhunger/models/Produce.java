package com.smoothhunger.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Produce {
    @Id
    @SequenceGenerator(name="produce_generator", sequenceName = "produce_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produce_generator")
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @Column
    private String plu;

    @Column
    private String category;

    @Column
    private String commodity;

    @Column
    private String variety;

    @Column
    private String size;

    @Column(name = "measurements_na")
    private String measurementsNa;

    @Column(name = "measurements_global")
    private String measurementsGlobal;

    @Column(name = "restrictions_notes")
    private String restrictionsNotes;

    @Column(name = "botanical_name")
    private String botanicalName;

    @Column
    private String aka;

    @Column
    private String notes;

    @Column(name = "revision_date")
    private String revisionDate;

    @Column(name= "date_added")
    private String dateAdded;

    @Column
    private String gpc;

    @Column
    private String image;

    @Column(name = "image_source")
    private String imageSource;
}
