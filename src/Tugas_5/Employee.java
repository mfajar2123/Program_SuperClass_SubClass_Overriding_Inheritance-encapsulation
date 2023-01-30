/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_5;

/**
 *
 * @author LENOVO
 */
//Employee -> Super Class
public class Employee{
    //Attribute or Properties
    String name;
    int employee_id;
    int age;
    int salary;
    
    //acces modifier private
    private String nickname;
    private String no_hp;
    
    
    // read (method getter), write (method setter) 
    public String getNickname() {
        return nickname;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }
    
    
    
   

   
    //constructor with parameters
    public Employee(String name, int employee_id, int age, int salary) {
        this.name = name;
        this.employee_id = employee_id;
        this.age = age;
        this.salary = salary;
        
    }
    
    

    //Behaviour or Method
    void perkenalkanDiri(){
        System.out.println("Hai nama saya : "+ name);   
        System.out.println("Id pegawai : "+ employee_id);
        System.out.println("Umur : "+ age);
        System.out.println("Gaji : "+ salary);
        
    }
}
