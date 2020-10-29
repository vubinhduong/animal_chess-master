package Model;

import java.util.List;

public class Tiger extends Animal {
    public Tiger(int color, Coordinate coordinate) {
        super(color, 6, true, "Tiger", coordinate, "image/tiger.jpg");
    }

    @Override
    public List<Coordinate> getPossibleMove(Piece[][] var1) {
        return null;
    }
}
