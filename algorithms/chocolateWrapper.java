
class chocolateWrapper {
    public static void main(String[] args) {
        System.out.println(countChoc(15, 1, 3));
    }

    public static int countChoc(int money, int price, int cholocateWrapper) {
        // number of chocolate one can buy with the money one has
        int chocolate = money / price;
        int wrapper = chocolate;

        while (wrapper >= cholocateWrapper) {

            chocolate += wrapper / cholocateWrapper;
            wrapper = (wrapper % cholocateWrapper) + (wrapper / cholocateWrapper);

        }

        return chocolate;
    }
}