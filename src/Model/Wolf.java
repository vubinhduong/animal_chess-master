package Model;

import java.util.List;

public class Wolf extends Animal {
    public Wolf(int color, Coordinate coordinate) {
        super(color, 4, true, "Wolf", coordinate, "image/wolf.png");
    }

    @Override
    public List<Coordinate> getPossibleMove(Piece[][] var1) {
        return null;
    }
}
