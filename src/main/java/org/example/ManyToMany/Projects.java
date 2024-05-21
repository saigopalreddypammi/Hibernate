package org.example.ManyToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;
@Entity
public class Projects {
    @Id
    @Column(name = "project_id")
    private int id;
    @Column(name = "project_name")
    private String projectName;
    @ManyToMany(mappedBy = "projectsList")
    private List<Employee> employeeList;

    public Projects(int id, String projectName, List<Employee> employeeList) {
        this.id = id;
        this.projectName = projectName;
        this.employeeList = employeeList;
    }

    public Projects(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
