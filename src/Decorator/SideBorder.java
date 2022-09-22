package Decorator;

public class SideBorder extends Border{
    private char borderchar;
    protected SideBorder(Display display,char borderchar) {
        super(display);
        this.borderchar = borderchar;
    }

    @Override
    public int getColumns() {
        return 1+ display.getColumns()+1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return borderchar+display.getRowText(row)+borderchar;
    }
}
