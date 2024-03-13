public class Main {
  public static int calculatePrice(String type, int page) {
    if (page <= 0 || page >= 2000) {
      return -1;
    }

    int price = 0;
    if (type.equals("hardcover")) {
      if (page < 300) {
        price = 1500 * page + 50000;
      } else {
        price = (int)(2000 * page + 50000 * 0.5);
      }
    } else if (type.equals("paperback")) {
      if (page < 300) {
        price = 1500 * page + 25000;
      } else {
        price = 2000 * page;
      }
    }

    return price;
  }
}