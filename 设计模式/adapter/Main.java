public static void main(String[] args) {
    Adapter adapter = new Adapter();
    QQMusicPlayer qqMusicPlayer = new QQMusicPlayer();
    adapter.setQqMusicPlayer(qqMusicPlayer);
    adapter.player("mp3", "D:\\1.mp3");
    adapter.player("wma", "D:\\1.wma");
}