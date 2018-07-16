public class TriangleCheck {

    public void isRightTriangle(Triangle triangle) {
        if ((triangle.getFirstSide() * triangle.getFirstSide()) + (triangle.getSecondSide() * triangle.getSecondSide()) ==
                triangle.getThirdSide() * triangle.getThirdSide()) {
            System.out.println("Trójkąt o bokach " + triangle.getFirstSide() + ", " + triangle.getSecondSide() +
                    " i " + triangle.getThirdSide() + " jest trójkątem prostokątnym");
        } else
            System.out.println("Trójkąt o bokach " + triangle.getFirstSide() + ", " + triangle.getSecondSide() + " " +
                    "i " + triangle.getThirdSide() + " nie jest trójkątem prostokątnym");

    }
    public boolean isRightTriangleBoolean (Triangle triangle){
        boolean result = (triangle.getFirstSide() * triangle.getFirstSide()) + (triangle.getSecondSide() * triangle.getSecondSide()) ==
                (triangle.getThirdSide() * triangle.getThirdSide());
        return result;
        }
    }

