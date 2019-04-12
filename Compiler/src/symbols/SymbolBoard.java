package symbols;

import java.util.HashMap;
import java.util.Map;

public class SymbolBoard {
    private final SymbolBoard prev;
    private final Map<String, SymbolItem> board;

    public SymbolBoard(SymbolBoard prev) {
        this.prev = prev;
        board = new HashMap<>();
    }

    public void putSymbolItem(String id, SymbolItem item) {
        board.put(id, item);
    }

    public SymbolItem getSymbolItem(String id) {
        for (SymbolBoard symbolBoard = this; symbolBoard != null; symbolBoard = symbolBoard.prev) {
            if (symbolBoard.board.containsKey(id))
                return board.get(id);
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (SymbolItem item : board.values())
            stringBuilder.append(item).append("\n");
        return stringBuilder.toString();
    }
}
