package ss6_ke_thua.bai_tap.lop_point_lop_moveablepoint;

public class Moveablepoint<MoveablePoint> extends Point {
    private float xspeed;
    private float yspeed;

    public Moveablepoint() {
        super();
        xspeed = 0.0f;
        yspeed = 0.0f;
    }
    public Moveablepoint(float xspeed, float yspeed) {
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }
    public Moveablepoint(float xspeed, float yspeed, float x, float y) {
        super(x, y);
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }
    public float getXspeed() {
        return xspeed;
    }
    public void setXspeed(float xspeed) {
        this.xspeed = xspeed;
    }
    public float getYspeed() {
        return yspeed;
    }
    public void setYspeed(float yspeed) {
        this.yspeed = yspeed;
    }
    public void setspeed(float xspeed, float yspeed) {
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }
    public float[] getSpeed() {
        return new float[]{xspeed, yspeed};
    }
    @Override
    public String toString() {
        return super.toString() + ", speed="+"("+xspeed+", "+yspeed+")";
    }

    public MoveablePoint move() {
        super.setX(getX() + xspeed);
        super.setY(getY() + yspeed);
        return (MoveablePoint) this;
    }
}


