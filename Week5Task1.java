/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.task1;

/**
 *
 * @author Huy Hung
 */
public class Week5Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuaCam qc= new QuaCam("hong", "my", "20/10", 20000,30);
        System.out.println(qc.Tonggiathanh());
        qc.print();
        QuaTao qt= new QuaTao(310, "quang chau", "24/12", 20000,30);
        System.out.println(qt.Tonggiathanh());
        qt.print();
        CamSanh cs= new CamSanh("day", "vietNam", "5/10", 20000,30);
        System.out.println(cs.Tonggiathanh());
        cs.print();
        CamCaoPhong ccp= new CamCaoPhong("thu h", "phap", "5/10", 20000,30);
        System.out.println(ccp.Tonggiathanh());
        ccp.print();     
    }
    
}
