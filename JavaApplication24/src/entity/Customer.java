/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author pc
 */
 
public class Customer {
    private String id;
    private String name;
    private int age; 
    private String gender;
    private String phone;
    private String birthday;
    private String created_at;
    private String updated_at;
    private int staff_id ;

    public Customer() {
       
    }

    public Customer(String id, String name, int age, String gender, String phone, String birthday, String created_at, String updated_at, int staff_id) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.birthday = birthday;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.staff_id = staff_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", phone=" + phone + ", birthday=" + birthday + ", created_at=" + created_at + ", updated_at=" + updated_at + ", staff_id=" + staff_id + '}';
    }

    
    

}
