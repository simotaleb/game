package com.nosto.fun.game1;


public class ArenaPosition {
    public final int row;
    public final int column;
    /** Creates a new instance of ArenaPosition */
    public ArenaPosition(int x, int y) {
        this.row=x;
        this.column=y;
    }
    /**
     * @return Returns the column.
     */
    public int getColumn() {
        return this.column;
    }
    /**
     * @return Returns the row.
     */
    public int getRow() {
        return this.row;
    }
    
    
}
