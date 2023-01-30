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
//extends syntax hubungan inheritance
public class Manager extends Employee {

    //attribute or properties
    String job_title;
    String tugas;

   
    public Manager(String job_title, String tugas, String name, int employee_id, int age, int salary) {
        super(name, employee_id, age, salary);
        this.job_title = job_title;
        this.tugas = tugas;
    }

    //overiding
    void perkenalkanDiriManager(){
//        [Alt 1] Call parent class or super class attribure
        System.out.println("Hai nama saya : "+ name);       
        System.out.println("Id pegawai : "+ employee_id);
        System.out.println("Umur : "+ age);
        System.out.println("Gaji : "+ salary);
//        [Alt 2]Call parent method
//        super.perkenalkanDiri();
        
        //Call child class or subclass attributee  
        System.out.println("Job Title : "+ job_title);
        System.out.println("tugas : "+ tugas);
    }
    
}