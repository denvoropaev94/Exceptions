public class dz1 {
    public static void main(String[] args) {
        int[] array1 = new int[]{14, 76, 27, 18, 45, 96};
        int[] array2 = new int[]{12, 17, 22, 13, 15, 43};
        try {
//            System.out.println(differenceOfTwoArrays(null, array2));
            //System.out.println(differenceOfTwoArrays(array1,array2));
            printArray(array1);
            printArray(array2);
            int [] res = (differenceOfTwoArrays(array1,array2));
            printArray(res);
            checkForPositive(res);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static int[] differenceOfTwoArrays(int[] array1, int[] array2) throws Exception {
        if ((array1 == null) || (array2 == null)) {
            throw new RuntimeException("Массива нет, код ошибки: -1");
        } else if (array1.length != array2.length) {
            throw new RuntimeException("Массивы не равны, код ошибки: -2");
        } else {
            int[] result = new int [array1.length];
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == 0 || array2[i] == 0)
                    throw new RuntimeException("Не хорошие значения... код ошибки: +0");
                result[i] = array1[i] - array2[i];
            }
            if (result.length < 1) {
                throw new RuntimeException("Bad result......cod -9");
            }

            return result;
        }
    }
    public static void printArray(int[]arr) {
        if (arr == null) {
            throw new RuntimeException("Массива нет, код ошибки: -1");}
        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    public static void checkForPositive(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<=0){
                throw new RuntimeException("Элементы массива должны быть положительными");
            }
        }
    }


}
