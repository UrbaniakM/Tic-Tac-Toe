/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figures;

/**
 *
 * @author mateusz
 */
public class Bishop extends Figure {
    
    public Bishop(String colour){
        super("bishop", colour);
    }
    
    @Override
    public boolean isMoveAllowed(){
        return true;
    } 
}