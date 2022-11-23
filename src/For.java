public class For {
    public static void main(String[] args) {
        /*String[] cats=new String[]{"mruczek", "burek", "iskierka", "pussy"};
        for(int i=0; i<cats.length; i++){
            System.out.println(cats[i]);
        }*/
        int x=3;
        int y;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x);
        y = x++;
        System.out.println (y);
        y = ++x;
        System.out.println (y);
        System.out.println (++y);
    }
}
