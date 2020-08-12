package com.fengfang.domain;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/12 10:49
 **/
public class Teacher {
    private String name;
    private Integer age;
    private String courseName;

    public Teacher() {
    }

    public Teacher(String name, Integer age, String courseName) {
        this.name = name;
        this.age = age;
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", courseName='" + courseName + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
