public class MinEgenKlasse {
    public static void main(String[] args) {
        Dog a1 = new Dog(" Rudolf", 5, "black");
        Dog a2 = new Dog(" bella", 7, "white");
        Dog a3 = new Dog(10);

        System.out.println(a1);
        System.out.println(a2);


    }

    static class Dog {
        String name;
        int age;
        String color;

        Dog(String n, int a, String c) {
            name = n;
            age = a;
            color = c;

        }

        public String getColor() {
            return color;
        }

        public Dog(int age) {
            this.age = age;

        }

        public Dog(String name) {
            this.name = name;

        }

        @Override
        public String toString() {
            return ("dog:"+name+"\t"+age+"\t"+color);
        }
    }
}
