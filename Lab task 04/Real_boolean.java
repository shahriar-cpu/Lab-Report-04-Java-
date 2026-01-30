public class Real_boolean {
     public static void main(String[] args) {
    boolean isLoggedIn = true;
    boolean isAdmin = false;
    int securityLevel = 3; // 1 = highest

    if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
      System.out.println("Access granted");
    } else {
      System.out.println("Access denied");
    }
}
}
