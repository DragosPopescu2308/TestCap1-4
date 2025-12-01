public class ArraysUtils {
    public static String intToArray(int[] array){
        if (array == null || array.length == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if(i < array.length-1){
                sb.append(", ");
            }
        }

        return sb.append("]").toString();
    }
}
