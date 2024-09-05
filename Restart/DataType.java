public class DataType {

    public static int dataTypeSize(String dataType) {
        switch (dataType.toLowerCase()) {
            case "byte":
                return 1;
            case "short":
                return 2;
            case "integer":
                return 4;
            case "long":
                return 8;
            case "float":
                return 4;
            case "double":
                return 8;
            case "character":
                return 2;
            case "boolean":
                return 1;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(dataTypeSize("int"));
        System.out.println(dataTypeSize("boolean"));
        System.out.println(dataTypeSize("double"));
        System.out.println(dataTypeSize("double"));
        System.out.println(dataTypeSize("unknown"));
    }
}
