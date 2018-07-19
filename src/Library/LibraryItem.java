package Library;

public abstract class LibraryItem {
    int id;
    String name;
    int pages;
    int row, column;
    @Override
    public String toString() {
        return "ID: "+id+" Name/Title: "+name+" Pages: "+pages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public boolean equals(Object obj) {
        LibraryItem check = (LibraryItem) obj;
        if(check.getName().equals(name)&&check.getId()==id)
            return true;
        else return false;
    }
}
