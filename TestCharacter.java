package Test;

import Item.Dice;
import Character.Character;

public class TestCharacter {

    public static void main(String[] args) {
    
        Dice dice = new Dice();
        Character p1 = new Character() {
            @Override
            public int attack() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        Character p2 = new Character() {
            @Override
            public int attack() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        
        
   
           p1.setName("Bob");
           p1.setStrength(5);
           p1.setMaxLife();
           p1.setDex(5);
           p1.setIntel(5);
           
           p2.setName("Joe");
           p2.setStrength(5);
           p2.setMaxLife();
           p2.setDex(5);
           p2.setIntel(5);
           
           int a = 1;
           for (int i = 0; i<=2; i++) {
               System.out.println("Round " +(i+a));
               System.out.println(p1.getName() +":" + p1.getCurrentLife());
               System.out.println(p2.getName() + ":" + p2.getCurrentLife());
               int dmg1 = p1.attack();
               p2.wound(dmg1);
               System.out.println(p2.getName() + " attacks " + p1.getName() + " for " + dmg1);
               int dmg2 = p2.attack();
               p1.wound(dmg2);
               System.out.println(p1.getName() + " attacks " + p2.getName() + " for " + dmg2);
               System.out.println(p1.getName() + " HP " + p1.getCurrentLife());
               System.out.println(p2.getName() + " HP " + p2.getCurrentLife());
               System.out.println(" ");
         
           }
           if (p1.getCurrentLife() < p2.getCurrentLife()){
               System.out.println(p2.getName() + " wins!");
           }else if (p2.getCurrentLife()<= p2.getCurrentLife()){
               System.out.println(p1.getName() + " wins!");
           }
       } 
        
    
    }

