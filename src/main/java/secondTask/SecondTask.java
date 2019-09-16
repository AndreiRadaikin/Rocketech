package secondTask;

import java.util.Arrays;
import java.util.List;

public class SecondTask {
    public static void main(String[] args) {

        Object[] objects = new Object[3];
        objects[0] = 1;
        objects[1] = 2.0;
        objects[2] = "3";

        List<Object> objectList = arrayToCollection(objects);
        System.out.println(objectList);
    }

    private static List<Object> arrayToCollection(Object[] objects){
        return Arrays.asList(objects);
    }
}
