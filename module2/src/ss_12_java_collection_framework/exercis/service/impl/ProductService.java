package ss_12_java_collection_framework.exercis.service.impl;

import ss_12_java_collection_framework.exercis.model.Product;
import ss_12_java_collection_framework.exercis.service.IProductService;

import java.util.*;

public class ProductService implements IProductService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> productList = new ArrayList<Product>();
    public static void test(){
        Product product =new Product(1,"ss",2);
        Product product1 =new Product(2,"ss",1);
        Product product2 =new Product(3,"ss",25);
        Product product3 =new Product(4,"ss",23);
        Product product4 =new Product(5,"ss",12);
        Product product5 =new Product(6,"ss",80);
        productList.add(product);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
    }
    @Override
    public void addProduct() {
        Product product = informationProducts();
        productList.add(product);
        System.out.println("Thêm mới sản phẩm thành công! ");    // thêm mới 1 sản phẩm.
        System.out.println("------------------------------");
        System.out.println("------------------------------");
    }

    @Override
    public void editProduct() {
        System.out.println("Nhập ID sản phẩm cần sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                System.out.println("Nhập tên tên mới : ");
                String name = scanner.nextLine();           // phương thúc sửa sản phẩm.
                productList.get(i).setName(name);
                System.out.println("Nhập giá sản phẩm :");
                int price = Integer.parseInt(scanner.nextLine());
                productList.get(i).setPrice(price);
                System.out.println("Sửa thành công : ");
            }
        }

    }

    @Override
    public void removeProduct() {
        System.out.println("Nhập ID sản phẩm cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;

        for (Product product : productList) {
            if (product.getId() == idRemove) {
                System.out.println("Bạn có chắc muốn xóa sản phẩm này? \n " +
                        "1. CÓ \n" +
                        "2. KHÔNG");
                int choiceYesNo = Integer.parseInt(scanner.nextLine());   // phương thức xóa sản phẩm.
                if (choiceYesNo == 1) {
                    productList.remove(product);
                    System.out.println("Xóa thành công! ");
                    System.out.println("------------------------------");
                    System.out.println("------------------------------");

                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy sản phẩm này! ");
        }
    }

    @Override
    public void displayProduct() {
        for (Product product : productList) {
            System.out.println(product);

        }
        System.out.println("------------------------------");    // phương thức hiển thị sản phẩm
        System.out.println("------------------------------");
    }

    @Override
    public void seachProduct() {
        System.out.println("Nhập tên sản phẩm cần tìm kiếm: ");
        String name = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {         // phương thức tìm kiếm sản phẩm
            if (productList.get(i).getName().equals(name)) {
                System.out.println(productList.get(i));
            }
        }

    }

    @Override
    public void reverseProduct() {
        System.out.println("1. Sắp xếp theo thứ tự tăng dần \n" +
                "2. Sắp xếp theo thứ tự giảm dần \n");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                Collections.sort(productList, new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        if (o1.getPrice() > o2.getPrice()) {
                            return 1;
                        } else if (o1.getPrice() == o2.getPrice()) {
                            return 0;
                        } else {
                            return -1;
                        }

                    }

                });
                for (Product reverse : productList) {
                    System.out.println(reverse);
                }
                break;
            case 2:
                Collections.sort(productList, new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        if (o1.getPrice() < o2.getPrice()) {
                            return 1;
                        } else if (o1.getPrice() == o2.getPrice()) {
                            return 0;
                        } else {
                            return -1;
                        }
                    }
                });
                for (Product reverse : productList) {
                    System.out.println(reverse);
                }
                break;

        }
        }
    public static Product informationProducts() {
        System.out.print("Mời bạn mã sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời bạn tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Mời bạn nhập giá sả phẩm: ");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, price);
        return product;
    }
}
