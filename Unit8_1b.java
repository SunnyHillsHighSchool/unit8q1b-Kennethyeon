public class Unit8_1b
{
  public int [] [] modifyRows (int [] [] array)
  {
    for (int r = 0; r < array.length; r++)
    {
      for (int c = 0; c < array[0].length; c++)
      {
          if (r%2 != 0)
          {
            array[r][c] = array[r - 1][c];
          }
      }
    }
    return array;
  }
}
 