package IO;

import java.io.*;
import java.net.DatagramPacket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;


public class Main  extends ArrayList<String>{
    public static void main(String[] args) throws IOException {
        /**
         *InputStream src = new URL("https://vk.com/pobaranchuk_v").openStream();
         *OutputStream dst = new FileOutputStream("D:/loshara.txt");
         *copy(src, dst);'
         */
        /**
        final byte[] DATA = {0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1};
        byte[] DATA1 = new byte[]{};
        InputStream src = new ByteArrayInputStream(DATA);
        OutputStream dst = new FileOutputStream("D:/loshara.txt");
        filter(src, dst, 3);


        FileInputStream fin=new FileInputStream("D:/loshara.txt");
            System.out.println("Размер файла: " + fin.available() + " байт(а)");
            int i=-1;
            while((i=fin.read())!=-1)
                System.out.print((int)i);
        */
        /**
        ByteArrayOutputStream buff = new ByteArrayOutputStream();
        EntityOutput out = new EntityOutputStream(buff);
        for (int index = 0; index < 10; index++){
            Person person = new Person("Mike_" + index, index);
            Point point = new Point(index + 2, index);
            out.writePerson(person);
            out.writePoint(point);
            System.out.println(person.toString());
            System.out.println(point.toString());

        }


        FileReader out = new FileReader("D:/loshara.txt");
        int c;
        while ((c = out.read()) != -1){
            System.out.print((char)c);
        }
         */


    }





    public static void copy(InputStream src, OutputStream dst) throws IOException {
        byte[] buff = new byte[64 * 1024];
        while (true) {
            int count = src.read(buff);
            if (count != -1)
                dst.write(buff, 0, count);
            else
                return;

        }
    }


    public static void filter(InputStream in, OutputStream out, int buffSize) throws IOException {
        final int ZERO_STATE = 0;
        final int NUMBERS_STATE = 1;
        byte[] buff = new byte[buffSize];
        int count;
        while ((count = in.read(buff)) != -1) {
            int state = ZERO_STATE;

            int fromIndex = 0;
            int length = 0;

            for (int index = 0; index < count; index++) {
                switch (state) {
                    case ZERO_STATE:
                        if (buff[index] == 0) {
                            state = ZERO_STATE;
                        } else {
                            fromIndex = index;
                            length++;
                            state = NUMBERS_STATE;
                        }
                        break;
                    case NUMBERS_STATE:
                        if (buff[index] == 0) {
                            out.write(buff, fromIndex, length);
                            length = 0;
                            state = ZERO_STATE;
                        } else {
                            length++;
                            state = NUMBERS_STATE;
                        }

                }
            }
            if (state != ZERO_STATE) {
                out.write(buff, fromIndex, length);


            }

        }
    }
}

