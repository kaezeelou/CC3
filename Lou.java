
package Character;

import Item.Armor;
import Item.Weapon;


/**
* The Wizard class extends Character, adding two new instance
* variables: maxPower, and currentPower, as well as the
* ultimateSnipe(), lethalShoot() and tacticalGrenade() methods 
* for the skills
* Implements weapon, armor
*/
public class Lou extends Character implements Weapon, Armor{
    private int maxPower;
    private int currentPower;
    
    
    
     /**
     * The Lou(String,int,int,int) constructor overrides the
     * constructor with the same signature in Character. It first
     * calls that constructor using the super keyword, then
     * initializes maxPower to a value, and sets currentPower to
     * the same value, similar to lifepoints.
     * @param n
     * @param s
     * @param d
     * @param i
     */
    public Lou(String n, int s, int d, int i){
         super.name = n;
         super.strength = s;
         super.dexterity = d;
         super.intelligence = i; 
         maxPower = 100;
         currentPower = maxPower;
    
    }
    
    /**
* ultimateSnipe() represents the ultimate power. The
* method first checks that currentPower is greater than/equal
* to 10. If it is, currentMagic is reduced by 10 and a random
* number is returned using the dice inherited from Character,
* modified by the character's intelligence.
* @returns 0.
*/
   
    public int ultimateSnipe(){
      if (currentPower >= 10){
            currentPower = currentPower - 10;
            return dice.roll() * dexterity;
        
        }else {
        return 0;
                }
       
    } 
    
    /**
     * lethatShoot() represents 2nd skill. 
     * The method first checks that currentPower is greater than/equal
     * to 5. If it is, currentPower is reduced by 5 
     * and a random modified by the character's intelligence
     * @return 0
     */
    public int lethalShoot(){
       if (currentPower >= 5){
            
            currentPower = currentPower - 5;
            return dice.roll() * dexterity;
        
        }else {
        return 0;
                }
    }
    /**
     * lethatShoot() represents 2nd skill. 
     * The method first checks that currentPower is greater than/equal
     * to 3. If it is, currentPower is reduced by 3 
     * and a random modified by the character's intelligence
     * 
     * 
     * @return 0
     */
    public int tacticalGrenade(){
       if (currentPower >= 3){
            
            currentPower = currentPower - 3;
            return dice.roll() * dexterity;
        
        }else {
        return 0;
                }
    }
    
    /**
     * 
     * @return maxPower
     */
   public int getMaxPower(){
       return maxPower;
   
   }
   /**
    * 
    * @return currentPower
    */
   public int getCurrentPower(){
       return currentPower;
   }
    
   /**
    * attack method abstract
    * @return an integer
    */
    @Override
   public int attack(){
        return dice.roll() * strength;
       
    }
   
   /**
     * 
     * useWeapon method will 
     * return a dice roll modified by strength.
     */
    @Override
   public int useWeapon(){
       return dice.roll() * strength;
   
   }
   
   /**
    * 
    * @return a dice roll modified by strength
    * invoke the heal() method
    */
   @Override 
   public int useArmor(){
       super.heal(0);
       return dice.roll() * strength;
       
   }

    
}
