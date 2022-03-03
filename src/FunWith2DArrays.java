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

    public static double average(int[][] numArr)
    {
        int count = 0;
        int total = 0;
        for (int[] row : numArr)
        {
            for (int element : row)
            {
                total += element;
                count++;
            }
        }
        return (double) total / count;
    }

    public static int[] indexFound(String[][] strArr, String target)
    {
        int[] found = new int[2];
        for (int row = 0; row < strArr.length; row++)
        {
            for (int col = 0; col < strArr[0].length; col++)
            {
                String element = strArr[row][col];
                if (element.equals(target))
                {
                    found[0] = row;
                    found[1] = col;

                    return found;
                }
            }
        }
        found[0] = -1;
        found[1] = -1;
        return found;
    }
}