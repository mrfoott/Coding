package OOP.Module0_Basic.Ex3;

public class Triangle {
    private int ma, mb, mc;

    public Triangle() {
        this.ma = 0;
        this.mb = 0;
        this.mc = 0;
    }

    public Triangle(int ma, int mb, int mc) {
        if (ma < 0 || mb < 0 || mc < 0 || ma + mb <= mc || mb + mc <= ma || ma + mc <= mb) {
            this.ma = 0;
            this.mb = 0;
            this.mc = 0;
        } else {
            this.ma = ma;
            this.mb = mb;
            this.mc = mc;
        }
    }

    public void setMa(int ma) {
        if (ma > 0) this.ma = ma;
    }

    public void setMb(int mb) {
        if (mb > 0) this.mb = mb;
    }

    public void setMc(int mc) {
        if (mc > 0) this.mc = mc;
    }

    public int getMa() {
        return ma;
    }

    public int getMb() {
        return mb;
    }

    public int getMc() {
        return mc;
    }

    public double perimeter() {
        return ((ma + mb + mc) / 2);
    }

    public double area() {
        return Math.sqrt(perimeter() * (perimeter() - ma) * (perimeter() - mb) * (perimeter() - mc));
    }

    public String triangleType() {
        if (ma + mb <= mc || mb + mc <= ma || ma + mc <= mb) {
            return "Not a triangle!!!";
        } else {
            if (ma == mb && mb == mc) {
                return "Is an equilateral triangle!!!";
            } else if (ma == mb || mb == mc || ma == mc) {
                return "Is an isosceles triangle!!!";
            } else {
                return "Is a normal triangle";
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Edge ma: %d\nEdge mb: %d\nEdge mc: %d\nTriangle type: " + triangleType() + "\nPerimeter: " + perimeter() + "\nArea: " + area(), ma, mb, mc);
    }
}

