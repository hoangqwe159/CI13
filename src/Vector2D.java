public class Vector2D {
    public float x;
    public float y;
    // ko co thuoc tinh length va angle => thuoc tinh ao, ko can khai bao
    // x. y quan he vs len angle => !$%@#$
    public Vector2D() {

        this(0, 0); //this (0,0)
    }

    public Vector2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Vector2D addThis(float x, float y){
        this.x += x;
        this.y += y;
        return this; // giup viet mot operator dai x : + - ....

    }

    public Vector2D subtractThis(float x, float y){
        this.x -= x;
        this.y -= y;
        return this;
    }

    public Vector2D scaleThis(float rate){
        this.x *= rate;
        this.y *= rate;
        return this;
    }

    public float getLength(){
        return (float) Math.sqrt(x * x + y * y);

    }

    public Vector2D setLength(float length){
        this.x = this.x / (this.getLength() / length);
        this.y = this.y / (this.getLength() / length);
        return this;
    }

    public float getAngle(){
        return (float) Math.acos(this.x / this.getLength());
    }

    public Vector2D setAngle(float angle){


        this.x = this.getLength() * (float) Math.cos(angle);
        this.y = this.getLength() * (float) Math.sin(angle);
        return this;

    }

    @Override
    public String toString() {
        return "Vector2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
//
//    public static void main(String[] args) {
//        Vector2D v1 = new Vector2D(1,1);
//        System.out.println(v1.addThis(2, 2));
//        System.out.println(v1.setAngle((float)Math.PI / 4));
//
//    }


}

// Get set the hien tinh chat dong goi
