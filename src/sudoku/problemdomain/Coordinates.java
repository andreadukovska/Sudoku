package sudoku.problemdomain;
import java.util.Objects;

public class Coordinates {
    private final int x;
    private final int y;

    public Coordinates(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(this == null || getClass() !=o.getClass())
            return false;
        Coordinates that = (Coordinates) o;
        return x == that.x && y == that.y;
    }
//uniqe identifier which is generetded of some diven data
    @Override
    public int hashCode() {
        return Objects.hash(x,y);
    }
}
