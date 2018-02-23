import sun.awt.shell.ShellFolder;

import java.io.*;

public class main {
    public static void main(String[] args){
        Song[] songs = new Song[ShuffleEngine.PEEKMAX];
        songs[0] = new Song();

        try {
            //Fileクラスに読み込むファイルを指定する
            songs[0].file = new File("aaa.txt");

            //ファイルが存在するか確認する
            if(songs[0].file.exists()) {

                //FileReaderクラスのオブジェクトを生成する
                FileReader filereader = new FileReader(songs[0].file);

                //filereaderクラスのreadメソッドでファイルを1文字ずつ読み込む
                int data;
                while((data = filereader.read()) != -1) {
                    System.out.print((char) data);
                }

                //ファイルクローズ
                filereader.close();

            } else {
                System.out.print("ファイルは存在しません");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        for(int i=0;i<5;i++){
//            songs[i].file = new File("sample")
//        }
    }
}
