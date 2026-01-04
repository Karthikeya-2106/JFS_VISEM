package com.sn1;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@OrderBy("name desc")
    private int id;

    private String name;
    private String Sem;
    private String dept;

    public Student() {}

    public Student(String name, String Sem, String dept) {
        this.name = name;
        this.Sem = Sem;
        this.dept = dept;
    }

    // getters & setters
    public int getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSem() { return Sem; }
    public void setSem(String Sem) { this.Sem = Sem; }

    public String getdept() { return dept; }
    public void setdept(String dept) { this.dept = dept; }
}
