/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Town;

import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author Hello VIỆT
 */
public class ManagerTown {
   
    private town town ;
    privat  ArrayList FamilyList = town.getTown();
    private static final   Scanner sc = new Scanner(System.in);

    public ManagerTown() {
       this.town =new town();
    }
    
    public void addPerson() {
       Person person = new Person();
       person.input();
       System.out.println("Nhap ten ho gia muon them nguoi : ");
       String familyName = sc.nextLine();
       for(int i = 0; i < FamilyList.size();i++) {
        if(this.town.getTown().get(i).getFamilyName().equals(familyName)) {
            
        }
           
       }
       
    }
}
