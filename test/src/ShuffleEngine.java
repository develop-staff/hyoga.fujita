public interface ShuffleEngine {

    public static final Integer PEEKMAX = 5;

    //シャッフル対象の曲の配列をインスタンスに設定する。
    void setSong(Song[] songs);

    //次に再生する曲を返す。次に返す曲が更新される
    Song getNext();

    //PEEKMAXの数を上限として,次に再生する予定の曲を先読みして配列として返す。次に返す曲の状態は変わらない
    Song[] peekQueue();
}
