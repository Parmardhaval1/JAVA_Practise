package myclient;
import java.net.*;
public class DSender{
public static void main(String[] args) throws Exception {

DatagramSocket ds = new DatagramSocket();
String str = "Welcome java";
InetAddress ip = InetAddress.getByName("LocalHost");

DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);

ds.send(dp);
ds.close();
}
}

