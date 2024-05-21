package org.example.ManyToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;
@Entity
public class Employee {
    @Id
    @Column(name = "employee_id")
    private int id;
    @Column(name = "employee_name")
    private String employeeName;
    @ManyToMany
    private List<Projects> projectsList;

    public Employee(int id, String employeeName, List<Projects> projectsList) {
        this.id = id;
        this.employeeName = employeeName;
        this.projectsList = projectsList;
    }
    public Employee(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<Projects> getProjectsList() {
        return projectsList;
    }

    public void setProjectsList(List<Projects> projectsList) {
        this.projectsList = projectsList;
    }
}
