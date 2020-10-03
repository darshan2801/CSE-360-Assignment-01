
class testCase extends AddingMachine {
    public static void main(String[] args) {
        testCase test = new testCase();
        test.add(4);
        test.subtract(2);
        test.add(5);
        System.out.println(test.toString());
        test.clear();
        test.add(4);
        System.out.println(test.toString());


    }
}
