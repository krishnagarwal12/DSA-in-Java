public class OOPS {
    public static void main(String args[]) {
        Pen p1 = new Pen(); //we have created a pen object called p1
        p1.setColour("blue");
        System.out.println(p1.getColour()); //p1.colour se p1.setColour() isiliye krna pada kyuki humlog colour aur tip ko private kr diye hai
        p1.setTip(5);
        System.out.println(p1.getTip());
        //p1.colour = "yellow";
        //System.out.println(p1.colour);
    }
    
}

class Pen {
    //properties
    private String colour;
    private int tip;

    //getters and setters
    String getColour() {
        return this.colour;
    }
    int getTip() {
        return this.tip;
    }

    //functions
    void setColour(String newColour) {
        this.colour = newColour;
    }
    void setTip(int newtip) {
        tip = newtip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int maths, int phy, int chem) {
        percentage = (maths+phy+chem)/3;
    }
}
