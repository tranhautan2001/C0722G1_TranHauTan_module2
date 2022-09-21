package ss_12_java_collection_framework.exercis.model;

public class Product {
  private int id;
  private String name;
  private int price;

    public Product() {
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s\n", this.getId(), this.getName(), this.getPrice());

    }

    @Override
    public String toString() {
        return "Sản Phẩm{" +
                "Tên Sản Phẩm='" + name + '\'' +
                ", Giá Sản Phẩm =" + price +
                ", Mã sản phẩm =" + id +
                '}';
    }

}
