
package Character;

import Item.Armor;
import Item.Weapon;
import static Character.Character.dice;

/**
* The Wizard class extends Character, adding two new instance
* variables: maxMagic, and currentMagic, as well as the
* castLightningBolt() and castHeal() methods, which represent
* casting magic spells.
* Implements weapon, armor
*/

public class Wizard extends Character implements Weapon, Armor{
    private int maxMagic;
    private int currentMagic;
    
    
    /**
     * The Wizard(String,int,int,int) constructor overrides the
     * constructor with the same signature in Character. It first
     * calls that constructor using the super keyword, then
     * initializes maxMagic to a value, and sets currentMagic to
     * the same value, similar to lifepoints.
     * @param n
     * @param s
     * @param d
     * @param i
     */
    public Wizard(String n, int s, int d, int i){
         super.name = n;
         super.strength = s;
         super.dexterity = d;
         super.intelligence = i;
         maxMagic = 100;
         currentMagic = maxMagic;
    
    }
    
    /**
     * castLightningBolt() represents casting a magic spell. The
     * method first checks that currentMagic is greater than/equal
     * to 5. If it is, currentMagic is reduced by 5 and a random
     * number is returned using the dice inherited from Character,
     * modified by the character's intelligence.
     * Otherwise, returns 0.
     * @return 
     */
    
    public int castLightingBolt(){
      if (currentMagic >= 5){
             currentMagic = currentMagic - 5;
            return dice.roll() + intelligence;
         }else {
        return 0;
     } 
    } 
    
    /**
     * castHeal() represents casting a magic spell. The method first
     * checks that currentMagic is greater than/equal to 8. If it
     * is, currentMagic is reduced by 8 and the character's heal()
     * method is called with a random number, modified by the
     * character's intelligence score. The amount healed is also
     * returned by the method.
     * @return 
     */
    public int castHeal(){
        int heal;
        if (currentMagic >= 8){
            heal = currentMagic - 8;
            this.currentMagic += heal;
            super.heal(dice.roll() * intelligence);
         } 
        return heal=0;
    }
    
    /**
     * 
     * @return maxMagic
     */
   public int getMaxMagic(){
       return maxMagic;
   }
   
   /**
    * 
    * @return currentMagic
    */
   public int getCurrentMagic(){
       return currentMagic;
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
     * @return a dice roll modified by strength.
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
    

