/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nosto.fun.game1;

/**
 *
 * @author haxx
 */
public class MachineOpponent implements Machine, Cloneable{
    Piece myPiece;
    String name;
    public MachineOpponent(){
        this.name ="Machine";
    }
    
    public void setSide(Piece p) {
        myPiece = p; //To change body of generated methods, choose Tools | Templates.
    }

   
    public Piece getSide() {
        return myPiece; //To change body of generated methods, choose Tools | Templates.
    }

    
    public ArenaPosition move(Piece[][] board, ArenaPosition last) {
        if (Math.random() * 1000 <= 3) {
            return new ArenaPosition(-23235, 0);
        }
        while (true) {
            int x = (int) (Math.random() * board.length);
            int y = (int) (Math.random() * board.length);
            if (board[x][y] == null) {
                return new ArenaPosition(x, y);
            }
        }
    }

    
    public String getName() {
       return this.name; //To change body of generated methods, choose Tools | Templates.
    }
    
    public String toString() {
        return getName();
    }
    
}
