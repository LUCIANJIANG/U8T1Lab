public class FunWith2DArrays {
    public static int totalElements(int[][] numArr)
    {
        int rows = numArr.length;
        int columns = numArr[0].length;
        return rows * columns;
    }

    public static void fourCorners(String[][] strArr)
    {
        int rows = strArr.length;
        int columns = strArr[0].length;
        System.out.println(strArr[0][0]);
        System.out.println(strArr[0][columns - 1]);
        System.out.println(strArr[rows - 1][0]);
        System.out.println(strArr[rows - 1][columns - 1]);
    }
}