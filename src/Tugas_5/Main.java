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
    //class main untuk eksekusi
public class Main {
    public static void main(String[] args) {
        Employee rizki = new Employee("rizki", 02, 21, 5500000);
     //call superclass method
        System.out.println("SuperClassEmployee");
        rizki.perkenalkanDiri();
       
        
        System.out.println("=========================");
//=====================================================        
        System.out.println("Inheritance");
        //set data
        Manager satria = new Manager ("s","a","q",1,2,3);
        satria.name = "satria";
        satria.employee_id = 03;
        satria.age = 22;
        satria.salary = 5000000;
        satria.job_title="firts line manager";
        satria.tugas="memimpin dan mengawasi performa tenaga kerja operasional";
        satria.perkenalkanDiriManager();
        
        System.out.println("");
        System.out.println("=========================");
//=====================================================        
        System.out.println("Inheritance & Encapsulation");
        //set data
        Manager fajar = new Manager ("s","a","q",1,2,3);
        fajar.name = "fajar";
        fajar.employee_id = 05;
        fajar.age = 20;
        fajar.salary = 6000000;
        fajar.job_title="middle manager";
        fajar.tugas="Memberikan saran dan rekomendasi ke top level management";
        
        
        
        
//        Call subclass method
        fajar.perkenalkanDiriManager();
        fajar.setNickname("fajar aja");
        fajar.setNo_hp("082143863319");
        System.out.println("Nama panggilan : "+fajar.getNickname());
        System.out.println("Nomor HP : "+fajar.getNo_hp());
        System.out.println("");
        
    }
    
   
    public Main() {
    }
}
