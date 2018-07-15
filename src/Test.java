import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        TriangleCheck triangleCheck = new TriangleCheck();
        Scanner sideAdjustment = new Scanner(System.in);
        System.out.println("Podaj długość pierwszego boku trójkąta");
        triangle.setFirstSide(sideAdjustment.nextDouble());
        System.out.println("Podaj długość drugiego boku trójkąta");
        triangle.setSecondSide(sideAdjustment.nextDouble());
        System.out.println("Podaj długość trzeciego boku trójkąta");
        triangle.setThirdSide(sideAdjustment.nextDouble());
        sideAdjustment.close();

        triangleCheck.isRightTriangle(triangle);

        boolean tiangleCheckBooleanResult = triangleCheck.isRightTriangleBoolean(triangle);
        System.out.println(tiangleCheckBooleanResult);
        triangle.showInfo();
    }
}
