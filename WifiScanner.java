import java.util.List;
import javax.swing.JOptionPane;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Enumeration;

public class WifiScanner {
  public static void main(String[] args) throws Exception {
    Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
    for (NetworkInterface ni : Collections.list(interfaces)) {
      if (ni.isLoopback() || !ni.isUp() || ni.getDisplayName().contains("Virtual")) {
        continue;
      }
      List<java.net.InterfaceAddress> addresses = ni.getInterfaceAddresses();
      for (java.net.InterfaceAddress ia : addresses) {
        if (ia.getBroadcast() == null) {
          continue;
        }
        System.out.println("Name: " + ni.getName());
        System.out.println("Display Name: " + ni.getDisplayName());
        System.out.println("Wi-Fi Network Available: " + ni.getName().contains("wlan"));
        System.out.println("");
      }
    }
  }
}
