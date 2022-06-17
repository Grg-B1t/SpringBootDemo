package com.example.demo4.Pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class E {
   // Field injection
/*     @Autowired
    Emp e;

    @Autowired
    Stu s;
 */

    Emp e;
    Stu s;

   // Constructor injection 
    // @Autowired
    // public E(Emp e, Stu s) {
    //     this.e = e;
    //     this.s = s;
    // }

    //Setters injection
    @Autowired
    public void setE(Emp e) {
        this.e = e;
    }
    @Autowired
    public void setS(Stu s) {
        this.s = s;
    }    



    public void printEandS(){
        System.out.println("Emp name: " + e.getName() + " | Stu name: " + s.getName());
    }

}
