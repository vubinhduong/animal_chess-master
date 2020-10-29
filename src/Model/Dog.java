package Model;

import java.util.List;

public class Dog extends Animal {
    public Dog(int color, Coordinate coordinate) {
        super(color, 3, true, "Dog", coordinate, "image/dog.jpg");
    }

    @Override
    public List<Coordinate> getPossibleMove(Piece[][] var1) {
        return null;
    }
}
