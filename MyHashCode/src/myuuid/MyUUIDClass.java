/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myuuid;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ysfbil
 */
class GenUUID {

    private String getMac() { //mac adresini öğreniyoruz. hata alınırsa rastgele sayı ile karşılık veriyorz.
        InetAddress localHost;
        Random rnd = new Random();
        try {
            localHost = InetAddress.getLocalHost();
            NetworkInterface ni = NetworkInterface.getByInetAddress(localHost);
            byte[] hardwareAddress = ni.getHardwareAddress();
            String[] hexadecimal = new String[hardwareAddress.length];
            for (int i = 0; i < hardwareAddress.length; i++) {
                hexadecimal[i] = String.format("%02X", hardwareAddress[i]);
            }
            String macAddress = String.join("", hexadecimal);
            return macAddress;
        } catch (UnknownHostException ex) {
            Logger.getLogger(GenUUID.class.getName()).log(Level.SEVERE, null, ex);
            return "000" + Math.round(rnd.nextInt());
        } catch (SocketException ex) {
            Logger.getLogger(GenUUID.class.getName()).log(Level.SEVERE, null, ex);
            return "000" + Math.round(rnd.nextInt());
        }

    }

    private String normalization(String input, int size) {
        //metni istenilen uzunluğa getiriyoruz.
        if (input.length() > size) { //metin uzunsa parçasını alıyoruz
            input = input.substring(0, size);
        } else if (input.length() < size) { //metin kısa ilse rastgele sayı karakterleri ekliyoruz
            Random rnd = new Random();
            while (input.length() != size) {
                input += (char) (48 + rnd.nextInt(9));
            }
        }

        return input;
    }

    private String toAscii(String input) {
        //metni asci karşılığına çeviriyoruz
        String output = "";
        for (char k : input.toCharArray()) {
            output += (int) k;
        }

        return normalization(output, 17);
    }

    private String embedding(String input) {
        //gelen metni 3'erli parçalara ayırıp rastgele karıştırıyoruz.
        String output = "";
        String[] parcalar = new String[17];

        ArrayList<Integer> indisler = new ArrayList<>();
        Random rnd = new Random();

        while (indisler.size() < 17) {
            int sayi = rnd.nextInt(17);
            if (!indisler.contains(sayi)) {
                indisler.add(sayi);
            }
        }

        for (int i = 0; i < 51; i += 3) {
            parcalar[indisler.get(i / 3)] = input.substring(i, i + 3);
        }

        for (int i = 0; i < 17; i++) {
            output += parcalar[i];
        }
        return output;
    }

    public void generateMyUUID() {
        Random rnd = new Random();
        String sayi = "" + Math.abs(rnd.nextLong());
        String username = "" + toAscii(System.getProperty("user.name")).hashCode();
        String macaddress = getMac();
        String nanoTime = "" + System.nanoTime();

        System.out.println(embedding(sayi + username + macaddress + nanoTime));
    }
}

public class MyUUIDClass {

    public static void main(String[] args) {
        GenUUID uuid = new GenUUID();
        uuid.generateMyUUID();
    }
}
