package Model;

import java.util.List;

public class Cat extends Animal {


    public Cat(int color, Coordinate coordinate) {
        super(color, 2, true, "Cat", coordinate, "image/cat.png");
    }

    @Override
    public List<Coordinate> getPossibleMove(Piece[][] var1) {
        return null;
    }
}
