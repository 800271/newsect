/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section1.pkg1;

/**
 *
 * @author hatem mostafa
 */
public class Section11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tv tv1=new tv();
        tv1.turnon();
        tv1.setchannel(30);
        tv1.setvolum(3);
        tv tv2=new tv();
        tv2.turnon();
        tv2.channelup();
        tv2.channelup();
        tv2.volumup();
        
        System.out.println("tv1,schannel is"+tv1.channel+"and volum level is"+tv1.volumlevel);
        System.out.println("tv1,schannel is"+tv2.channel+"and volum level is"+tv2.volumlevel);
        
        
        
    }
        
}
