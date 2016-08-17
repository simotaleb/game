package com.nosto.fun.game1;


public interface Player extends Cloneable {
 
    public void setSide(Piece p);

   
    public Piece getSide();

   
    public ArenaPosition move(Piece[][] board, ArenaPosition last);

  
    public String getName();

   
    public String toString();


}
