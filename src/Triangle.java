public class Triangle {

    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(){

    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }

    void showInfo(){
        System.out.println("Wymiary boków trójkąta: " + firstSide + " " + secondSide + " " + thirdSide);
    }

}
