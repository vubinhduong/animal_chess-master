package Model;

import java.util.List;

public class Mouse extends Animal {
    public Mouse(int color, Coordinate coordinate) {
        super(color, 1, true, "Mouse", coordinate, "image/mouse.jpg");
    }

    @Override
    public List<Coordinate> getPossibleMove(Piece[][] var1) {
        return null;
    }
}
