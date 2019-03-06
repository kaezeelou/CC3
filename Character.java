
package Character;

import Item.Dice;

/**
* The Character class models a character for a roleplaying game.
* A character has a name and 3 stats: strength, dexterity, and
intelligence, as
* well as maximum allowed life points and the current value.
*/

public abstract class Character {
    /** static variables */

    static Dice dice = new Dice();
    
    protected String name;
    protected int strength;
    protected int dexterity;
    protected int intelligence;
    protected int maxLife;
    protected int currentLife;
     

    public Character(){
        name = "";
        strength = 5;
        dexterity = 5;
        intelligence = 5;
        maxLife = dice.roll() + 200;
        currentLife = maxLife;
    }
    
    /**
* Constructor takes 4 parameters: n,s,d,i and assigns them to
* instance variables name, strength, dexterity, intelligence.
* Also uses the dice instance to assign a random
* number to maxLife. currentLife is initialized to maxLife
     * @param n
     * @param s
     * @param d
     * @param i
*/
    public Character(String n, int s, int d, int i) {
        this.name = n;
        this.strength = s;
        this.dexterity = d;
        this.intelligence = i;
        this.maxLife = dice.roll() * 100;
        this.currentLife = maxLife;
    }
    /**
     * 
     * @return name
     */
    
    public String getName(){
        return name;
    }
    
    /**
     * 
     * @return strength
     */
    public int getStrength(){
        return strength;
    }
    
    /**
     * 
     * @return dexterity
     */
    public int getDexterity(){
        return dexterity;
    }
    /**
     * 
     * @return intelligence 
     */
    public int getIntel(){
        return intelligence;
    }
    
    /**
     * 
     * @return currentLife
     */
    public int getCurrentLife(){
        return currentLife;
    }
    
    /**
     * 
     * @return maxLife
     */
    public int getMaxLife(){
        return maxLife;
    }
    
    
    /**
     * 
     * @param name 
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * 
     * @param s 
     */
    public void setStrength(int s){
        this.strength = s;
    }
    /**
     * 
     * @param d 
     */
    public void setDex(int d){
        this.dexterity = d;
    }
    /**
     * 
     * @param i 
     */
    public void setIntel(int i){
        this.intelligence = i ;
    }
    /**
     * 
     */
    public void setCurrentLife(){
        this.currentLife = maxLife;
    }
    
    public void setMaxLife(){
        this.maxLife = 100;
    }
    
    
    public abstract int attack();
    
    /**
     * Decreases currentLife by the damage parameter
     * @param damage 
     */
    public void wound(int damage) {
      currentLife -= damage;
    }
    
    /**
     * Increases currentLife by the heal parameter.
     * currentLife cannot be greater than maxLife
     * @param heal
     */
    public void heal(int heal) {
        if(currentLife < maxLife){
        this.currentLife += heal;
        }
    }
    
}