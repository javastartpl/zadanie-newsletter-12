import java.lang.reflect.Field;

public interface CatAndDog {
    static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String source = "Ala ma kota";
        Class<? extends String> aClass = source.getClass();
        Field valueField = aClass.getDeclaredField("value");
        valueField.setAccessible(true);
        byte[] chars = (byte[]) valueField.get(source);
        chars[7] = 'p';
        chars[8] = 's';
        chars[9] = 'a';
        chars[10] = ' ';

        System.out.println(source);
    }
}

