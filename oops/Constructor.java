import java.util.*;

class Shape {
    int length;
    int width;
    int height;
    int radius;

    Shape(int length) {
        this.length = length;
        System.out.println("Volume of cube is " + Math.pow(length, 3));
    }

    Shape(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        System.out.println("Volume of cuboid is " + (length * width * height));
    }

    Shape(int radius, int height) {
        this.radius = radius;
        this.height = height;
        System.out.println("Volume of cylinder is " + (3.14 * radius * radius * height));
    }

    Shape(Shape s) {
        this.length = s.length;
        this.width = s.width;
        this.height = s.height;
        this.radius = s.radius;
        System.out.println("Copy constructor called");
    }
}

class Constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.print("\n1. Normal constructor\n2. Copy constructor\n3. Exit\nChoice: ");
            int mode = sc.nextInt();

            if (mode == 3) {
                exit = true;
                continue;
            }

            System.out.print("\n1. Cube\n2. Cuboid\n3. Cylinder\n4. Exit\nShow volume of: ");
            int choice = sc.nextInt();

            if (choice == 4) {
                exit = true;
                continue;
            }

            Shape original = null;

            switch (choice) {
                case 1:
                    System.out.print("Enter cube length: ");
                    int l = sc.nextInt();
                    original = new Shape(l);
                    break;

                case 2:
                    System.out.print("Enter cuboid length: ");
                    int l1 = sc.nextInt();
                    System.out.print("Enter cuboid width: ");
                    int w = sc.nextInt();
                    System.out.print("Enter cuboid height: ");
                    int h1 = sc.nextInt();
                    original = new Shape(l1, w, h1);
                    break;

                case 3:
                    System.out.print("Enter cylinder radius: ");
                    int r = sc.nextInt();
                    System.out.print("Enter cylinder height: ");
                    int h2 = sc.nextInt();
                    original = new Shape(r, h2);
                    break;

                default:
                    System.out.println("Invalid input");
                    continue;
            }

            if (mode == 2 && original != null) {
                Shape copy = new Shape(original);
            }
        }

        sc.close();
    }
}