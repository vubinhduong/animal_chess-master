package Model;

import java.util.List;

public class Cheetah extends Animal {
    public Cheetah(int color, Coordinate coordinate) {
        super(color, 5, true, "Cheetah", coordinate, "image/cheetah.jpg");
    }

    @Override
    public List<Coordinate> getPossibleMove(Piece[][] var1) {
        return null;
    }
}
