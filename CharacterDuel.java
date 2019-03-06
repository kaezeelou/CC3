
package Test;

import Character.Lou;
import Character.Wizard;


public class CharacterDuel {
    public static void main (String[]args) {
         Wizard wiz = new Wizard("Wizard",6,6,5);
        Lou lou = new Lou("Lou", 5,7,5);
           
        System.out.println("*****B A T T L E   B E G I N S *****");
        
     
          System.out.println(wiz.getName() + " "+ wiz.getMaxLife());
          System.out.println(lou.getName() + " "+lou.getMaxLife());
          
          int a=1;
         for (int i = 0; i < 10; i++) {
            System.out.println("Round " + (i+a));
            
           if (wiz.getCurrentMagic() >= 100){
            int dmg1 = wiz.castLightingBolt();
            lou.wound(dmg1);
            System.out.println(wiz.getName() + " attacks LightningBolt to " + lou.getName() + " for " + dmg1);
            System.out.println("Wizard's magic: "+wiz.getCurrentMagic());
            System.out.println("Wizard's life:" +wiz.getCurrentLife());
               System.out.println(" ");
               
             }else if (wiz.getCurrentMagic()>= 30){
                int dmg1 = wiz.useWeapon();
                lou.wound(dmg1);
                System.out.println(wiz.getName() + " uses wand to attack " + lou.getName() + " for " + dmg1);
                System.out.println("Wizard's magic: "+wiz.getCurrentMagic());
                System.out.println("Wizard's life:" +wiz.getCurrentLife());
                System.out.println(" ");
          
          }else if (wiz.getCurrentMagic()>= 10){
              
               System.out.println("Wizard Healed: " + wiz.castHeal());
               System.out.println("Wizards Life: " + wiz.getCurrentLife());
               System.out.println(" ");
               
          }   
           if(lou.getCurrentPower() >= 50){
               int dmg2 = lou.ultimateSnipe();
               wiz.wound(dmg2);
               System.out.println(lou.getName() + " attacks UltimateSnipe to " + wiz.getName() + " for " + dmg2);
               System.out.println("Lou's power: " +lou.getCurrentPower());
               System.out.println("Lou's life: " + lou.getCurrentLife());
               System.out.println(" ");
         
           } else if(lou.getCurrentPower() >= 30){
           int dmg2 = lou.lethalShoot();
           wiz.wound(dmg2);
           System.out.println(lou.getName() + " attacks LethalShoot to " + wiz.getName() + " for " + dmg2);
           System.out.println("Lou's power: " +lou.getCurrentPower());
           System.out.println("Lou's life: " + lou.getCurrentLife());
               System.out.println(" ");
               
          }  else if (lou.getCurrentPower() >= 20){
           int dmg2 = lou.tacticalGrenade();
           wiz.wound(dmg2);
           System.out.println(lou.getName() + " attacks TacticalGrenade to " + wiz.getName() + " for " + dmg2);
           System.out.println("Lou's power: " +lou.getCurrentPower());
           System.out.println("Lou's life: " + lou.getCurrentLife());
               System.out.println(" ");
               
           
         }else if (lou.getCurrentPower() >= 10){
           int dmg2 = lou.useWeapon();
           wiz.wound(dmg2);
           System.out.println(lou.getName() + " attacks " + wiz.getName() + " for " + dmg2);
           System.out.println("Lou's power: " +lou.getCurrentPower());
           System.out.println("Lou's life: " + lou.getCurrentLife());
               System.out.println(" ");
            
       }
 
        if(wiz.getCurrentLife() < lou.getCurrentLife() && wiz.getCurrentLife() <= 0){
               System.out.println(lou.getName() + " wins!");
           }else if (lou.getCurrentLife()<= lou.getCurrentLife()){
               System.out.println(wiz.getName() + " wins!");
           }  
}
    }
}
