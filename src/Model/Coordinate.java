package Model;

public class Coordinate {
    private int iRow;
    private int iCol;

    public Coordinate(int _iRow, int _iCol) {
        this.iRow = _iRow;
        this.iCol = _iCol;
    }

    public int getRow() {
        return this.iRow;
    }

    public void setRow(int _iRow) {
        this.iRow = _iRow;
    }

    public int getCol() {
        return this.iCol;
    }

    public void setCol(int _Col) {
        this.iCol = _Col;
    }
    
    public Piece getTypeOfLand() {
    	iCol = this.getCol();
    	iRow = this.getRow();
        if((iRow >= 3 && iRow <= 5) && ((iCol >= 1 && iCol <= 2) || (iCol >= 4 && iCol <= 5))){
            return new Water(this);
        }
        return new Glass(this);
    }
}
