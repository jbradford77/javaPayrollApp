public class ArrayPicture {
  public static void main(String[] args) {
    char[][] imgData =
      new char[][] {
         { ' ',' ',' ',' ',' ',' ',' ' },
         { ' ',' ',' ','0',' ',' ',' ' },
         { ' ',' ',' ','|',' ',' ',' ' },
         { ' ','0','-','+','-','0',' ' },
         { ' ',' ',' ','|',' ',' ',' ' },
         { ' ',' ',' ','0',' ',' ',' ' },
         { ' ',' ',' ',' ',' ',' ',' ' }
       };
                                       
    for (int row = 0; row < imgData.length ; row++ ) {
      for (int col = 0; col < imgData[row].length; col++ ) {
        System.out.print(imgData[row][col]);
      }
      System.out.println();
    }
  }
}