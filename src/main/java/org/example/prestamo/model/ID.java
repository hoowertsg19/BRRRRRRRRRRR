package org.example.prestamo.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.Hidden;

import javax.persistence.*;

@MappedSuperclass
@Getter
@Setter
public class ID {
    @Id
    @GeneratedValue(generator = "sytstem-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    @Column(length = 32)
    @Hidden
    private String id;


}
