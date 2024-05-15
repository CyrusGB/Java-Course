class Lab10CGronblom {
  public static void main(String[] args) {
		ElevensBoard board = new ElevensBoard();
		CardGameGUI gui = new CardGameGUI(board);
		gui.displayGame();
  }
}