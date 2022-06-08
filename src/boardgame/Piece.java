package boardgame;

public abstract class Piece {

    protected boardgame.Position position;
    private boardgame.Board board;

public Piece(boardgame.Board board) {
        this.board = board;
        position = null;
    }

    protected boardgame.Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(boardgame.Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat.length; j++) {
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}