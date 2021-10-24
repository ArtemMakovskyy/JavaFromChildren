package Shildt.WorkinLan22P811;

import java.io.*;
import java.net.*;
import java.util.*;

class ExampplesLans {
    void _L1_Java179() throws IOException {
        //https://www.youtube.com/watch?v=lKUb2IAdq3E
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress("http://www.internic.net", 80), 2000);
            Scanner scanner = new Scanner(socket.getInputStream());
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        }
    }

    void _L2_Java179_ServerSocket() throws IOException {
        //https://www.youtube.com/watch?v=lKUb2IAdq3E
        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            Socket socket = serverSocket.accept();
//            InputStream inputStream = socket.getInputStream();
//            OutputStream outputStream = socket.getOutputStream();
            Scanner scanner = new Scanner(socket.getInputStream());
            PrintWriter printWriterwriter = new PrintWriter(socket.getOutputStream(), true);
            printWriterwriter.println("hello");


        }
    }

    void _0_InetAddress() throws UnknownHostException {
//        для инкапсуляции как числового IР-адреса, так и его доменного имени
        InetAddress inetAddress;

        inetAddress = InetAddress.getLocalHost();
        System.out.println(inetAddress);

        inetAddress = InetAddress.getByName("www.HerbSchildt.com");
        System.out.println(inetAddress);

        InetAddress AW[] = InetAddress.getAllByName("www.nba.com");
        for (int i = 0; i < AW.length; i++) {
            System.out.println(AW[i]);
        }
    }

    void _1_Socket() throws IOException {
        /**Socket для клиентов сервера.*/
        int c;
        Socket socket = new Socket("whois.internic.net", 43);
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();

        String[] url = {"MHProfessional.com"};
        String str = (url.length == 0 ? "MHProfessional.com" : url[0]) + "\n";

        byte[] buf = str.getBytes();

        out.write(buf);

        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }
        socket.close();
    }//p819

    void _1_1_Socket() throws IOException {
        /**Socket для клиентов сервера.
         * старый способ подключения*/

        Socket socket = new Socket("whois.internic.net", 43);
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();
        String strAdres = "MHProfessional.com\n";
        byte strAdresToByte[] = strAdres.getBytes();

        out.write(strAdresToByte);

        int c;
        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }
        socket.close();
    }//p819

    void _2_URL() throws MalformedURLException {
        URL hp = new URL("http://www.HerbSchildt.com/Articles");
        System.out.println("Пpoтoкoл:  " + hp.getProtocol());
        System.out.println("Пopт:  " + hp.getPort());
        System.out.println("Xocт:  " + hp.getHost());
        System.out.println("порт:  " + hp.getDefaultPort());
        System.out.println("Фaйл:  " + hp.getFile());
        System.out.println("Пoлнaя форма :  " + hp.toExternalForm());
    }

    void _3_URLConnection() throws IOException {
        /** каша */
        int c;
        URL hp = new URL("http://www.internic.net");
        URLConnection hpCon = hp.openConnection();

//        получить дату
        long d = hpCon.getDate();
        if (d == 0) System.out.println("np date ");
        else System.out.println("Date " + new Date(d));
        System.out.println("Тип содержимого: " + hpCon.getContentType());
        d = hpCon.getExpiration();
        System.out.println("Срок действия истекает: " + new Date(d));
        d = hpCon.getLastModified();
        System.out.println("Дата последней модификации : " + new Date(d));
        long len = hpCon.getContentLengthLong();
        System.out.println(len);


        if (len != 0) {
            System.out.println("=== Содержимое===");
            InputStream in = hpCon.getInputStream();
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
            in.close();
        }
    }

    void _4_URLConnWithInputStreamAndOpenConnection() throws IOException {
        // является классом общего назначения и предназначен для доступа к атрибутам удаленного ресурса
        int c;
        URL hp = new URL("http://www.internic.net");
        URLConnection hpCon = hp.openConnection();

        long len = hpCon.getContentLengthLong();

        if (len != 0) {
            try (InputStream in = hpCon.getInputStream()) {
                while ((c = in.read()) != -1) {
                    System.out.print((char) c);
                }
            } catch (IOException e) {
                System.out.println();
            }
        }
    }

    void _5_HttpURLConn() throws IOException {
        int c;
        URL hyperPath = new URL("http://www.google.com");
        HttpURLConnection hpCon = (HttpURLConnection) hyperPath.openConnection();
        System.out.println("Meтoд  запроса:   " + hpCon.getRequestMethod());
        System.out.println("Koд ответа:   " + hpCon.getResponseCode());
        System.out.println("Oтвeтнoe  сообщение: " + hpCon.getResponseMessage());
        System.out.println("\n== получить список полей и  множество ключей из заголовка ==");

        /** getHeaderFields() - стандартные метод.
         * после мапирования создаем объект с ключами Set<String>
         * затем по ключам берем содержтмое */
        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
        System.out.println("\nДaлee следует  заголовок:\n вывести все ключи  и значения из заголовка ");
        for (String k : hdrField) {
            System.out.println("Kлюч:   " + k + " Значение:   " + hdrMap.get(k));
        }
    }

    void _6_info(){
        //** p 826
        // инкапсулирует универсалъный идентификатор ресурса
        // очень похожий на URL. На самом деле URL является подмножеством URI. Если URI
        // обозначает стандартный способ идентификации ресурсов, то URL описывает
        // также доступ к ресурсу.
        //============cookie
        //CookieHandler, CookieManager и HttpCookie, а также интерфейсы CookiePolicyиCookieStore.
        //
        // ServerSocket применяется для создания серверов p 827
        //
        // дейтаграммы - облегченный вариант ТСР /IP
        // Дейтаграммы - это порции данных, передаваемых между машинами
        //Даже если дейтаграм· ма и передается в нужном направлении, нет никаких гарантий,
        // что она достигнет цели или кто-нибудь окажется на месте, чтобы ее перехватить
        //
        // DatagramPacket (контейнер данных) и DatagramSocket (механизм для передачи и
        // приема пакетов типа DatagramPacket).
        // */

    }
    void _7_DatagramPacket826_WriteServer(){

    }


}

public class LAnsEx {
    public static void main(String[] args) throws IOException {
        ExampplesLans start = new ExampplesLans();

//        start._0_InetAddress();
//        start._1_1_Socket();
//        start._2_URL();
//        start._3_URLConnection();
//        start._4_URLConnWithInputStream();
//        start._5_HttpURLConn();
        start._7_DatagramPacket826_WriteServer();



    }
}
