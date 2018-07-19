package Library;

public class Library {

    private LibraryItem[][] libraryItems = new LibraryItem[10][10];

    public Library(){

    }

    public LibraryItem checkOut(LibraryItem li){
        return li;
    }
    public LibraryItem checkOut(int row,int column){
       return libraryItems[row][column];
    }
    public boolean checkIn(LibraryItem li){
        return true;
    }
    public boolean checkIn(LibraryItem li,int row,int column){
        libraryItems[row][column]=li;
        return true;
    }

    public boolean addItem(LibraryItem li){
        int[] index = findEmptySpace();
        int row = index[0],column = index[1];
        libraryItems[row][column]=li;
        return true;
    }
    public boolean removeItem(LibraryItem li){
           int row, column;
           int[] index = findItem(li);
           row = index[0];
           column = index[1];

           libraryItems[row][column]= null;

           return true;
    }
    public boolean registerPerson(LibraryItem li){
        return true;
    }
    public boolean updatePerson(LibraryItem li){
        return true;
    }
    public boolean deletePerson(LibraryItem li){
        return true;
    }
    public int[] findItem(LibraryItem li){
        int[] index = new int[2];
        for (int i = 0; i < libraryItems.length; i++) {
            for (int j = 0; j <libraryItems[i].length ; j++) {
                if(libraryItems[i][j].equals(li)){
                    index[0]=i;
                    index[1]=j;

                }
            }
        }
        return index;
    }
    public int[] findEmptySpace(){
        int[] index = new int[2];
        for (int i = 0; i < libraryItems.length; i++) {
            for (int j = 0; j <libraryItems[i].length ; j++) {
                if(libraryItems[i][j]==null){
                    index[0]=i;
                    index[1]=j;
                }
            }
        }
        return index;
    }

    public void displayLibrary(){
        for (int i = 0; i < libraryItems.length; i++) {
            for (int j = 0; j <libraryItems[i].length ; j++) {
                System.out.print(libraryItems[i][j]);
                }
            System.out.println();
            }
        }

    }

