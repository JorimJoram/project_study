package com.example.app.classroom;

import com.example.app.user.student.Student;
import com.example.app.user.teacher.Teacher;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Teacher teacher;

    @ManyToOne
    private Student student;

    @Column
    private String name;

    @Column
    private LocalDateTime createDate;
}
