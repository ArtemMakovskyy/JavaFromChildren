package Shildt.Classes.IO.NIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ExplicitChaппelRead805 {
    public static void main(String[] args) {
        FileInputStream fin = null;
        FileChannel fChan = null;
        ByteBuffer mBuf;
        int count;
        try {
            fin = new FileInputStream("Shildt\\Classes\\IO\\NIO\\test.txt");
            fChan = fin.getChannel();
            mBuf = ByteBuffer.allocate(128);

            do{
                count = fChan.read(mBuf);
                if(count != -1){
                    mBuf.rewind();
                    for (int i = 0; i < count; i++) {
                        System.out.println((char) mBuf.get());
                    }


                }



            }while (count !=-1);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fChan != null) fChan.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fin != null)fin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
