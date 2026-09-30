public class StringBuilderBasics {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        sb.append(" is awesome");

        int start = sb.indexOf("awesome");
        sb.insert(start, "really ");

        start = sb.indexOf("awesome");
        int end = start + "awesome".length();
        sb.replace(start, end, "powerful");

        start = sb.indexOf("really ");
        end = start + "really ".length();
        sb.delete(start, end);

        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        String thisString = sb.toString();
        System.out.println(thisString);
    }
}