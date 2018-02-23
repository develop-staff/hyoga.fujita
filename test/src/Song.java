import com.oracle.webservices.internal.api.databinding.DatabindingMode;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Song implements ShuffleEngine{
    static int lastNum=0; //　前回の添え字参照変数

    ArrayList<Song> songs = new ArrayList<Song>();

    File file;

    //シャッフル対象の曲の配列をインスタンスに設定する。
    public void setSong(Song[] songs){
        Collections.addAll(this.songs,songs);
    }

    //次に再生する曲を返す。次に返す曲が更新される
    public Song getNext(){
        return this.songs.get(lastNum++);
    }

    //PEEKMAXの数を上限として,次に再生する予定の曲を先読みして配列として返す。次に返す曲の状態は変わらない
    public Song[] peekQueue(){
        if(PEEKMAX>=lastNum) {
            return  new Song[lastNum];
        }
        else{
            lastNum =0;
            return new Song[lastNum];
        }
    }

}
