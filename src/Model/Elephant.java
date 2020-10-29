package Model;

import java.util.List;

public class Elephant extends Animal {
    public Elephant(int color, Coordinate coordinate) {
        super(color, 8, true, "Elephant", coordinate, "image/elephant.png");
    }

    @Override
    public List<Coordinate> getPossibleMove(Piece[][] var1) {
        return null;
    }
}
